package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class Order2 implements ActionListener {
    private JFrame jFrame2;
    private JTextField jTextField1,jTextField2;
    private JRadioButton jRadioButton1,jRadioButton2;
    private String count1,j1;
    public Order2(JFrame jFrame2, JTextField jTextField1,JTextField jTextField2,JRadioButton jRadioButton1,JRadioButton jRadioButton2,String count1,  String j1){
        this.jFrame2=jFrame2;
        this.jTextField1=jTextField1;
        this.jTextField2=jTextField2;
        this.jRadioButton1=jRadioButton1;
        this.jRadioButton2=jRadioButton2;
        this.j1=j1;
        this.count1=count1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!jTextField1.getText().equals(null) && !jTextField2.getText().equals(null)){
            JFrame jFrame3 =new JFrame();

            FlowLayout flowLayout1=new FlowLayout(FlowLayout.CENTER,5,5);
            jFrame3.setLayout(flowLayout1);

            Dimension dimension=new Dimension(300,300);
            Dimension dimension1=new Dimension(240,50);
            Dimension dimension2=new Dimension(100,50);

            jFrame3.setTitle("确认订单&修改订单");
            jFrame3.setSize(360,400);

            JTextArea jTextArea=new JTextArea();
            jTextArea.setText("");
            jTextArea.setLineWrap(true);

            jTextArea.append("\n                                     订单详情");
            jTextArea.append("\n--------------------------------------------------------------------------");
            jTextArea.append("\n顾客姓名："+jTextField1.getText());
            jTextArea.append("\n购买商品："+j1+"--------------------"+count1+"台\n");
            jTextArea.append("\n顾客地址："+jTextField2.getText());

            if(jRadioButton1.isSelected()){
                jTextArea.append("\n收货方式：快递送达");
//                ExpressDelivery expressDelivery=new ExpressDelivery(jFrame2);
//                jButton1.addActionListener(expressDelivery);
            }else {
                jTextArea.append("\n收货方式：到店自取");
            }
            jTextArea.append("\n\n\n\n\n");

            if (j1=="iphone 11 Pro Max手机") {
                int a = new Integer(count1);
                jTextArea.append("                                                      共计" + a * 5499 + "元");
            }else{
                int a = new Integer(count1);
                jTextArea.append("                                                      共计" + a * 12999 + "元");
            }


            Date date = new Date();
            DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
            jTextArea.append("\n         "+df4.format(date));


            jTextArea.append("\n--------------------------------------------------------------------------");
            jTextArea.append("\n#温馨提示：请确认订单无误后提交订单");

            jTextArea.setPreferredSize(dimension);
            jFrame3.add(jTextArea);

            JButton jButton1=new JButton();
            jButton1.setText("提交订单");
            jButton1.setPreferredSize(dimension2);
            jFrame3.getRootPane().setDefaultButton(jButton1);
            jFrame3.add(jButton1);




            jFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame3.setLocationRelativeTo(null);
            jFrame3.setResizable(false);
            jFrame3.setVisible(true);

            if(jRadioButton1.isSelected()){
                ExpressDelivery expressDelivery=new ExpressDelivery(jFrame3);
                jButton1.addActionListener(expressDelivery);
            }else {
                Store store=new Store(jFrame3);
                jButton1.addActionListener(store);
            }


            jFrame2.dispose();
        }
    }
}
