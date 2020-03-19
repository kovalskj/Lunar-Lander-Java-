import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public  class MainWindow extends  JFrame {

    private JButton PlayButton;
    private JButton RulesButton;
    private JButton ResultTableButton;
    private JButton AuthorsButton;
    private JButton ExitButton;


    public MainWindow(){

        JPanel Header = createHeader();
        JPanel Content = createContent();
        JPanel Footer = createFooter();
        JPanel Empty = createEmpty();
        JPanel Empty2 = createEmpty();

        BorderLayout borderLayout = new BorderLayout(10,20);
        setLayout(borderLayout);
        add(Header, BorderLayout.NORTH);
        add(Empty, BorderLayout.EAST);
        getContentPane().add(Content, BorderLayout.CENTER);
        add(Empty2, BorderLayout.WEST);
        add(Footer, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        pack();
        setSize(new Dimension(640, 480));
        setVisible(true);
    }

    public MainWindow(Point Loc, int width, int heigth){

        JPanel Header = createHeader();
        JPanel Content = createContent();
        JPanel Footer = createFooter();
        JPanel Empty = createEmpty();
        JPanel Empty2 = createEmpty();

        BorderLayout borderLayout = new BorderLayout(10,20);
        setLayout(borderLayout);
        add(Header, BorderLayout.NORTH);
        add(Empty, BorderLayout.EAST);
        getContentPane().add(Content, BorderLayout.CENTER);
        add(Empty2, BorderLayout.WEST);
        add(Footer, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(Loc);
        pack();
        setSize(new Dimension(width, heigth));
        setVisible(true);
    }

    private JPanel createHeader() {
        Color myColor = new Color(176, 196, 222);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextField TextField= new JTextField("Lunar Lander");
        Font font = new Font("Arial", Font.BOLD+Font.ITALIC,30); // sapces between operators like + && etc
        TextField.setForeground(myColor);
        TextField.setFont(font);
        TextField.setEditable(false); // use builder pattern !!! like tm.builder() [ENTER] and .component1 [ENTER] .component2 ... [ENTER] .build()
        TextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(TextField);

        return panel;
    }

    private JPanel createContent() {
        JPanel panel = new JPanel();
        PlayButton = new JButton("Graj");
        RulesButton = new JButton("Zasady");
        ResultTableButton = new JButton("Tabela wynikow");
        AuthorsButton = new JButton("Autorzy");
        ExitButton = new JButton("Wyjdź");
        //This not work, but may help if we try to design buttons
        panel.setMaximumSize(new Dimension(250, 200));
        PlayButton.setPreferredSize(new Dimension(80, 40));
        RulesButton.setPreferredSize(new Dimension(80, 40));
        ExitButton.setPreferredSize(new Dimension(80, 40));

        panel.setLayout(new GridLayout(5, 1, 10, 20));
        panel.add(PlayButton);
        panel.add(RulesButton);
        panel.add(ResultTableButton);
        panel.add(AuthorsButton);
        panel.add(ExitButton);

        PlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartMenu(CenterStartMenu());
            }
        });

        ExitButton.addActionListener(new ActionListener() {    // Application Exit Action Listener
            @Override
            public void actionPerformed(ActionEvent e) {       //Exit method
                Exit(panel);
            }
        });

        RulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rules(panel);
            }
        });

        ResultTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Results(panel);
            }
        });

        AuthorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Authors(CenterStartMenu());
            }
        });

        return panel;
    }


    private JPanel createFooter() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextField TextField = new JTextField("by Michał Ryszka and Wojciech Kowalski 2020");
        Font font = new Font("Arial", Font.BOLD+Font.ITALIC,8);
        TextField.setFont(font);
        TextField.setEditable(false);
        TextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(TextField);
        panel.add(TextField);
        return panel;
    }

    private  JPanel createEmpty() {
        JPanel panel = new JPanel();
        panel.add(Box.createRigidArea(new Dimension(30,0)));
        return  panel;
    }

    private void Exit(JPanel panel){
        if (JOptionPane.showConfirmDialog(panel,"Potwierdz jesli chcesz wyjśc.","Lunar Lander",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }

    private void Rules(JPanel panel) {
        new Rules(this.getLocationOnScreen(), this.getSize().width, this.getSize().height);
        this.dispose();
    }

    private int[]  CenterStartMenu() {  //Methods help set location StartMenu Frame
        int[] Loc = new int[4];
        Loc[0] = this.getLocationOnScreen().x;
        Loc[1] = this.getLocationOnScreen().y;
        Loc[2] = this.getSize().width;
        Loc[3] = this.getSize().height;
        return Loc;
    }

    private void Results(JPanel panel) {
        new ResultsTable(this.getLocationOnScreen(), this.getSize().width, this.getSize().height);
        this.dispose();
    }




}
