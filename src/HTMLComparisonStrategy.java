public class HTMLComparisonStrategy implements ComparisonStrategy {
    
    // compares a and b using the html 
    @Override
    public boolean compare(String a, String b) {
        return a.equals(b);
    }
}