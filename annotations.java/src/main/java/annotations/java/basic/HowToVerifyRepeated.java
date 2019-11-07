package annotations.java.basic;

import java.lang.annotation.Annotation;

public class HowToVerifyRepeated {

    public static void main(String[] args) {
        Class object = HowToUseRepeated.class;
        Annotation[] annotations = object.getAnnotations();

        for (Annotation annotation : annotations) {
            RepeatedValues rac = (RepeatedValues) annotation;
            CanBeRepeated[] raArray = rac.value();
            for (CanBeRepeated ra : raArray) {
                System.out.println(ra.value());
            }
        }
    }

}
