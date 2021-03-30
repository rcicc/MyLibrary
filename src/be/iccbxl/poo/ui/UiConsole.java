package be.iccbxl.poo.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import be.iccbxl.poo.Data;
import be.iccbxl.poo.metier.IMetier;
import be.iccbxl.poo.metier.Metier;

public class UiConsole implements IUi {
	private IMetier metier = new Metier();

	@Override
	public void run() {
		int level;
		Scanner sc = new Scanner(System.in);
		
		//Récupérer les données
		ArrayList<Data> list = metier.findAll();
				
		//Présentation
		System.out.println("Bienvenue dans ce programme!");
				
		do {
			System.out.println("Quel niveau de données souhaitez-vous ?");
			System.out.println("Tapez 0 pour quitter.");
			
			level = Integer.parseInt(sc.nextLine());
			
			if(level==0) break;
			
			//Transformation des données
			ArrayList<Data> listFinale = metier.findByLevel(level);
			
			//Présentation
			System.out.println(listFinale);
		
		} while(level!=0);
		
		System.out.println("Merci d'avoir utilisé notre application.");
	}

}
