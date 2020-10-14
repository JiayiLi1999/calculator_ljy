package view.panels;

import myComponent.button.*;
import myComponent.MyTextField;
import myComponent.panel.GeneralPanel;
import myComponent.panel.HasakiPanel;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class Science{

    private StringBuilder postfix = new StringBuilder();
    private MyTextField resultText = new MyTextField("0",4);

    private ClearButton clearButton;
    private DeleteButton deleteButton;

    private final String[] RESULTKEYS={"n!","1/x","|x|","="};
    private ResultButton[] resultButtons=new ResultButton[RESULTKEYS.length];//1/x,|x|,exp,n!,=
    private final  String[] NUMBERKEYS = { "7", "8", "9", "4", "5", "6","1","2","3","0", "π", "e"};
    private NumberButton[] numberButtons=new NumberButton[NUMBERKEYS.length];//0,1,2,3,4,5,6,7,8,9
    private PointButton pointButton;

    private final  String[] OPERATORKEYS = { "%","e^x","2√x", "x²", "x^y", "log", "ln", "sin", "cos", "tan", "(", ")",  "/", "*", "-", "+"};
    private final  String[] OPERATORS = { "%","e^", "sqrt(", "^2", "^",  "log(", "ln(", "sin(", "cos(", "tan(", "(", ")",  "/", "*", "-", "+"};


    private OperatorButton[] operatorButtons=new OperatorButton[OPERATORKEYS.length];


    public Science(){

    }
    public JPanel init(){

        //      初始化4个结果按钮
        for (int i = 0; i <RESULTKEYS.length; i++) {
            resultButtons[i] = new ResultButton(RESULTKEYS[i]);
            resultButtons[i].scienceListener(RESULTKEYS[i],postfix,resultText);

            //设置等号为蓝色，其他为灰色
            if(i<3)
                resultButtons[i].setBackground(new Color(245, 245, 245));
            else
                resultButtons[i].setBackground(new Color(126, 192, 238));//蓝色
        }
        //      初始化12个数字按钮
        for (int i = 0; i <NUMBERKEYS.length; i++) {
            numberButtons[i] = new NumberButton(NUMBERKEYS[i]);
            numberButtons[i].generalListener(NUMBERKEYS[i],postfix,resultText);
            //设置0-9数字按钮字体颜色为白色，其他为灰色
            if (i<10)
                numberButtons[i].setBackground(Color.WHITE);
            else
                numberButtons[i].setBackground(new Color(245, 245, 245));
        }

        //        初始化16个运算符按钮
        for (int i = 0; i <OPERATORKEYS.length; i++) {
            operatorButtons[i] = new OperatorButton(OPERATORKEYS[i],OPERATORS[i],postfix,resultText,pointButton);
            // 设置颜色
            operatorButtons[i].setBackground(new Color(	245, 245, 245));
        }

        // 初始化后退、清除按钮
        clearButton=new ClearButton();
        deleteButton=new DeleteButton();
        pointButton=new PointButton(postfix,resultText);
        // 设置颜色
        clearButton.setBackground(new Color(255,222,173));
        deleteButton.setBackground(new Color(255,222,173));
        pointButton.setBackground(Color.WHITE);

        clearButton.generalListener(postfix,resultText);
        deleteButton.generalListener(postfix,resultText);

        JPanel padPanel = new GeneralPanel();
        padPanel.setLayout(new GridLayout(7, 5, 3, 3));
        padPanel.add(operatorButtons[0]);padPanel.add(resultButtons[0]);padPanel.add(operatorButtons[1]);padPanel.add(clearButton);padPanel.add(deleteButton);
        padPanel.add(resultButtons[1]);padPanel.add(resultButtons[2]);padPanel.add(operatorButtons[2]);padPanel.add(operatorButtons[3]);padPanel.add(operatorButtons[4]);
        padPanel.add(operatorButtons[5]);padPanel.add(numberButtons[10]);padPanel.add(numberButtons[11]);padPanel.add(operatorButtons[10]);padPanel.add(operatorButtons[11]);
        padPanel.add(operatorButtons[6]);padPanel.add(numberButtons[0]);padPanel.add(numberButtons[1]);padPanel.add(numberButtons[2]);padPanel.add(operatorButtons[12]);
        padPanel.add(operatorButtons[7]);padPanel.add(numberButtons[3]);padPanel.add(numberButtons[4]);padPanel.add(numberButtons[5]);padPanel.add(operatorButtons[13]);
        padPanel.add(operatorButtons[8]);padPanel.add(numberButtons[6]);padPanel.add(numberButtons[7]);padPanel.add(numberButtons[8]);padPanel.add(operatorButtons[14]);
        padPanel.add(operatorButtons[9]);padPanel.add(pointButton);padPanel.add(numberButtons[9]);padPanel.add(resultButtons[3]);padPanel.add(operatorButtons[15]);

        JPanel science =new GeneralPanel();

        science.setLayout(new BorderLayout(3, 5));
        science.add("South",padPanel);
        science.add("Center",resultText);



        return science;
    }
//    陈氢end
}
