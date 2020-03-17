import javax.swing.*;
import java.awt.*;

public class StartMenu  extends JDialog {

    public StartMenu(int Loc[]) {

        JPanel Header = createHeader();
        JPanel Content = createContent();
        JPanel Footer = createFooter();
        BorderLayout borderLayout = new BorderLayout(5,5);
        setLayout(borderLayout);
        add(Header, BorderLayout.NORTH);
        getContentPane().add(Content, BorderLayout.CENTER);
        add(Footer, BorderLayout.SOUTH);
        setSize(new Dimension(300, 225));
        pack();
        setLocation( setLoc( Loc));
        setVisible(true);


    }

    private Point setLoc(int[] Loc) {
        Point result = new Point();
        Loc[2] = Loc[2]/2 - (getSize().width/2);
        Loc[3] = Loc[3]/2 - (getSize().height/2);
        result.x = Loc[0] + Loc[2];
        result.y = Loc[1] + Loc[3];

        return  result;
    }


    private JPanel createFooter() {
        JPanel panel = new JPanel();
        JButton Back = new JButton("Wroc");
        panel.add(Back);
        JButton Next = new JButton("Dalej");
        panel.add(Next);
        return  panel;
    }

    private JPanel createContent() {
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(1,3, 5,5);
        panel.setLayout(gridLayout);
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
        panel.add(Easy);
        panel.add(Medium);
        panel.add(Hard);
        return  panel;
    }

    private JPanel createHeader() {
        JPanel panel = new JPanel();
        JLabel Nick = new JLabel("Imie: ");
        Nick.setForeground(Color.GRAY);
        Font font = new Font("Arial", Font.BOLD+Font.ITALIC,15);
        Nick.setFont(font);
        panel.add(Nick);
        JTextField SetNick = new JTextField(15);
        SetNick.setForeground(Color.GRAY);
        SetNick.setFont(font);
        panel.add(SetNick);
        return  panel;
    }

}
