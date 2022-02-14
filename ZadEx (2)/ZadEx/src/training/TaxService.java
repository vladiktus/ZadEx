package training;

import javax.naming.Name;
import java.util.ArrayList;

public class TaxService {

    public TaxService(){
        CreatDistrict();
        CreatCabs();
    }

    public ArrayList<District> Districts = new ArrayList<District>();
    public ArrayList<Cab> Cabs = new ArrayList<Cab>();


    private void CreatDistrict(){
        Districts.add(new District(1,"Retkinia",-2));
        Districts.add(new District(2,"Lodz Kaliska",-1));
        Districts.add(new District(3,"Srodmiescie",0));
        Districts.add(new District(4,"Widzew",1));
        Districts.add(new District(5,"Janów",3));
    }


    private void CreatCabs(){

        Cabs.add(new Cab(1,"Ford Mondeo", Districts.get(0)));
        Cabs.add(new Cab(2,"Dacia Logan",  Districts.get(1)));
        Cabs.add(new Cab(3,"Toyota Avensis",  Districts.get(2)));
        Cabs.add(new Cab(4,"Mercedes E220", Districts.get(3)));
        Cabs.add(new Cab(5,"Huindai Lantra",  Districts.get(4)));

//
//        Id	Samochód	Status	Aktualna dzielnica
//        1	Ford Mondeo	wolny	Retkinia
//        2	Dacia Logan	wolny	Łódź Kaliska
//        3	Toyota Avensis	wolny	Śródmieście
//        4	Mercedes E220	wolny	Widzew
//        5	Huindai Lantra	wolny	Janów
    }

    public void cabAndTimeAccordingToDistrict(int districtId) {
        Cab cab = getCabs().get(districtId);

        System.out.println(
                "ZLECENIE REALIZUJE: " + cab.getCar() +
                "\nCZAS DOJAZDU: " + cab.Arrivaltime(getDistricts().get(districtId)) + " min."
        );

        System.out.println("LISTA DZIELNIC:\n" +
                "-----------------------------------------\n" +
                "NUMER | NAZWA | ILOSC TAKSOWEK\n" +
                "1 | Retkinia | 1\n"+
                "2 | Lodz Kaliska | 1\n"+
                "3 | SrOdmiescie | 1\n"+
                "5 | Janow | 1\n"+
                "LISTA TAKSOWEK:\n"+
                "-----------------------------------------\n"+
                "SAMOCHOD | STATUS | AKTUALNA LOKALIZACJA | CZAS DOJAZDU\n");

        for (int i=0; i<5; i++) {
            Cab tempCab = getCabs().get(i);
            String isAvailable = getIsAvailable(tempCab, i, districtId);
            System.out.println(
                    tempCab.getCar() + " | " +
                    isAvailable + " | " +
                    tempCab.getCurrentDistrict().getName() + " | " +
                    "(" + tempCab.Arrivaltime(getDistricts().get(districtId)) + " min.)"
            );
        }
        getCabs().get(districtId).setAvailable(false);
    }

    private String getIsAvailable(Cab cab, int i, int districtId) {
        String isAvailable = "";
        if (i == districtId) {
            isAvailable = "zajety";
        } else if (!cab.isAvailable()) {
            isAvailable = "zajety";
        } else {
            isAvailable = "wolny";
        }
        return isAvailable;
    }

    public ArrayList<District> getDistricts() {
        return Districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        Districts = districts;
    }

    public ArrayList<Cab> getCabs() {
        return Cabs;
    }

    public void setCabs(ArrayList<Cab> cabs) {
        Cabs = cabs;
    }


}
