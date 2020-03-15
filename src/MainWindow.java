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

public  class MainWindow extends  JFrame { // -1 space !

    private JButton PlayButton;
    private JButton HelpButton;
    private JButton ExitButton;

    // try to make function as short as it is possible
    // extract long method to many small (SINGLE RESPONSIBILITY) functions

    public MainWindow(){
        JPanel Header = createHeader(); // variable name - sneakCase start from small letter in Java !
        JPanel Content = createContent();
        JPanel Footer = createFooter();
        JPanel Empty = createEmpty();
        JPanel Empty2 = createEmpty();

        BorderLayout borderLayout = new BorderLayout(10,20);    // here var name is correct - in whole project u should use one convention, initialize var then assing value
        setLayout(borderLayout);
        add(Header, BorderLayout.NORTH);    // use Ctrl + Alt + Shift + L - to auto reformat code
        add(Empty, BorderLayout.EAST);  // static import hint - Alt + Enter -> use import ...
        getContentPane().add(Content, BorderLayout.CENTER);
        add(Empty2, BorderLayout.WEST);
        add(Footer, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // do not add to much empty lines

        pack();
        setSize(new Dimension(640, 480));
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
        PlayButton = new JButton("Graj");   // use userFriendly names like playButton or if u want to group by name buttonPlay e.g.
        HelpButton = new JButton("Pomoc");  // use EN names and extract all Strings content to .properties
        ExitButton = new JButton("Wyjdź");
        panel.setMaximumSize(new Dimension(250, 200)); // if it is possible don't create one line methodd like this ... hint for  debuging
        PlayButton.setPreferredSize(new Dimension(80, 40)); // here it is OK!
        HelpButton.setPreferredSize(new Dimension(80, 40)); // if u use 100 - set variable for it and name it ... - now I dont know what is this 100 ...
        ExitButton.setPreferredSize(new Dimension(80, 40));
        panel.setLayout(new GridLayout(3, 1, 10, 30));
        panel.add(PlayButton);
        panel.add(HelpButton);
        panel.add(ExitButton);

        PlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartMenu( CenterStartMenu());
            }
        });

        ExitButton.addActionListener(new ActionListener() {    // Application Exit Action Listener
            @Override
            public void actionPerformed(ActionEvent e) {       //Exit method
                exit(panel);
            }
        });

        HelpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                help(panel);                                //Open website withe Game rules
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

    private void exit(JPanel panel){
        if (JOptionPane.showConfirmDialog(panel,"Potwierdz jesli chcesz wyjśc.","Lunar Lander",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }

    private void help(JPanel panel) {
        JLabel hyperlink = new JLabel("Wikipedia");
        hyperlink.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){

                    if (Desktop.isDesktopSupported())
                    {
                        Desktop desktop = Desktop.getDesktop();
                        try
                        {
                            desktop.browse(new URL("https://pl.wikipedia.org/wiki/Lunar_Lander_(gra_komputerowa)").toURI());
                        }
                        catch (IOException ex)
                        {
                            ex.printStackTrace();
                        }
                        catch (URISyntaxException ex)
                        {
                            ex.printStackTrace();
                        }
                    }
            }
            @Override
            public void mousePressed(MouseEvent e){}
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){}
            @Override
            public void mouseExited(MouseEvent e){}
        });
        JOptionPane.showMessageDialog(panel, hyperlink, "Zasady", JOptionPane.INFORMATION_MESSAGE);
    }

    private int[]  CenterStartMenu() {  //Methods help set location StartMenu Frame
        int[] Loc = new int[2];
        Loc[0] = (this.getLocationOnScreen().x + this.getSize().width/4);
        Loc[1] = (this.getLocationOnScreen().y + this.getSize().height/4);
        return Loc;
    }

}
// at the end of each file u should add new line !