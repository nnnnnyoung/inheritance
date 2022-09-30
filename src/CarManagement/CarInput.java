package CarManagement;

import java.util.ArrayList;
import java.util.Scanner;



public class CarInput {
	Scanner in =new Scanner(System.in);
		
	ArrayList <Car> cList=new ArrayList<>();
	
	public void Input() {
		System.out.println("경형을 선택해주세요");
		System.out.println("1. 경차  2. 소형차  3. 대형차");
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

		System.out.println("등록완료");

	}
	
	public void Priceprt() {
		for(Car car: cList) { 
			System.out.println("차번호: "+car.carnum);
			System.out.println("주차요금: "+car.price);
			System.out.println("-----------------------");
		}
		
	}
	
	public void search() {
		
		System.out.println("검색할 차번호를 입력해주세요");
		String Scarnum=in.nextLine();
		for(Car car: cList) { 
			if(car.carnum.equals(Scarnum)) {
				car.prt();
				car.nextPrice();
				return;
			}
		}
		System.out.println("차량이 없습니다.");

		
	}

	
	
}
