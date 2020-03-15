import javax.swing.*;
import java.awt.*;

public class StartMenu  extends JFrame {

    public StartMenu(int Loc[]) {

        FlowLayout Layout = new FlowLayout();
        setLayout(Layout);

        JLabel Nick = new JLabel("Imie: ");
        Nick.setForeground(Color.GRAY);
        Font font = new Font("Arial", Font.BOLD+Font.ITALIC,15);
        Nick.setFont(font);
        add(Nick);

        JTextField SetNick = new JTextField(15);
        SetNick.setForeground(Color.GRAY);
        SetNick.setFont(font);
        add(SetNick);

        JRadioButton Easy = new JRadioButton("Latwy");
        JRadioButton Medium = new JRadioButton("Sredni");
        JRadioButton Hard = new JRadioButton("Trudny");
        ButtonGroup DifficultGroup = new ButtonGroup();
        DifficultGroup.add(Easy);
        DifficultGroup.add(Medium);
        DifficultGroup.add(Hard);
        Font font2 = new Font("Arial", Font.BOLD,15);
        Easy.setFont(font2);
        Medium.setFont(font2);
        Hard.setFont(font2);
        add(Easy);
        add(Medium);
        add(Hard);

        JButton Back = new JButton("Wroc");
        add(Back);
        JButton Next = new JButton("Dalej");
        add(Next);

        setLocation(Loc[0], Loc[1]);
        setSize(new Dimension(280, 150));
        setVisible(true);


    }
}
