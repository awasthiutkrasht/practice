package SimpleProram;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {10,12,13,14,15,16};
		int count=0;
		int[] rev  =new int[x.length];
		System.out.println("öriginal arrays is :");
		for(int i : x) {
		System.out.println(i+" ");
		for(int j =x.length-1;j>=0;j--) {
			rev[count++]= x[j];
			System.out.println("\n"+"rev arrays is :");
			for(int i1 : rev) {
				System.out.println(i1+" ");
				
			}
		}
		}

	}

}
