package mainifest.chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/13 20:52 by miaojz
 */
@DisplayName("Test class showing the @DisplayName annotation")
public class DisplayNameTest {

    private SUT systemUnderTest = new SUT();

    @Test
    @DisplayName("Our system under test ")
    void testHello() {
        assertEquals("hello",systemUnderTest.hello());
    }

    @Test
    @DisplayName("尴尬")
    public void testTalking(){
        assertEquals("How are you?",systemUnderTest.talk());
    }

    @Test
    void testBye() {
        assertEquals("Bye",systemUnderTest.bye());
    }
}
