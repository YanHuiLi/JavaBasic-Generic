import java.awt.*;

/**
 * 设计一个地球的经纬度
 * int
 * float
 * String
 *
 * 泛型的使用。
 * 解决数据的安全性的问题
 * 使用泛型的好处
 *
 * Created by Archer on 2016/3/29.
 */


public class GenericDemo01 {

    public static void main(String[] args) {

       Point<Integer> p=new Point<Integer>();
        p.setX(100);
        p.setY(100);

        System.out.println(p.getX()+" " +p.getY());



    }
}


class  Point<T>{


    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    private T x;
    private T y;

}