public class Car <C extends Number> implements Drivable{
    private C km;
    private C year;


    public Car(C km, C year) {
        this.year = year;
        this.km = km;
    }

    public C getKm() {
        return km;
    }

    public void setKm(C km) {
        this.km = km;
    }

    public C getYear() {
        return year;
    }

    public void setYear(C year) {
        this.year = year;
    }

    @Override
    public void mileage() {
        System.out.println("This car's mileage is " + km +"km");

    }

    @Override
    public void yearProd() {
        System.out.println("This car produced in " + year);


    }
}
