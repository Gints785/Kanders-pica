import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String izvele;
		
		do{
			System.out.println("1 - Ievadīt klienta datus|2 - Ievietot faila| Atcelt");;
			izvele = scan.next();		
			izvele = izvele.toLowerCase();
	
				switch(izvele){
				case"1":
					KLDA();
				break;
				//==================	
				case"2":
					
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
	
	public static void ierakstit(String v){
		try{
			
			FileWriter fw = new FileWriter("Fails.txt", true);
			PrintWriter raksta = new PrintWriter(fw);
			raksta.print(v);
			raksta.close();
			
			
		}catch(Exception e){
			
		}
	}
		public static void KLDA() {
			

			Scanner scan = new Scanner(System.in);
			String v,u,a = null;
			int t=0,count = 0;
			char n=0;
			String PersonasDati = null;
			
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
