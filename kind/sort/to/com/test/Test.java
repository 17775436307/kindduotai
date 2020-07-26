package kind.sort.to.com.test;
import kind.sort.to.com.animal.*;
public class Test {
    public static void main(String []args){
        /*向上转型（隐式转型，自动转型）:
        * 指的是 父类引用指向子类实例，子类实例可以调用子类重写父类的方法以及父类派生的方法，无法调用子类特有的方法 例如下面的sleep 和run 方法就不可以
        *是从小类转向大类
        *（注意！！！）在父类中的静态方法不能被子类重写，如果写了又不报错，那这样只能是重写的方法变成子类所独有的方法了
        * 而且在调用中只会调用父类的方法，如果非要调用子类的方法，只能把向上转型的再往下转型了，然后才可以调用子类的方法了
        * */
       //Animal one=new Animal(); 在class的前面加上 abstract 可以使这个类抽象化，会使这个类没有实例，但是可以向上转型指向子类的实例
       Animal two=new Cat();
       Animal three=new Dog();
       //one.eat();
       two.eat();
       three.eat();
      // two.sleep();
       // three.run();
      System.out.println("==============================================================================");
      /*向下类型的转化(也称强制类型转换)
      *子类引用指向父类对象，此处必须进行强制转换，可以调用子类的特有方法了
      *满足转换条件才可以转换（本来是什么类型，才能转换成什么类型）即是是不满足条件去转型了，虽然程序不会报错，但是关于转型的对象的有关程序不会成功执行 例如下面的Dog
      *instanceof 运算符 可以用来测试是否满足这个条件左边是否满足右边的特征，如果满足则为true,如果不满足则为false;例如下（a instanceof b)
      * */

     /* if(two instanceof Cat) {
          Cat temp = (Cat) two;
          temp.sleep();
          temp.eat();
          temp.getSex();
          System.out.println("two 满足 cat 的特征");
      }
      if(two instanceof Dog) {
          Dog temp1 = (Dog) two;
          temp1.eat();
          temp1.run();
          temp1.getWeight();
          System.out.println("two 满足 Dog 的特征");
      }*/
        System.out.println("==============================================================================");
         two.say();
         Cat cat=(Cat) two;
         cat.say();













    }
}
