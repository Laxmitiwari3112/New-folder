
public class Visibility {
    
    public static void main(String[] args) {
         //BANKACCOUNT
        BankAccount myAcc=new BankAccount();
        myAcc.Username="harry";
        //myAcc.password="1644";error bcz password isn't visible
    }
}
    class BankAccount{
        public String Username;//visible to all class(public)
        private int password;//only visible to this class(private)

        void Username(String newUsername){
            Username=newUsername;
        }
    }

