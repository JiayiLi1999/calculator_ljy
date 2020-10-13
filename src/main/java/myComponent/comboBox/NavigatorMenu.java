package myComponent.comboBox;

import myComponent.decoration.MyComboBoxUI;

import javax.swing.*;

public class NavigatorMenu extends JComboBox<String> {
//    陈氢start
    public NavigatorMenu(){
        super();
        this.addItem("计算器");
        this.addItem("单位转换");
        this.addItem("方程计算");
        this.addItem("生成随机数");
        this.addItem("数独游戏");
        this.addItem("上传背景");
        this.setUI(new MyComboBoxUI("arrow.png"));
    }
//    陈氢end
}
