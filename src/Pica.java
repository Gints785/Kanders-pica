import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;


public class Pica {
	
	static double a,b,c,skaitlis;
//===========================================================================	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String izvele;
		
		do{
			System.out.println("1 - Ievadīt klienta datus|2 - Veikt Picu pastūtījumu| Atcelt");;
			izvele = scan.next();		
			izvele = izvele.toLowerCase();
	
				switch(izvele){
				case"1":
					KLDA();
				break;
				//==================	
				case"2":
					PCDA();
				break;
				//==================		
				case"atcelt":
					System.out.println("Programma aptureta!");
				break;
				//==================	
				default:
					System.out.println("Darbiba nepastav!");
				}
			
	}while(!izvele.equals("atcelt"));
		}
//===========================================================================	
	public static void ierakstit(String v){
		try{	
			FileWriter fw = new FileWriter("Fails.txt", true);
			PrintWriter raksta = new PrintWriter(fw);
			raksta.print(v);
			raksta.close();
}catch(Exception e){
}
}	
//===========================================================================
	public static double PicIzm(double cena){
		
		double atbilde = cena;
		apreikinat(atbilde);
		return cena;	
	}
//===========================================================================
	public static void apreikinat(double atbilde){
		
		try{	
			FileWriter fw = new FileWriter("Apreikini.txt", true);
			PrintWriter raksta = new PrintWriter(fw);
			raksta.print(" "+atbilde+" Eur");
			raksta.close();
}catch(Exception e){
}
}
//===========================================================================	


		public static void PCDA() {
			Scanner scan = new Scanner(System.in);
			String izvele;
			double cena=0;
			try {
			
				System.out.println("=========================");
				System.out.println("Picas izmērs");
				ierakstit("\n=========================");
				ierakstit("\nPicas izmers:");
				System.out.println("1 - 30cm|2 - 50cm");;
				izvele = scan.next();		
				izvele = izvele.toLowerCase();
		
					switch(izvele){
					case"1":ierakstit("\n30cm - 2.00 Euro");
					cena=cena+2.00;
					
					break;
					//==================	
					case"2":ierakstit("\n50cm -  3.50 Euro");
					cena=cena+3.50;
					
					break;
					//==================		
					default:System.out.println("Darbiba nepastav!");}	
					
			}catch(Exception e){
	}

			try {
				
				boolean SE = false,KE = false,DE = false,EE = false;
				System.out.println("Picas piedevas");
				
				ierakstit("\nPicas piedevas:");
				System.out.println("1 - siers|2 - šķinķis|3 - desa|4 - sēnes|5 - Turpinat");
				
				     
				do {
				izvele = scan.next();		
				izvele = izvele.toLowerCase();
					
					switch(izvele){
					case"1":
						if(!SE) {
						ierakstit("\nsiers - 1.50 Euro");
						cena=cena+1.50;
						
						SE = true;
					}else {
						System.out.println("Siers jau ir pielikts!");
					}
					break;
					//==================
					
					case"2":
						if(!KE) {
							ierakstit("\nskinkis - 2.00 Euro");
							cena=cena+2.00;
							
							KE = true;	
							
					}else {
						System.out.println("skinkis jau ir pielikts!");
					}
					break;
					//==================		
					case"3":
						if(!DE) {
						ierakstit("\ndesa - 2.00 Euro");
						cena=cena+2.00;
					
						DE = true;
					}else {
						System.out.println("desa jau ir pielikts!");
					}
					break;
					//==================	
					case"4":
						if(!EE) {
						ierakstit("\nsenes - 1.00 Euro");
						cena=cena+1.00;
						
						EE = true;
					}else {
						System.out.println("senes jau ir pielikts!");
					}
					break;
					//==================	
					case"5":
						
						
						
					break;
					//==================	
						
					default:System.out.println("");}
				
				}while(!izvele.equals("5"));
				
				
		}catch(Exception e){
		}
			try {
				
				boolean SE = false,KE = false,DE = false;
				System.out.println("Picas mērce");
		
				ierakstit("\nPicas merce:");
				System.out.println("1 - kečups|2 - majonēze|3 - gruķu mērce|4 - Turpinat");
				do {
				izvele = scan.next();		
				izvele = izvele.toLowerCase();
					switch(izvele){
					case"1":
						if(!SE) {
						ierakstit("\nkecups - 1.00 Euro");
						cena=cena+1.00;
						
						SE = true;
					}else {
						System.out.println("šī mērce jau ir pielikts!");
					}
					break;
					//==================	
					case"2":
						if(!KE) {
							ierakstit("\nmajoneze - 1.00 Euro");
							cena=cena+1.00;
						
							KE = true;	
					}else {
						System.out.println("šī mērce jau ir pielikts!");
					}
					break;
					//==================		
					case"3":
						if(!DE) {
						ierakstit("\ngruku merce - 1.20 Euro");
						cena=cena+1.20;
						
						DE = true;
					}else {
						System.out.println("šī mērce jau ir pielikts!");
					}
					break;
					//==================	
					case"4":
						PicIzm(cena);
					break;
					//==================	
						
					default:System.out.println("");}
				
				}while(!izvele.equals("4"));
				ierakstit("\n---------------------");
		}catch(Exception e){
		}
			try {
				
				
				System.out.println("Uzvietas/Piegāde");
				
				ierakstit("\nUzvietas/Līdzi:");
				System.out.println("1 - Piegade|2 - Uzvietas");;
				izvele = scan.next();		
				izvele = izvele.toLowerCase();
		
					switch(izvele){
					case"1":ierakstit("\nPiegade - 2.00 Euro");
					cena=cena+2.00;
					
					break;
					//==================	
					case"2":ierakstit("\nUzvietas - 0.00 Euro");
					
					
					break;
					//==================		
					default:System.out.println("Darbiba nepastav!");}	
					ierakstit("\n---------------------");
			}catch(Exception e){
	}

		
}	
//===========================================================================	
		
			
		

		public static void KLDA() {
			Scanner scan = new Scanner(System.in);
			String v,u,a = null;
			int t=0,count = 0;
			char n=0;
			
			
			System.out.println("Adrese(Ielas nosaukums un numurs): ");
			a = scan.nextLine();
			for(int i=0;i<a.length();i++) {
				if(Character.isDigit(a.charAt(i))) {
				n=a.charAt(i);	
			ierakstit("\n---------------------");
			ierakstit("\nAdrese: "+a);
				
			System.out.println("vārds: ");
			v = scan.next();
			ierakstit("\nVards uzvards: "+v);
			System.out.println("Uzvārds: ");
			u = scan.next();
			ierakstit(" "+u);
			do {
				count=0;
			System.out.println("Telefons: ");
			t = scan.nextInt();
			i=t;
			while (i != 0) {  
			      i /= 10;
			      ++count;   
			}
			 String t1=String.format("%d",t);  
		      ierakstit("\nTelefons: "+t1);
			}while(8!=count);
			System.out.println("\nIerakstits faila");
			break;
}
}
}

	}
