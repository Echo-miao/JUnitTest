package mainifest.chapter2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <p></p>
 *
 * @author Jazin
 * @version 1.0
 * @date 2024/3/13 20:22 by miaojz
 */
public class SUTTest {
    private static ResourceForAllTests resourceForAllTests;

    private SUT systemUnderTest;

    @BeforeAll
    static void setUpClass() {
        resourceForAllTests = new ResourceForAllTests("Our resource for all tests");
    }

    @AfterAll
    static void tearDownClass() {
        resourceForAllTests.close();
    }

    @BeforeEach
    void setUp() {
        systemUnderTest = new SUT("Our System under test");
    }

    @AfterEach
    void tearDown() {
        systemUnderTest.close();
    }

    @Test
    void testRegularWork() {
        boolean canReceiveAdditionalWork = systemUnderTest.canReceiveAdditionWork();
        assertTrue(canReceiveAdditionalWork);
    }

    @Test
    void testAdditionWork() {
        boolean canReceiveRegularWork = systemUnderTest.canReceiveRegularWork();
        assertFalse(canReceiveRegularWork);
    }
}
