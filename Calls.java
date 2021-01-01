import java.util.*;
class Calls {
	int rate;
	int duration;
	Calls(int r, int d){
	rate=r;
	duration=d;
	System.out.println("Charges of Selected call is: " + rate*duration);
	}
}