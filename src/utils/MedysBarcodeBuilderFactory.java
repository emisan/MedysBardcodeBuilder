package utils;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import org.krysalis.barcode4j.BarcodeDimension;
import org.krysalis.barcode4j.HumanReadablePlacement;
import org.krysalis.barcode4j.impl.datamatrix.DataMatrixBean;
import org.krysalis.barcode4j.impl.datamatrix.SymbolShapeHint;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.MessageUtil;

public class MedysBarcodeBuilderFactory {

	private static final String DEFAULT_DATA_MATRIX_OUTPUT_PNG_POSIX = ".png";

	public static void generateXMLDataMatrixBarcode(String xmlFilePath, String outputFileName, String destPath)
	{
		if(xmlFilePath.toLowerCase().endsWith(".xml"))
		{
			File barcodeXmlFile = new File(xmlFilePath);
			
			String barcodeContent = getXmlFileContent(barcodeXmlFile);
			
			if((barcodeContent != null) & (barcodeContent.length() > 0))
			{
				generateDataMatrixBarcode(barcodeContent, outputFileName, destPath);
			}
		}
	}
	
	public static void generateDataMatrixBarcode(String barcodeContent, String outputFileName, String destPath)
	{
		boolean outputFileReady = false;
		
		try 
		{	
			BarcodeDimension barcodeDimensions = new BarcodeDimension(40, 40);
			
			File filePath = new File(destPath);
			
			File outputFile = null;
			
			if(filePath.exists())
			{
				if(outputFileName != null)
				{	
					if(outputFileName.length() > 0)
					{
						if(outputFileName.toLowerCase().endsWith(".png"))
						{
							outputFile = new File(filePath + File.separator + outputFileName);
						}
						else
						{
							outputFile = new File(filePath + File.separator 
												+ outputFileName + DEFAULT_DATA_MATRIX_OUTPUT_PNG_POSIX);
						}
						
						if(outputFile != null)
						{
							if(outputFile.exists())
							{
								outputFile.delete();
							}
							
							if(outputFile.createNewFile())
							{
								outputFileReady = true;
							}
						}
					}
				}
				
				
				if(outputFileReady)
				{
					OutputStream out = new java.io.FileOutputStream(outputFile);
					
					BitmapCanvasProvider provider = 
							new BitmapCanvasProvider(out, "image/x-png", 300, BufferedImage.TYPE_INT_RGB, true, 0);
					
					provider.establishDimensions(barcodeDimensions);
					
					DataMatrixBean barcode = new DataMatrixBean();
					
					barcode.doQuietZone(true);
					barcode.setMsgPosition(HumanReadablePlacement.HRP_NONE);
					barcode.setShape(SymbolShapeHint.FORCE_SQUARE);
					
					if(barcodeContent.length() > 0)
					{
						barcodeContent = MessageUtil.filterNonPrintableCharacters(barcodeContent);
						
						System.out.println(barcodeContent); // fürs DEBUGGEN
						
//						barcodeContent = MessageUtil.unescapeUnicode(barcodeContent);
						
						System.out.println(barcodeContent); // fürs DEBUGGEN
						
						barcode.generateBarcode(provider, barcodeContent);
					}
					
					provider.finish();
				}
			}
		}
		catch (IOException e) 
		{
			System.out.println("IOException");
			e.printStackTrace();
		}
	}
	
	private static String getXmlFileContent(File xmlFile)
	{
		StringBuilder sb = new StringBuilder();
		
		try
		{
			String str = "";
			
			if(xmlFile.exists())
			{
				BufferedReader br = new BufferedReader(new FileReader(xmlFile));
				
				while((str = br.readLine()) != null)
				{
					sb.append(str);
				}
				
				br.close();
			}
		}
		catch(IOException ioexec)
		{
			System.out.println("IOException beim Lesen aus XML-Datei");
			ioexec.printStackTrace();
		}
		
		return sb.toString();
	}
}
