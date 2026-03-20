package day2;

public class Program1_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.implicit
		int a =4;
		float b =a;
		System.out.println(b);
//		2.explicit
		float a1 =4.26F;
		int b1 = (int) a1;
		System.out.println(b1);
//		3.explicit
		long phoneNumber = 8867278402L;
		int pN = (int)phoneNumber;
		System.out.println(pN);
	}

}
