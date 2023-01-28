// write an applet program with three text fields with the following names: "number1", "number 2 " and " result . When the user clicks a "number 2" should be displayed in the text field named "result".

import java.awt.*;
import java.awt.event.*;
import java.applet.*;



public class applet extends Applet implements ActionListener{
    TextField num1,num2,result;
    Button sum;

    public void init(){
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);

        result.setEditable(false);

        sum = new Button("Display");
        add(num1);
        add(num2);
        add(result);
        add(sum);
        sum.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        String text = num2.getText();
        result.setText(text);
    }
}
