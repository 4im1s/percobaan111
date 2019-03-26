import java.util.*;
public class diskriminan{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double x,y,z,p;
		System.out.println("program menghitung diskriminan");
		System.out.println("================================");
		System.out.println("menghitung = ax + bx + c = 0 " );
		System.out.print("masukan a : ");
		int a=in.nextInt();
		System.out.print("masukan b : ");
		int b=in.nextInt();
		System.out.print("masukan c : ");
		int c=in.nextInt();
		x=b*b-4*a*c;
		System.out.println("hasil diskriminan = "+x);

		if (x==0)
		{
			y=-b/2*a;
		System.out.println("nilai x1 dan x2 = "+ y);
		}
		 if(x>0);
		{
			y=-b+Math.sqrt(x)/2*a;
			z=-b-Math.sqrt(x)/2*a;
			System.out.println("hasil akar x1 = "+y);
			System.out.println("hasil akar x2 = "+ z);
		}
		 if(x<=0);
		{
			y=-b/2*a + Math.sqrt(x)/2*a;
			z=-b/2*a + Math.sqrt(x)/2*a;
			System.out.println("hasil x1 = "+y);
			System.out.println("hasil x2 = "+ z);
		}



	}
}