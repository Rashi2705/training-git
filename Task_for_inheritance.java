
class Account{
    int accountNo;
    String name,address,phoneNo,dob;
    float balance;
    public Account(int accountNo,String name,String address,String phoneNo,String dob,float balance){
        this.accountNo=accountNo;
        this.address=address;
        this.balance=balance;
        this.dob=dob;
        this.name=name;
        this.phoneNo=phoneNo;
    }
    public void closeAccount(){
        
    }
    
}
class SavingsAccount extends Account{
    public SavingsAccount(int accountNo, String name, String address, String phoneNo, String dob, float balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }
    public void withdraw(){
        
    }
    public void deposite(){
        
    }
    public void fixedDeposite(){
        
    }
}
class LoanAccount extends Account{
    public LoanAccount(int accountNo, String name, String address, String phoneNo, String dob, float balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
        
    }
    public void payEMI(){
        
    }
    public void topUpLoan(){
        
        
    }
    public void repayment(){
}
}
public class Task_for_inheritance {
    public static void main(String[]args){
       
    } 
}
