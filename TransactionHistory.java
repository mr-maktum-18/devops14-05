public class TransactionHistory {
    int Transactin_id;
    String Sender_Name;
    String Receiver_Name;
    double AmountTransaction;
    String Status;
    String Date;

    void display(){
        System.out.println("Transaction ID: "+Transactin_id);
        System.out.println("Sender Name: "+ Sender_Name  );
        System.out.println("Receiver Name: "+ Receiver_Name);
        System.out.println("Amount Transaction: "+ AmountTransaction);
        System.out.println("Status: "+Status);
        System.out.println("Date: "+Date);
    }

    public static void main(String[] args) {
        TransactionHistory T1 = new TransactionHistory();
        T1.Transactin_id = 1;
        T1.Sender_Name = "ABC";
        T1.Receiver_Name = "XYZ";
        T1.AmountTransaction = 50000;
        T1.Status = "Successful";
        T1.Date = "14-05-2025";

        T1.display();

    }
}
