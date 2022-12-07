
public class DriverCls {
	//No Args..No Returns00
	void Display() {
		System.out.println("NO Args and NO Returns");
	}
	
	//No Args..with Returns
	int Display2() {
		return (25);
	}
	//with Args..No Retruns
	void Display3(String name) {
		System.out.println("Parameter Value:"+name);
	}
	//with Args..with Returns
	int Display4(int x) {
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverCls d;
		d=new DriverCls();
		
		d.Display();
		
		int x=d.Display2();
		System.out.println("Return value:"+x);
		
		d.Display3("Peter");
		
		int y=d.Display4(57);
		System.out.println("Return value with Parameter:"+y);
	}

}
