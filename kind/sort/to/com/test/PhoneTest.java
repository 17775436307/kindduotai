package kind.sort.to.com.test;
//连续继承就可以访问所有功能
import kind.sort.to.com.phone.*;

public class PhoneTest {
    public static void main(String []args){
        ForthPhone phone=new ForthPhone();
          phone.call();
          phone.vedio();
          phone.games();
          System.out.println("===========================================");
          IPhoto ip=new ForthPhone();//用接口的引用指向要调用方法的对象 类似 向上转型
          ip.photo();
          ip=new Camera();
          ip.photo();
          //用接口方法来实现的目的就是体现出各个不同对象的相同特点，且只能调用全部都相同的方法特点，不能调用自己类的其它方法了
        // 比如上面的手机，相机，智能手表，都可以拍照（前提是给每个对象都创立了一个独立的类，或者连续继承的类）
        System.out.println("===========================================");
        INet it=new SmaertWatch();//一般调用接口内的长量直接用接口名.常量名就可以了 例如：INet.temp
        System.out.println(it.temp);/*当实现接口类中没有定义跟接口中一样名的常量时，可以调用接口内的常量，但是如果定义了同名不同量的常量，还用接口引用指向
          实现接口类的对象实例时，仍然还会调用接口中的常量，要调用  实现接口类内的常量，用实现接口类 的自己引用及对象就可以调用了 */
        SmaertWatch sw=new SmaertWatch();
        System.out.println(sw.temp);
        it.connection();//用这个也可以调用接口中的默认方法，
        //it.stop(); 但是不可以调用接口中的静态方法，只能用接口名.方法 去调用
        INet.stop();
        System.out.println("===========================================");
        INet it1=new SmaertWatch();
        IPhoto sw1=new SmaertWatch();
        it1.qq();
        sw1.qq();
        System.out.println("===========================================");
        INet it2=new ForthPhone();
        IPhoto sw2=new ForthPhone();
        it2.qq();
        sw2.qq();
    }
}
