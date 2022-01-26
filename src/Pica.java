import java.util.Scanner;

public class Pica {

	public static void main(String[] args) {
	
		fikset();
		
		
		
		
		
		
		
	}
		
		public static void fikset() {
			Scanner scan = new Scanner(System.in);
			String v,u,a = null;
			int t=0,count = 0;
			char n=0;
			
			
			System.out.println("Adrese(Ielas nosaukums un numurs): ");
			a = scan.nextLine();
			for(int i=0;i<a.length();i++) {
				if(Character.isDigit(a.charAt(i))) {
					n=a.charAt(i);
					
			System.out.println("vārds: ");
			v = scan.next();
			System.out.println("Uzvārds: ");
			u = scan.next();
			do {
				count=0;
			System.out.println("Telefons: ");
			t = scan.nextInt();
			
			while (t != 0) {  
			      t /= 10;
			      ++count;
			    
			    }
			}while(8!=count);	
			break;	
			
				}
			}
			
		
		}

	


}
