/**
 * 
 */
package fr.imie.asciiart;

import fr.imie.asciiart.alphabets.DefaultAlphabet;
import fr.imie.asciiart.alphabets.MonAlphabet;
import fr.imie.asciiart.manager.AsciiManager;

/**
 * @author NicolasG
 *
 */
public class ApplicationAsciiArt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAlphabet alphabet = new MonAlphabet();
			AsciiManager manager = new AsciiManager(alphabet);
			manager.GetAsciiTranslation("zdedededex");
	}

}
