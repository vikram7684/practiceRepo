public class bankAccount {

    String accountHoldername;
    String branchName;
    long id;
    Double balance;

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public void setAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

public void checkBalance(){

    System.out.println("Your current Balance is " + getBalance());


}

public void depositAmount(Double amount){

    System.out.println("You have deposited " + amount);
}

    public void withdrawAmount(Double drawAmount){
balance =  balance - drawAmount;
        System.out.println("Your new balance is " + balance);
    }



    @Override
    public String toString() {
        return "bankAccount{" +
                "accountHoldername='" + accountHoldername + '\'' +
                ", branchName='" + branchName + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }
}
