package Main;

import java.util.*;

/**
 * 
 */
public class Launcher 
{
	
	public static String randomCountryToVote(String votingCountryName,String paisesParticipantes[]) 
	{
		String result = "";
		do
		{
			int random = (int) Math.random();
			result = paisesParticipantes[random];
		}while(result==votingCountryName);
		return result;
	}
	
	/**
	 * 
	 */
	public static void main(String[] args) 
	{
		String paisesParticipantes[] = new String[25];
		paisesParticipantes[0] = "Serbia";
		paisesParticipantes[1] = "Moldavia";
		paisesParticipantes[2] = "Hungría";
		paisesParticipantes[3] = "Ucrania";
		paisesParticipantes[4] = "Suecia";
		paisesParticipantes[5] = "Australia";
		paisesParticipantes[6] = "Noruega";
		paisesParticipantes[7] = "Dinamarca";
		paisesParticipantes[8] = "Eslovenia";
		paisesParticipantes[9] = "Holanda";
		paisesParticipantes[10] = "Albania";
		paisesParticipantes[11] = "República Checa";
		paisesParticipantes[12] = "Lituania";
		paisesParticipantes[13] = "Israel";
		paisesParticipantes[14] = "Estonia";
		paisesParticipantes[15] = "Bulgaria";
		paisesParticipantes[16] = "Austria";
		paisesParticipantes[17] = "Finlandia";
		paisesParticipantes[18] = "Irlanda ";
		paisesParticipantes[19] = "Chipre";
		paisesParticipantes[20] = "Alemania";
		paisesParticipantes[21] = "Italia";
		paisesParticipantes[22] = "Reino Unido";
		paisesParticipantes[23] = "Francia ";
		paisesParticipantes[24] = "España";
		
		
		Map<String,Country> mapaDePaises = new TreeMap<String,Country>();
		
		Country pais0 = new Country(paisesParticipantes[0],randomCountryToVote(paisesParticipantes[0],paisesParticipantes),Country.randomPuntuation());
		Country pais1 = new Country(paisesParticipantes[1],randomCountryToVote(paisesParticipantes[1],paisesParticipantes),Country.randomPuntuation());
		Country pais2 = new Country(paisesParticipantes[2],randomCountryToVote(paisesParticipantes[2],paisesParticipantes),Country.randomPuntuation());
		Country pais3 = new Country(paisesParticipantes[3],randomCountryToVote(paisesParticipantes[3],paisesParticipantes),Country.randomPuntuation());
		Country pais4 = new Country(paisesParticipantes[4],randomCountryToVote(paisesParticipantes[4],paisesParticipantes),Country.randomPuntuation());
		Country pais5 = new Country(paisesParticipantes[5],randomCountryToVote(paisesParticipantes[5],paisesParticipantes),Country.randomPuntuation());
		Country pais6 = new Country(paisesParticipantes[6],randomCountryToVote(paisesParticipantes[6],paisesParticipantes),Country.randomPuntuation());
		Country pais7 = new Country(paisesParticipantes[7],randomCountryToVote(paisesParticipantes[7],paisesParticipantes),Country.randomPuntuation());
		Country pais8 = new Country(paisesParticipantes[8],randomCountryToVote(paisesParticipantes[8],paisesParticipantes),Country.randomPuntuation());
		Country pais9 = new Country(paisesParticipantes[9],randomCountryToVote(paisesParticipantes[9],paisesParticipantes),Country.randomPuntuation());
		Country pais10 = new Country(paisesParticipantes[10],randomCountryToVote(paisesParticipantes[10],paisesParticipantes),Country.randomPuntuation());
		Country pais11 = new Country(paisesParticipantes[11],randomCountryToVote(paisesParticipantes[11],paisesParticipantes),Country.randomPuntuation());
		Country pais12 = new Country(paisesParticipantes[12],randomCountryToVote(paisesParticipantes[12],paisesParticipantes),Country.randomPuntuation());
		Country pais13 = new Country(paisesParticipantes[13],randomCountryToVote(paisesParticipantes[13],paisesParticipantes),Country.randomPuntuation());
		Country pais14 = new Country(paisesParticipantes[14],randomCountryToVote(paisesParticipantes[14],paisesParticipantes),Country.randomPuntuation());
		Country pais15 = new Country(paisesParticipantes[15],randomCountryToVote(paisesParticipantes[15],paisesParticipantes),Country.randomPuntuation());
		Country pais16 = new Country(paisesParticipantes[16],randomCountryToVote(paisesParticipantes[16],paisesParticipantes),Country.randomPuntuation());
		Country pais17 = new Country(paisesParticipantes[17],randomCountryToVote(paisesParticipantes[17],paisesParticipantes),Country.randomPuntuation());
		Country pais18 = new Country(paisesParticipantes[18],randomCountryToVote(paisesParticipantes[18],paisesParticipantes),Country.randomPuntuation());
		Country pais19 = new Country(paisesParticipantes[19],randomCountryToVote(paisesParticipantes[19],paisesParticipantes),Country.randomPuntuation());
		Country pais20 = new Country(paisesParticipantes[20],randomCountryToVote(paisesParticipantes[20],paisesParticipantes),Country.randomPuntuation());
		Country pais21 = new Country(paisesParticipantes[21],randomCountryToVote(paisesParticipantes[21],paisesParticipantes),Country.randomPuntuation());
		Country pais22 = new Country(paisesParticipantes[22],randomCountryToVote(paisesParticipantes[22],paisesParticipantes),Country.randomPuntuation());
		Country pais23 = new Country(paisesParticipantes[21],randomCountryToVote(paisesParticipantes[23],paisesParticipantes),Country.randomPuntuation());
		Country pais24 = new Country(paisesParticipantes[22],randomCountryToVote(paisesParticipantes[24],paisesParticipantes),Country.randomPuntuation());
		
		mapaDePaises.put(pais0.getName(), pais0);
		mapaDePaises.put(pais1.getName(), pais1);
		mapaDePaises.put(pais2.getName(), pais2);
		mapaDePaises.put(pais3.getName(), pais3);
		mapaDePaises.put(pais4.getName(), pais4);
		mapaDePaises.put(pais5.getName(), pais5);
		mapaDePaises.put(pais6.getName(), pais6);
		mapaDePaises.put(pais7.getName(), pais7);
		mapaDePaises.put(pais8.getName(), pais8);
		mapaDePaises.put(pais9.getName(), pais9);
		mapaDePaises.put(pais10.getName(), pais10);
		mapaDePaises.put(pais11.getName(), pais11);
		mapaDePaises.put(pais12.getName(), pais12);
		mapaDePaises.put(pais13.getName(), pais13);
		mapaDePaises.put(pais14.getName(), pais14);
		mapaDePaises.put(pais15.getName(), pais15);
		mapaDePaises.put(pais16.getName(), pais16);
		mapaDePaises.put(pais17.getName(), pais17);
		mapaDePaises.put(pais18.getName(), pais18);
		mapaDePaises.put(pais19.getName(), pais19);
		mapaDePaises.put(pais20.getName(), pais20);
		mapaDePaises.put(pais21.getName(), pais21);
		mapaDePaises.put(pais22.getName(), pais22);
		mapaDePaises.put(pais23.getName(), pais23);
		mapaDePaises.put(pais24.getName(), pais24);
		
		System.out.println(mapaDePaises);
	}

}
