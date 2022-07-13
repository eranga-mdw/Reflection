import java.lang.reflect.Method;

public class Reflection10 {

    public static void main(String[] args) throws Exception {
        Primary p = new Primary();
        Method m = p.getClass().getDeclaredMethod("setX", double.class);
        m.setAccessible(true);
        m.invoke(p, 76);
        System.out.println(p);
    }
}


