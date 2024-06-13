public class TextContentComparisonStrategy implements ComparisonStrategy {

    private static final String regex = "(?:<script\\b[^<](?:(?!<\\/script>)<[^<])<\\/script\\s>)|(?:(?i)<[^>]>)|(?:<style((.|\\n|\\r)?)<\\/style>)";
    
    @Override
    public boolean compare(String a, String b) {
        
        if(a == null || b == null) {
            return false;
        }
        
        a = a.replaceAll(regex, "");
        b = b.replaceAll(regex, "");
        
        return a.equals(b);
    }
}