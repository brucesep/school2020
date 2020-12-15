import ReflectPack.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class ExtractReflections {

    public static void main(String[] args) {

        // Так и не разобрался как выдёргивать коллекции

        getAllFromClasses(new ListBuilding());  // тут просто много методов
//        getAllFromClasses(new Shell()); // тут интерфейс
//        getAllFromClasses(new OwnException(100, "some1", "some2"));  // тут есть конструкторы
//        getAllFromClasses(new Billing(new ClientId(), 123));  //тут есть больше одного предка
//        getAllFromClasses(new CommandExit());
    }

    public static void getAllFromClasses(Object someObject) {
        Class clazz = someObject.getClass();
        System.out.println("Class name is: " + clazz.getName());
        System.out.println("Modifiers are: " + Modifier.toString(clazz.getModifiers()));
        System.out.println("---------- Parents are:");
        searchParents(clazz);
        System.out.println("---------- Interfaces are:");
        searchInterfaces(clazz);
        System.out.println("---------- Methods are:");
        searchMethods(clazz);
        System.out.println("---------- Some Constructors:");
        searchConstrs(clazz);
        System.out.println("---------- All poles: ");
        searchPolesClass(clazz);
        System.out.println("=======================");
    }

    public static void searchPolesClass(Class someClass) {
        Field[] fieldList = someClass.getDeclaredFields();
        for (Field someField : fieldList) {
            System.out.println("Field: " + someField.getName() + "  --  Type: " + someField.getType());
        }
        fieldList = someClass.getFields();
        for (Field someField : fieldList) {
            System.out.println("Field: " + someField.getName() + "  -- Type: " + someField.getType());
        }
//        System.out.println("Поля класса: " + Arrays.toString(someClass.getDeclaredFields()));
//        System.out.println("Поля класса: " + Arrays.toString(someClass.getFields()));
    }

    public static void searchConstrs(Class someClass) {
        Constructor[] constrList = someClass.getConstructors();
        for (Constructor someConstr : constrList) {
            System.out.println(someConstr.getName());
            Class[] paramList = someConstr.getParameterTypes();
            for (Class someParam : paramList) {
                System.out.println("---  " + someParam.getName());
            }
        }
    }

    public static void searchMethods(Class someClass) {
        Method[] methodList = someClass.getMethods();
        for (Method someMeth : methodList) {
            if (someMeth.getModifiers() >= 9) {
                System.out.println("Method:  " + someMeth.getName() + "  ||  Type:   " + someMeth.getReturnType());
            }
        }
        Method[] methodList1 = someClass.getDeclaredMethods();
        for (Method someMeth : methodList1) {
            if (someMeth.getModifiers() != 9) {
                System.out.println("Method:  " + someMeth.getName() + "  ||  Type:   " + someMeth.getReturnType());
            }
        }

    }

    public static void searchInterfaces(Class someClass) {
        Class[] interfaceList = someClass.getInterfaces();
        for (Class someClass1 : interfaceList) {
            if (someClass1.getInterfaces() != null) {
                System.out.println(someClass1.getName());
            }
        }
    }

    public static void searchParents(Class someClass) {
        System.out.println("--- " + someClass.getSuperclass());
        if (someClass.getSuperclass().getSuperclass() != null) {
            searchParents(someClass.getSuperclass());
        }
    }

}
