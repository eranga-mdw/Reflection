import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection09 {

    public static void main(String[] args) {
        Primary p = new Primary();
        Method [] methods = p.getClass().getMethods();
        System.out.printf("There are %d methods\n", fields.length);
        
        for(Method m : methods) {
            System.out.printf("Field name = %s | type = %s | parameters = ", m.getName(), m.getReturnType());
        Class [] types = m.getParameterTypes();
        for (Class c : types) {
            System.out.print(c.getName() + " ");
        }
        System.out.println();
        }    
    }
}



