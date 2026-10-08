package com.tka;

public class LogicalOperators {
	public static void main(String args[]) {
		
		boolean check=!(4 >= 3);//true
		
		System.out.println((check && 9 > 4) || (3 == 3 || 8 <= 2) && (6 != 5 && !check));
		//  (T && T)|| (T || F ) && (T && F)
		//  (T) || (T) && (F)
		//  (T) || (F)
		//  True
		
		
		
		System.out.println(((7 >= 7 || 5 > 9) && (!check || 6 == 6)) && ((3 != 4 && 8 <= 8) || (check && 1 > 5)));
		//   (T||F && F||T)  &&  (T && T || T && F)
		//   (T && T) && (T || F)
		//   (T) && (T)
		//   True
		
		
		System.out.println(((5 > 2 && "BCA".equals("BCA")) ||(!check && 7 < 4)) &&(9 >= 9 || !"Java".equals("Python")));
		//((T && T) || (F && F)) && (T || T)
		//((T)||(F)) && (T)
		//T && T
		//True
		
		
	    int a = 5;
		int b = 10;
		String language = "Java";
        boolean checks = !(a >= b);//true

		System.out.println((((a < b && "Java".equals(language)) || checks) &&(b >= 10 && a != 3)) ||((a > b || "Python".equals(language)) &&!checks));
		//((T && T)||F) && (T && T)) ||((T || F) && F)
		//(T||F) && (T) || (T && F)
		//T &&  T || F
		//True
		
		int x = 5;
        System.out.println(x++ < 5 || ++x == 7 && x++ == 7|| ++x > 8 && x-- == 9);
		//(F || T && T || T && T)
        //F || T || T
        //True
		System.out.println(x);
		
		
	    x = 5;
	    System.out.println((x++ < 5 || ++x == 7 && x++ == 9 || x-- == 8 && ++x == 9) || (--x == 7 && x++ > 7));
		//(F || T && F || T && T ) || (T && F)
		// (F|| F ||F)||(F)
		//F || F|| (F)
		//False
		System.out.println(x);
		
		
		
		
	}

}
