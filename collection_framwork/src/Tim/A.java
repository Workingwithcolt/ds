package Tim;
import java.util.Scanner;
class A{
	//first we ask the User to enter the 1 or 2 for first class or economy class
	//then assign the seat of particulary the first class having the seat (1 to 6) and economy has (6 to 10)
	//distplay the boarding pass has 1 .name 2 .number of seat
	//first we have to create the boolean array,when the particular seat get selected that become the true other
	//wise false
	Scanner s = new Scanner(System.in);
	boolean[] isSeat = new boolean[20];
	String[] nameSeat = new String[20];
	String[] numberSeat = new String[20];
	public static void main(String[] args) {
		A obj = new A();
		for (int i = 0; i < 10; i++) {
			obj.isSeat[i] = true;
		}
		boolean isTruef = true;
		boolean isTruee = true;
		int countf = 0;
		int counte = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Please make Select the 1 or 2 ");
			System.out.println("1:first Class\n2:economy Class");
			int classs = obj.s.nextInt();
			if (classs == 1 && isTruef) {
				System.out.println("Enter the name:");
				obj.nameSeat[i] = obj.s.next();
				obj.numberSeat[i] = "141" + i;
				System.out.println("the number is" + obj.numberSeat[i]);
				if (countf <= 5) {
					countf += 1;
					isTruef = true;
					obj.isSeat[i] = false;
					if (countf == 5) {
						System.out.println("please select the 2 compartement theris no any seat here present ");
						isTruef = false;
					}
				}
			} else if (classs == 2 && isTruee) {
				System.out.println("is you want to make a seat at the economic class then type 1 or 0 for not");
				String value = obj.s.next();
				if (value.equals("1")) {
					System.out.println("Enter the name:");
					obj.nameSeat[counte + 6] = obj.s.next();
					obj.numberSeat[counte + 6] = "141" + counte;
					System.out.println("the number is" + obj.numberSeat[counte + 6]);
					if (counte <= 5) {
						counte += 1;
						isTruee = true;
						obj.isSeat[counte + 5] = false;
						if (counte == 5) {
							isTruee = false;
						}
					}
				} else {
					counte += 1;
					if(counte <= 5){
						System.out.println("make select of another compartement!!");
					}
					continue;
				}
			}
		}
		System.out.println("is U want  a seat at the economy class");
		int value = obj.s.nextInt();
		if(value == 1){
		for (int i = 0; i < 10; i++) {
			if (obj.isSeat[i] == true) {

			} else {
				System.out.println("Enter the name:");
				obj.nameSeat[i] = obj.s.nextLine();
				obj.numberSeat[i] = "142" + i;
			}
		}
		}else{
					System.out.println("Thank You!!!");
				}
		for (int i = 0; i < 10; i++) {
			System.out.println(obj.nameSeat[i] + " having a seat number" + obj.numberSeat[i]);
		}
	}
}