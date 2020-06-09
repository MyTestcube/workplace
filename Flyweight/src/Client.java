import java.awt.font.ImageGraphicAttribute;
import java.util.IllegalFormatCodePointException;

public class Client {
    public static void main(String args[]){
        IgoChessman black1,black2,black3,white1,white2;
        IgoChessmanFactory factory;

        factory= IgoChessmanFactory.getInstance();

        black1=factory.getIgoChessman("b");
        black2=factory.getIgoChessman("b");
        black3=factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同："+(black1==black2));

        white1=factory.getIgoChessman("w");
        white2=factory.getIgoChessman("w");
        System.out.println("判断两颗黑子是否相同："+(white1==white2));


        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();

    }
}
