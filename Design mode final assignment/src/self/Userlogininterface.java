package self;

import javax.swing.*;
import java.awt.*;
import java.net.http.WebSocket;

public class Userlogininterface extends JFrame {


    public void login(){
        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,5,5);
        this.setLayout(flowLayout);

        Dimension dimension=new Dimension(50,50);
        Dimension dimension1=new Dimension(250,30);
        Dimension dimension2=new Dimension(100,40);
        Dimension dimension3=new Dimension(100,50);


        JLabel jLabel1=new JLabel();
        jLabel1.setText("账号：");
        jLabel1.setPreferredSize(dimension);
        this.add(jLabel1);
//        jLabel1=new JLabel("user:");
//        jLabel1.setBounds(10,20,80,25);


        JTextField jTextField=new JTextField();
//        jTextField.setBounds(100,20,165,25);
        jTextField.setPreferredSize(dimension1);
        this.add(jTextField);


        JLabel jLabel2=new JLabel();
        jLabel2.setText("密码：");
        jLabel2.setPreferredSize(dimension);
        this.add(jLabel2);
//        jLabel2=new JLabel("password:");
//        jLabel2.setBounds(10,50,80,25);

        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField=new JPasswordField();
//        jPasswordField.setBounds(100,50,165,25);
        jPasswordField.setPreferredSize(dimension1);
        this.add(jPasswordField);

        JButton jButton1=new JButton();
        jButton1.setText("登录");
        jButton1.setPreferredSize(dimension3);

        this.add(jButton1);
        this.getRootPane().setDefaultButton(jButton1);

//        jButton1=new JButton("login");

//        jButton1.setBounds(10,80,80,25);
//        JButton jButton2=new JButton();
//        jButton2.setText("注册");
//        jButton2.setPreferredSize(dimension3);
//        this.add(jButton2);
//        jButton2=new JButton("register");
//        jButton2.setBounds(10,80,80,25);


//        jPanel1=new JPanel();
//        jPanel2=new JPanel();
//        jPanel3=new JPanel();
////设置布局
//        this.setLayout(new GridLayout(3,2));
//
//        jPanel1.add(jLabel1);
//        jPanel1.add(jTextField);
//
//        jPanel2.add(jLabel2);
//        jPanel2.add(jPasswordField);
//
//        jPanel3.add(jButton1);
//        jPanel3.add(jButton2);
//
//        this.add(jPanel1);
//        this.add(jPanel2);
//        this.add(jPanel3);
//设置显示
        this.setSize(340,250);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("登录界面");
        this.setLocationRelativeTo(null);

        LoginListener loginListener=new LoginListener(this,jTextField,jPasswordField);

        jButton1.addActionListener(loginListener);
//        jButton2.addActionListener();
    }
}
