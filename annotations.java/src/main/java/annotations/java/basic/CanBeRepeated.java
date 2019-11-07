package annotations.java.basic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Here, CanBeRepeated is an annotation that can be used repeatedly to annotate any type.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@Repeatable(RepeatedValues.class)//This is basically a container of the annotation type, and it must have an array of the CanBeRepeated annotation type.
public @interface CanBeRepeated {
	
	String value();

}
