//clasa este ca un fel de sablon/blueprint pentru obiectele sale
//ca un fel de structura din C dar cu functionalitate(are si functii)
//structura: 1. atribute/field-uri/campuri
//           2. metode(functii)
//campurile clasei: private/public
//private: este vizibil in clasa unde este declarat field-ul sau declarata metoda
public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;
    private static String cetatenie = "romana";

    //constructorul: o functie care poarta numele clasei si nu are deloc return type(tip de date returnat)
    //pe langa asta, constructorul aloca memorie clasei si seteaza valorile atributelor clasei

    //un constructor care imi seteaza numele, prenumele si varsta
    Persoana(String numePersoana, String prenumePersoana, int varstaPersoana){
        nume = numePersoana;
        prenume = prenumePersoana;
        varsta = varstaPersoana;
    }
    //un constructor gol
    private Persoana(){

    }

    //static inseamna ca este o metoda sau un atribut al clasei
    static Persoana creeazaPersoanaMajora(String nume, String prenume){
        return new Persoana(nume, prenume, 18);
    }

    //getters+setters

    public String getNume(){
        if(varsta < 18){
            return "Anonim";
        }else{
            return nume;
        }
    }

    public int getVarsta(){
        return varsta;
    }

    public void setVarsta(int varstaNoua){
        if(varstaNoua < 0 || varstaNoua > 120){
            varstaNoua = 0;
        }
        varsta = varstaNoua;
    }

    //daca folosesc system.out.println pe obiect se apeleaza automat toString() pe obiectul acela
    public String toString(){
        String aux = "Nume: " + nume + ", Prenume: " + prenume + ", varsta: " + varsta;
        return aux;
    }

    public static void main(String[] args) {
        Persoana persoana1 = new Persoana(); // aloca memorie lui persoana1
        persoana1.nume = "Ionescu";
        persoana1.prenume = "Daniel";
        persoana1.varsta = 20;
        System.out.println(persoana1);

        Persoana persoana2 = new Persoana("Popescu", "Ana", 22);
        System.out.println(persoana2);

        Persoana persoana3 = Persoana.creeazaPersoanaMajora("Ilie", "Vlad");
        System.out.println(persoana3.toString());

        String persoana = persoana3 + "- scris-"; //ca si cum as scrie `persoana3.toString() + ""`
        System.out.println(persoana);

        persoana1.cetatenie = "germana";
        System.out.println(persoana1.cetatenie);
        System.out.println(persoana2.cetatenie);
        System.out.println(persoana3.cetatenie);


    }
}

