import java.util.HashMap;

public class FlyweightFactory {
    private HashMap flyweights = new HashMap();

    public Flyweight getFlyweight(String key) {
        //如果对象存在，则直接从享元池获取
        if (flyweights.containsKey(key)) {
            return (Flyweight) flyweights.get(key);
        }
        //如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        else {
            Flyweight fw = new ConcreteFlyweight();
            flyweights.put(key, fw);
            return fw;
        }
    }

}
