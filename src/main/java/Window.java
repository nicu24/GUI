import javax.swing.*;

public class Window {


    public void show(Vector v)
        {
            JFrame jFrame = new JFrame() {};

            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);


            JLabel jLabelX = new JLabel("x: "+v.getX());
            JLabel jLabelY = new JLabel("y: "+v.getY());
            JLabel jLabelX1 = new JLabel("x1: "+v.getX1());
            JLabel jLabelY1 = new JLabel("Y1: "+v.getY1());


            JPanel panel = new JPanel();
            panel.add(jLabelX);
            panel.add(jLabelY);
            panel.add(jLabelX1);
            panel.add(jLabelY1);


            jFrame.getContentPane().add(panel);
            jFrame.pack();
            jFrame.setBounds(500,500,200,100);

    }

}
