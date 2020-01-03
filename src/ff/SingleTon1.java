package ff;

public class SingleTon1 {
private SingleTon1(){}
	
	private static  SingleTon1 instance=new SingleTon1();
	
	public static SingleTon1 getnInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon1.getnInstance().toString();
	}
	
	

}
