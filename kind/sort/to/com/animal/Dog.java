package kind.sort.to.com.animal;

public class Dog extends Animal {
    private double weight;
    public Dog(){

    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public Dog(String name,int month,double weight){
        this.setName(name);
        this.setMonth(month);
        this.setWeight(weight);
    }
    public void eat(){
        System.out.println("小狗爱吃骨头");
    }
    public void run(){
        System.out.println("小狗喜欢到处奔跑");
    }
    public void play(){
        System.out.println("狗狗喜欢玩飞盘");
    }
}
