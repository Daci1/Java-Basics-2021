public class Scoala {
    String numeScoala;
    Persoana[] elevi;

    Scoala(String nume, Persoana[] eleviScoala){
        elevi = eleviScoala;
        numeScoala = nume;
    }

    void afiseazaElevi(){
        System.out.println(numeScoala);
        for(int i = 0; i < elevi.length; i++){
            System.out.println(elevi[i]);
        }
    }

    public static void main(String[] args) {

        Persoana persoana1 = new Persoana("Popescu", "Ana", 22);
        Persoana persoana2 = new Persoana("Ionescu", "Vlad", 20);
        Persoana persoana3 = new Persoana("Ilie", "Daniel", 23);

        Persoana[] persoane = new Persoana[3];
        persoane[0] = persoana1;
        persoane[1] = persoana2;
        persoane[2] = persoana3;
        Scoala scoala = new Scoala("Poli", persoane);
        scoala.afiseazaElevi();

        System.out.println(persoana1.getVarsta());
        persoana1.setVarsta(-150);
        System.out.println(persoana1.getVarsta());
        System.out.println(scoala);
    }
}
