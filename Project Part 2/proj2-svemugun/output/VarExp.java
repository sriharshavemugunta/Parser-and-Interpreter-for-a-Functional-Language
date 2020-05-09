public class VarExp extends Expr {
	private final String strn5;

	public VarExp(String _strn5) {
		strn5 = _strn5;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		Value v = e.lookup(strn5);// looks up the 1st occurrence of string in the environment.
		return v;// returns value, if string is found in the environment.
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return strn5;
	}

}
