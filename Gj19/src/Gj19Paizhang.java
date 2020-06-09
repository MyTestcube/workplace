public class Gj19Paizhang extends Gj19Officer{
    public Gj19Paizhang(String name){
        super(name);
    }

    public void handleMission(Gj19Mission mission){
        if (mission.getEnemyNumber()>=10 && mission.getEnemyNumber()<50){
            System.out.println("排长"+name+"接到"+mission.getSoldierName()+"的军情"+"，敌人的数量为"+mission.getEnemyNumber()+"可以下达作战指令");
        }else {
            if (this.gj19successor!=null){
                this.gj19successor.handleMission(mission);
            }
        }
    }
}
