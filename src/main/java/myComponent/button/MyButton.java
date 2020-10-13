package myComponent.button;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(){
        super();
        this.setForeground(Color.black);
        // 设置按钮背景不透明
        this.setOpaque(true);
        // 去焦点框
        this.setFocusPainted(false);
        // 可填充
        this.setContentAreaFilled(true);
        // 设置字体
        this.setFont(new Font("Meiryo UI", 1, 16));
    }
}
