
public class DerivedCls extends SuperCls2 implements Inter {
	public void Display1() {
		System.out.println("Interface Invoked");
	}
	void Display3() {
		Display2();
	}
}
