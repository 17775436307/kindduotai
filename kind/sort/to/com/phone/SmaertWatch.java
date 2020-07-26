package kind.sort.to.com.phone;

 public class SmaertWatch implements INet,IPhoto{
       public static final int temp=20;
    public void call(){
        System.out.println("智能手表可以打电话");
    }
    public void  message(){
        System.out.println("智能手表可以发消息");
    }
    public void netWork(){
        System.out.println("智能手表可以上网");
    }
/*
* 当一个类实现多个接口时，并且只能先继承，后实现类，在实现多个类时，可以用逗号隔开
* 1.两个接口都有同名方法时,如果不重写方法就会报错
* 因此只能重写一个自己类的方法,之后用接口引用指向实现类的对象时，再调用这个方法时，都会调用重写的方法,要调用接口中的方法只能用接口名调用了
* 但是如果方法变成 成员属性的话  要调出属性只能用接口.成员  来调用了
*
* 2.（在ForthPhone中）当一个子类继承自一个父类时，同时这个子类又实现两个接口，并且两个接口都有一个同名的方法，如果这个子类不想重写方法，可以在它的父类中重写这个方法，这样这个子类不但
* 不会报错，而且还会继承这个方法，用接口引用指向这个子类的对象去调用时只会调用父类的这个方法
* 但是如果方法变成 成员属性的话这招就不行了，就必须在子类中定义一个成员属性，这样才能保证程序不报错
* */

     @Override
     public void qq() {
         System.out.println("connection on  qq  IN SmaertWatch");
     }

     //@Override
    public void connection() {
              System.out.println("智能手表可以交流");
     }

     //@Override

     /*public void qq() {//这个是重写接口中的qq()方法
         INet.super.qq();//INet.super这是调用接口中默认的方法
     }*/

     public void stop(){
        //这个不能算是重写方法 访问修饰都不一样
        INet.stop();//调用接中的静态方法不用INet.super的方法， 静态方法只能用INet.这个调用

     }

     @Override
     public void photo() {
         System.out.println("智能手表的照相");
     }
 }
