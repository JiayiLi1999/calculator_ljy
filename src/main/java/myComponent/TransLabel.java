package myComponent;

import lombok.Getter;
import lombok.Setter;
import utils.Constant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;

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
            case 0:{
                rate=Constant.LENGTH[row][col];
                try{this.removeMouseListener(this.getMouseListeners()[0]);}
                catch (IndexOutOfBoundsException ignored){}

                if(this.getMouseListeners().length==0){
                    this.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            TransLabel.super.removeMouseListener(TransLabel.super.getMouseListeners()[0]);
                            updateText();
                        }
                        @Override
                        public void mousePressed(MouseEvent e) { }
                        @Override
                        public void mouseReleased(MouseEvent e) { }
                        @Override
                        public void mouseEntered(MouseEvent e) { }
                        @Override
                        public void mouseExited(MouseEvent e) { }
                    });
                }
                return; }
            case 1:{rate=Constant.MASS[row][col];
                try{this.removeMouseListener(this.getMouseListeners()[0]);}
                catch (IndexOutOfBoundsException ignored){}break;}
            case 2:{rate=Constant.SPEED[row][col];
                try{this.removeMouseListener(this.getMouseListeners()[0]);}
                catch (IndexOutOfBoundsException ignored){}break;}
        }
        this.setText(formerText+"="+rate+latterText);
    }
//     陈氢end
}

