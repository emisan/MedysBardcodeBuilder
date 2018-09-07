import utils.MedysBarcodeBuilderFactory;
//import utils.MedysDataMatrixBarcodeBuilder;
//import utils.MedysQRBarcodeBuilder;

import de.medys.MedysLogger;

/**
 * Start-Routine
 * 
 * @author Hayri Emrah Kayaman, MEDYS GmbH, W&uuml;rath
 */
public class MedysBarcodeBuilderMain {

	public static void main(String[] args) 
	{
		MedysLogger logger = new MedysLogger();
		logger.initLogger(MedysBarcodeBuilderMain.class);
		
		try
		{
			/*
			 * erster parameter legt den Barcode-Typen fest
			 * 
			 */
			if(args[0] != null)
			{
				if (args[0].toLowerCase().equals("datamatrix")) 
				{
					
					/*
					 * zweiter Parameter muss eine absolute Pfadangabe zu der
					 * XML-Datei sein, dessen Inhalt ausgelesen wird
					 * 
					 * dritter Paramter bildet den Namen der Ausgabedatei
					 * (Bilddatei)
					 * 
					 * Die Bilddatei sollte mit ".png" enden !
					 * 
					 * vierter Paramater ist Pfadangabe, wo die Bilddatei abgelegt
					 * werden soll
					 */
					if(args[1] != null)
					{
						if(args[1].toLowerCase().endsWith(".xml"))
						{
							MedysBarcodeBuilderFactory.generateXMLDataMatrixBarcode(args[1], args[2], args[3]);
							
							logger.logConfigMessage("INFO", "Barcode generiert!");
						}
						else
						{
							MedysBarcodeBuilderFactory.generateDataMatrixBarcode(args[1], args[2], args[3]);
							
							logger.logConfigMessage("INFO", "Barcode generiert!");
						}
					}
				}
				if (args[0].toLowerCase().equals("pdf417"))
				{
					// zukünftige Implementation eines PDF417-Barcodes hier
					// starten !!

					// new MedysPDF417BarcodeBuilder(args[1], args[2], args[3]);
				}
				if (args[0].toLowerCase().equals("qr")) {
					// zukünftige Implementation eines PDF417-Barcodes hier
					// starten !!

					// new MedysQRBarcodeBuilder(args[1], args[2], args[3]);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			logger.logConfigMessage("ERROR", "Barcode konnte nicht generiert werden \n\n"
					+ e.getMessage());
		}
	}

}
