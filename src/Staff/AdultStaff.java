package Staff;

 

import java.util.Scanner;

 

public abstract class AdultStaff extends Staff { //추상화

 

	public AdultStaff(StaffKind kind) { //추가

		super(kind);

	}

	

	@Override

	public abstract void getUserInput(Scanner input); //추상화

	

	@Override

	public void printinfo() { //추가

		String skind = getKindString();

		System.out.print("kind: " + skind +"," + " name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", "

				+ "workhour : " + workhour + "\n\n");

	}

 

	public void setStaffagewithYN(Scanner input) { //추가

		char answer = 'x';  

		while (answer != 'y' && answer !='Y' && answer !='n' && answer !='N')

		{

			System.out.println("Do you want to know age? (Y/N)");

			answer = input.next().charAt(0);

			if(answer == 'y' || answer == 'Y')

			{

				setStaffAge(input); // 추가

				break;

			}

 

			else if (answer == 'N' || answer == 'n')

			{

				this.setAge(0);      // 문자형 데이터 " " 를 정수로 표현하지 못해 0이 출력되도록 하였습니다.

				break;

			}

 

			else {

 

			}

		}

	}

	

}