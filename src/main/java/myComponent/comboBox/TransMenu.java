package myComponent.comboBox;

import myComponent.TransLabel;
import myComponent.decoration.MyComboBoxUI;

import javax.swing.JComboBox;

public class TransMenu extends JComboBox<String> {

    public TransMenu(UnitsComboBox[] unitsComboBoxes, TransLabel label){
        super();
        this.addItem("长度");
        this.addItem("质量");
        this.addItem("速率");
        this.setOpaque(true);
        this.setUI(new MyComboBoxUI("arrow2.png"));
        this.addActionListener(e -> {
               switch (this.getSelectedIndex()){
                   case 0:{
                       label.setNo(0);
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
                       label.setNo(1);
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
                       label.setNo(2);
                       label.setRow(0);
                       label.setCol(0);
                       for (UnitsComboBox unitsComboBox:unitsComboBoxes){
                           unitsComboBox.removeAllItems();
                           unitsComboBox.addItem("米/秒");
                           unitsComboBox.addItem("公里/小时");
                           unitsComboBox.addItem("英里/小时");
                           unitsComboBox.addItem("节");
                           unitsComboBox.setSelectedIndex(1);
                       }
                       break;
                   }
               }
        });
        this.setSelectedIndex(0);
    }

}
