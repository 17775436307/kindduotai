package kind.sort.to.com.phone;
/*建一个具有拍照能力的接口   用关键字 interface 来修饰
* */
public interface IPhoto {
    //不需要写构造方法
    //具有拍照的能力
    public void photo();//没有方法体
    default void  qq(){
        System.out.println("connection on  qq  IN IPhoto");
    }
}
