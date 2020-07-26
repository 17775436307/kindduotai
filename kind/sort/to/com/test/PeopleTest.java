package kind.sort.to.com.test;

import kind.sort.to.com.insidesort.People;

public class PeopleTest {
    public static void main(String []args){
          People p=new People();
           p.age=15;
       /*   //访问内部类
        //1.获取内部类的实例对象:  外部类名.内部类名 引用名 = new 外部类名（）.new 内部类名（）;  相当于两次实例化对象一起用了，不过用调用链接起来了
        People.Heart h=new  People().new Heart();//年龄为0，是因为在实例化的时候是新产生实例，并没有给age赋值；
        System.out.println(h.beat());

        //2.获取内部类的实例对象:外部类对象.new 内部类 调用来实现
        h=p.new Heart();
        System.out.println(h.beat());

        //3.获取内部类的实例对象: 外部类对象.获取方法
        h=p.getHeart();
        System.out.println(h.beat());
        */
     /* //获取静态内部类对象实例
         People.Heart h=new People.Heart();
        System.out.println(h.beat());
        People.Heart.say();
        */

       //方法内部类
       System.out.println( p.getHeart());//p.getHeart()不能直接调用方法了，因此在方法内部类返回的时候需要返回要调用的方法






    }
}
