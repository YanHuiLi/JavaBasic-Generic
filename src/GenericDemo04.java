/**
 * Created by Archer on 2016/3/29.
 */
public class GenericDemo04 {
    public static void main(String[] args) {


         Info<String> info=new Info<String>();
        info.setKey("jikexueyuan");
        tell(info);
    }

    /**
     * 通配符？的使用
     * @param info
     */
    public static void tell(Info<?> info){
        System.out.println(info);
    }
}


class Info<T>{
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return this.getKey().toString();
    }
}