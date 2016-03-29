/**
 * 泛型数组的使用
 * Created by Archer on 2016/3/29.
 */
public class GenericDemo06 {
    public static void main(String[] args) {

        String arr[]={"www","archer","com"};
        tell(arr);
    }


    public static <T>void tell(T arr[]){

        for (T anArr : arr) {
            System.out.println(anArr);
        }
    }

}
