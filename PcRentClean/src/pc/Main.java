package pc;

import pc.cases.X1;
import pc.cases.X2;
import pc.gpu.GTX1660S;
import pc.gpu.RTX3090;
import pc.procesors.I3;
import pc.procesors.I5;
import pc.procesors.I7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Procesors procesor;
    public static Cases obudowa;
    public static Gpu gpu1;

    public static void main(String[] args) throws FileNotFoundException, IOException {



        int i = 1;


        System.out.println("Witaj w wypozyczalni komputerów PC. ");
        do {
            procesor = ChoosProcesor();

            System.out.println("wybierz obudowe do Swojego komputera");
            System.out.println("1 - x1, 2-x2");

            obudowa = ChoosCase();

            System.out.println("Wybierz karte graficzna swojego komputera");
            System.out.println("Kliknij: 1 dla GTX1660s, 2 dla RTX3090");

            gpu1=ChoosGpu();

            PC pc = new PcAssembler(procesor, obudowa, gpu1);
            print(printerF(pc));

            System.out.println("czy chcesz dokonac zmian? jesli tak kliknij 1, jesli nie kliknij 0");
            Scanner si = new Scanner(System.in);

            i = si.nextInt();
            switch (i){
                case 0: {}
                endline(pc);
                break;


            }


        }
        while (i > 0);


    }

        public static void print (ArrayList name){

            for (int i = 0; i < name.size(); i++) {

                System.out.print(name.get(i) + "\n");
            }


        }
        public static ArrayList printerF (PC name) throws FileNotFoundException {

            ArrayList<String> printer = new ArrayList<String>();
            printer.add("Twoj nowy PC sklada sie z :");
            printer.add("Procesor (nazwa, taktowanie, generacja, cena):");
            printer.add(name.getModel());
            printer.add(name.getClock());
            printer.add(name.getGeneration());
            printer.add(name.getPrice());
            printer.add("Obudowa (nazwa, rozmiar, cena):");
            printer.add(name.getC_model());
            printer.add(name.getC_Size());
            printer.add(name.getC_Price());
            printer.add("Karta graficzna (nazwa, taktowanie, pamiec, cena):");
            printer.add(name.getG_model());
            printer.add(name.getG_Clock());
            printer.add(name.getG_Memory());
            printer.add(name.getG_Price());
            int overalPrice = Integer.parseInt(name.getPrice()) + Integer.parseInt(name.getG_Price()) + Integer.parseInt(name.getC_Price());
            printer.add("Cena za calosc jest rowna:" + overalPrice);

            return printer;
        }

        public  static Procesors ChoosProcesor(){
            int p=0;
           int pr=0;
           Procesors userprocesor = new I7();
            while (pr == 0) {
                System.out.println("Wybierz z jakim procesorem chcesz wypozyczyc komputer:");
                System.out.println("1 - i3, 2-i5, 3-i7");
                Scanner s = new Scanner(System.in);
                p = s.nextInt();
                switch (p) {
                    case (1):
                     userprocesor = new I3();
                        pr = 1;

                        break;
                    case (2):
                       userprocesor = new I5();
                        pr = 1;
                        break;
                    case 3:
                       userprocesor = new I7();
                        pr = 1;
                        break;
                    default:
                        pr = 0;
                        System.out.println("wybierz podnownie");

                }
            }

        return userprocesor;
        }

        public static Cases ChoosCase(){
        Cases usercase = new X2();
            int pr=0;
            int p = 0;
            while (pr == 0) {

                Scanner s = new Scanner(System.in);
                p = s.nextInt();
                switch (p) {
                    case (1):
                        usercase  =new X1();
                        pr = 1;

                        break;
                    case (2):
                        usercase  = new X2();
                        pr = 1;
                        break;

                    default:
                        pr = 0;
                        System.out.println("wybierz podnownie");

                }
            }

            return usercase;

        }

        public static Gpu ChoosGpu(){
            int p=0;
            int pr=0;
           Gpu usergpu = new RTX3090();
            while (pr == 0) {

                Scanner s = new Scanner(System.in);
                p = s.nextInt();
                switch (p) {
                    case (1):
                        usergpu = new GTX1660S();
                        pr = 1;

                        break;
                    case (2):
                        usergpu = new RTX3090();
                        pr = 1;
                        break;

                    default:
                        pr = 0;
                        System.out.println("wybierz podnownie");

                }
            }

            return usergpu;


        }

        public static void endline(PC pc) throws  FileNotFoundException, IOException{




                    System.out.println("Czy chcesz wydrukowac fakture");
                    System.out.println("1 aby potwierdzic, 0 aby nie drukowac faktury");
                     Scanner si = new Scanner(System.in);
                    int fact = si.nextInt();
                    switch (fact) {
                        case 1:
                            new Facture().printFacture(printerF(pc));
                            System.out.println("Twoja faktura znajduje sie w folcerze PcRentCelan w pliku Facture.txt");

                            break;

                        case 2:
                            break;
                        default:
                            break;


                    }





            }

        }















