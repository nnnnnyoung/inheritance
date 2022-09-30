package CarManagement;

public class Compact extends Car{
	@Override
	public void Price() {
		// TODO Auto-generated method stub
		price=40000;
		if(low_Pollution) {
			price=price/2;
		}
		if(family>=4) {
			price=(int) (price*(0.9));
		}
	}
	
	@Override
	public void carsize() {
		// TODO Auto-generated method stub
		size="¼ÒÇü";
		
	}

}
