package Interpreter.Abstraction;

public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret() {
        System.out.println("Terminal Interpretation");
    }
}
