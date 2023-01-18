package LineComparition;

public class LineComparition {
	//static Integer x1 ,x2,y1,y2 ;
		static Double Length (Integer x1, Integer  x2,Integer  y1,Integer  y2 ) {
		return Math.sqrt((x2-x1)^2 + (y2-y2)^2);//formula for getting the lenth of lines
	}
	static void compare(Double equation1,Double equation2) {
		System.out.println("comparing 2 the difference is -"+equation1.compareTo(equation2));
	}
	static void Equal(Double equation1,Double equation2) {
		System.out.println("is the both "+equation1 +","+equation2+"or equal -"+equation1.equals(equation2));		
	}
	
	public static void main(String[] args) {
		Double l1=(Length(1,6,3,4));//1st lenth points 
		Double l2=(Length(1,2,12,10));//2nd lenth points
		System.out.println(l1);
		System.out.println(l2);
		
		compare(l1,l2);//compare method
		Equal(l1,l2);//equals to method
		
	}
}
