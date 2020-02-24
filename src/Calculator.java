public class Calculator {
    public static final char ADD = '+';
    public static final char SUB = '-';
    public static final char MUL = '*';
    public static final char DIV = '/';


    public static int calculate(int fistOperand, int secondOperand, char Operand) {
        switch (Operand) {
            case ADD:
                return  fistOperand + secondOperand;
            case SUB:
                return fistOperand - secondOperand;
            case MUL:
                return fistOperand * secondOperand;
            case DIV:
                if (secondOperand != 0)
                    return fistOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
