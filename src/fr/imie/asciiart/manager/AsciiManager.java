package fr.imie.asciiart.manager;

public class AsciiManager {
	public (String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        T = T.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
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
    }   	
}
