import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContentSizeComparisonStrategyTest {
    
    ContentSizeComparisonStrategy strategy;
    
    @BeforeEach
    void setUp(){
        strategy = new ContentSizeComparisonStrategy();
    }
    
    @Test
    void compareContentSizeReturnTrue() {
        String a = "sweeeeed";
        String b = "sweeeeed";
        boolean result = strategy.compare(a, b);

        // Assert
        assertTrue(result, "strings has the same size");
    }

    @Test
    void compareContentSizeReturnFalse() {
        String a = "🐱";
        String b = "👁️👄👁️";
        boolean result = strategy.compare(a, b);

        // Assert
        assertFalse(result, "strings has not the same size");
    }
    
}