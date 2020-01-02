package com.hyman.composite.basic;

import java.util.ArrayList;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 10:30
 */
public class Composite extends Component {

    private ArrayList<Component> children = new ArrayList<>();

    @Override
    void add(Component c) {
        children.add(c);
    }

    @Override
    void remove(Component c) {
        children.remove(c);
    }

    @Override
    Component getChild(int i) {
        return children.get(i);
    }

    @Override
    void operation() {
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for (Component component : children) {
            component.operation();
        }
    }
}
