package CarManagement;

import java.util.ArrayList;
import java.util.Scanner;



public class CarInput {
	Scanner in =new Scanner(System.in);
		
	ArrayList <Car> cList=new ArrayList<>();
	
	public void Input() {
		System.out.println("������ �������ּ���");
		System.out.println("1. ����  2. ������  3. ������");
		int no=in.nextInt();
		in.nextLine();
		if(no==1) {
			Car c=new Small();
			c.input();
			cList.add(c);
		}else if(no==2) {
			Car c=new Compact();
			c.input();
			cList.add(c);
		}else if(no==3) {
			Car c=new Full();
			c.input();
			cList.add(c);
		}

		System.out.println("��ϿϷ�");

	}
	
	public void Priceprt() {
		for(Car car: cList) { 
			System.out.println("����ȣ: "+car.carnum);
			System.out.println("�������: "+car.price);
			System.out.println("-----------------------");
		}
		
	}
	
	public void search() {
		
		System.out.println("�˻��� ����ȣ�� �Է����ּ���");
		String Scarnum=in.nextLine();
		for(Car car: cList) { 
			if(car.carnum.equals(Scarnum)) {
				car.prt();
				car.nextPrice();
				return;
			}
		}
		System.out.println("������ �����ϴ�.");

		
	}

	
	
}
