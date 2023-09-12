package task2;

import java.util.Scanner;

public class atmmachine {
    public static void main(String[] args) {
        int balance=50000000;
        int withdrow,deposite;
        Scanner sc=new Scanner(System.in);
        System.out.println("Automated Teller Machine");
        System.out.println("choose 1 for withdrow");
        System.out.println("choose 2 for deposite");
        System.out.println("choose 3 for chek balance");
        System.out.println("choose 4 for exit");
        int amount=sc.nextInt();
        switch(amount){
            case 1:
                System.out.println("enter a amount to withdrow");
                withdrow=sc.nextInt();
                if(balance>=withdrow){
                    balance=balance-withdrow;
                    System.out.println("Remaining balance"+balance);
                    System.out.println("Thank you for using machine");
                }else {
                    System.out.println("insefficent balance");
                }
                break;
            case 2:
                System.out.println("enter a amount to be deposite");
                deposite=sc.nextInt();
                balance=balance+deposite;
                System.out.println("total balance"+balance);
                System.out.println("Thank you for using machine");
                break;
            case 3:
                System.out.println("your current balance-"+balance);
                break;
            case 4:
                System.out.println("exit");
                break;
        }
    }
}
