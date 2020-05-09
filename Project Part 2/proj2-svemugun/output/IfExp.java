public class IfExp extends Expr {
	private final Expr expr1, expr2, expr3;

	public IfExp(Expr _expr1, Expr _expr2, Expr _expr3) {
		expr1 = _expr1;
		expr2 = _expr2;
		expr3 = _expr3;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		Value v = expr1.eval(e);// evaluating the expression
		if (v instanceof BoolVal) {// The condition expression of an if-then-else expression must be a Boolean
									// value.
			return ((BoolVal) v).boolvalue ? expr2.eval(e) : expr3.eval(e);
			/*
			 * ternary operator takes 3 arguments, 1st argument - comparison; 2nd argument -
			 * result upon true comparison; 3rd argument - result upon false comparison
			 */
		} else
			throw new EvalError("Not a boolean condition");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IF" + expr1.toString() + "THEN" + expr2.toString() + "ELSE" + expr3.toString();
	}

}
