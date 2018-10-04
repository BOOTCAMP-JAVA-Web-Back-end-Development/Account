public class new_Acc {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000,4.5);
        System.out.println("ID "+ account1.getId());
        System.out.println("Ngày lập tk: " + account1.dateCreated());
        System.out.println("Số tiền "+ account1.getBalance());
        System.out.println("Lãi suất hàng năm "+ account1.getAnnualInterestRate());
        System.out.println("Tiền lãi hàng tháng "+ account1.getMonthlyInterestRate());
        System.out.println("Rút tiền "+ account1.withdraw(2500));
        System.out.println("Gửi tiền "+ account1.deposit(3000));
    }
}
