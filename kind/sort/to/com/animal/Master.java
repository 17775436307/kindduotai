package kind.sort.to.com.animal;

public class Master {
    //喂动物之后还会带宠物去做自己爱做的事情
    /*1.只喂几个动物，可以直接写几个喂养动物的方法
    *2.但是宠物多了就不行了，那就要写很多喂养动物的方法，这就很麻烦，因此就可以用到 instanceof 这个关键字了
    *在传入参数时直接传入父类，如果符合某个子类对象的特征，就 向下转型 成想要的子类对象，这样的情况下可以写很多个喂食宠物，
    * 而且直接在后面加就可以，在自己的范围想加什么东西就加什么东西
    *
    * */
    public Master(){

    }

   /*1.方案一 public void feed(Cat cat){
        cat.eat();
        cat.sleep();
    }
    public void feed(Dog dog){
        dog.eat();
        dog.play();
    }*/
   //2.方案二
   public void feed(Animal obj){
       if(obj instanceof Cat){
           Cat temp=(Cat) obj;
           temp.eat();
           temp.sleep();
       }else if(obj instanceof Dog){
           Dog temp1=(Dog) obj;
           temp1.eat();
           temp1.play();
       }
   }
   /*养动物
   * 如果时间多，就推荐养狗狗
   * 如果时间不多，就推荐养猫猫
   * */
   //方案一
    public Dog hasTime(){
        System.out.println("主人有很多时间，推荐养狗狗");
        return  new Dog();
    }
    public Cat hasNoTime(){
        System.out.println("主人时间不多，推荐养猫猫");
        return  new Cat();
    }
    //方案二
    public Animal feedAnimal(boolean isHasManyTime){
        if(isHasManyTime){
            System.out.println("主人有很多时间，推荐养狗狗!");
            return new Dog();
        }else{
            System.out.println("主人时间不多，推荐养猫猫!");
            return new Cat();
        }
    }//第一方案要建立2种方法，而第种2方案应用了多态，方法就变得简单与效率了,第二种方法直接以父类作为返回值，但是却是子类的实例对象
}
