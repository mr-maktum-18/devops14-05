public class BankCustomer {

    String Name;
    double Account_Number;
    int Age;

    void display()
    {
        System.out.println("Name is "+ Name);
        System.out.println("Account Number is "+ Account_Number);
        System.out.println("Age is "+ Age);
    }
    public static void main(String[] args) {
        BankCustomer obj = new BankCustomer();
        obj.Name = "ABC";
        obj.Account_Number = 1234567890;
        obj.Age = 23;

        obj.display();
    }
}