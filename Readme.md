The main Java Specification Requests involved in the annotations design and development are:
* [JSR 175 A metadata facility for the Java programming Language][1]
* [JSR 250 Common Annotations for the Java Platform][2]

*Tutorial*
* [Java Annotation Tutorial][3]

##### Notes :aries: :+1:
> * Annotations can be used basically in almost every element of a Java program: classes, fields, methods, packages, variables, etc
> * Since Java 8 annotations can be placed
almost in every place of the code, this is called type annotations
> * Annotations can be used for many different purposes
    * **Information for the compiler :** Annotations can be used by the compiler to produce warnings or even errors based on different rules
    * **Documentation:** Annotations can be used by software applications for documentation and also generation of reports
    * **Code generation:** Annotations can be used to generate code or some sort of files automatically using metadata information.
    * **Runtime processing:** Annotations that are examined in runtime can be used for different objectives like unit testing (Junit),dependency injection (Spring), bean validation, data access (JPA) etc.
> * Since Java 8 it is also possible to use annotations within types. That is anywhere you can use a type, including the new operator,
castings, implements and throws clauses. Type Annotations allow improved analysis of Java code and can ensure even stronger
type checking. 
> * All method declarations cannot have parameters and are not allowed to have a thrown clause. The return
types are restricted to String, Class, enums, annotations and arrays of the types. No extends/implements at annotation level.
> * The @Inherited annotation is only applicable to classes and annotations present in the interfaces have no effect in the implementing
classes (ex2.inherit) [API][4]
> * Annotation can't inherit from other annotations.

```
   //in method parameters
   public void doSomeWork(@TypeAnnotated int param) {
   
     //type def
     @TypeAnnotated
     String value;
     
     //type
     List<@TypeAnnotated String> list = new ArrayList<>();
     
     //values
     String res = new @TypeAnnotated String("Some value");
   }
```
___    
##### Built-in Annotations (Only Core library)

> * **@Retention:** This annotation annotates other annotations and it is used to indicate how to store the marked annotation. This
annotation is a kind of Meta annotation, since it is marking an annotation and informing about its nature. Possible values are:
    * *SOURCE*: Indicates that this annotation is ignored by compiler and JVM (not available at runtime) and it is only retained in the source.
    * _CLASS:_ Indicates that the annotation is going to be retained by the compiler but ignored by the JVM at runtime (not going to be available at runtime).
    * _RUNTIME:_ Means that the annotation is going to be retained by the Java Virtual Machine and can be used in runtime via reflection.

> * **@Target:** This one restricts the elements that an annotation can be applied to. The syntactic locations where annotations may appear are split into `declaration contexts` , where annotations apply to declarations, and `type contexts`, where annotations apply to types used in declarations and expressions
     *  *ANNOTATION_TYPE* means that the annotation can be applied to other annotation.
     *  *CONSTRUCTOR* can be applied to a constructor.
     *  *FIELD* can be applied to a field or property.
     *  *LOCAL_VARIABLE* can be applied to a local variable.
     *  _METHOD_ can be applied to a method-level annotation.
     *  _PACKAGE_ can be applied to a package declaration.
     *  _PARAMETER_ can be applied to the parameters of a method.
     *  _TYPE_ can be applied to any element of a class.
     *  *TYPE_PARAMETER*
     *  *TYPE_USE*

> * **@Repeatable:** indicates that an annotation annotated with this one can be applied more than once to the same element
declaration.

> * **@Documented:** The annotated elements are going to be documented using the Javadoc tool.

> * **@Inherited:** By default annotations are not inherited by subclasses. This annotation marks an annotation so as to allow l subclasses to extend this annotated class.

> * **@Deprecated:** Indicates that the annotated element should not be used, generates compiler warnings.

> * **@SuppressWarnings:** Indicates the compiler not to produce warnings for an specific reason or reasons

> * **@Override:** Indicates the compiler that the element is overriding an element of the super class. This annotation is not
mandatory to use when overriding elements but it helps the compiler to generate errors when the overriding is not done
correctly.

> * **@SafeVarags:** A programmer assertion that the body of the annotated method or constructor does not perform potentially unsafe operations on its varargs parameter. Applying this annotation to a method or constructor suppresses unchecked warnings about a non-reifiable variable arity (vararg) type and suppresses unchecked warnings about parameterized array creation at call sites.

[1]: https://www.jcp.org/aboutJava/communityprocess/final/jsr175/index.html
[2]: https://jcp.org/en/jsr/detail?id=250
[3]: https://docs.oracle.com/javase/tutorial/java/annotations/index.html
[4]: https://docs.oracle.com/javase/7/docs/api/java/lang/annotation/Inherited.html

