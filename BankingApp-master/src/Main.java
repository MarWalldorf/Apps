public class Main {

    public static void main(String[] args) {
        Account PeterAccount = new Account("12345",0.0,"Peter","Peter@gmail.com","12121");

        PeterAccount.DepositMoney(100);
        PeterAccount.DepositMoney(150);
        PeterAccount.WithDrawMoney(200);
    }

}