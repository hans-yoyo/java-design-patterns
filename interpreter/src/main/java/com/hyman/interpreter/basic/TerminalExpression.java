package com.hyman.interpreter.basic;

/**
 * @author HuHan
 * @description 终结符表达式
 * @date 2020/01/03 11:08
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context ctx) {
        System.out.println("终结符表达式的解释操作...");
    }
}
