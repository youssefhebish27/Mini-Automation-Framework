public class TestCaseData {

    private String testName;
    private String status;

    public TestCaseData(String testName){
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
