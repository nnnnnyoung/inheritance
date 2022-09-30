package CarManagement;


import java.util.Scanner;

public class Menu {
	Scanner in=new Scanner(System.in);
	CarInput I=new CarInput();
	
	Menu(){
		for(;;) {
			System.out.println("1. 자동차등록");
			System.out.println("2. 주차요금 전체목록");
			System.out.println("3. 자동차조회");
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
