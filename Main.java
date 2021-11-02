import java.util.Random;

public class Main {
    public static void main(String[] args){
        //First java app
        System.out.println("Hello world");

        //Tipuri de date primitive
        int numarIntreg = 2;
        float numarFloat = 5.2F;
        double numarDouble = 6.3;
        char caracter = 'a';
        short numarShort = (short) 1;
        long numarLong = 60L;
        boolean bool = true; // sau "false"

        System.out.println(numarIntreg);
        System.out.println(numarFloat);
        System.out.println(numarDouble);
        System.out.println(caracter);
        System.out.println(numarShort);
        System.out.println(numarLong);
        System.out.println(bool);

        //Tipul de date String
        //String este imutabil -> nu poti sa ii schimbi caracterele
        String nume = "Ana ";
        System.out.println(nume);
        String prenume = "Ilie";
        String numeIntreg = nume + prenume;
        System.out.println(numeIntreg);

        //Cast from number to String
        String numarString = 6 + ""; // -> se casteaza la String
        System.out.println(numarString); // -> "6"
        int numarDinString = Integer.parseInt("123");
        System.out.println(numarDinString);
        double doubleDinString = Double.parseDouble("12.5");
        System.out.println(doubleDinString);

        // if statements
        int a = 5;
        int b = 6;
        boolean conditie = a > b;
        if(conditie){
            System.out.println("a > b");
        }else{
            System.out.println("a < b");
        }

        // sau -> ||
        // si -> &&
        // negare -> !

        if(6 > 5 || 4 < 3){ // true || false -> true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // switch case:

        int numar = 6;

        switch(numar){
            case 5:
                System.out.println("Numarul este 5");
                break;
            case 6:
                System.out.println("Numarul este 6");
                break;
        }

        //operatul ternar -> conditie ? conditia este true : conditia este false

        int numar1 = 6;
        int numar2 = 7;
        int max = numar1 > numar2 ? numar1 : numar2;
        System.out.println(max);

        //Bucle for/while

        int pozitiv = 10;
        while(pozitiv > 0){
            System.out.println("Numarul este inca pozitiv: " + pozitiv);
            pozitiv--;
        }

        for(int i = -10; i < 0; i++){
            System.out.println("Numarul este inca negativ: " + i);
        }

        //Arrays(vectori)
        int lungime = 5;
        String[] vectorDeNume = new String[lungime]; // -> 5 stringuri care pornesc de la 0 (0 -> 4)
        vectorDeNume[0] = "Ana";
        vectorDeNume[1] = "ana";
        vectorDeNume[2] = "Denisa";
        vectorDeNume[3] = "Andrei";
        vectorDeNume[4] = "Mihai";
        for(int i = 0; i < vectorDeNume.length; i++){
            System.out.println(vectorDeNume[i]);
        }


        //clasa Math
        int numarNegativ = -3;
        int modul = Math.abs(numarNegativ);
        System.out.println(modul);

        //clasa Random
        Random generator = new Random(); // generator de numere random
        int numarGeneratRandom = generator.nextInt(300); // genereza numar random in intervalul [0, 300)
        System.out.println(numarGeneratRandom);

        int numarGeneratRandom2 = generator.nextInt(200); // genereaza numar random in intervalul [0, 200)
        numarGeneratRandom2 = numarGeneratRandom2 + 100; // un numar generat intre [100, 300)
        System.out.println(numarGeneratRandom2);

        int numarGeneratNegativ = generator.nextInt(10); // genereaza numar random in intervalul [0, 10)
        numarGeneratNegativ = numarGeneratNegativ - 10; // generaza in intervalul [-10, 0)
        System.out.println(numarGeneratNegativ);

        double doubleGenerat = generator.nextDouble();// fara argumente -> [0, 1)
        System.out.println(doubleGenerat);



    }
}
