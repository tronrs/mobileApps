
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDemo extends JFrame implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JPanel pinkPanel;
    private JPanel greenPanel;
    private JPanel yellowPanel;
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    public static void main(String[] args)
    {
        PanelDemo gui = new PanelDemo( );
        gui.setVisible(true);
    }

    public PanelDemo( )
    {
        super("Panel Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout( ));

        JPanel biggerPanel = new JPanel( );
        biggerPanel.setLayout(new GridLayout(2, 3));


        redPanel = new JPanel( );
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel( );
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);

        bluePanel = new JPanel( );
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);

        pinkPanel = new JPanel( );
        pinkPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(pinkPanel);

        greenPanel = new JPanel( );
        greenPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(greenPanel);

        yellowPanel = new JPanel( );
        yellowPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(yellowPanel);

        add(biggerPanel, BorderLayout.CENTER);

        JPanel buttonPanelTop = new JPanel( );
        buttonPanelTop.setBackground(Color.LIGHT_GRAY);
        buttonPanelTop.setLayout(new FlowLayout( ));

        JPanel buttonPanelBottom = new JPanel( );
        buttonPanelBottom.setBackground(Color.LIGHT_GRAY);
        buttonPanelBottom.setLayout(new FlowLayout( ));

        JButton pinkButton = new JButton("Pink");
        pinkButton.setBackground(Color.PINK);
        pinkButton.addActionListener(this);
        buttonPanelTop.add(pinkButton);

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        buttonPanelTop.add(greenButton);

        JButton yellowButton = new JButton("Yellow");
        yellowButton.setBackground(Color.YELLOW);
        yellowButton.addActionListener(this);
        buttonPanelTop.add(yellowButton);

        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanelBottom.add(redButton);

        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanelBottom.add(whiteButton);

        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanelBottom.add(blueButton);

        add(buttonPanelTop, BorderLayout.NORTH);
        add(buttonPanelBottom, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        String buttonString = e.getActionCommand( );

        if (buttonString.equals("Red"))
             redPanel.setBackground(Color.RED);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if (buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else if (buttonString.equals("Pink"))
            pinkPanel.setBackground(Color.PINK);
        else if (buttonString.equals("Green"))
            greenPanel.setBackground(Color.GREEN);
        else if (buttonString.equals("Yellow"))
            yellowPanel.setBackground(Color.YELLOW);
        else
            System.out.println("Unexpected error.");
    }
}
