public class IntsCalculator implements Ints {

    @Override
    public int sum(int arg0, int arg1) {
        // считывам через target
        Calculator calc = new Calculator();
        return (int )calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        // считывам через target
        Calculator calc = new Calculator();
        return (int )calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg0, int arg1) {
        // считывам через target
        Calculator calc = new Calculator();
        return (int )calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}

