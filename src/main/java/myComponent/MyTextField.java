package myComponent;

import javax.swing.JTextField;
import java.awt.*;

public class MyTextField extends JTextField {

    public MyTextField(String name,int RorL){
        super();
        this.setText(name);
        // 文本框中的内容采用右对齐方式
        this.setHorizontalAlignment(RorL);
        // 不允许修改结果文本框
        this.setEditable(false);
        // 设置文本框的字体
        this.setFont(new Font("ARIAL",Font.BOLD,22));
        // 设置文本框背景颜色为透明
        this.setOpaque(false);
        //设置背景
        //this.setBackground(new Color(255,250,250));

    }

}
