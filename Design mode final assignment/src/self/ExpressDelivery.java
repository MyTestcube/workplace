package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpressDelivery implements ActionListener {
    private JFrame jFrame3;
    public ExpressDelivery(JFrame jFrame3) {
        this.jFrame3 = jFrame3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame jFrame4 =new JFrame();

        FlowLayout flowLayout1=new FlowLayout(FlowLayout.CENTER,5,5);
        jFrame4.setLayout(flowLayout1);

        Dimension dimension=new Dimension(300,300);
        Dimension dimension1=new Dimension(240,50);
        Dimension dimension2=new Dimension(100,50);

        jFrame4.setTitle("快递已经打包送往目的地，请付款签收");
        jFrame4.setSize(400,300);


        ImageIcon imageIcon=new ImageIcon("D:\\IntelliJ\\IntelliJ IDEA 2020.1.1\\workplace\\Design mode final assignment\\box.jpg");

        JLabel label=new JLabel(imageIcon);
        label.setBounds(0,0,200,200);
        jFrame4.setLocationRelativeTo(null);
        jFrame4.add(label);


        jFrame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame4.setVisible(true);
        jFrame4.setResizable(false);


        jFrame3.dispose();
    }
}
