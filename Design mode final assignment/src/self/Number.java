package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Number implements ActionListener {
    private JFrame jFrame;
    private JCheckBox jCheckBox1,jCheckBox2;

    public Number(JFrame jFrame, JCheckBox jCheckBox1, JCheckBox jCheckBox2) {
        this.jFrame=jFrame;

        this.jCheckBox1=jCheckBox1;
        this.jCheckBox2=jCheckBox2;
    }

    public void actionPerformed(ActionEvent e) {

//        Boolean bool=false;
//        String coustomer="Alex";
//        String data="订单\n客户："+coustomer+"\n";
//        File file=new File("D:\\IntelliJ\\IntelliJ IDEA 2020.1.1\\workplace\\Design mode final assignment\\"+coustomer+".txt");
//        try {
//            if (!file.exists()){
//                file.createNewFile();
//                bool=true;
//                Writer out=new FileWriter(file);
//
//                out.write(data);
//                out.close();
//            }
//            else {
//                FileWriter writer=new FileWriter("D:\\IntelliJ\\IntelliJ IDEA 2020.1.1\\workplace\\Design mode final assignment\\\"+coustomer+\".txt",true);
//                writer.write(data);
//                writer.close();
//            }
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }

        if (jCheckBox1.isSelected()&&jCheckBox2.isSelected()){//Alex
            String count1=null;
            String count2=null;
            JFrame jFrame1=new JFrame();
            FlowLayout flowLayout3=new FlowLayout(FlowLayout.CENTER,5,5);
            jFrame1.setLayout(flowLayout3);

            Dimension dimension=new Dimension(50,20);
            Dimension dimension1=new Dimension(260,50);
            Dimension dimension2=new Dimension(100,50);

            jFrame1.setTitle("货物数量");
            jFrame1.setSize(380,230);

            JLabel jLabel1=new JLabel();
            jLabel1.setText("请输入要购买的iphone 11 Pro Max手机数量：");
            jLabel1.setPreferredSize(dimension1);
            jFrame1.add(jLabel1);

            JTextField jTextField1=new JTextField();
            jTextField1.setPreferredSize(dimension);
            jFrame1.add(jTextField1);


            JLabel jLabel2=new JLabel();
            jLabel2.setText("请要购买的华为 Mate30 RS手机数量：");
            jLabel2.setPreferredSize(dimension1);
            jFrame1.add(jLabel2);


            JTextField jTextField2=new JTextField();
            jTextField2.setPreferredSize(dimension);
            jFrame1.add(jTextField2);

            JButton jButton1=new JButton();
            jButton1.setText("确定");
            jButton1.setPreferredSize(dimension2);
            jFrame1.add(jButton1);
            jFrame1.getRootPane().setDefaultButton(jButton1);

            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame1.setLocationRelativeTo(null);
            jFrame1.setResizable(false);
            jFrame1.setVisible(true);
//            JFrame jFrame1=new JFrame();
//            ButtonGroup buttonGroup=new ButtonGroup();
//            FlowLayout flowLayout1=new FlowLayout(FlowLayout.CENTER,5,5);
//            jFrame1.setLayout(flowLayout1);
//
//            Dimension dimension=new Dimension(300,30);
//            Dimension dimension1=new Dimension(240,50);
//            Dimension dimension2=new Dimension(100,50);
//
//            jFrame1.setTitle("订单详情");
//            jFrame1.setSize(360,400);
//
//
//            JLabel jLabel1=new JLabel();
//            jLabel1.setText("真实姓名：");
//            jLabel1.setPreferredSize(dimension);
//            jFrame1.add(jLabel1);
////Alex
//            JTextField jTextField1=new JTextField();
//            jTextField1.setPreferredSize(dimension);
//            jFrame1.add(jTextField1);
//
//
//            JLabel jLabel2=new JLabel();
//            jLabel2.setText("详细地址：");
//            jLabel2.setPreferredSize(dimension);
//            jFrame1.add(jLabel2);
//
//
//            JTextField jTextField2=new JTextField();
//            jTextField2.setPreferredSize(dimension);
//            jFrame1.add(jTextField2);
//
//
//            JLabel jLabel3=new JLabel();
//            jLabel3.setText("取货方式：");
//            jLabel3.setPreferredSize(dimension);
//            jFrame1.add(jLabel3);

//            JRadioButton jRadioButton1=new JRadioButton("快递送达");
//            jRadioButton1.setPreferredSize(dimension1);
//
////Alex
//
//            JRadioButton jRadioButton2=new JRadioButton("到店自取");
//            jRadioButton2.setPreferredSize(dimension1);
//            buttonGroup.add(jRadioButton1);
//            buttonGroup.add(jRadioButton2);
//            jFrame1.add(jRadioButton1);
//            jFrame1.add(jRadioButton2);
//
//            JButton jButton1=new JButton();
//            jButton1.setText("确定");
//            jButton1.setPreferredSize(dimension2);
//            jFrame1.add(jButton1);
//
//            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            jFrame1.setLocationRelativeTo(null);
//            jFrame1.setResizable(false);
//            jFrame1.setVisible(true);

            Box1 box1=new Box1(jFrame1, jTextField1,jTextField2);
            jButton1.addActionListener(box1);
            jFrame.dispose();
//Alex
        }else if (jCheckBox1.isSelected()){
            String j1="iphone 11 Pro Max手机";
            JFrame jFrame1=new JFrame();
            FlowLayout flowLayout3=new FlowLayout(FlowLayout.CENTER,5,5);
            jFrame1.setLayout(flowLayout3);

            Dimension dimension=new Dimension(50,20);
            Dimension dimension1=new Dimension(260,50);
            Dimension dimension2=new Dimension(100,50);

            jFrame1.setTitle("货物数量");
            jFrame1.setSize(380,150);

            JLabel jLabel1=new JLabel();
            jLabel1.setText("请输入要购买的iphone 11 Pro Max手机数量：");
            jLabel1.setPreferredSize(dimension1);
            jFrame1.add(jLabel1);

            JTextField jTextField1=new JTextField();
            jTextField1.setPreferredSize(dimension);
            jFrame1.add(jTextField1);

            JButton jButton1=new JButton();
            jButton1.setText("确定");
            jButton1.setPreferredSize(dimension2);
            jFrame1.getRootPane().setDefaultButton(jButton1);
            jFrame1.add(jButton1);

            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame1.setLocationRelativeTo(null);
            jFrame1.setResizable(false);
            jFrame1.setVisible(true);


            Box2 box2=new Box2(jFrame1, jTextField1,j1);
            jButton1.addActionListener(box2);
            jFrame.dispose();
        } else if (jCheckBox2.isSelected()) {//Alex
            String j1="华为 Mate30 RS手机";
            JFrame jFrame1=new JFrame();
            FlowLayout flowLayout3=new FlowLayout(FlowLayout.CENTER,5,5);
            jFrame1.setLayout(flowLayout3);

            Dimension dimension=new Dimension(50,20);
            Dimension dimension1=new Dimension(240,50);
            Dimension dimension2=new Dimension(100,50);

            jFrame1.setTitle("货物数量");
            jFrame1.setSize(360,150);
            JLabel jLabel2=new JLabel();
            jLabel2.setText("请要购买的华为 Mate30 RS手机数量：");
            jLabel2.setPreferredSize(dimension1);
            jFrame1.add(jLabel2);


            JTextField jTextField2=new JTextField();
            jTextField2.setPreferredSize(dimension);
            jFrame1.add(jTextField2);

            JButton jButton1=new JButton();
            jButton1.setText("确定");
            jButton1.setPreferredSize(dimension2);
            jFrame1.getRootPane().setDefaultButton(jButton1);
            jFrame1.add(jButton1);

            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame1.setLocationRelativeTo(null);
            jFrame1.setResizable(false);
            jFrame1.setVisible(true);


            Box2 box2=new Box2(jFrame1, jTextField2,j1);
            jButton1.addActionListener(box2);

            jFrame.dispose();
        }else {

        }


    }
}
