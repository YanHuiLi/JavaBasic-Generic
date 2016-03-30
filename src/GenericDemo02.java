/**
 * Created by Archer on 2016/3/29.
 */

//这里有一个bug
public class GenericDemo02 {
    public static void main(String[] args) {

         Con123<String> c= new Con123<String>("Archer");

        System.out.println(c.getValue());
        System.out.println("hello");
    }
}


class Con123<T>{
    private T value;

    public Con123(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
