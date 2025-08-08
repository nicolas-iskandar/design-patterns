package Interpreter.Abstraction;

public class NonTerminalExpression implements AbstractExpression {
    @Override
    public void interpret() {
        System.out.println("NonTerminal Interpretation");
    }
}
