package Agent;

import Message.Message;
import Message.Recipient;
import company.HUAWEICompany;
import customer.Order;
import customer.OrderBuilder;
import phone.HUAWEI;
import company.iPhoneCompany;
import phone.HUAWEIFactory;
import phone.PhoneFactory;
import phone.iPhoneFactory;
import self.LoginListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgentFrame extends JFrame  {
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
//    private static final long serialVersionUID=1L;
//    public JLabel label;
//    public JButton button1,button2,button3;
//    public JPanel panel;
//    public JTextArea jTextArea;
//    public JCheckBox checkBox1,checkBox2;
//    public JRadioButton radioButton1,radioButton2;
//    public JScrollPane scrollPane;
//    int count=0;
//    Agent agent=Agent.getInstance();
//    iPhoneCompany iPhone=iPhoneCompany.getInstance();
//    HUAWEICompany HUAWEI= HUAWEICompany.getInstance();
//    public AgentFrame(){
//        super("手机批发商");
//        label=new JLabel("登录界面");
//        button1=new JButton("登录");
//        button2=new JButton("注册");
//        button3=new JButton();
//        panel=new JPanel();
//        jTextArea=new JTextArea();
//        checkBox1=new JCheckBox();
//        checkBox2=new JCheckBox();
//
//        radioButton1=new JRadioButton();
//        radioButton2=new JRadioButton();
//        scrollPane=new JScrollPane();
//
//        button1.addActionListener(this);
//        button2.addActionListener(this);
//        button3.addActionListener(this);
//        jTextArea.setText("");
//        jTextArea.setLineWrap(true);
//
//
//        panel.setLayout(null);
//        panel.add(label);
//        panel.add(jTextArea);
//        panel.add(button1);
//        panel.add(button2);
//        panel.add(button3);
//        panel.add(checkBox1);
//        panel.add(checkBox2);
//        panel.add(radioButton1);
//        panel.add(radioButton2);
//        panel.add(scrollPane);
//        label.setBounds(20,20,400,20);
//        checkBox1.setBounds(20,50,150,20);
//        checkBox2.setBounds(20,80,200,20);
//        button1.setBounds(20,110,70,30);
//        button2.setBounds(190,50,100,30);
//        radioButton1.setBounds(340,50,100,20);
//        radioButton2.setBounds(340,110,70,30);
//        button3.setBounds(340,110,70,30);
//        jTextArea.setBounds(20,150,400,200);
//        scrollPane.setBounds(20,150,400,200);
//
//
//        scrollPane.setViewportView(jTextArea);
//        this.setSize(500,400);
//        this.setLocationRelativeTo(null);
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//
//
//
//    public void actionPerformed(ActionEvent event){
//        if (event.getSource()==button1){
//            count=0;
//            jTextArea.append("\n======");
//            jTextArea.append("\n");
//            Recipient recipient=new Recipient("苹果&华为公司","1322843909@qq.com");
//            Message message =new Message("Agent",recipient);
//            Message clone=(Message)message.clone();
//            if (checkBox1.isSelected()&&checkBox2.isSelected()){
//                agent.setMessage(clone);
//                jTextArea.append("\n代理商向公司请求进货：iphone 11 Pro Max*x件，华为 Mate30 RS*x件，");
//                jTextArea.append("\n发件人："+agent.getMessage().getSender()+"，收件人："+agent.getMessage().getRecipient()+"");
//                jTextArea.append("\n");
//                jTextArea.append("\n");
//            }else if (checkBox1.isSelected()){
//                recipient.setName("苹果公司");
//                clone.setRecipient(recipient);
//                agent.setMessage(clone);
//                jTextArea.append("\n代理商向华为公司请求进货：华为 Mate30 RS*x件");
//                jTextArea.append("\n发件人："+agent.getMessage().getSender()+"，收件人："+agent.getMessage().getRecipient()+"");
//                jTextArea.append("\n邮件发送中...   发送成功!!!");
//                jTextArea.append("\n等待华为公司送货");
//            } else {
//                count--;
//                jTextArea.append("\n请选择进货商品");
//                JOptionPane.showMessageDialog(this, "请选择进货物品", "提示消息", JOptionPane.WARNING_MESSAGE);
//            }
//            jTextArea.append("\n=================================\n");
//            checkBox1.setSelected(false);//清空选择
//            checkBox2.setSelected(false);
//            count++;
//        }
//        if(event.getSource()==button2){
//            if(!jTextArea.getText().equals("")&&count!=0){
//                count=0;
//                jTextArea.append("\n========--2、手机公司供货--========");
//                PhoneFactory coca = new iPhoneFactory();//抽象工厂模式
//                PhoneFactory pepsi = new HUAWEIFactory();
//                jTextArea.append("\n"+coca.producePhone().produce()+"\n"+pepsi.producePhone().produce() );
//                jTextArea.append("\n已发货请注意查收！，邮件发送中...  发送成功!!!");
//                jTextArea.append("\n代理商验收商品并签收，商品售卖中，顾客已支付---请选择收货方式：");
//                jTextArea.append("\n（1）门店自取，（2）快递送达");
//            }else{
//                jTextArea.append("\n未接受到发货请求！");
//                JOptionPane.showMessageDialog(this, "未接受到发货请求！", "提示消息", JOptionPane.WARNING_MESSAGE);
//            }
//            jTextArea.append("\n===============================\n");
//        }
//        if(event.getSource()==button3){
//            jTextArea.append("\n========--3、销售给顾客--========");
//
//            if(radioButton1.isSelected()||radioButton2.isSelected()){
//                String str1= JOptionPane.showInputDialog("请输入姓名");
//                String str2= JOptionPane.showInputDialog("请输入要购买的商品（iphone 11 Pro Max  or  华为 Mate30 RS）");
//                String str3 = null;
//                if(radioButton2.isSelected()){
//                    str3= JOptionPane.showInputDialog("请输入地址");
//                }
//                jTextArea.append("\n订单生成中...");
//                OrderBuilder builder = new OrderBuilder(str1, str2, str3);
//                Order order = builder.create();
//                jTextArea.append("\n顾客姓名："+order.getName());
//                jTextArea.append("\n购买商品："+order.getGoods());
//                jTextArea.append("\n顾客地址："+order.getAddress());
//                DeliverGoods deliverGoods;
//                if(!radioButton1.isSelected()){
//                    deliverGoods = new DeliverMethod(true);
//                    jTextArea.append("\n"+deliverGoods.selectMethod());
//                }else{
//                    deliverGoods = new DeliverMethod(false);
//                    jTextArea.append("\n"+deliverGoods.selectMethod());
//                }
//                jTextArea.append("\n=============================");
//                jTextArea.append("\n感谢您购买我们的商品，祝您购物愉快！");
//            }else{
//                jTextArea.append("\n请先选择收货方式！");
//                JOptionPane.showMessageDialog(this, "请先选择收货方式！", "提示消息", JOptionPane.WARNING_MESSAGE);
//            }
//        }
//    }
}

