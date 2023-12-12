import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

class MyFrame extends JFrame  implements ActionListener {
    private static final int FRAME_WIDTH =300;
    public static final int FRAME_HEIGHT = 300;
    public static final int FRAME_X_ORIGINAL = 150;
    public static final int FRAME_Y_ORIGINAL = 250;
    private JButton cancelButton;
    private JButton okButton;

    public MyFrame(){
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(true);
        setTitle("Program JButtonFrame");
        setLocation(FRAME_X_ORIGINAL,FRAME_Y_ORIGINAL);
        contentPane.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("Cancel");
        contentPane.add(cancelButton);
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton =(JButton) event.getSource();
        String buttonText = clickedButton.getText();
        setTitle("You CLicked"+buttonText);
    }
}


