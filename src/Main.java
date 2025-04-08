import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // kuriame kazkoki tai objekta (objektinis programavimas)
//              sc => kintamasis scanner tipo
//        System.out.println("parasiau " + sc.nextLine()); //galime sustabdyti koda spaudziant raudona STOP mygtuka

        ArrayList<String> vardai = new ArrayList<>();//kai yra NEW ==> reiskia kuriame kazkokios klases objekta //masyvas, neapibrezto dydzio (kaip balionelis) kiek mes i ji idesime, tiek jis issipus
//        vardai.add("Ana"); //pridedame varda
//        System.out.println(vardai.size()); // skirstingai negu kituose masyvuose, norint suinoti dydi, rasome ne LENGHT, o SIZE
//        System.out.println(vardai.get(0)); //ideti????
//        vardai.set(0,"Naglis");
//        vardai.remove(0); //istriname nulintoj pozicijoj => vardo nebera

//        while (true) {
//            System.out.println("Prasome itraukti varda i vardu sarasa");
//            vardai.add(sc.nextLine());
//            for (int i = 0; i < vardai.size(); i++) {
//                System.out.println(vardai.get(i));
//            }
//        }
        System.out.println("=============================================");


//        if (val == 1) {
//            System.out.println("atvaizduojame");
//        }
//        if (val == 2) {
//            System.out.println("itraukiame");
//        }
//        if (val == 3) {
//            System.out.println("redaguojame");
//        }
//        if (val == 4) {
//            System.out.println("istriname");
//        }
//        if (val == 5) {
//            System.out.println("sustabdome programa");
//        }


        while (true) {
            System.out.println("Pasirinkite:");
            System.out.println("1. Atvaizduoti vardus");
            System.out.println("2. Itraukti varda");
            System.out.println("3. Redaguoti varda");
            System.out.println("4. Istrinti varda");
            System.out.println("5. Iseiti is programos");
            int val = sc.nextInt();// mums grazins sveikaji skaiciu
            sc.nextLine();
            switch (val) { //tas pats IF, tik trumpesnis
                case 1:
                    for (int i = 0; i < vardai.size(); i++) {
                        System.out.println((i + 1) + ". " + vardai.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Iveskite vartotojo varda");
                    vardai.add(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Iveskite numeri iraso, kuri norite redaguoti");
                    int index = sc.nextInt() -1;
                    sc.nextLine();
                    System.out.println("Paduokite nauja varda");
                    String name = sc.nextLine();
                    vardai.set(index,name);
                    break;
                case 4:
                    System.out.println("Iveskite numeri iraso, kuri norite trinti");
                    vardai.remove(sc.nextInt() - 1);
                    break;
                case 5:
                    System.out.println("Sustabdome programa");
                    System.exit(1);
                default:
                    System.out.println("Tokios reiksmes nera");


















            }
        }



































    }
}