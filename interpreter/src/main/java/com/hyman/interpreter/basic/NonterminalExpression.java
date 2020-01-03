package com.hyman.interpreter.basic;

/**
 * @author HuHan
 * @description 非终结符表达式
 * @date 2020/01/03 11:08
 */
public class NonterminalExpression extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context ctx) {
        //递归调用每一个组成部分的interpret()方法
        //在递归调用时指定组成部分的连接方式，即非终结符的功能
    }
}
