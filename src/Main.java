public class Main {
    public static void main(String[] args) {

       /* Car bmw = new Car("BMW M5","Red");
        System.out.println(bmw);*/

        CarRecord bmw = new CarRecord("BMW M6","Yellow");
        System.out.println(bmw);
        System.out.println(CarRecord.ENGINE_TYPE);
        CarRecord.print();
        bmw.makeNoise();

    }
}