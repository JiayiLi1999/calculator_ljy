package view.panels;
import myComponent.*;
import myComponent.button.*;
import myComponent.comboBox.*;
import myComponent.panel.GeneralPanel;
import myComponent.panel.HasakiPanel;

import javax.swing.*;
import java.awt.*;

public class Transformer {
//    陈氢start
    private StringBuilder postfix = new StringBuilder();
    private MyTextField rawText = new MyTextField("0",2);
    private ClearButton clearButton=new ClearButton();
    private DeleteButton deleteButton=new DeleteButton();
    private  final String[] NUMBERKEYS = {  "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};
    private NumberButton[] numberButtons=new NumberButton[NUMBERKEYS.length];
    private PointButton pointButton=new PointButton(postfix,rawText);
    private TransMenu menu;
    private UnitsComboBox[] unitsComboBoxes=new UnitsComboBox[2];
    private MyTextField resultText = new MyTextField("",2);
    private TransLabel label;

    public JPanel init(){
        // 初始化各个部件
        label=new TransLabel();
        unitsComboBoxes[0]=new UnitsComboBox();
        unitsComboBoxes[1]=new UnitsComboBox();
        unitsComboBoxes[0].formerTextListener(rawText,resultText,label);
        unitsComboBoxes[1].latterTextListener(rawText,resultText,label);
        menu=new TransMenu(unitsComboBoxes,label);
        for (int i = 0; i < NUMBERKEYS.length; i++) {
            numberButtons[i] = new NumberButton(NUMBERKEYS[i]);
            numberButtons[i].transformerListener(NUMBERKEYS[i],postfix,rawText,resultText,label);
            numberButtons[i].setBackground(new Color(245, 245, 245));
        }

        clearButton.transformerListener(postfix,rawText,resultText);
        deleteButton.transformerListener(postfix,rawText,resultText,label);

        clearButton.setBackground(new Color(255,222,173));
        deleteButton.setBackground(new Color(255,222,173));
        pointButton.setBackground(new Color(245, 245, 245));

        JPanel showPanel=new GeneralPanel();
        showPanel.setLayout(new GridLayout(5, 1, 3, 3));
        showPanel.add(menu);
        showPanel.add(rawText);
        showPanel.add(unitsComboBoxes[0]);
        showPanel.add(resultText);
        showPanel.add(unitsComboBoxes[1]);

        JPanel buttonPanel1 = new GeneralPanel();
        buttonPanel1.setLayout(new GridLayout(1,4,2,2));
        buttonPanel1.add(numberButtons[0]);buttonPanel1.add(pointButton);buttonPanel1.add(clearButton);buttonPanel1.add(deleteButton);

        JPanel buttonPanel2 = new GeneralPanel();
        // 用网格布局器，3行，3列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素
        buttonPanel2.setLayout(new GridLayout(3, 3, 3, 3));
        buttonPanel2.add(numberButtons[1]);buttonPanel2.add(numberButtons[2]);buttonPanel2.add(numberButtons[3]);
        buttonPanel2.add(numberButtons[4]);buttonPanel2.add(numberButtons[5]);buttonPanel2.add(numberButtons[6]);
        buttonPanel2.add(numberButtons[7]);buttonPanel2.add(numberButtons[8]);buttonPanel2.add(numberButtons[9]);

        JPanel buttonPanel = new GeneralPanel();
        buttonPanel.setLayout(new BorderLayout(3,3));
        buttonPanel.add("Center",buttonPanel1);
        buttonPanel.add("South", buttonPanel2);

        JPanel transformer=new GeneralPanel();
        transformer.setLayout(new BorderLayout(4, 25));
        transformer.add("North",showPanel);
        transformer.add("Center",buttonPanel);

        transformer.setBackground(Color.white);

        return transformer;
    }
}
