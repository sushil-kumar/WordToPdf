package org.example;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.ToPdfParameterList;

public class App {
    public static void main( String[] args ) {
        Document doc = new Document();
        doc.loadFromFile("test.docx");

        //create an instance of ToPdfParameterList.
        ToPdfParameterList ppl=new ToPdfParameterList();

        //embeds full fonts by default when IsEmbeddedAllFonts is set to true.
        ppl.isEmbeddedAllFonts(true);

        //set setDisableLink to true to remove the hyperlink effect for the result PDF page.
        //set setDisableLink to false to preserve the hyperlink effect for the result PDF page.
        ppl.setDisableLink(true);

        //Set the output image quality as 40% of the original image. 80% is the default setting.
        doc.setJPEGQuality(40);

        //Save to file.
        doc.saveToFile("ToPDF.pdf",FileFormat.PDF);
    }
}
