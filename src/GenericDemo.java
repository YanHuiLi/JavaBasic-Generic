/**
 * Created by Archer on 2016/3/29.
 */
public class GenericDemo {
    public static void main(String[] args) {

         Gin<String> gin=new Gin<String>("极客学院");
        System.out.println(gin.getInfo());
    }
}

interface GenInter<T>{
    void say();
}

class Gin<T> implements GenInter<T>{

    public Gin(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;
    @Override
    public void say() {

    }
}
