public abstract class Gj19Bangzhang extends Gj19Officer {
    public Gj19Bangzhang(String name){
        super(name);
    }
    public void handMission(Gj19Mission mission){
        if (mission.getEnemyNumber()>0 && mission.getEnemyNumber()<10){
            System.out.println("班长"+name+"接到"+mission.getSoldierName()+"的军情"+"敌人数量为"+mission.getEnemyNumber()+"，可以下达作战指令");
        }else {
            if (this.gj19successor!=null)
            {
                this.gj19successor.handleMission(mission);
            }
        }
    }
}
