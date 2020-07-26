package kind.sort.to.com.animal;
/*1.在class的前面加上 abstract 可以使这个类抽象化，会使这个类没有实例，但是可以向上转型指向子类的实例
* 2.在方法前加上 abstract 表示这个方法为抽象类，抽象方法不需要具体的实现方法，但是必须在这个类的子类重写这个方法（每一个子类都会提醒你重写这个方法），
* 如果就是不重写，那么你就必须要给这个不重写方法的类也加上 abstract 让子类也变成 抽象类
* 提示一下：有抽象方法的一定是抽象类，而是抽象类的不一定有抽象方法
* 而且 abstract修饰的方法 不可以和 private ,static ,final 同时出现，因为private ,static ,final等修饰的方法不允许子类重写，跟abstract 修饰的方法矛盾
*
*
*
*
* */
public  abstract class Animal {
    private String name;
    private int month;
    public Animal(){

    }
    public Animal(String name,int month){
        this.setName(name);
        this.setMonth(month);
    }
    //例如abstract 的案例
    public abstract void eat();//没有具体实现方法，这样加后，因为一般不用父类的一些方法，就可以不用担心在写代码的时候出现调用了父类方法的错误情况

    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMonth(int month){
        this.month=month;
    }
      public int getMonth(){
        return month;
      }
      public static void say(){
          System.out.println("Animal 之间的打招呼");
      }

}
