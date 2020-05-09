public class SeqExp extends Expr {
	private final Expr expr10, expr11;

	public SeqExp(Expr _expr10, Expr _expr11) {
		expr10 = _expr10;
		expr11 = _expr11;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		/*
		 * In general, for a sequence of expressions, the value returned is that of the
		 * last expression in the sequence.
		 */
		expr10.eval(e);//evaluating the first expression
		Value v = expr11.eval(e);//evaluating the last expression
		return v;//return value of last expression
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + expr10.toString() + ";" + expr11.toString() + "}";
	}

}
