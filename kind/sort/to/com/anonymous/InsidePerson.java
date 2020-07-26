package kind.sort.to.com.anonymous;

public abstract class InsidePerson {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getNmae(){
        return name;
    }
    public InsidePerson(){

    }
    public abstract  void  read();
}
