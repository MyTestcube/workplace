package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Store implements ActionListener {
    private JFrame jFrame3;
    public Store(JFrame jFrame3) {
        this.jFrame3 = jFrame3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame jFrame4 =new JFrame();

        FlowLayout flowLayout1=new FlowLayout(FlowLayout.CENTER,5,5);
        jFrame4.setLayout(flowLayout1);

        Dimension dimension=new Dimension(300,20);


        jFrame4.setTitle("商品已预定，请到店自取");
        jFrame4.setSize(900,400);


        ImageIcon imageIcon=new ImageIcon("D:\\IntelliJ\\IntelliJ IDEA 2020.1.1\\workplace\\Design mode final assignment\\src\\self\\store.jpg");


//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date sDate = sdf.parse();
//
//
//        Format f = new SimpleDateFormat("yyyy-MM-dd");
//
//
//        Calendar c = Calendar.getInstance();
//        c.setTime(sDate);
//        c.add(Calendar.DAY_OF_MONTH, 1);
//
//        sDate = c.getTime();
//
//
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//        endDate = sdf1.format(sDate);

//
//
//        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
//        Date date1 = new Date(System.currentTimeMillis());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar calendar = Calendar.getInstance();
//        Date date=null;
//        try {
//            date = sdf.parse(String.valueOf(date1));
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        calendar.setTime(date);
//        int day=calendar.get(Calendar.DATE);
//
//        calendar.set(Calendar.DATE,day+1);
//
//        String lastDay = sdf.format(calendar.getTime());


        JLabel jLabel1=new JLabel();
        jLabel1.setText("请顾客于明天到广东财经大学西门分店取货");
        jLabel1.setPreferredSize(dimension);
        jFrame4.add(jLabel1);

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
