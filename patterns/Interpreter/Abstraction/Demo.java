package Interpreter.Abstraction;

public class Demo {
    public static void show() {
        AbstractExpression terminal = new TerminalExpression();
        AbstractExpression nonTerminal = new NonTerminalExpression();

        terminal.interpret();
        nonTerminal.interpret();
    }
}
