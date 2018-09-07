
MedysBarcodeBuilder.jar kann nur PNG Bilddateien zurückliefern, da diese den geringsten
Informationsverlust haben !


MedysBarcodeBuilder wie folgt Aufrufen


java -jar MedysBarcodeBuilder param1 param2 param3 param4



param1 := datamatrix (fixe Vorgabe, stellt die Barcode-Art dar, kann um andere Barcode-Arten erweitert werden)

param2 := Verzeichnispfadangabe zur "XML-Datei" , welche die Barcode-Inhalte beinhaltet
		  
		  Die Pfadangabe muß absolute sein, d.h. con(<Verzeichnis>,<verzeichnistrenner>,<xml-dateiname>)
		  
		  Beispiel:
		  
		  /Users/hk/Desktop  (Falsch, keine XML-Datei angegeben)
		  
		  /Users/hk/Desktop/barcode.xml (OK)
		  
		  
		  oder
		  
		  ein beliebiger String (darf dann aber kein XML-File sein)
		  
param3 := Name der Ausgabedatei mit Dateiendung ".png" (da eine Barcode-Bilddatei generiert wird)

		  Beispiel:
		  
		  die-irrwege-des-ödypuss.txt (FALSCH, kein .png-Dateiendung)
		  
		  die-irrwege-des-ödypuss.png (OK, folglich ist in dieser Datei der codierte Barcode zu sehen)
		  
		  
param4 := Ablageort / Verzeichnis für die Bilddatei

