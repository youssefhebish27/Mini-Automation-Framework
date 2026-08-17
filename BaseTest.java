abstract class BaseTest {
    public void setup(){
        System.out.println("Opening Browser and navigating to URL...");
    }

    public void teardown(){
        System.out.println("Closing Browser...");
    }
    public abstract void runTest();
}
