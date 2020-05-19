public class Main {

    public static void main(String[] args) {

        Car<Integer> car1 = new Car<>(15000, 2019);
        Car<Number> car2 = new Car<>(20000, 2018);
        car1.mileage();
        car2.yearProd();


    }
}
