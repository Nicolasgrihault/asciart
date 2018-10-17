/**
 * 
 */
package fr.imie.asciiart.utils;

/**
 * @author NicolasG
 *
 */
public class ScannerProvider {
	 /** Constructeur privé */
    private ScannerProvider()
    {}
     
    /** Instance unique non préinitialisée */
    private static ScannerProvider INSTANCE = null;
     
	/** Point d'accès pour l'instance unique du ScannerProvider */
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
