package DDitJavaClass;

public class Test {
    public static void main(String[] args) {
    long var1 = 2L;
    float var2 = 1.8f;
    double var3 = 2.5;
    String var4 = "3.9";
    double value = Double.parseDouble(var4);
    int result = (int)(var1 + var2) + (int)(var3 + value);
    System.out.println(result);

    }
}
