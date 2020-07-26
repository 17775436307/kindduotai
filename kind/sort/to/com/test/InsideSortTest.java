package kind.sort.to.com.test;
import kind.sort.to.com.anonymous.*;
public class InsideSortTest {
  /*  //方案一：直接传入要调用的类的方法
    public void  getRead(Man man){
        man.read();
    }
    public void  getRead(Women women){
        women.read();
    }  */
    //方案二：传入父类对象
    public void getRead(InsidePerson insidePerson){
        insidePerson.read();
    }

    public static void main(String []args ){
        InsideSortTest ist=new InsideSortTest();
      /*  Man m=new Man();
        Women w=new Women();
        ist.getRead(m);
        ist.getRead(w);*/
      //方案三：匿名内部类       直接定义并重写方法        这种方法只能使用一次         用   ( 实例{  重写方法    })；
        /* 1.匿名内部类没有类型名称，实力对象名称
        * 2.编译后的文件名：外部类$数字.class
        * 3.无法使用private,protected,static,abstract,public 等修饰访问符
        * 4.无法编写构造方法，但是能写构造代码块
        * 5.里面不能出现静态成员
        * 6.匿名内部类可以实现接口，也可以继承父类，但是二者不可兼得
        * */
      ist.getRead(new InsidePerson(){
         // public static int temp=12;
         /* public  static void h(){
              System.out.println();
          }*/

          {
              //构造代码块
          }
          @Override
          public void read() {
              System.out.println("This is man's read!");
          }
      });
      ist.getRead(new InsidePerson() {
          @Override
          public void read() {
              System.out.println("This is Wemen's read!");
          }
      });

    }
}
