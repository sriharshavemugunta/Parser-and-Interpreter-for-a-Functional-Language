public class AssnExp extends Expr {
	private final String strn4;
	private final Expr expr13;

	public AssnExp(String _strn4, Expr _expr13) {
		strn4 = _strn4;
		expr13 = _expr13;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		/*
		 * The assignment expression is meaningful only if a binding for the
		 * corresponding variable already exists (in the current environment). The new
		 * value must be compatible with the existing value. The value returned is the
		 * value of its right hand side.
		 */
		Value v1 = e.lookup(strn4);// to check if binding for the corresponding variable already exists in current
									// environment
		Value v2 = expr13.eval(e);// evaluating right hand side value
		// check if the right hand side value is compatible with the variable
		if ((v1 instanceof BoolVal) && (v2 instanceof BoolVal) || (v1 instanceof IntVal) && (v2 instanceof IntVal)
				|| (v1 instanceof FunVal) && (v2 instanceof FunVal)) {
			e.updateBinding(strn4, v2);// updating value in the environment
			return v2;// returning the value of its right hand side
		} else
			throw new EvalError("Incompatible argument types");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return strn4 + ":=" + expr13.toString();
	}

}
