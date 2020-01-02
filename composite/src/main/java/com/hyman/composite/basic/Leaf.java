package com.hyman.composite.basic;

/**
 * @author HuHan
 * @description 叶子构件
 * @date 2020/01/02 10:28
 */
public class Leaf extends Component {
    @Override
    void add(Component c) {
        // 异常处理
    }

    @Override
    void remove(Component c) {
        // 异常处理
    }

    @Override
    Component getChild(int i) {
        // 异常处理
        return null;
    }

    @Override
    void operation() {
        System.out.println("叶子构件业务方法");
    }
}
