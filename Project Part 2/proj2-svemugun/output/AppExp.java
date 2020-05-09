public class AppExp extends Expr {
	private final String strn6;
	private final Expr expr22;

	public AppExp(String _strn6, Expr _expr22) {
		strn6 = _strn6;
		expr22 = _expr22;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		// AppExp f(a)-strn6(expr22)
		Value v1 = e.lookup(strn6);// Lookup f(strn6)
		if (v1 instanceof FunVal) {// Value v must be bound to a FunVal(x,e,denv)
			Value v = expr22.eval(e);// evaluate a(expr22) to get v
			//Converting Value object v1 into FunVal type for accessing members of FunVal.
			FunVal val = (FunVal) v1;
			Env denv = val.envr.addBinding(val.strn, v);// extend denv by adding binding of x with v
			Value v2 = val.expr.eval(denv);// evaluate e in this extended environment
			return v2;// return the value
		} else
			throw new EvalError("Not bound to FunVal");// Value v not bound to a FunVal

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return strn6 + "(" + expr22.toString() + ")";
	}

}
