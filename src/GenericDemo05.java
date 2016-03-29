/**
 * Created by Archer on 2016/3/29.
 */
public class GenericDemo05 {
    public static void main(String[] args) {

         Gener g=new Gener();

      String string=  g.tell("Archer");
        System.out.println(string);

        int i=g.tell(10);
        System.out.println(i);
    }
}

class Gener{
    public <T>T tell(T t){
        return  t;
    }
}