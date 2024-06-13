public class HTMLComparisonStrategy implements ComparisonStrategy {
    @Override
    public boolean compare(String a, String b) {
        return a.equals(b);
    }
}