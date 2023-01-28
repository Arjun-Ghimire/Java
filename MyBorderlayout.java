import java.awt.*;


public class MyBorderlayout extends Frame{
    public MyBorderlayout() {
        setTitle("Border Layout Example");
        setLayout(new BorderLayout());

        // now this will add all the button on the window, short code and simple!
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("Center"), BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new MyBorderlayout();
    }
}
