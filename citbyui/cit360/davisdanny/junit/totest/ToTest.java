package citbyui.cit360.davisdanny.junit.totest;

public class ToTest {
	private int numberA;
	private int numberB;
	
	public int addAAndB(){
		return numberA + numberB;
	}
	
	public int mult(int x, int y){
		int count = 0;
		for(int i = 0;i<y;i++){
			count += x;
		}
		for(int i = 0;i>y;i--){
			count -= x;
		}
		return count;
	}
	
	
	public int getNumberA() {
		return numberA;
	}
	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}
	public int getNumberB() {
		return numberB;
	}
	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}
	
	
	
	
}
