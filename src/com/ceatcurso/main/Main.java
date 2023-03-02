package com.ceatcurso.main;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
/*	System.out.println("Dime tu fecha de nacimiento [dd-mm-aaaa]");
		String fechaN=entrada.nextLine();
		String[] fechaNde=fechaN.split("-");
		String diaN=fechaNde[0];
		String mesN=fechaNde[1];
		String anioN=fechaNde[2];
		//La fecha de nacimiento la quiero combertir en un objeto tipo LocalDate
		//Parse-> convierte
		fechaN=anioN+"-"+mesN+"-"+diaN;
		
		
		LocalDate fechaNN=LocalDate.parse(fechaN);//espera un String
		
		System.out.println(fechaNN.getDayOfWeek());//Muestra que dia de la semana naciste
		//plus+minus //dias-mes-años
		LocalDate mas70=fechaNN.plus(70,ChronoUnit.YEARS);
		System.out.println("Te jubilarás en el año"+mas70);
		System.out.println("Te jubilaras en el año: "+fechaNN.plus(70,ChronoUnit.YEARS));
		
	*/System.out.println("**************************");
		
		//guardar en BBDD-> aaaa-mm-dd
		//**Utilizando LocalDate**
		LocalDate hoy= LocalDate.now();
		/*System.out.println("Fecha de Nacimiento-> "+fechaN);
		System.out.println("Hoy es-> "+hoy);
		System.out.println(hoy.getDayOfWeek());//Monday....Sunday
		System.out.println(hoy.getMonth());//January...December
		System.out.println(hoy.getYear());
		System.out.println(hoy.getDayOfMonth());//1...31
		System.out.println(hoy.getMonthValue());//1...12
		
		Period anionXjubilar=Period.between(mas70, hoy);
		System.out.println("Te faltan para jubilarte "+anionXjubilar);
		System.out.println("Dime la fecha de nacimiento de tu madre [yyyy-mm-dd]");
		LocalDate fechaMama=LocalDate.parse(entrada.nextLine());
		Period xPeriod=Period.between(fechaNN, fechaMama);
		System.out.println("Mi madre tenia "+xPeriod);
		
		//Años bisientos
		System.out.println("Dime una fecha cualquiera y compruebo si es bisiesto -> [yyyy-mm-dd]");
		LocalDate bisiesto=LocalDate.parse(entrada.nextLine());
		boolean bisiestoR=bisiesto.isLeapYear();
		if(bisiestoR) {
			System.out.println("Es año bisiesto");
		}else{
			System.out.println("No es bisiesto");
		}*/
		//Formatear segun nuestro forma local-> pater ---patron
		DateTimeFormatter formato=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato));
		DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato1));
		DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato2));
		DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato3));
		DateTimeFormatter formato0=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoy.format(formato0));
		
		entrada.close();
	}

}
