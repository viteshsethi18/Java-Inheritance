class Square {
	void getdetails() {
		System.out.println("data in superclass");
	}
}
class Rectangle extends Square {
	void checkdeatils(){
		System.out.println("data in subclass");
	}
       
}
public class PvtMem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rectangle obj1 = new Rectangle();
    obj1.getdetails();
	}

}
