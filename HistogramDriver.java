package labs.apcs_ch6_lab_1;


/**
 * Write a description of class HistogramDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HistogramDriver
{
    public static void main(String[] args)
    {
        Histogram hist = new Histogram(10);
        hist.setValues();
        hist.createHistogram();
    }
}
