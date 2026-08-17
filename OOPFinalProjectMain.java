public class OOPFinalProjectMain {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("QA TEST EXECUTION REPORT");
        System.out.println("Tester: Youssef Hebish");
        System.out.println("=================================");

        TestCaseData loginData = new TestCaseData("Login Functionality");
        LoginTest loginTest = new LoginTest();
        loginTest.setup();
        loginTest.runTest();
        loginTest.teardown();
        loginData.setStatus("PASSED");
        System.out.println("Test Name: " + loginData.getTestName() + " | Status: " + loginData.getStatus());
        System.out.println("---------------------------------");

        TestCaseData paymentData = new TestCaseData("Checkout Process");
        PaymentTest paymentTest = new PaymentTest();
        paymentTest.setup();
        paymentTest.runTest();
        paymentTest.teardown();
        paymentData.setStatus("Failed");
        System.out.println("Test Name: " + paymentData.getTestName() + " | Status: " + paymentData.getStatus());
        System.out.println("---------------------------------");

    }
}
