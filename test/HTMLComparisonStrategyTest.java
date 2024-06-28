import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HTMLComparisonStrategyTest {

    HTMLComparisonStrategy htmlComparisonStrategy;
    
    @BeforeEach
    void setUp() {
        htmlComparisonStrategy = new HTMLComparisonStrategy();
    }
    
    @Test
    void compareHtmlTrue() {
        String a = "SWED";
        String b = "SWED";
        boolean result = htmlComparisonStrategy.compare(a, b);

        // Assert
        assertTrue(result, "strings are same");
    }
    
    @Test
    void compareHtmlFalse() {
        String a = "SWED";
        String b = "RTS";
        boolean result = htmlComparisonStrategy.compare(a, b);
        
        assertFalse(result, "strings are different");
    }
}