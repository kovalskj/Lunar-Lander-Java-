import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public  class MainWindow extends  JFrame {

    private JButton playButton;
    private JButton rulesButton;
    private JButton resultTableButton;
    private JButton authorsButton;
    private JButton exitButton;
    private JPanel Header;
    private JPanel Content;
    private JPanel Footer;
    private JPanel Empty;
    private JPanel Empty2;


    public MainWindow() {

        Header = createHeader();
        Content = createContent();
        Footer = createFooter();
        Empty = createEmpty();
        Empty2 = createEmpty();
        pack();
        setSize(new Dimension(640, 480));
        try {
            BufferedImage myImage = ImageIO.read(new File("menu_background.jpg"));
            this.setContentPane(new BackgroundImage(myImage, this));
        }catch (Exception e) {

        }
        BorderLayout borderLayout = new BorderLayout(10,20);
        setLayout(borderLayout);
        add(Header, BorderLayout.NORTH);
        add(Empty, BorderLayout.EAST);
        getContentPane().add(Content, BorderLayout.CENTER);
        add(Empty2, BorderLayout.WEST);
        add(Footer, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        Font font = new Font("Arial", Font.BOLD + Font.ITALIC,30);
        TextField.setForeground(myColor);
        TextField.setFont(font);
        TextField.setEditable(false);
        TextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        TextField.setOpaque(false);
        panel.add(TextField);
        panel.setOpaque(false);
        return panel;
    }

    private JPanel createContent() {
        JPanel panel = new JPanel();
        playButton = new JButton("Graj");
        rulesButton = new JButton("Zasady");
        resultTableButton = new JButton("Tabela wynikow");
        authorsButton = new JButton("Autorzy");
        exitButton = new JButton("Wyjdź");

        panel.setLayout(new GridLayout(5, 1, 10, 20));
        panel.add(playButton);
        panel.add(rulesButton);
        panel.add(resultTableButton);
        panel.add(authorsButton);
        panel.add(exitButton);
        panel.setOpaque(false);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartMenu(centerFrame());
            }
        });

        exitButton.addActionListener(new ActionListener() {    // Application Exit Action Listener
            @Override
            public void actionPerformed(ActionEvent e) {       //Exit method
                Exit(panel);
            }
        });

        rulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rules();
            }
        });

        resultTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Results();
            }
        });

        authorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Authors(centerFrame());
            }
        });

        return panel;
    }


    private JPanel createFooter() {
        JPanel panel = new JPanel();
        Color myColor = new Color(176, 196, 222);
        panel.setLayout(new FlowLayout());
        JTextField TextField = new JTextField("by Michał Ryszka and Wojciech Kowalski 2020");
        Font font = new Font("Arial", Font.BOLD+Font.ITALIC,8);
        TextField.setFont(font);
        TextField.setForeground(myColor);
        TextField.setEditable(false);
        TextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        TextField.setOpaque(false);
        panel.add(TextField);
        panel.setOpaque(false);
        return panel;
    }

    private  JPanel createEmpty() {
        JPanel panel = new JPanel();
        panel.add(Box.createRigidArea(new Dimension(30,0)));
        panel.setOpaque(false);
        return  panel;
    }

    private void Exit(JPanel panel){
        if (JOptionPane.showConfirmDialog(panel,"Potwierdz jesli chcesz wyjśc.","Lunar Lander",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }

    private void Rules() {
        new Rules(this.getLocationOnScreen(), this.getSize().width, this.getSize().height);
        this.dispose();
    }

    private int[]  centerFrame() {
        int[] Loc = new int[4];
        Loc[0] = this.getLocationOnScreen().x;
        Loc[1] = this.getLocationOnScreen().y;
        Loc[2] = this.getSize().width;
        Loc[3] = this.getSize().height;
        return Loc;
    }

    private void Results() {
        new ResultsTable(this.getLocationOnScreen(), this.getSize().width, this.getSize().height);
        this.dispose();
    }




}
