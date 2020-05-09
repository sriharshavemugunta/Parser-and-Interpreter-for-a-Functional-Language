public class WhileExp extends Expr {
	private final Expr expr8, expr9;

	public WhileExp(Expr _expr8, Expr _expr9) {
		expr8 = _expr8;
		expr9 = _expr9;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		/*
		 * While-expressions are used for side-effects only. The value they return is of
		 * no importance. For our implementation, we will have all while-expressions
		 * return the value false!
		 */
		while (((BoolVal) expr8.eval(e)).boolvalue)// evaluate the condition (evaluate the expression)
			expr9.eval(e);// while condition is true, evaluate the expression
		return new BoolVal(false);// return false
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WHILE" + expr8.toString() + "DO" + expr9.toString();
	}

}
