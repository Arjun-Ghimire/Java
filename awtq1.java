// ques = use frame it should have three textfield and one button, it should accept 2 numbers, when user clicks the button it should caluclate sum of two numbers entered and disply the result in third 
// text field.

// trust me I am tired enough to write all imports!
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awtq1 extends Frame implements ActionListener{

    TextField f1,f2,f3;
    Button b1;


    public awtq1(){

        setTitle("substraction");
        setLayout(null);

        Label num1label = new Label("num");
        num1label.setBounds(50,30,80,20);

        add(num1label);

        f1= new TextField();
        f1.setBounds(50,60,80,20);

        f2= new TextField();
        f2.setBounds(50,90,80,20);

        f3= new TextField();
        f3.setBounds(50,120,80,20);

        b1 = new Button("Subtract");
        b1.setBounds(50,190,80,70);
        
        setSize(500,500);
        add(f1);
        add(f2);
        add(f3);
        add(b1);

        setVisible(true);

        b1.addActionListener(this);

        
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int n1 = Integer.parseInt(f1.getText());
            int n2 = Integer.parseInt(f2.getText());
            int sub = n1-n2;
            f3.setText(Integer.toString(sub));
        }
    }

    public static void main(String[] args){
        new awtq1();

    }
}
