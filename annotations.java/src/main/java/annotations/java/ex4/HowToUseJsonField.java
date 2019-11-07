package annotations.java.ex4;

public class HowToUseJsonField {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Maruti", "Ritz", "2010");
        JsonFieldProcessor processor = new JsonFieldProcessor();
        System.out.println(processor.serialize(car));
    }
}
