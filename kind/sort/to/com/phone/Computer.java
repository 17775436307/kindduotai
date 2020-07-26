package kind.sort.to.com.phone;

public abstract class Computer implements INet {
    public void netWork(){
        System.out.println("电脑可以上网");
    }
    public void games(){
        System.out.println("电脑可以打游戏");
    }
    public void vedio(){
        System.out.println("电脑可以看视频");
    }
    public void music(){
        System.out.println("电脑可以听音乐");
    }
}
