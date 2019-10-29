package com.hyman.singleton.ex01;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author HuHan
 * @description
 * @date 2019/10/29 15:21
 */
public class SingletonEager {

    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        BaJie obj1 = BaJie.getInstance();
        contentPane.add(obj1);
        BaJie obj2 = BaJie.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    static class BaJie extends JPanel {
        private static BaJie instance = new BaJie();

        private BaJie() {
            String path = BaJie.class.getClassLoader().getResource("images/Bajie.jpg").getPath();
            JLabel l1 = new JLabel(new ImageIcon(path));
            this.add(l1);
        }

        public static BaJie getInstance() {
            return instance;
        }
    }

}
