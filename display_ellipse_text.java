import java.awt.*;
import javax.swing.*;

public class display_ellipse_text {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Ellipse with Text");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.LIGHT_GRAY);
                g.drawOval(50,50,200,100);
                g.setFont(new Font("Serif", Font.BOLD, 20));
                g.drawString("Pokhara University", 75, 100);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}
