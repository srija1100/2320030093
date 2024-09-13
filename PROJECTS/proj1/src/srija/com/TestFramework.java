package srija.com;

public class TestFramework {
	private boolean running = false;
    private boolean paused = false;

    public void start() {
        running = true;
        paused = false;
        System.out.println("Test framework started.");
    }

    public void pause() {
        if (running) {
            paused = true;
            System.out.println("Test framework paused.");
        } else {
            System.out.println("Cannot pause, framework is not running.");
        }
    }

    public void stop() {
        running = false;
        paused = false;
        System.out.println("Test framework stopped.");
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isPaused() {
        return paused;
    }
}
