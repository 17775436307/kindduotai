package kind.sort.to.com.test;
import kind.sort.to.com.animal.*;
public class MasterTest {
    public static void main(String []args){
        Master master=new Master();
        Cat one=new Cat();
        Dog two=new Dog();
        master.feed(one);
        master.feed(two);
        boolean flag=true;
        Animal temp;//可有父类对象
        if(flag){
           temp= master.hasTime();

        }else{
            temp=master.hasNoTime();
        }
        System.out.println(temp);
       // master.feedAnimal(flag);
    }
}
