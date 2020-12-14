package myComponent.button;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(){
        super();
        this.setForeground(Color.black);
        // 设置按钮背景透明
        this.setOpaque(true);
        // 去焦点框
        this.setFocusPainted(false);
        // 可填充
        this.setContentAreaFilled(true);
        // 设置字体
        this.setFont(new Font("Meiryo UI", 1, 16));
        // 设置边框不可见
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10));
    }
}

