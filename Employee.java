class Employee {
int empId;
String name;
int salary;
Employee(){
System.out.println("Name and Salary through default cons is: " + name + " " + salary);
}
Employee(String name, int empId, int salary){
this.name=name;
this.empId=empId;
this.salary=salary;
System.out.println("Name and Salary through parameterized cons is: " + name + " " + empId + " " + salary);
}
void getdetails(String name, int empId, int salary) {
this.name=name;
this.empId=empId;
this.salary=salary;
System.out.println("Name and Salary through method is: "
+ name + " " + empId + " " + salary);
}
void increaseSalary(int salary) {
this.salary=salary;
int inc, total;
inc=(5*salary)/100;
total=salary+inc;
System.out.println("Increased salary by 5% is: " + total);
}
}