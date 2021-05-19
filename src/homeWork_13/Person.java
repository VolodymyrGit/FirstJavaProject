package homeWork_13;


import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    @MyFieldAnnotation("Some name")
    private String name;

    private int age;

    @MyFieldAnnotation("weight")
    private int weight;

    private int height;

    @MyFieldAnnotation
    private String address;


    public static void saveFieldsToFile() {

        Person person = new Person();

        Class<? extends Person> clazz = person.getClass();

        Field[] declaredFields = clazz.getDeclaredFields();

        List<Field> fieldsWithAnnotation = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(MyFieldAnnotation.class))
                .collect(Collectors.toList());

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Laptop\\Desktop\\" +
                "FirstJavaProject\\src\\homeWork_13\\fieldsWithAnnotations.txt")) {

            fieldsWithAnnotation.forEach(field -> {
                        try {
                            fileWriter.write(field.getName() + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

            fileWriter.write(String.valueOf(fieldsWithAnnotation));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person.saveFieldsToFile();
    }
}
//        1.Створити власну анотацію, яка буде приймати хоча б один параметр. Створити клас із
//        певними полями і над декількома полями написати власну анотацію.
//        Створити метод який буде записувати поля класу які промарковані анотацією в файл
//        (рефлексія).