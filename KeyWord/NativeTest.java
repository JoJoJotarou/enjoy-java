package KeyWord;

public class NativeTest {
    public native String encryptData(String inputdata);
    
    static {
        System.loadLibrary("nativetest"); /* lowercase of classname! */
    }

    public static void main(String[] args) {
        NativeTest nativeTest = new NativeTest();
        String inputdata = "Hello World";
        String encryptedData = nativeTest.encryptData(inputdata);
        System.out.println(encryptedData);
    }
}
