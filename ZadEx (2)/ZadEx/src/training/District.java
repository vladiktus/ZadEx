package training;

public class District {

    public int Number;
    public String Name;
    public int DistanceFromCentrum;


    public District(int number,String name,int distanceFromCentrum){
        Number = number;
        Name = name;
        DistanceFromCentrum = distanceFromCentrum;




//        1	Retkinia	-2 km
//        2	Łódź Kaliska	-1 km
//        3	Śródmieście	0 km
//        4	Widzew	1 km
//        5	Janów	3 km
    }




    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDistanceFromCentrum() {
        return DistanceFromCentrum;
    }

    public void setDistanceFromCentrum(int distanceFromCentrum) {
        DistanceFromCentrum = distanceFromCentrum;
    }

    @Override
    public String toString() {
        return getName();
    }
}
