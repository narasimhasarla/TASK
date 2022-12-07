import java.util.Scanner;
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-D ARRAY
		int a[];
		a=new int[5];
		int i,j;
		System.out.println("Enter elments:");
		Scanner s;
		s=new Scanner(System.in);
		for(i=0;i<5;i++)
			a[i]=s.nextInt();
		System.out.println("Entered elments are:");
		for(i=0;i<5;i++)
			System.out.print(a[i]+" ");
		
		//2-D ARRAY
		int b[][];
		b=new int[2][2];
		System.out.println("Enter elments:");
		for(i=0;i<2;i++)
			for (j=0;j<2;j++)
				b[i][j]=s.nextInt();
			
		System.out.println("Entered elments are:");
		for(i=0;i<2;i++)
			for (j=0;j<2;j++)
				System.out.print(b[i][j]+" ");
	}
}
