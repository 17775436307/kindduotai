package kind.sort.to.com.insidesort;
//外部类
public class People {
    public  int age;
    public  Object getHeart(){
        //方法内部类 就是在外部中的方法中再建一个类 ，这个类中也可以有其它成员
        /*1.在定义方法时候，方法的类，可以为Object
        * 2.和方法内部成员使用规则一样， class前面不可以添加public,private,protected,static
        * 3.内中不能包含静态成员
        * 4.但是类中可以有final,abstract，修饰的成员，一般abstract 不推荐的
        *5.方法内部类中的 外部类成员调用   用 外部实例.成员 就可以调用了
        * 6.在方法返回的时候一般返回要调用的方法
        * */
        class Heart{
            int temp=12;
            public  int age=15;


            public void say(){
                System.out.println("hello");
            }
            public  String  beat(){
                say();
                new People().eat();
                return new People().age+"岁的心脏在跳动" ;//age+"岁的心脏在跳动" ;
            }

    }
    return new Heart().beat();


    }
/*成员内类
*2.内部类的访问修饰符：可以任意，但是访问范围会受到限制
*3.内部类可以直接调用外部类的方法及成员属性，如果出现同名属性成员，优先访问内部类中定义的，
* 如果想访问外部类的成员就要用 People.this.age 就可以了 即 外部类名.this.调用的成员名字
* 4.外部类访问内部类信息，必须要通过内部类实例，然后来调用，否则不能调用（temp）
* public class Heart{
        int temp=12;
         int age=15;
        public  String  beat(){
           eat();
            return  People.this.age+"岁的心脏在跳动" ;//age+"岁的心脏在跳动" ;
        }
    }//1.典型的内部类,且内部类无法直接在外面实例化对象的，需要借助外部类信息才能实例化
*
*
* */
/*静态内部类
 * 1.静态内部类中，只能直接访问外部类的静态成员，如果要调用非静态成员,可以通过化对象实例化调用
 *2.静态内部类对象实例时，可以不依靠外部类对象，比如：People.Heart h=new People.Heart();就可以得到内部类对象实例化了
 *3.可以通过 外部类.内部类.静态成员 的方式直接访问内部类中的静态成员 例如say();
 *4.当内部类属性与外部类属性同名时.默认直接调用内部类成员属性
 * 如果需要访问外部类的静态成员，可以直接用 外部类.成员 直接调用
 *  如果需要访问外部类的非静态成员，可以直接用 new 外部类().成员 直接调用

   public static class Heart{
        int temp=12;
      public static  int age=15;
         public static void say(){
             System.out.println("hello");
         }
        public  String  beat(){
           new People().eat();
            return new People().age+"岁的心脏在跳动" ;//age+"岁的心脏在跳动" ;
        }
    }*/
public   void eat(){
    System.out.println("人会吃东西");}

}
