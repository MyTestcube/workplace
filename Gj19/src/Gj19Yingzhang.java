public abstract class Gj19Yingzhang extends Gj19Officer{
    public Gj19Yingzhang(String name){
        super(name);
    }
    public void handelMission(Gj19Mission mission){
        if (mission.getEnemyNumber()>=50 && mission.getEnemyNumber()<200){
            System.out.println("营长"+name+"接到"+mission.getSoldierName()+"的军情"+"，敌人数量为"+mission.getEnemyNumber()+"可以下达作战指令");
        }else {
            System.out.println("接到"+mission.getSoldierName()+"的军情"+"，敌人数量为"+mission.getEnemyNumber()+"，敌人太多了，我们开会讨论一下吧");
        }
    }
}
