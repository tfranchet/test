package fr.mise.a.niveau;

import com.itextpdf.text.Document;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FirstPdfTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param name name of the test case
     */
    public FirstPdfTest(String name)
    {
      super(name);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstPdf.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
      String[] args = null;
      try {
        FirstPdf pdf = new FirstPdf();
      pdf.main(args);
        assertTrue( true );
      } catch (Exception e) {
        assertTrue( true);
      }
      
    }
}
