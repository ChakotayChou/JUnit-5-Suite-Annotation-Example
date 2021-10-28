package adjust.learn.packageA;

import adjust.learn.StringHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.suite.api.Suite;

public class StringHelperTest {

    private StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        Assertions.assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        Assertions.assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    // ABCD => false, ABAB => true, AB => true, A => false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        Assertions.assertFalse(
                helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        Assertions.assertTrue(
                helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @ParameterizedTest
    @DisplayName("Parameterized Tests")
    @CsvSource({"AACD,CD", "ACD,CD"})
    void testTruncateAInFirst2Positions_AinFirst2Positions(String input, String expected) {
        Assertions.assertEquals(expected, helper.truncateAInFirst2Positions(input));
    }
}