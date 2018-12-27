package annotations.java.ex1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Author(date = "2018-10-10")
public class HowToUse {

	// @Author - Not allowed for method as Target is TYPE, see Author2AtMethodLevel
	public void doSomeWork() {

	}

	@Author2AtMethodLevel(description = "This is method level annotation")
	public void doSomeWork1() {

	}
	
	public static void main(String[] args) {
		
		Class<HowToUse> clazz = HowToUse.class;
        
		//Class Level
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			if (Proxy.isProxyClass(annotation.getClass())) {
				System.out.println(Proxy.isProxyClass(annotation.getClass()));
			}
			
			System.out.println(annotation.getClass() +" - " + annotation.annotationType() +" - " + annotation);
		}
		
		//Get Method Level
        Method methods[] = clazz.getDeclaredMethods();
        for (Method method : methods) {
        	 annotations = method.getAnnotations();
        	 for (Annotation annotation : annotations) {
     			System.out.println(annotation.annotationType() + " - " + annotation);
     		}
        }
	}
}
