package _04_class_interface.smartcasts;

import _04_class_interface.smartcasts.java.Kotliner;
import _04_class_interface.smartcasts.java.Person;

public class JavaCasts {
    public static void main(String... args) {


        Kotliner kotliner = new Person("benny", 20);
        if(kotliner instanceof Person){
            System.out.println(((Person) kotliner).name);
        }



    }
}


