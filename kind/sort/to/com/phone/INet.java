package kind.sort.to.com.phone;
//接口访问修饰符：默认  public 且接口的名字一般为大写的I加上你自己要取名字的首字母大写  例如下面INet
public interface INet {
    //在接口中的抽象方法可以不加 抽象修饰符 abstract
    public void netWork();//方法修饰符也可以不写 void netWork();写public的话，实现接口的类的内方法会默认为是public
    public void connection();//在实现接口的类中如果没有全部实现在接口类定义的方法，又不想去实现或者又不想报错，在这个类的前面加上抽象修饰符 abstract 就可以了（例如SmartWatch)
    //在接口中定义一个常量时 可以省略前面的访问修饰符 例如int temp =10;但是会默认为 public static final int temp=10;
    public static final int temp=10;
    /*default:默认方法，可以带方法体，而且在实现接口的类中不用重写这个方法 JD K1.8 以后新增的  这个方法是为了有些方法不需要其他实现接口类去重写接口中的方法而存在的
      且可以被实现接口的类去重写,并用接口引用去调用


    */
    default void  qq(){
        System.out.println("connection on  qq  IN INet");
    }
    // static:静态方法也是可以带方法体的,且也是可以不用在在实现接口的类中重写这个方法；  JD K1.8 以后新增的     这个方法是为了有些方法不需要其他实现接口类去重写接口中的方法而存在的
    //接口中的静态方法不允许被重写，但能被接口名去调用
    static void stop(){
    System.out.println();
}
}
