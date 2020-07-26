package kind.sort.to.com.phone;
/*原始手机
* */
public class FirstPhone {
    private String  pingPai;
    private double price;
    public void setPingPai(String pingPai){
        this.pingPai=pingPai;
    }
    public String getPingPai(){
        return pingPai;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FirstPhone() {

    }

    public void call(){
        System.out.println("手机可以打电话");
    }

}
