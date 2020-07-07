

import lombok.extern.log4j.Log4j;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.logging.Logger;

@Log4j
public class Main {
    final static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(){ };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        Window window = new Window();


        JTextField vector1TextX = new JTextField("");
        vector1TextX.setColumns(2);
        JTextField vector1TextY = new JTextField();
        vector1TextY.setColumns(2);

        JTextField vector1TextX1 = new JTextField();
        vector1TextX1.setColumns(2);
        JTextField vector1TextY1 = new JTextField();
        vector1TextY1.setColumns(2);

        JTextField vector2TextX = new JTextField("");
        vector2TextX.setColumns(2);
        JTextField vector2TextY = new JTextField();
        vector2TextY.setColumns(2);

        JTextField vector2TextX1 = new JTextField();
        vector2TextX1.setColumns(2);
        JTextField vector2TextY1 = new JTextField();
        vector2TextY1.setColumns(2);



        JButton calculateAddButon = new JButton("Calculate ADD: ");
        JButton calculateDiffButon = new JButton("Calculate DIFF: ");



        JPanel jPanel = new JPanel();
        JLabel jLabelVector1 = new JLabel();
        JLabel jLabelVector2 = new JLabel();


        jLabelVector1.setText("Vector 1: ");
        jPanel.add(jLabelVector1);
        jPanel.add(vector1TextX);
        jPanel.add(vector1TextY);
        jPanel.add(vector1TextX1);
        jPanel.add(vector1TextY1);

        jLabelVector2.setText("Vector 2: ");
        jPanel.add(jLabelVector2);
        jPanel.add(vector2TextX);
        jPanel.add(vector2TextY);
        jPanel.add(vector2TextX1);
        jPanel.add(vector2TextY1);

        jPanel.add(calculateAddButon);
        jPanel.add(calculateDiffButon);

        jFrame.getContentPane().add(jPanel);
        jFrame.pack();



        calculateAddButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                Vector vector1 = new Vector(Integer.parseInt(vector1TextX.getText()), Integer.parseInt(vector1TextY.getText()), Integer.parseInt(vector1TextX1.getText()),
                        Integer.parseInt(vector1TextY1.getText()));

                Vector vector2 = new Vector(Integer.parseInt(vector2TextX.getText()), Integer.parseInt(vector2TextY.getText()), Integer.parseInt(vector2TextX1.getText()),
                        Integer.parseInt(vector2TextY1.getText()));



            Vector vector3;
            vector3=Vector.sum(vector1,vector2);
            window.show(vector3);
                     }catch (Exception n)
                                            {
                logger.info("Exceptie la adunare "+n);
            }
            }
        });

        calculateDiffButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Vector vector1 = new Vector(Integer.parseInt(vector1TextX.getText()), Integer.parseInt(vector1TextY.getText()), Integer.parseInt(vector1TextX1.getText()),
                            Integer.parseInt(vector1TextY1.getText()));

                    Vector vector2 = new Vector(Integer.parseInt(vector2TextX.getText()), Integer.parseInt(vector2TextY.getText()), Integer.parseInt(vector2TextX1.getText()),
                            Integer.parseInt(vector2TextY1.getText()));

                    Vector vector3;
                    vector3 = Vector.diff(vector1, vector2);

                    window.show(vector3);
                }catch (Exception n){
                    logger.info("Exceptie la scadere "+n);
                }

            }
        });
        jFrame.setSize(200,200);



    }
}
