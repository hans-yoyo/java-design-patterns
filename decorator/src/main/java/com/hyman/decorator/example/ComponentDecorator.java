package com.hyman.decorator.example;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 11:41
 */
public class ComponentDecorator extends Component {

    private Component component; // 维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
