public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public BankAccount(){ //CONSTRUCTOR
        this("54321",2.5,"default name","default email",
                "default phone number");// este un caz special
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber,double balance,String customerName,String email, String phoneNumber){
        System.out.println("Bank account constructor with parameters called");// CONSTRUCTOR DE BAZĂ
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public BankAccount(String customerName, String email, String phoneNumber) {// alt constructor pe baza constructorului de bază
        this("99999",100.55,customerName,email,phoneNumber);
    }
    public double DepositFunds(double funds ){
        this.balance +=funds;
        return this.balance;

    }
    public double  WithdrawFunds(double funds){
        if(this.balance - funds < 0){
            this.balance = 0;
        }else {
            this.balance -= funds;

        }
        return this.balance ;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}
