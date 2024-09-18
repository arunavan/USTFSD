package com.ust.module3.io;

import java.io.FileInputStream;
import java.io.File;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.parser.ParseContext;

 
public class PDFDemo {
 
	public static void main(String argvs[]) throws Exception {
		BodyContentHandler ch = new BodyContentHandler();
		File fl = new File("C:\\Users\\VINOD\\Downloads\\UST\\Java Module\\13.J2EE_Overview.pdf");
 		FileInputStream fs = new FileInputStream(fl);
		Metadata md = new Metadata();
		ParseContext pc = new ParseContext();
		PDFParser pp = new PDFParser();
		pp.parse(fs, ch, md, pc);
 		String str = ch.toString();
		System.out.println("Extracting the contents from the file: \n" + ch.toString());
	}
}