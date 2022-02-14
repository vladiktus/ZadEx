package training;

public class Cab {

    public int Id;
    public String Car;
    public boolean IsAvailable;
    public District CurrentDistrict;
    public int time;


    public Cab(int id, String car, District district) {
        Id = id;
        Car = car;
        CurrentDistrict = district;
        IsAvailable = true;
        time = 0;
    }

    public int Arrivaltime(District custumerDistrict) {

        int time = 0;
        if (custumerDistrict.Number == CurrentDistrict.Number)
            time = 4;
        else {
            int route = Math.abs(custumerDistrict.DistanceFromCentrum - CurrentDistrict.DistanceFromCentrum);
            System.out.println(route);
            time = route * 5;
        }

        if (!IsAvailable) {
            time += 12;
        }
        return time;
    }


    public District getCurrentDistrict() {
        return CurrentDistrict;
    }

    public void setCurrentDistrict(District currentDistrict) {
        CurrentDistrict = currentDistrict;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String car) {
        Car = car;
    }

    public boolean isAvailable() {
        return IsAvailable;
    }

    public void setAvailable(boolean available) {
        IsAvailable = available;
    }

    public int getMyProperty() {
        return MyProperty;
    }

    public void setMyProperty(int myProperty) {
        MyProperty = myProperty;
    }

    public int MyProperty;
}
