package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        for(int i = 0; i <= 20; i++) histogram.increment("ulpgc.es");
        
        for(int i = 0; i <= 12; i++) histogram.increment("ull.es");
        
        for(int i = 0; i <= 1; i++) histogram.increment("gmail.com");

        for(int i = 0; i <= 4; i++) histogram.increment("hotmail.com");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
