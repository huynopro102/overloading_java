package overloading;

public class main extends myMath {
	public static void main(String[] args) {
	//
		myMath m = new myMath();
		System.out.println("tim max int "+m.timmax(5, 6));
		System.out.println("tim max double "+m.timmax(4.2, 4.5));
		System.out.println("tinh tong int a , b "+m.tinhtong(5, 6));
		double ary[] = new double []{3,42,5,6,1};
		System.out.println("tinh tong mang "+m.tinhtong(ary));
	}

}
