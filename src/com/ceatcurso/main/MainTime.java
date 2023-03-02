package com.ceatcurso.main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;




public class MainTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime ahora=LocalTime.now();
		System.out.println(ahora);
		System.out.println("Descanso " +ahora.getMinute());
		//A la hora actual le sumamos 10 segundos
		for(int i=1;i<=10;i++) {
			ahora=ahora.plus(1,ChronoUnit.SECONDS);
			System.out.println(ahora);
		}
		//Desglosamos la hora en hora-minutos y segundo aplicando metodos
		int hora=ahora.getHour();// me lo pasa a entero
		int minutos=ahora.getMinute();
		int segundos=ahora.getSecond();
		
		//Restamos 10 horas a la hora acctual
		for(int i=1;i<=10;i++) {
			ahora=ahora.minus(1,ChronoUnit.HOURS);
			System.out.println(ahora);
		}
		//El pattern si quiero mostrar los milisegundos hh:mm:ss:SSS
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("La hora actual formateada es "+LocalTime.now().format(formato));
	}

}
