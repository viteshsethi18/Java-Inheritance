class SalariedWorker extends Worker{
void ComPay(int hrs) {
if(hrs==0)
System.out.println("Total salary of salaried worker: " + 40*hrs);
else
System.out.println("Total salary of salaried worker: " +
40*salaryRate*hrs);
}
}