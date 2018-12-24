package annotations.java.ex2.inherit;

import java.lang.annotation.Annotation;

public class HowToUseInherited {

	public static void main(String[] args) {
		System.out.println(MyEnumDefaultExtendsEnum.ONE.getValue());

		// HowToUseInherited is not annotated but will inherit from IamAnnotated
		System.out.println( "Extended Class: " + ExtendsFromAnnotatedSuperClass.class.isAnnotationPresent(InheritableAnnotation.class));
		Class<?> clazz = ExtendsFromAnnotatedSuperClass.class;
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation.getClass() + " - " + annotation.annotationType() + " - " + annotation);
		}
		
		/*
		 * This shows how inheritance works in relation with annotations and interfaces: it is just ignored. 
		 * The implementing class do not inherit the annotation although it is an inherit annotation;
		 */
		// Interface
		System.out.println( "Annotated Interface: " + AnnotatedInterface.class.isAnnotationPresent(InheritableAnnotation.class));
		System.out.println( "Implemented Interface: " + ImplementsFromAnnotatedInterface.class.isAnnotationPresent(InheritableAnnotation.class));
		clazz = ImplementsFromAnnotatedInterface.class;
		annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation.getClass() + " - " + annotation.annotationType() + " - " + annotation);
		}
	}
}
