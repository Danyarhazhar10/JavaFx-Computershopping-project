package shop;

public class Shop {

    private String Staff;
    private String customer;

    public static void buy() {

    }

    public void setStaff(String NStaff) {
        Staff = NStaff;
    }

    public void setcustomer(String Ncustomer) {
        customer = Ncustomer;
    }

    public String getStaff() {
        return Staff;
    }

    public String getcustomer() {
        return customer;
    }

}

class danyar {

    public static void main(String[] args) {
        Shop ob = new Shop();
        ob.setStaff("manager,employee");
        ob.setcustomer("people");

        System.out.println("Staff= " + ob.getStaff());
        System.out.println("customer= " + ob.getcustomer());

    }
}
