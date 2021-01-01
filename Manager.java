class Manager extends Employee{
String department;
Manager(String name, int empId, int salary, String department){
super.name=name;
this.empId=empId;
super.salary=salary;
this.department=department;
System.out.println("Name, Salary and department through subclass is: "
+ name + " " + empId + " " + salary + " " + department);
}
}