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
	
	String indate; //����� ��¥1
	
	public void nextPrice() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd", Locale.US);
		LocalDate date = LocalDate.parse(indate, formatter);
		System.out.println(date.getMonthValue()+1+"�� ���"+this.price);
	}


	public void input() {
		System.out.println("������ �Է����ּ���");
		carinfo=in.nextLine();
		System.out.println("�� ��ȣ�� �Է����ּ���");
		carnum=in.nextLine();
		System.out.println("������������ �� ����Դϱ�?");
		family=in.nextInt();
		in.nextLine();
		System.out.println("��ϳ�¥�� �Է��ϼ���");
		indate=in.nextLine();
		System.out.println("������ ���� ����� �Ǿ��ֽ��ϱ�?");
		System.out.println("1. ���  2. �̵��");
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
		System.out.println("����: "+this.carinfo+"("+this.size+")");
		System.out.println("����ȣ: "+this.carnum);
		System.out.println("�������: "+this.price);
		if(low_Pollution) {
			System.out.println("����������: ���");
		}else {
			System.out.println("����������: �̵��");
		}
		System.out.println("����������: "+this.family+"��");
	}
	

	

}
