import java.util.Scanner;

public class cs234 {

	public static void main(String[] args) {
		
		
		//Justus Contreras
		//P2.1
		//cs234
		
		
		//Variable Declaration
		int y, a, b, c, d, e, g, h, j, m, n, p, k, r, s;
		
		Scanner pam = new Scanner (System.in);

		
		
		//User enter the year 
		System.out.print("Enter the year:" );
		y=pam.nextInt();
		
		
		//The math to figure it out
		a = y%19;
		
		b=y/100;
		
		s = y%100;
		
		d= b/4;
		
		e = b%4;
		
		g = (8*b+13)/25;
		
		h= (19*a+b-d-g+15)%30;
		
		j= s/4;
		
		k= s%4;
		
		m = (a+11*h)/319;
		
		r = (2*e+2*j-k-h+m+32)%7;
		
		n = (h-m+r+90)/25;
		
		p = (h-m+r+n+19)%32;
		
		
		//Once user enters a operation switch will determine which action will be used 
		switch(n)
		{
		//January
		case 1:
			System.out.print("The month and day falls on January " +p);
			break;
		//February 
		case 2:
			System.out.print("The month and day falls on February " +p);
			break;
		//March
		case 3:
			System.out.print("The month and day falls on March " +p);
		    break;
		//April  
		case 4:
			System.out.print("The month and day falls on April " +p);
		    break;
		//May   
		case 5:
			System.out.print("The month and day falls on May " +p);
		    break;
		//June    
		case 6:
			System.out.print("The month and day falls on June " +p);
		    break;
		//July    
		case 7:
			System.out.print("The month and day falls on July " +p);
		    break;
		//August    
		case 8:
			System.out.print("The month and day falls on August " +p);
		    break;
		//September   
		case 9:
			System.out.print("The month and day falls on September " +p);
		    break;
		//October    
		case 10:
			System.out.print("The month and day falls on October " +p);
		    break;
		//November   
		case 11:
			System.out.print("The month and day falls on November " +p);
		    break;
		//December    
		case 12:
			System.out.print("The month and day falls on December " +p);
		    break;
	
		   }
		
		
		
		
		
		
		
		
		

	}

}
