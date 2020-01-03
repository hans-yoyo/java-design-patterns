package com.hyman.interpreter.example.robot;

/**
 * @author HuHan
 * @description 动作解释：终结符表达式
 * @date 2020/01/03 11:29
 */
public class ActionNode extends AbstractNode {

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        } else if (action.equalsIgnoreCase("run")) {
            return "快速移动";
        } else {
            return "无效指令";
        }
    }
}
