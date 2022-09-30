package CarManagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public abstract class Car {
	Scanner in=new Scanner(System.in);
	
	String size;
	int price;
	boolean low_Pollution;
	String carnum;
	String carinfo;
	int family;
	
	String indate; //등록한 날짜1
	
	public void nextPrice() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd", Locale.US);
		LocalDate date = LocalDate.parse(indate, formatter);
		System.out.println(date.getMonthValue()+1+"월 요금"+this.price);
	}


	public void input() {
		System.out.println("차종을 입력해주세요");
		carinfo=in.nextLine();
		System.out.println("차 번호를 입력해주세요");
		carnum=in.nextLine();
		System.out.println("가족구성원은 총 몇명입니까?");
		family=in.nextInt();
		in.nextLine();
		System.out.println("등록날짜를 입력하세요");
		indate=in.nextLine();
		System.out.println("저공해 차량 등록이 되어있습니까?");
		System.out.println("1. 등록  2. 미등록");
		int no=in.nextInt();
		if(no==1) {
			low_Pollution=true;
		}else if(no==2) {
			low_Pollution=false;
		}
		carsize();
		Price();
		
	
		
	}

	public abstract void Price();
	
	public abstract void carsize();
	
	public void prt() {
		System.out.println("차종: "+this.carinfo+"("+this.size+")");
		System.out.println("차번호: "+this.carnum);
		System.out.println("주차요금: "+this.price);
		if(low_Pollution) {
			System.out.println("저공해차량: 등록");
		}else {
			System.out.println("저공해차량: 미등록");
		}
		System.out.println("가족구성원: "+this.family+"명");
	}
	

	

}
