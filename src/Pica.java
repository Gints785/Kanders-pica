import java.awt.Component;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Pica {
	
	static double a,b,c,skaitlis;
//===========================================================================	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	String[] options = {"Ievadīt klienta datus", "Veikt Picu pastūtījumu", "Atcelt"};
 int izvele = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array","Click a button",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
		do{
			
	
				switch(izvele){
				case 0:
					KLDA();
				break;
				//==================	
				case 1:
					PCDA();
				break;
				//==================		
				case 2:
					System.out.println("Programma aptureta!");
				break;
				//==================	
				default:
					JOptionPane.showMessageDialog(null,"Darbiba nepastav!","Kluda",JOptionPane.ERROR_MESSAGE);	
				}
			
	}while(izvele==3);
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
				
			
				
				ierakstit("\n=========================");
				ierakstit("\nPicas izmers:");
				izvele = JOptionPane.showInputDialog("  Picas izmērs\n 1 - 30cm|2 - 50cm ");			
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
				ierakstit("\nPicas piedevas:");
   
				do {
				izvele = JOptionPane.showInputDialog("  Picas piedevas\n 1 - siers|2 - šķinķis|3 - desa|4 - sēnes|5 - Turpinat");		
				izvele = izvele.toLowerCase();
				
					switch(izvele){
					case"1":
						if(!SE) {
						ierakstit("\nsiers - 1.50 Euro");
						cena=cena+1.50;
						
						SE = true;
					}else {
						JOptionPane.showMessageDialog(null,"Siers jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================
					
					case"2":
						if(!KE) {
							ierakstit("\nskinkis - 2.00 Euro");
							cena=cena+2.00;
							
							KE = true;	
							
					}else {
						JOptionPane.showMessageDialog(null,"skinkis jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================		
					case"3":
						if(!DE) {
						ierakstit("\ndesa - 2.00 Euro");
						cena=cena+2.00;
					
						DE = true;
					}else {
						JOptionPane.showMessageDialog(null,"desa jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================	
					case"4":
						if(!EE) {
						ierakstit("\nsenes - 1.00 Euro");
						cena=cena+1.00;
						
						EE = true;
					}else {
						JOptionPane.showMessageDialog(null,"senes jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================	
					case"5":
						
						
						
					break;
					//==================	
						
					default:
						JOptionPane.showMessageDialog(null,"nekas","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
				
				
				}while(!izvele.equals("5"));
				
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"nekas","Kluda",JOptionPane.ERROR_MESSAGE);	
		}
			try {
				
				boolean SE = false,KE = false,DE = false;
				System.out.println("Picas mērce");
		
				ierakstit("\nPicas merce:");
					
			
				do {
				izvele = JOptionPane.showInputDialog("1 - kečups|2 - majonēze|3 - gruķu mērce|4 - Turpinat");	
				izvele = izvele.toLowerCase();
					switch(izvele){
					case"1":
						if(!SE) {
						ierakstit("\nkecups - 1.00 Euro");
						cena=cena+1.00;
						
						SE = true;
					}else {
						JOptionPane.showMessageDialog(null,"šī mērce jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
						
					}
					break;
					//==================	
					case"2":
						if(!KE) {
							ierakstit("\nmajoneze - 1.00 Euro");
							cena=cena+1.00;
						
							KE = true;	
					}else {
						JOptionPane.showMessageDialog(null,"šī mērce jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================		
					case"3":
						if(!DE) {
						ierakstit("\ngruku merce - 1.20 Euro");
						cena=cena+1.20;
						
						DE = true;
					}else {
						JOptionPane.showMessageDialog(null,"šī mērce jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================	
					case"4":
						
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
				izvele = JOptionPane.showInputDialog("Uzvietas/Līdzi:\n 1 - Piegade|2 - Uzvietas");	
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
					PicIzm(cena);
			}catch(Exception e){
	}

		
}	
//===========================================================================	

		public static void KLDA() {
			Scanner scan = new Scanner(System.in);
			String v,u,a = null;
			int t=0,count = 0;
			char n=0;
			
			a = JOptionPane.showInputDialog("Adrese(Ielas nosaukums un numurs): ");	
			for(int i=0;i<a.length();i++) {
				if(Character.isDigit(a.charAt(i))) {
				n=a.charAt(i);	
			ierakstit("\n---------------------");
			ierakstit("\nAdrese: "+a);
				
			v = JOptionPane.showInputDialog("vārds: ");	
			ierakstit("\nVards uzvards: "+v);
			
			u = JOptionPane.showInputDialog("Uzvārds: ");	
			ierakstit(" "+u);
			
			do {
				count=0;
				t = Integer.parseInt((JOptionPane.showInputDialog("Telefons: ")));
			i=t;
			while (i != 0) {  
			      i /= 10;
			      ++count;   
			}
			 String t1=String.format("%d",t);  
		      ierakstit("\nTelefons: "+t1);
			}while(8!=count);
			JOptionPane.showMessageDialog(null, "Ierakstits faila","Info",JOptionPane.INFORMATION_MESSAGE);
			System.out.println("\nIerakstits faila");
			break;
}
}
}

	}
