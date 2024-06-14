public class ContentSizeComparisonStrategy implements ComparisonStrategy{
    
    
    //Compares a and b using the size
    @Override
    public boolean compare(String a, String b) {
        return a.length() == b.length();
    }
}
