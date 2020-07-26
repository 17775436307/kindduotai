package kind.sort.to.com.animal;

public class Cat extends Animal {
    private String sex;
    public Cat(){

    }
    public Cat(String name,int month,String sex){
        this.setName(name);
        this.setMonth(month);
        this.setSex(sex);

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void eat(){
        System.out.println("小猫爱吃鱼");
    }
    public void sleep(){
        System.out.println("小猫有睡午觉的习惯");
    }
    public static void say(){
        System.out.println("Cat 小猫之间的打招呼");
    }
}
