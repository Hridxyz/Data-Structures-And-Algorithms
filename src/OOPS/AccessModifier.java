package OOPS;

public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "hriday";
        myAcc.setPassword("12345678");
    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
