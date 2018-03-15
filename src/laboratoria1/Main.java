package laboratoria1;

import figury.Run;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main /*extends JFrame*/{
    /*public Main()
    {
        super("Figury - Labki nr 1");
        this.setBounds(300,300,300,300);
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void initComponents()
    {
        panel.add(trójkąt);
        panel.add(kwadrat);
        panel.add(koło);

        grupa.add(trójkąt);
        grupa.add(kwadrat);
        grupa.add(koło);


        trójkąt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.getContentPane().add(panel);
       // pack();
    }

    JPanel panel = new JPanel();
    ButtonGroup grupa = new ButtonGroup();
    JRadioButton trójkąt = new JRadioButton("Trójkąt");
    JRadioButton kwadrat = new JRadioButton("Kwadrat");
    JRadioButton koło = new JRadioButton("Koło");*/
    public static void main(String[] args) {

        //new Main().setVisible(true);
        Run program = new Run();
        program.run();

    }
}
