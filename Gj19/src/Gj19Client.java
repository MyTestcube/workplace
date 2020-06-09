public class Gj19Client {
    public static void main(String[] args){
        Gj19Officer gj19Bangzhang= new Gj19Bangzhang("张三") {
            @Override
            public void handleMission(Gj19Mission mission) {

            }
        };
        Gj19Officer gj19Paizhang=new Gj19Paizhang("李四");
        Gj19Officer gj19Yingzhang= new Gj19Yingzhang("王五") {
            @Override
            public void handleMission(Gj19Mission mission) {

            }
        };

        gj19Bangzhang.setgj19Successor(gj19Paizhang);
        gj19Paizhang.setgj19Successor(gj19Yingzhang);

        Gj19Mission m1=new Gj19Mission("小周",8);
        gj19Bangzhang.handleMission(m1);

        Gj19Mission m2=new Gj19Mission("小曾",36);
        gj19Bangzhang.handleMission(m2);

        Gj19Mission m3=new Gj19Mission("小李",188);
        gj19Bangzhang.handleMission(m3);

        Gj19Mission m4=new Gj19Mission("小孙",269);
        gj19Bangzhang.handleMission(m4);

    }
}
