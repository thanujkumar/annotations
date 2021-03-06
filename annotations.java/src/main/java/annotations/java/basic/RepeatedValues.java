package annotations.java.basic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//This is basically a container of the annotation type, and it must have an array of the CanBeRepeated annotation type.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface RepeatedValues {

	 CanBeRepeated[] value();
}
