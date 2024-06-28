public class TextContentComparisonStrategy implements ComparisonStrategy {
    
    // removes everthing in the html code which is unnecessary
    private static final String regex = "(?:<script\\b[^<](?:(?!<\\/script>)<[^<])<\\/script\\s>)|" +
                                        "(?:(?i)<[^>]>)|(?:<style((.|\\n|\\r)?)<\\/style>)";
    
    // compares a and b using the text content
    @Override
    public boolean compare(String a, String b) {
        
        a = a.replaceAll(regex, "");
        b = b.replaceAll(regex, "");
        
        return a.equals(b);
    }
}


