public class bankAccountmain {
    public static void main(String[] args) {
        bankAccount info = new bankAccount();
        info.setBalance(500D);
        info.setBranchName("Cambridge");
        info.setId(4534L);
        info.setAccountHoldername("Vikram Veer Singh");
        info.checkBalance();
        info.depositAmount(100D);
        info.withdrawAmount(50d);



    }
}
