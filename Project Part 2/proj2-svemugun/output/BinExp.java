public class BinExp extends Expr {
	private final BinOp bnropr;
	private final Expr expr1, expr2;

	public BinExp(BinOp _bnropr, Expr _expr1, Expr _expr2) {
		bnropr = _bnropr;
		expr1 = _expr1;
		expr2 = _expr2;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		Value v1 = expr1.eval(e);
		Value v2 = expr2.eval(e);
		switch (bnropr) {

		case PLUS:
			if ((v1 instanceof IntVal) && (v2 instanceof IntVal)) {
				int w = ((IntVal) v1).value;
				int c = ((IntVal) v2).value;
				return new IntVal(w + c);
			} else {
				throw new EvalError("Invalid arguments for Addition");
			}

		case MINUS:
			if ((v1 instanceof IntVal) && (v2 instanceof IntVal)) {
				int w = ((IntVal) v1).value;
				int c = ((IntVal) v2).value;
				return new IntVal(w - c);
			} else {
				throw new EvalError("Invalid arguments for Subtraction");
			}

		case TIMES:
			if ((v1 instanceof IntVal) && (v2 instanceof IntVal)) {
				int w = ((IntVal) v1).value;
				int c = ((IntVal) v2).value;
				return new IntVal(w * c);
			} else {
				throw new EvalError("Invalid arguments for Multiplication");
			}

		case DIV:
			if ((v1 instanceof IntVal) && (v2 instanceof IntVal)) {
				int w = ((IntVal) v1).value;
				int c = ((IntVal) v2).value;
				if (c == 0)
					throw new EvalError("Division by 0 is undefined");
				else
					return new IntVal(w / c);
			} else {
				throw new EvalError("Invalid arguments for Division");
			}

		case EQ:
			if ((v1 instanceof IntVal) && (v2 instanceof IntVal)) {
				int w = ((IntVal) v1).value;
				int c = ((IntVal) v2).value;
				return new BoolVal(w == c);
			} else if ((v1 instanceof BoolVal) && (v2 instanceof BoolVal)) {
				boolean w = ((BoolVal) v1).boolvalue;
				boolean c = ((BoolVal) v2).boolvalue;
				return new BoolVal(w == c);
			} else {
				throw new EvalError("Invalid arguments for EQUAL");
			}

		case LT:
			if ((v1 instanceof IntVal) && (v2 instanceof IntVal)) {
				int w = ((IntVal) v1).value;
				int c = ((IntVal) v2).value;
				return new BoolVal(w < c);
			} else {
				throw new EvalError("Invalid arguments for LT operator");
			}

		case AND:
			if ((v1 instanceof BoolVal) && (v2 instanceof BoolVal)) {
				boolean w = ((BoolVal) v1).boolvalue;
				boolean c = ((BoolVal) v2).boolvalue;
				return new BoolVal(w && c);
			} else {
				throw new EvalError("Invalid arguments for AND operator");
			}

		case OR:
			if ((v1 instanceof BoolVal) && (v2 instanceof BoolVal)) {
				boolean w = ((BoolVal) v1).boolvalue;
				boolean c = ((BoolVal) v2).boolvalue;
				return new BoolVal(w || c);
			} else {
				throw new EvalError("Invalid arguments for OR operator");
			}
		}
		throw new EvalError("Invalid BINARY Operator");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		switch (bnropr) {

		case PLUS:
			return expr1.toString() + "+" + expr2.toString();
		case MINUS:
			return expr1.toString() + "-" + expr2.toString();
		case TIMES:
			return expr1.toString() + "*" + expr2.toString();
		case DIV:
			return expr1.toString() + "/" + expr2.toString();
		case EQ:
			return expr1.toString() + "=" + expr2.toString();
		case LT:
			return expr1.toString() + "<" + expr2.toString();
		case AND:
			return expr1.toString() + "&" + expr2.toString();
		case OR:
			return expr1.toString() + "|" + expr2.toString();
		default:
			return "Invalid BINARY Operator";
		}
	}

}
