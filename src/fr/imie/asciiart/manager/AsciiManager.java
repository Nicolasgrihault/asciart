package fr.imie.asciiart.manager;

import java.util.Scanner;

import fr.imie.asciiart.alphabets.DefaultAlphabet;
import fr.imie.asciiart.alphabets.datas.AlphabetsDatas;

public class AsciiManager {
	public DefaultAlphabet alphabet;
	
	
	public AsciiManager(DefaultAlphabet alphabet) {
		super();
		this.alphabet = alphabet;
	}


	public String[] GetAsciiTranslation(String message) {
	        Scanner in = new Scanner(System.in);
	        int L = this.alphabet.getW();
	        int H = this.alphabet.getH();
	        String T = in.nextLine();
	        T = T.toUpperCase();
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < H; i++) {
	            String ROW = this.alphabet.toString();
	            for(char letter : T.toCharArray()){
	                if(letter >= 65 && letter <= 90){
	                    result.append(ROW.substring((letter-65)*L,(letter-65)*L+L));
	                }
	                else{
	                	result.append(ROW.substring(L*26,(L*26)+L));
	                }
	            }
	            result.append("\n");
	        }
	        
	        
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        System.out.println(result.toString());
			return null;
	    } 
}