package srija.com;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFrameworkTest {
	private TestFramework testFramework;

    @Before
    public void setUp() {
        testFramework = new TestFramework();
    }

    @Test
    public void testStart() {
        testFramework.start();
        assertTrue("Test framework should be running.", testFramework.isRunning());
        assertFalse("Test framework should not be paused.", testFramework.isPaused());
    }

    @Test
    public void testPauseWhenRunning() {
        testFramework.start();
        testFramework.pause();
        assertTrue("Test framework should still be running.", testFramework.isRunning());
        assertTrue("Test framework should be paused.", testFramework.isPaused());
    }

    @Test
    public void testPauseWhenNotRunning() {
        testFramework.pause();
        assertFalse("Test framework should not be running.", testFramework.isRunning());
        assertFalse("Test framework should not be paused.", testFramework.isPaused());
    }

    @Test
    public void testStop() {
        testFramework.start();
        testFramework.stop();
        assertFalse("Test framework should be stopped.", testFramework.isRunning());
        assertFalse("Test framework should not be paused after stopping.", testFramework.isPaused());
    }

    @Test
    public void testStopWhenNotRunning() {
        testFramework.stop();
        assertFalse("Test framework should not be running.", testFramework.isRunning());
        assertFalse("Test framework should not be paused.", testFramework.isPaused());
    }
}
