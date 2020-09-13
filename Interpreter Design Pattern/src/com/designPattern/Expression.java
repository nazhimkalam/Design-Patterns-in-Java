package com.designPattern;

// Resource used is Tutorial Points in Java. https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm

// This Design Pattern is used to convert the Representation of data from one form to another.
// Interpreter pattern provides a way to evaluate language grammar or expression.

// Example:
//      Input = Convert 1 dollar into cents.
//      Output = 1 dollar is equal to 100 cents

public interface Expression {
    public boolean interpret(String context);
}