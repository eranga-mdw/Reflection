import java.lang.reflect.Field;

public class Reflection06 {

    public static void main(String[] args) throws IllegalAccessException {

        Primary primary = new Primary();

        Field[] declaredFields = primary.getClass().getDeclaredFields();
        System.out.println("fields count : " + declaredFields.length);
        System.out.println();

        for (Field field: declaredFields) {
            System.out.println("Field Name : " + field.getName());
            System.out.println("Type : " + field.getType());
            System.out.println("Value : " + field.isAccessible());
            System.out.prinln();
        }
    }
}



