package com.hyman.decorator.example;

/**
 * @author HuHan
 * @description 具体构件类
 * @date 2020/01/02 11:39
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}
