package kind.sort.to.com.phone;
//用一个类实现一个接口用 implements
public class Camera  implements IPhoto {
    //实现接口后，如果没有重写接口内没有方法体的方法，程序会报错，会提醒你重写方法，例如下面的photo方法
   public void photo(){
        System.out.println("照相机可以拍照");
    }
}
