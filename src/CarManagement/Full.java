package CarManagement;

public class Full extends Car{
	@Override
	public void Price() {
		// TODO Auto-generated method stub
		price=70000;
		if(low_Pollution) {
			price=price/2;
		}
	}
	
	@Override
	public void carsize() {
		// TODO Auto-generated method stub
		size="´ëÇü";
	}

}
