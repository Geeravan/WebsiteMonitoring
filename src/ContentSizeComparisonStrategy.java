public class ContentSizeComparisonStrategy implements ComparisonStrategy{
    
    @Override
    public boolean compare(String a, String b) {
        
        return a.length() == b.length();
    }
}
