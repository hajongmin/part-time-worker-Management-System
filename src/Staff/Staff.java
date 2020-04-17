package Staff;

import java.util.Scanner;

public class Staff {
	protected StaffKind kind = StaffKind.Regularworker;
	protected String name;	
	protected int age;
	protected int phonenumber;
	protected int workhour; 
	//�ڽĿ��� ��ӵǴµ� �� �� �ܺ� Ŭ�������� ���� ���ϴ�, ���� ��Ű���ȿ��� ���Ե����� �ٸ������� ���� ���ϵ��� �ϴ� ��Ʈ

	public Staff() {

	}

	public Staff(String name, int age, int phonenumber, int workhour) {
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.workhour = workhour;
	}


	public StaffKind getKind() {
		return kind;
	}

	public void setKind(StaffKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getWorkhour() {
		return workhour;
	}

	public void setWorkhour(int workhour) {
		this.workhour = workhour;
	}


	public void printinfo() {
		System.out.print("name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", "
				+ "workhour : " + workhour + "\n\n");
	}

	public void getUserInput(Scanner input) {
		System.out.println("***Add the staff*** ");

		System.out.println("Name : ");
		String name = input.next();
		this.setName(name);

		System.out.println("age : ");
		int age = input.nextInt();
		this.setAge(age);

		System.out.println("Phone number : ");
		int phonenumber = input.nextInt();
		this.setPhonenumber(phonenumber);

		System.out.println("working hour : ");
		int workhour = input.nextInt();
		this.setWorkhour(workhour);

	}
} 