
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple if
		int x=10;
		if (x==10) 
			System.out.println("x="+x);
		//if-else
		if (x>0) 
			System.out.println("+ve");
		else 
			System.out.println("-ve");
		//nested if
		if (x!=0)
			System.out.println("x="+x);
			if (x>0)
				System.out.println("+ve");
				if (x<50)
					System.out.println("x<50");
		//if-else-if
		if (x==0)
			System.out.println("x:"+x);
		else if (x>0)
			System.out.println("+ve");
		else if (x<0)
			System.out.println("-ve");
		else
			System.out.println("Invalid");
		//switch
		int a=11;
		switch(a) {
		case 0:System.out.println("case 0");
			break;
		case 1:System.out.println("case 1");
			break;
		case 2:System.out.println("case 2");
			break;
		default:System.out.println("Invalid");
		}
	}

}
