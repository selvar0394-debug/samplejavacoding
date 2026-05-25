package basicPrograms;

public class Initialize extends Initalize1 {

	public Initialize() {
		
		super(10);
		System.out.println("default constructor");
	}

	public Initialize(int i) {
		System.out.println(i);
	}

	// public Initialize(int i) {
//		System.out.println(i);
//	}
	public static void main(String[] args) {
		Initialize i = new Initialize();
		Initialize i1 = new Initialize(100);
	}

}
