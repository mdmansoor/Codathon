import java.text.*;

public class Calendar {
	
	String strInput = "06/07/88";
	
	SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yy");
	SimpleDateFormat sdfmt2= new SimpleDateFormat("dd-MMM-yyyy");
	java.util.Date dDate = sdfmt1.parse( strInput );
	String strOutput = sdfmt2.format( dDate );

}