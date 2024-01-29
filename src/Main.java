import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //1 create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setBackground(new Color(189, 38, 231));
        //2 create a panel
        // default layout is flow layout
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        //3 create components
        JLabel label = new JLabel("Hello world");
        JButton button = new JButton("click me please");
        JTextField texty = new JTextField(12);
        JCheckBox checky = new JCheckBox("click me too", true);

        //adding picture
        ImageIcon icon = new ImageIcon("Images/PNG/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);
        //4 add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(texty);
        panel.add(picLabel);
        panel.add(checky);
        //5 add panel to frame
        frame.add(panel);
        //6 make the frame visible
        frame.setVisible(true);
    }
}