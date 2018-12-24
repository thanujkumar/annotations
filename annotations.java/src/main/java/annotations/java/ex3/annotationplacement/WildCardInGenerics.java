package annotations.java.ex3.annotationplacement;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;

@Retention(RUNTIME)
@Target(TYPE_USE)
public @interface WildCardInGenerics {//Annotation declaration can't have type parameter

	/*
	 * For the annotation attribute WildCardInGenerics.values; only primitive type,
	 * String, Class, annotation, enumeration are permitted or 1-dimensional arrays
	 * thereof
	 */
	Class<? extends List<?>> values();

	//Class<? extends List<T>> invalid(); //T parameter type not allowed
}
