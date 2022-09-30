package CarManagement;

public class Small extends Car{
	
	
	
	@Override
	public void Price() {
		price=20000;
		if(low_Pollution) {
			price=price/2;
		}
		if(family>=3) {
			price=(int) (price*(0.9));
		}
		
	}

	@Override
	public void carsize() {
		// TODO Auto-generated method stub
		size="°æÂ÷";
	}

}
