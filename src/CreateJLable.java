import javax.swing.*;
import java.awt.*;

public class CreateJLable extends JFrame {
    public CreateJLable(){
        getContentPane().setLayout(null);
        setTitle("Name And Age");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel nameLabel =new JLabel("Name: ");
        nameLabel.setFont(new Font("Arial",Font.PLAIN,20));
        nameLabel.setSize(300,30);
        nameLabel.setLocation(50,30);
        add(nameLabel);
    }

}
