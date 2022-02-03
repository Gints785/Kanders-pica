import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Pica {
	
	
//===========================================================================	
	public static void main(String[] args) {
		boolean SE=false;
		if(!SE) {
			izvele();
			SE = true;
		}	
	}
	public static void izvele() {
try{
		Scanner scan = new Scanner(System.in);
		int izvele;
		
		String[] options = {"Ievadīt klienta datus", "Veikt Picu pastūtījumu", "dzest datus(Dati.txt)","Atcelt"};
	izvele = JOptionPane.showOptionDialog(null, "Veikt pasūtījumu","",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
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
				lasit1();
				break;
				//==================	
				default:
					
				}
			
	}while(izvele==3);
		}catch(Exception e){
		}
	}
//===========================================================================	
	public static void ierakstit(String v){
		try{	
			FileWriter fw = new FileWriter("Dati.txt", true);
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
	public static void lasit(){
		
		try{	
	 File file = new File("Apreikini.txt");
	 BufferedReader br= new BufferedReader(new FileReader(file));
	 String st;
	  
	 while ((st = br.readLine()) != null)
	 
		
		 JOptionPane.showMessageDialog(null,"Izmaksās"+st);
	 
	 PrintWriter raksta = new PrintWriter("Apreikini.txt");
	 raksta.close();
	 
	 izvele();
}catch(Exception e){
}
}
//===========================================================================
public static void lasit1(){
		
		try{	
	 
	 PrintWriter fw = new PrintWriter("Dati.txt");
	 fw.close();
	 
	 
	
}catch(Exception e){
}
}

//===========================================================================


		public static void PCDA() {
			Scanner scan = new Scanner(System.in);
			String izvele,IZM1="",IZM2="",PIE1="",PIE2="",PIE3="",PIE4="",MER1="",MER2="",MER3="";
			double cena=0;
			try {
				ierakstit("\n=========================");
				ierakstit("\nPicas izmers:");
			do{
				izvele = JOptionPane.showInputDialog("  Picas izmērs\n 1 - 30cm|2 - 50cm ");			
				izvele = izvele.toLowerCase();
					switch(izvele){
					case"1":
					
					ierakstit("\n30cm - 2.00 Euro");
					cena=cena+2.00;
					IZM1="30 cm pica";
					
					break;
					//==================	
					case"2":
					
					ierakstit("\n50cm -  3.50 Euro");
					cena=cena+3.50;
					IZM1="50 cm pica";
					break;
					//==================		
					default:	
					}	
			}while(!izvele.equals("1")&&!izvele.equals("2"));
	

					
				boolean SE = false,KE = false,DE = false,EE = false,KR = false,PR = false,SC = false;
				ierakstit("\nPicas piedevas:");
				
				do {
				izvele = JOptionPane.showInputDialog(IZM1+IZM2+"\n=============\n"+PIE1+"\n"+PIE2+"\n"+PIE3+"\n"+PIE4+"\n\n"+"  Picas piedevas\n 1 - siers|2 - šķinķis|3 - desa|4 - sēnes|5 - Turpinat");		
				izvele = izvele.toLowerCase();
				
					switch(izvele){
					case"1":
						if(!SE) {
						ierakstit("\nsiers - 1.50 Euro");
						cena=cena+1.50;
						PIE1="Siers";
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
							PIE2="Šķiņķis";
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
						PIE3="Desa";
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
						PIE4="Sēnes";
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
						
					}
				}while(!izvele.equals("5"));

				
				
		
				ierakstit("\nPicas merce:");

				do {
				izvele = JOptionPane.showInputDialog(IZM1+IZM2+"\n=============\n"+PIE1+"\n"+PIE2+"\n"+PIE3+"\n"+PIE4+"\n=============\n"+MER1+"\n"+MER2+"\n"+MER3+"\n\n"+"1 - kečups|2 - majonēze|3 - gruķu mērce|4 - Turpinat");	
				izvele = izvele.toLowerCase();
					switch(izvele){
					case"1":
						if(!KR) {
						ierakstit("\nkecups - 1.00 Euro");
						cena=cena+1.00;
						MER1="Kečups";
						KR = true;
					}else {
						JOptionPane.showMessageDialog(null,"šī mērce jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
						
					}
					break;
					//==================	
					case"2":
						if(!PR) {
							ierakstit("\nmajoneze - 1.00 Euro");
							cena=cena+1.00;
							MER2="Majonēze";
							PR = true;	
					}else {
						JOptionPane.showMessageDialog(null,"šī mērce jau ir pielikts!","Kluda",JOptionPane.ERROR_MESSAGE);	
					}
					break;
					//==================		
					case"3":
						if(!SC) {
						ierakstit("\ngruku merce - 1.20 Euro");
						cena=cena+1.20;
						MER3="Gurķu mērce";
						SC = true;
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
//===========================================================================	
				ierakstit("\nmaksas veids:");
				do {
				izvele = JOptionPane.showInputDialog(IZM1+IZM2+"\n=============\n"+PIE1+"\n"+PIE2+"\n"+PIE3+"\n"+PIE4+"\n=============\n"+MER1+"\n"+MER2+"\n"+MER3+"\n\n"+"maksas veids:\n 1 - Skaidra|2 - ar karti");	
				izvele = izvele.toLowerCase();
		
					switch(izvele){
	
					
					case"1":ierakstit("\nSkaidra");
					
					break;
					//==================	
					case"2":ierakstit("\nar karti");
					break;
				}
				}while(!izvele.equals("1")&&!izvele.equals("2"));
				
				ierakstit("\n---------------------");
//===========================================================================	
				ierakstit("\nUzvietas/Lidzi:");
				izvele = JOptionPane.showInputDialog(IZM1+IZM2+"\n=============\n"+PIE1+"\n"+PIE2+"\n"+PIE3+"\n"+PIE4+"\n=============\n"+MER1+"\n"+MER2+"\n"+MER3+"\n\n"+"Uzvietas/Līdzi:\n 1 - Piegade|2 - Uzvietas");	
				izvele = izvele.toLowerCase();
		
					switch(izvele){
					case"1":ierakstit("\nPiegade - 2.00 Euro");
					cena=cena+2.00;
					
					break;
					//==================	
					case"2":ierakstit("\nUzvietas - 0.00 Euro");
					
					
					break;
					//==================		
					default:
						JOptionPane.showMessageDialog(null,"Darbiba nepastav!","Kluda",JOptionPane.ERROR_MESSAGE);	
						}	
					ierakstit("\n---------------------");
					PicIzm(cena);
					lasit();
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
			izvele();
			break;
}
}
}	
}
