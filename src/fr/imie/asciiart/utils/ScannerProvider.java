/**
 * 
 */
package fr.imie.asciiart.utils;

/**
 * @author NicolasG
 *
 */
public class ScannerProvider {
	 /** Constructeur priv� */
    private ScannerProvider()
    {}
     
    /** Instance unique non pr�initialis�e */
    private static ScannerProvider INSTANCE = null;
     
	/** Point d'acc�s pour l'instance unique du ScannerProvider */
    public static synchronized ScannerProvider getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new ScannerProvider(); 
        }
        return INSTANCE;
    }
    
    public static ScannerProvider getINSTANCE() {
		return INSTANCE;
	}
 
   
}
