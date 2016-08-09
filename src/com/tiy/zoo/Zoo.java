package com.tiy.zoo;

import java.util.ArrayList;
//import java.util.Scanner;

import com.tiy.zoo.Mammal;
import com.tiy.zoo.Bird;
import com.tiy.zoo.Fish;
import com.tiy.zoo.Reptile;
import com.tiy.zoo.Amphibian;



public class Zoo {
	
//	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		int enter = 0;
		
//		System.out.println("What animal cage to visit? (1-20)");
//		String animalCage = sc.nextLine();
//		animalCage = (animalCage + 1);
//		enter = Integer.parseInt(animalCage);
		
		
		
ArrayList<Animal> theZoo = new ArrayList<>(20);
		
		
		Mammal Animal1 = new Mammal(true, 500, true, "Tony the Tiger", false, 1000, "Orange Striped");
		Mammal Animal2 = new Mammal(false, 250, true, "Harambe the Gorilla", false, 1000 , "Silverback, some red spots");
		Mammal Animal3 = new Mammal(true, 150, false, "Doug the Human", false, 1500, "Business Casual");
		Mammal Animal4 = new Mammal(true, 10, false, "Alan the Cat", false, 100, "Calico");
			
		Bird Animal5 = new Bird(true, 10, false, "Hank the Eagle", true, 1000, 6.0f);
		Bird Animal6 = new Bird(true, 4, false, "Louie the Pidgeon", true, 100, 2.0f);
		Bird Animal7 = new Bird(true, 10, false, "Phil the Falcon", true, 1500, 4.0f);
		Bird Animal8 = new Bird(true, 1, false, "Gary the Oriole", true, 100, .5f);
				
		Fish Animal9 = new Fish(true, 100, false, "Ben the Barracuda", true, 10000, false, false);
		Fish Animal10 = new Fish(true, 2300, true, "Bruce the Shark", true, 10000, false, true);
		Fish Animal11 = new Fish(true, 5, false, "Barry the Pufferfish", true, 100, false, false);
		Fish Animal12 = new Fish(true, 1, false, "Rick the Minnow", true, 10, false, true);
				
		Reptile Animal13 = new Reptile(true, 2, false, "Gordon the Gecko", false, 0, true, 0);
		Reptile Animal14 = new Reptile(true, 10, false, "Dick the Snake", false, 0, true, 0);
		Reptile Animal15 = new Reptile(true, 5, false, "Larry the Turtle", false, 0, true, 0);
		Reptile Animal16 = new Reptile(true, 75, false, "Thirsty the Iguana", false, 0, true, 0);
				
		Amphibian Animal17 = new Amphibian(true, 1, false, "Diggum the Frog", false, 10, false, false);
		Amphibian Animal18 = new Amphibian(true, 1, false, "Harry the Toad", false, 10, false, false);
		Amphibian Animal19 = new Amphibian(true, 1, false, "Herbert the Salamander", false, 10, false, true);
		Amphibian Animal20 = new Amphibian(true, 1, false, "Romero the other Frog", false, 10, false, false);
		
		
		theZoo.add(Animal1);
		theZoo.add(Animal2);
		theZoo.add(Animal3);
		theZoo.add(Animal4);
		theZoo.add(Animal4);
		theZoo.add(Animal5);
		theZoo.add(Animal6);
		theZoo.add(Animal7);
		theZoo.add(Animal8);
		theZoo.add(Animal9);
		theZoo.add(Animal10);
		theZoo.add(Animal11);
		theZoo.add(Animal12);
		theZoo.add(Animal13);
		theZoo.add(Animal14);
		theZoo.add(Animal15);
		theZoo.add(Animal16);
		theZoo.add(Animal17);
		theZoo.add(Animal18);
		theZoo.add(Animal19);
		theZoo.add(Animal20);
		
	
		
		System.out.println(theZoo.get(4));
		

		
	}
	
	
	
}
