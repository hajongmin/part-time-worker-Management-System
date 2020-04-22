package Staff;

import java.util.Scanner;

public class Manager extends Staff {
	
	public Manager(StaffKind kind) {
		super(kind);

	}
	
	public void getUserInput(Scanner input) {
		System.out.println("***Add the staff*** ");

		System.out.println("Name : ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';  
		while (answer != 'y' && answer !='Y' && answer !='n' && answer !='N')
		{
			System.out.println("Do you want to know age? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y')
			{
				System.out.println("age : ");
				int age = input.nextInt();
				this.setAge(age); 
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
		
		System.out.println("phone : ");
		int phonenumber = input.nextInt();
		this.setPhonenumber(phonenumber);
		
		System.out.println("working hour : ");
		int workhour = input.nextInt();
		this.setWorkhour(workhour);
		
		
		
	


	}
}
