package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es",20);
        
        histogram.increment("ull.es",5);
        
        histogram.increment("gmail.com",10);

        histogram.increment("hotmail.com",2);
        
        new HistogramDisplay(histogram).execute();
    }
    
}
