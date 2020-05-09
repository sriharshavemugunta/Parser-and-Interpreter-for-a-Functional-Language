public class LetFunExp extends Expr {
	private final String strn2, strn3;
	private final Expr expr6, expr7;

	public LetFunExp(String _strn2, String _strn3, Expr _expr6, Expr _expr7) {
		strn2 = _strn2;
		strn3 = _strn3;
		expr6 = _expr6;
		expr7 = _expr7;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		/*
		 * Add binding of f(f-strn2) with a “dummy” value (any value would do) to the
		 * current environment. Call it new-env.
		 */
		Env newenv = e.addBinding(strn2, new IntVal(0));
		/*
		 * Create a function value (FunVal) object <a,e1,new-env>(a-strn3, e1-expr6).
		 * Call this value val.
		 */
		FunVal val = new FunVal(strn3, expr6, newenv);
		/*
		 * Update binding of f in new-env with val. Let this be new-env2.
		 */
		Env newenv2 = newenv.updateBinding(strn2, val);
		/*
		 * Evaluate e2(e2-expr7) in new-env2 and return the value.
		 */
		Value v = expr7.eval(newenv2);
		return v;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "LET FUN" + strn2 + "(" + strn3 + ") =" + expr6.toString() + "IN" + expr7.toString() + "END";
	}

}
