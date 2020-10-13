package myComponent;

import lombok.Getter;
import lombok.Setter;
import utils.Constant;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class TransLabel extends JLabel {
//    陈氢start
    private String formerText="";
    private String latterText="";
    private int no=0;
    private int row=0;
    private int col=0;
    private double rate;
    public TransLabel(){
        super();
        this.setForeground(Color.BLUE);
        this.setPreferredSize(new Dimension(340,30));
    }
    public void updateText(){
        switch(no){
            case 0:{rate=Constant.LENGTH[row][col];
                      try{this.removeMouseListener(this.getMouseListeners()[0]);}
                      catch (IndexOutOfBoundsException ignored){}break;}
            case 1:{rate=Constant.MASS[row][col];
                try{this.removeMouseListener(this.getMouseListeners()[0]);}
                catch (IndexOutOfBoundsException ignored){}break;}
            }
            this.setText(formerText+"="+rate+latterText);
        }
//     陈氢end
    }

