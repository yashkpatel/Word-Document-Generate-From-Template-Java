package C2.DocGenFormTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.wickedsource.docxstamper.DocxStamper;
import org.wickedsource.docxstamper.DocxStamperConfiguration;

public class GenerateReport {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		DocxStamper stamper = new DocxStamper(new DocxStamperConfiguration());
		DocxContext context = new DocxContext();
		context.setName("Yash");
		InputStream template = new FileInputStream(new File("template.docx"));
		OutputStream out = new FileOutputStream("output_template.docx");
		stamper.stamp(template, context, out);
		out.close();
	}

}
