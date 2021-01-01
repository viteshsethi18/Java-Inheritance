import java.util.Scanner;

public class TrunkCalls {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1. for ordinary/ 2. for Urgent/ 3. for 2Lightning");
int i = sc.nextInt();
if(i==1) {
System.out.println("Enter Rate and duration of call: ");
int x = sc.nextInt();
int y = sc.nextInt();
Ordinary obj1 = new Ordinary(x,y);
}
else if(i==2) {
System.out.println("Enter Rate and duration of call: ");
int x = sc.nextInt();
int y = sc.nextInt();
Urgent obj2 = new Urgent(x,y);
}
else if(i==3) {
System.out.println("Enter Rate and duration of call: ");
int x = sc.nextInt();
int y = sc.nextInt();
Lightning obj3 = new Lightning(x,y);
}
else
System.out.println("Invalid input");
sc.close();
}
}