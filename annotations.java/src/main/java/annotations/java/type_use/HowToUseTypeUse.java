package annotations.java.type_use;

//https://dzone.com/articles/creating-custom-annotations-in-java
//https://dzone.com/articles/explore-annotations-in-java-8

/*
As an example, suppose we want a particular variable to never be assigned null throughout our program.
 We can write a custom plugin NonNull to check this and annotate that particular variable with that custom annotation.
 The variable declaration should then be.

 When the code is compiled, the compiler checks for potential problems and raised warnings when any such code is
 found where the variable may be assigned a null value.
 */
public class HowToUseTypeUse {
    @NotNull String myString;
}
