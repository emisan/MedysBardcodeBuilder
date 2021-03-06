package utils;

//import java.awt.image.BufferedImage;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.OutputStream;
//
//import org.krysalis.barcode4j.BarcodeDimension;
//import org.krysalis.barcode4j.HumanReadablePlacement;
//import org.krysalis.barcode4j.impl.datamatrix.DataMatrixBean;
//import org.krysalis.barcode4j.impl.datamatrix.SymbolShapeHint;
//import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
//import org.krysalis.barcode4j.tools.MessageUtil;

/**
 * @deprecated future releases see {@link MedysBarcodeBuilderFactory}
 * @author hek
 */
public class MedysXMLDataMatrixBarcodeBuilder 
{
//	private final String DEFAULT_OUTPUT_PNG_NAME = "MedysDataMatrixBarcode.png";
	
	public MedysXMLDataMatrixBarcodeBuilder(String xmlFilePath, String outputFileName, String destPath) 
	{
//		if(xmlFilePath.toLowerCase().endsWith(".xml"))
//		{
//			File barcodeXmlFile = new File(xmlFilePath);
//			
//			String barcodeContent = getXmlFileContent(barcodeXmlFile);
//			
//			if((barcodeContent != null) & (barcodeContent.length() > 0))
//			{
//				generateBarcode(barcodeContent, outputFileName, destPath);
//			}
//		}
		
//		MedysBarcodeBuilderFactory.generateXMLDataMatrixBarcode(xmlFilePath, outputFileName, destPath);
	}

//	@SuppressWarnings("unused")
//	private void generateBarcode(String barcodeContent, String outputFileName, String destPath)
//	{
//		boolean outputFileReady = false;
//		
//		try 
//		{	
//			BarcodeDimension barcodeDimensions = new BarcodeDimension(40, 40);
//			
//			File filePath = new File(destPath);
//			
//			File outputFile = null;
//			
//			if(filePath.isDirectory())
//			{
//				if(outputFileName != null)
//				{	
//					if(outputFileName.toLowerCase().endsWith(".png"))
//					{
//						outputFile = new File(filePath + File.separator + outputFileName);
//					}
//				}
//				else
//				{
//					outputFile = new File(filePath + File.separator + DEFAULT_OUTPUT_PNG_NAME);
//				}
//				
//				if(outputFile != null)
//				{
//					if(outputFile.exists())
//					{
//						outputFile.delete();
//					}
//					
//					if(outputFile.createNewFile())
//					{
//						outputFileReady = true;
//					}
//				}
//				
//				if(outputFileReady)
//				{
//					OutputStream out = new java.io.FileOutputStream(outputFile);
//					
//					BitmapCanvasProvider provider = 
//							new BitmapCanvasProvider(out, "image/x-png", 300, BufferedImage.TYPE_BYTE_GRAY, true, 0);
//					
//					provider.establishDimensions(barcodeDimensions);
//					
//					DataMatrixBean barcode = new DataMatrixBean();
//					
//					barcode.doQuietZone(true);
//					barcode.setMsgPosition(HumanReadablePlacement.HRP_NONE);
//					barcode.setShape(SymbolShapeHint.FORCE_SQUARE);
//					
//					if(barcodeContent.length() > 0)
//					{
//						String filteredXmlFile = MessageUtil.filterNonPrintableCharacters(barcodeContent);
//						
//						System.out.println(filteredXmlFile);
//						
//						filteredXmlFile = MessageUtil.unescapeUnicode(filteredXmlFile);
//						
//						System.out.println(filteredXmlFile);
//						
//						barcode.generateBarcode(provider, filteredXmlFile);
//					}
//					
//					provider.finish();
//				}
//			}
//		}
//		catch (IOException e) 
//		{
//			System.out.println("IOException");
//			e.printStackTrace();
//		}
//	}
//	
//	@SuppressWarnings("unused")
//	private String getXmlFileContent(File xmlFile)
//	{
//		StringBuilder sb = new StringBuilder();
//		
//		try
//		{
//			String str = "";
//			
//			if(xmlFile.exists())
//			{
//				BufferedReader br = new BufferedReader(new FileReader(xmlFile));
//				
//				while((str = br.readLine()) != null)
//				{
//					sb.append(str);
//				}
//				
//				br.close();
//			}
//		}
//		catch(IOException ioexec)
//		{
//			System.out.println("IOException beim Lesen aus XML-Datei");
//			ioexec.printStackTrace();
//		}
//		
//		return sb.toString();
//	}
}
