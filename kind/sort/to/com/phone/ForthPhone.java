package kind.sort.to.com.phone;
//让四代手机在继承三代手机的基础上，也让他也实现与IPhoto 的接口
public class ForthPhone extends ThirdPhone  implements IPhoto,INet{
    public void photo(){
        System.out.println("手机可以拍照");
    }
    public void netWork(){
        System.out.println("手机可以上网");
    }
    public void games(){
        System.out.println("手机可以打游戏");
    }

    @Override
    public void connection() {
        System.out.println("手机可以打交流");
    }
}
