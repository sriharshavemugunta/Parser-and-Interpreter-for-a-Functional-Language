public class FunVal extends Value {
	public final String strn;// parameter of the function
	public final Expr expr;// body of the function
	public final Env envr;// definition time environment

	public FunVal(String _strn, Expr _expr, Env _envr) { // closures
		strn = _strn;
		expr = _expr;
		envr = _envr;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return strn;
	}

}
