package basicPrograms;

public class ControlStatements {

	public static void main(String[] args) {
//		    
//		for (int i = 0; i <= 10; i++) {
//			if (i == 5) {
//				continue;
//           }
//			System.out.println(i);
//		}
//		int n=18;
//		if (n!=18) {
//			System.out.println("eligible");
//		}else if (n==18) {
//			System.out.println("eligible to vote");
//		}  else {
//			System.out.println("not eligible");
//		}

		// int i=5;
//		while (i<5) {
//			System.out.println(i);
//			i++;
//		}

//		do {
//			System.out.println(i);
//			i++;
//		} while (i<5);
		
		String browser="IE";
		switch (browser) {
		case "chrome":
			System.out.println("chrome driver launched scuccessfully");
			break;
		case "firefox":
			System.out.println("Firefox driver launched scuccessfully");
			break;
		case "IE":
			System.out.println("Internet Explorer driver launched scuccessfully");
			break;

		
		}

	}

}
