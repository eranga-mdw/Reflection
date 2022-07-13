import java.lang.reflect.Field;

public class Reflection07 {

    public static void main(String[] args) throws Exception {
        Primary p = new Primary();
        Field[] fields = p.getClass().getDeclaredFields();
        System.out.printf("There are %d fields\n", fields.length);

        for (Field f : fields) {
            f.setAccessible(true);
            System.out.printf("Field name = %s | type = %s | value = %.02f\n", f.getName(), f.getType(), f.getDouble(p));
        }
    }
}




