import java.util.*;
class Worker{
int salaryRate;
Scanner scan = new Scanner(System.in);
void getdetails() {
System.out.println("Enter worker name: ");
String name = scan.nextLine();
System.out.println("Worker name is: " + name);
System.out.println("Enter Salary rate: ");
salaryRate = scan.nextInt();
}
void ComPay(int hrs) {
}
}