package CarManagement;


import java.util.Scanner;

public class Menu {
	Scanner in=new Scanner(System.in);
	CarInput I=new CarInput();
	
	Menu(){
		for(;;) {
			System.out.println("1. �ڵ������");
			System.out.println("2. ������� ��ü���");
			System.out.println("3. �ڵ�����ȸ");
			int no=in.nextInt();
			in.nextLine();
			if(no==1) {
				I.Input();
			}else if(no==2) {
				I.Priceprt();
			}else if(no==3) {
				I.search();
			}
					
		}
	}
	
	
	

}
