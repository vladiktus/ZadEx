package training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        TaxService service = new TaxService();

        for (var d:service.Districts
             ) {
            System.out.println(d.Name+" Odle: "+ d.DistanceFromCentrum+" km");
        }

        for (var m:service.Cabs
        ) {
            System.out.println(m.Car+" Dzielnica: "+ m.CurrentDistrict);
        }

        while (true){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            MainMenu();
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num){
                case 1:
                    System.out.println("LISTA DZIELNIC:\n" +
                            "-----------------------------------------\n" +
                            "NUMER | NAZWA | ILOSC TAKSOWEK\n" +
                            "1 | Retkinia | 1\n"+
                            "2 | Lodz Kaliska | 1\n"+
                            "3 | SrOdmiescie | 1\n"+
                            "5 | Janow | 1\n"+
                            "LISTA TAKSOWEK:\n"+
                            "-----------------------------------------\n"+
                            "LSAMOCHOD | STATUS | AKTUALNA LOKALIZACJA\n"+
                            "Ford Mondeo | wolny | Retkinia\n"+
                            "Dacia Logan | wolny | Lodz Kaliska\n"+
                            "Toyota Avensis | wolny | Srodmiescie\n"+
                            "Mercedes E220 | wolny | Widzew\n"+
                            "Huindai Lantra | wolny | Janów");
                    break;
                case 2:
                    cabArrivalTimeLoop(service);
                    break;
                case 3:
                    System.exit(0);
            }

        }

    }

    private static void cabArrivalTimeLoop(TaxService service) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("PROSZE PODAC NUMER DZIELNICY DO KTOREJ CHCESZ WEZWAC TAKSOWKE (-1 for exit): ");
            int districtId = 0;
            districtId = scanner.nextInt() - 1;

            switch (districtId) {
                case 0:
                    service.cabAndTimeAccordingToDistrict(districtId);
                    break;
                case 1:
                    service.cabAndTimeAccordingToDistrict(districtId);
                    break;
                case 2:
                    service.cabAndTimeAccordingToDistrict(districtId);
                    break;
                case 3:
                    service.cabAndTimeAccordingToDistrict(districtId);
                    break;
                case 4:
                    service.cabAndTimeAccordingToDistrict(districtId);
                    break;
                case -1:
                    flag = false;
            }
        }
    }


    static void MainMenu(){
         System.out.println("WYBIERZ OPCJĘ:");
         System.out.println("1 => LISTA WSZYSTKICH DZIELNIC I TAKSÓWEK");
         System.out.println("2 => ZAMÓW TAKSÓWKĘ");
         System.out.println("3 => ZAKOŃCZ PROGRAM");
         System.out.print("Input a number: ");
    }

    static void TaxMenu(){
        System.out.println("LISTA DZIELNIC:");
        System.out.println("-----------------------------------------");
        System.out.println("NUMER | NAZWA | ILOŚĆ TAKSÓWEK");
        System.out.println("1 | Retkinia | 1");
        System.out.println("2 | Łódź Kaliska | 1");
        System.out.println("3 | Śródmieście | 1");
        System.out.println("4 | Widzew | 1");
        System.out.println("5 | Janów | 1");
        System.out.println("LISTA TAKSÓWEK:");
        System.out.println("-----------------------------------------");
        System.out.println("LSAMOCHÓD | STATUS | AKTUALNA LOKALIZACJA");
        System.out.println("Ford Mondeo | wolny | Retkinia");
        System.out.println("Dacia Logan | wolny | Łódź Kaliska");
        System.out.println("Toyota Avensis | wolny | Śródmieście");
        System.out.println("Mercedes E220 | wolny | Widzew");
        System.out.println("Huindai Lantra | wolny | Janów");
    }

    static void LiczbTax(){
        System.out.println("LISTA DZIELNIC:");
        System.out.println("-----------------------------------------");
        System.out.println("NUMER | NAZWA | ILOŚĆ TAKSÓWEK");
        System.out.println("1 | Retkinia | 1");
        System.out.println("2 | Łódź Kaliska | 1");
        System.out.println("3 | Śródmieście | 1");
        System.out.println("4 | Widzew | 1");
        System.out.println("5 | Janów | 1");
        System.out.println("LISTA TAKSÓWEK:");
        System.out.println("-----------------------------------------");
        System.out.println("SAMOCHÓD | STATUS | AKTUALNA LOKALIZACJA | CZAS DOJAZDU");
        System.out.println("Ford Mondeo | wolny | Retkinia |");
        System.out.println("Dacia Logan | wolny | Łódź Kaliska |");
        System.out.println("Toyota Avensis | wolny | Śródmieście |");
        System.out.println("Mercedes E220 | wolny | Widzew |");
        System.out.println("Huindai Lantra | wolny | Janów |");
        System.out.println("PROSZĘ PODAĆ NUMER DZIELNICY DO KTÓREJ CHCESZ WEZWAĆ TAKSÓWKĘ:");
    }
}


