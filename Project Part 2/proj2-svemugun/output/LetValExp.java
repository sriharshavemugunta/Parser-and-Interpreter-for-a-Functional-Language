public class LetValExp extends Expr {
	private final String strn1;
	private final Expr expr4, expr5;

	public LetValExp(String _strn1, Expr _expr4, Expr _expr5) {
		strn1 = _strn1;
		expr4 = _expr4;
		expr5 = _expr5;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		/*
		 * Let val is exactly as discussed for SML: evaluate the expression in the
		 * declaration part of let and bind it to the name/id. Then evaluate the
		 * expression in the body of let in this environment and return that value.
		 */
		Value v1 = expr4.eval(e);// evaluating the expression
		Env e1 = e.addBinding(strn1, v1);// binding the expression
		Value v2 = expr5.eval(e1);// evaluating the expression in new environment
		return v2;// return that value
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "LET VAL" + strn1 + "=" + expr4.toString() + "IN" + expr5.toString() + "END";
	}

}
