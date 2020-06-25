package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {
    private JTextField jTextField;
    private JPasswordField jPasswordField;
    private JFrame login;
    public LoginListener(JFrame login,JTextField jTextField,JPasswordField jPasswordField){
        this.login=login;
        this.jTextField=jTextField;
        this.jPasswordField=jPasswordField;
        String str= String.valueOf(this.jTextField);
        System.out.println(str);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(jTextField.getText().equals("Alex") && jPasswordField.getText().equals("123")){
//            setjTextField(e);
            JFrame jFrame=new JFrame();
            FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,5,5);
            jFrame.setLayout(flowLayout);

            Dimension dimension=new Dimension(100,50);
            Dimension dimension1=new Dimension(200,50);

            JLabel jLabel1=new JLabel();
            jLabel1.setText("请选择手机型号：");
            jLabel1.setPreferredSize(dimension);
            jFrame.add(jLabel1);

            JLabel jLabel2=new JLabel();
            jLabel2.setText("               ");
            jLabel2.setPreferredSize(dimension);
            jFrame.add(jLabel2);

            JCheckBox jCheckBox1=new JCheckBox("iphone 11 Pro Max-----5499/台");
            jCheckBox1.setPreferredSize(dimension1);
            jFrame.add(jCheckBox1);

            JCheckBox jCheckBox2=new JCheckBox("华为 Mate30 RS-----12999/台");
            jCheckBox2.setPreferredSize(dimension1);
            jFrame.add(jCheckBox2);

            JButton jButton1=new JButton();
            jButton1.setText("确定");
            jButton1.setPreferredSize(dimension);

            jFrame.add(jButton1);
            jFrame.getRootPane().setDefaultButton(jButton1);

            jFrame.setTitle("货品选择界面");
            jFrame.setSize(300,300);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setResizable(false);
            jFrame.setVisible(true);

            Number number=new Number(jFrame,jCheckBox1, jCheckBox2);
            jButton1.addActionListener(number);

            login.dispose();
//            JFrame jFrame=new JFrame();
//            FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,5,5);
//            jFrame.setLayout(flowLayout);
//
//            Dimension dimension=new Dimension(100,50);
//            Dimension dimension1=new Dimension(200,50);
//
//            jFrame.setTitle("用户界面");
//            jFrame.setSize(350,200);
//
//            JLabel jLabel1=new JLabel();
//            jLabel1.setText("请选择手机型号：");
//            jLabel1.setPreferredSize(dimension);
//            jFrame.add(jLabel1);
//
//            JCheckBox jCheckBox1=new JCheckBox("iphone 11 Pro Max");
//            jCheckBox1.setPreferredSize(dimension1);
//            jFrame.add(jCheckBox1);
//
//
//            JCheckBox jCheckBox2=new JCheckBox("华为 Mate30 RS");
//            jCheckBox2.setPreferredSize(dimension1);
//            jCheckBox1.setBounds(10,80,80,25);
//            jFrame.add(jCheckBox2);
//
//
//            JButton jButton1=new JButton();
//            jButton1.setText("确定");
//            jButton1.setPreferredSize(dimension);
//            jFrame.add(jButton1);
//
//            jFrame.setDefaultCloseOperation(3);
//            jFrame.setLocationRelativeTo(null);
//            jFrame.setResizable(false);
//            jFrame.setVisible(true);
//
//  Number number=new Number(jFrame,jCheckBox1, jCheckBox2);
//        jButton1.addActionListener(number);
//
//
//            login.dispose();
        }
    }
//    public void setjTextField(ActionEvent e){
//        JFrame jFrame=new JFrame();
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,5,5);
//        jFrame.setLayout(flowLayout);
//
//        Dimension dimension=new Dimension(100,50);
//        Dimension dimension1=new Dimension(200,50);
//
//        jFrame.setTitle("货品选择界面");
//        jFrame.setSize(300,300);
//
//        JLabel jLabel1=new JLabel();
//        jLabel1.setText("请选择手机型号：");
//        jLabel1.setPreferredSize(dimension);
//        jFrame.add(jLabel1);
//
//        JLabel jLabel2=new JLabel();
//        jLabel2.setText("               ");
//        jLabel2.setPreferredSize(dimension);
//        jFrame.add(jLabel2);
//
//
//        JCheckBox jCheckBox1=new JCheckBox("iphone 11 Pro Max-----5499/台");
//        jCheckBox1.setPreferredSize(dimension1);
//        jFrame.add(jCheckBox1);
//
//
//        JCheckBox jCheckBox2=new JCheckBox("华为 Mate30 RS-----12999/台");
//        jCheckBox2.setPreferredSize(dimension1);
//        jFrame.add(jCheckBox2);
//
//
//        JButton jButton1=new JButton();
//        jButton1.setText("确定");
//        jButton1.setPreferredSize(dimension);
//        jFrame.add(jButton1);
//
//        jFrame.setDefaultCloseOperation(3);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setResizable(false);
//        jFrame.setVisible(true);
//
//
//        Number number=new Number(jFrame,jCheckBox1, jCheckBox2);
//        jButton1.addActionListener(number);
//
//
//        login.dispose();
//    }

}
//Alex
