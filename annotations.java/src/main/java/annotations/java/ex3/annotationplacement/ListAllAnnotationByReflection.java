package annotations.java.ex3.annotationplacement;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//These annotations can then be processed at compile time by pre-compiler tools, or at runtime via Java Reflection
public class ListAllAnnotationByReflection {

	public static void main(String[] args) {
		System.out.println("ClassLevel: " + AnnotationPlacement.class.isAnnotationPresent(ClassLevel.class));

		Class<AnnotationPlacement> clazz = AnnotationPlacement.class;

		// At class level
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println("Size of annotations : " + annotations.length);
		for (Annotation annotation : annotations) {
			System.out.println(annotation + " - " + annotation.annotationType());
		}

		// At Field level

		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			annotations = field.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation + " - " + annotation.annotationType());
			}
		}

		// At Method level

		try {
			Method method = clazz.getMethod("getName");
			annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation + " - " + annotation.annotationType());
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		//At Method parameter level
		try {
			Method method = clazz.getMethod("setName",String.class);
			//Two dimensional array containing array of annotation for each parameter
			Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			Class[] parameterTypes = method.getParameterTypes();
			
			int i =0;
			for (Annotation[] annotationDim : parameterAnnotations) {
				Class parameterType = parameterTypes[i++];
				
				for (Annotation annotation : annotationDim) {
					System.out.println(annotation + " - "+ annotation.annotationType() +" - " + parameterType);
					
				}
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		//At Local variable level

		/*
		 * Local variable annotations are not retained in class files (or at runtime)
		 * regardless of the retention policy set on the annotation type. See JLS
		 * 9.6.1.2. However, JSR 308 is working its way through the community process to
		 * retain local variable annotations in class files
		 */
	}

}
