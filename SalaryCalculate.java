import java.util.Scanner;

public class SalaryCalculate {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 to get info of daily worker or 2 to get info of salaried worker");
int i = sc.nextInt();
if(i==1) {
DailyWorker obj1 = new DailyWorker();
obj1.getdetails();
System.out.println("Enter number of hours worked");
int x = sc.nextInt();
obj1.ComPay(x);
}
else if(i==2) {
SalariedWorker obj2 = new SalariedWorker();
obj2.getdetails();
System.out.println("Enter number of hours worked");
int y = sc.nextInt();
obj2.ComPay(y);
}
else
System.out.println("Invalid Input");
sc.close();
}
}