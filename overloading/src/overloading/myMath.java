package overloading;

public class myMath {
	// khong can thuoc tinh
	public myMath() {
		
	}
	// phuong thuc
	public int timmax(int a, int b  ) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public double timmax(double a , double b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public int tinhtong(int a,int b ) {
		return a+b;
	}
	public double tinhtong(double[] mang) {
		double tong =0;
		for (int i = 0; i < mang.length; i++) {
			tong=tong+mang[i];
		}
		return tong;
	}
}
