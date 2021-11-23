package com.prograd;

public class CalculateBharatBankInterest {
    int balance;
    private int currentInterestRate=3;
    private int savingInterestRate=0;
    String accountType;
    double period = 0.24;
    CalculateBharatBankInterest(int balance, String accountType){
        this.balance = balance;
        this.accountType = accountType;
    }

    public String depositMoney(int depositedMoney){
        this.balance += depositedMoney;
        return "Gopal deposited "+depositedMoney+" money";
    }

    public String withdrawMoney(int amountToWithdraw){
        if(this.balance < amountToWithdraw){
            return "No sufficient amount to withdraw";
        }
        this.balance -= amountToWithdraw;
        return "Amritha withdraws "+amountToWithdraw+" money";
    }

    public double getInterest(){
        int interest ;
        if(this.accountType == "current"){
            interest = currentInterestRate;
        }
        else{
            interest = savingInterestRate;
        }
        double balanceWithInterest =  this.balance*interest;
        return (double) balanceWithInterest*period/100;
    }
}

class InterestBank{
    public static void main(String[] args){
        CalculateBharatBankInterest gopalAccount = new  CalculateBharatBankInterest(50000,"current");
        CalculateBharatBankInterest amrithaAccount = new  CalculateBharatBankInterest(100000,"savings");
        System.out.println(gopalAccount.depositMoney(10000));
        System.out.println(amrithaAccount.withdrawMoney(45000));


        System.out.println("Gopal interest is : "+gopalAccount.getInterest());
        System.out.println("Amritha interest is : "+amrithaAccount.getInterest());
    }
}

