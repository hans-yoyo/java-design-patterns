package com.hyman.decorator.example;

/**
 * @author HuHan
 * @description 具体装饰类
 * @date 2020/01/02 11:43
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }

}
