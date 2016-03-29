/**
 * Created by Archer on 2016/3/29.
 */
public class GenericDemo03 {
    public static void main(String[] args) {

        Gen<String,Integer>g=new Gen<String,Integer>();
        g.setTake(10);
        g.setKey("key");
        System.out.println(g.getTake()+g.getKey());

    }
}



class Gen<K,T>{
    public T getTake() {
        return take;
    }

    public void setTake(T take) {
        this.take = take;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    private T take;
    private K key;
}