package myComponent.comboBox;

import myComponent.TransLabel;
import myComponent.decoration.MyComboBoxUI;

import javax.swing.JComboBox;

public class TransMenu extends JComboBox<String> {
//    陈氢start
    public TransMenu(UnitsComboBox[] unitsComboBoxes, TransLabel label){
        super();
        this.addItem("长度");
        this.addItem("质量");
        this.addItem("时区");
        this.addItem("进制");
        this.setOpaque(true);
        this.setUI(new MyComboBoxUI("arrow2.png"));
        this.addActionListener(e -> {
               switch (this.getSelectedIndex()){
                   case 0:{
                       label.setNo(1);
                       label.setRow(0);
                       label.setCol(0);
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("微米");
                           unitsComboBox.addItem("毫米");
                           unitsComboBox.addItem("厘米");
                           unitsComboBox.addItem("米");
                           unitsComboBox.addItem("公里");
                           unitsComboBox.addItem("英寸");
                           unitsComboBox.addItem("英尺");
                           unitsComboBox.addItem("英里");
                           unitsComboBox.addItem("海里");
                           unitsComboBox.setSelectedIndex(3);
                       }
                       break;
                   }
                   case 1:{
                       label.setNo(2);
                       label.setRow(0);
                       label.setCol(0);
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("克");
                           unitsComboBox.addItem("斤");
                           unitsComboBox.addItem("千克");
                           unitsComboBox.addItem("公吨");
                           unitsComboBox.addItem("盎司");
                           unitsComboBox.addItem("磅");
                           unitsComboBox.addItem("克拉");
                           unitsComboBox.setSelectedIndex(2);
                       }
                       break;
                   }
                   case 2:{
                       label.setNo(0);
                       label.setRow(0);
                       label.setCol(0);
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
//                           unitsComboBox.setSelectedIndex(-1);
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("伦敦(0)");
                           unitsComboBox.addItem("罗马(+1)");
                           unitsComboBox.addItem("莫斯科(+3)");
                           unitsComboBox.addItem("新加坡(+7)");
                           unitsComboBox.addItem("北京(+8)");
                           unitsComboBox.addItem("悉尼(+10)");
                           unitsComboBox.addItem("纽约(-5)");
                           unitsComboBox.addItem("巴西利亚(-3)");
                           unitsComboBox.setSelectedIndex(0);
                       }
                       break;
                   }
                   case 3:{
                       label.setNo(3);
                       label.setRow(0);
                       label.setCol(0);
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("二进制");
                           unitsComboBox.addItem("八进制");
                           unitsComboBox.addItem("十六进制");
                           unitsComboBox.setSelectedIndex(1);
                       }
                       break;
                   }
               }
        });
        this.setSelectedIndex(0);
    }
//    陈氢end
}
