package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class Box2 implements ActionListener {
    private JFrame jFrame1;
    private JTextField jTextField1;
    private String j1;
    public Box2(JFrame jFrame1, JTextField jTextField1,String j1){
        this.jFrame1=jFrame1;
        this.jTextField1=jTextField1;
        this.j1=j1;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String count1=null;

        count1=jTextField1.getText();


        Pattern pattern=Pattern.compile("^[-\\+]?[\\d]*$");
        if (pattern.matcher(count1).matches()) {


            JFrame jFrame2 = new JFrame();
            ButtonGroup buttonGroup = new ButtonGroup();
            FlowLayout flowLayout1 = new FlowLayout(FlowLayout.CENTER, 5, 5);
            jFrame2.setLayout(flowLayout1);

            Dimension dimension = new Dimension(300, 30);
            Dimension dimension1 = new Dimension(240, 50);
            Dimension dimension2 = new Dimension(100, 50);

            jFrame2.setTitle("订单详情");
            jFrame2.setSize(360, 400);

            JLabel jLabel1 = new JLabel();
            jLabel1.setText("真实姓名：");
            jLabel1.setPreferredSize(dimension);
            jFrame2.add(jLabel1);
//Alex
            JTextField jTextField1 = new JTextField();
            jTextField1.setPreferredSize(dimension);
            jFrame2.add(jTextField1);

            JLabel jLabel2 = new JLabel();
            jLabel2.setText("详细地址：");
            jLabel2.setPreferredSize(dimension);
            jFrame2.add(jLabel2);

            JTextField jTextField2 = new JTextField();
            jTextField2.setPreferredSize(dimension);
            jFrame2.add(jTextField2);

            JLabel jLabel3 = new JLabel();
            jLabel3.setText("取货方式：");
            jLabel3.setPreferredSize(dimension);
            jFrame2.add(jLabel3);

            JRadioButton jRadioButton1 = new JRadioButton("快递送达");
            jRadioButton1.setPreferredSize(dimension1);

//Alex

            JRadioButton jRadioButton2 = new JRadioButton("到店自取");
            jRadioButton2.setPreferredSize(dimension1);
            buttonGroup.add(jRadioButton1);
            buttonGroup.add(jRadioButton2);
            jFrame2.add(jRadioButton1);
            jFrame2.add(jRadioButton2);

            JButton jButton1 = new JButton();
            jButton1.setText("确定");
            jButton1.setPreferredSize(dimension2);
            jFrame2.getRootPane().setDefaultButton(jButton1);
            jFrame2.add(jButton1);

            jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame2.setLocationRelativeTo(null);
            jFrame2.setResizable(false);
            jFrame2.setVisible(true);
//        JFrame jFrame2=new JFrame();
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,5,5);
//        jFrame2.setLayout(flowLayout);
//
//        Dimension dimension=new Dimension(100,50);
//        Dimension dimension1=new Dimension(200,50);
//
//
//
//        JLabel jLabel1=new JLabel();
//        jLabel1.setText("请选择手机型号：");
//        jLabel1.setPreferredSize(dimension);
//        jFrame2.add(jLabel1);
//
//        JLabel jLabel2=new JLabel();
//        jLabel2.setText("               ");
//        jLabel2.setPreferredSize(dimension);
//        jFrame2.add(jLabel2);
//
//
//        JCheckBox jCheckBox1=new JCheckBox("iphone 11 Pro Max-----5499/台");
//        jCheckBox1.setPreferredSize(dimension1);
//        jFrame2.add(jCheckBox1);
//
//
//        JCheckBox jCheckBox2=new JCheckBox("华为 Mate30 RS-----12999/台");
//        jCheckBox2.setPreferredSize(dimension1);
//        jFrame2.add(jCheckBox2);
//
//
//        JButton jButton1=new JButton();
//        jButton1.setText("确定");
//        jButton1.setPreferredSize(dimension);
//        jFrame2.add(jButton1);
//
//        jFrame2.setTitle("货品选择界面");
//        jFrame2.setSize(300,300);
//        jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame2.setLocationRelativeTo(null);
//        jFrame2.setResizable(false);
//        jFrame2.setVisible(true);
            Order2 order2=new Order2(jFrame2, jTextField1,jTextField2,jRadioButton1,jRadioButton2,count1,j1);
            jButton1.addActionListener(order2);
            jFrame1.dispose();
        }
    }
}
