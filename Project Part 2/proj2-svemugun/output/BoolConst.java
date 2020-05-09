public class BoolConst extends Expr {
	public final boolean boolvalue;

	public BoolConst(boolean _boolvalue) {
		boolvalue = _boolvalue;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		return new BoolVal(boolvalue);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(boolvalue);
	}

}
