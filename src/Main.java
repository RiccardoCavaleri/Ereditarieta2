public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma(4 , 7);
        Rettangolo rettangolo = new Rettangolo(5,13);
        System.out.print("calcolo dell'area forma : ");
        forma.calcolaArea();
        System.out.print("calcolo area del rettangolo : ");
        rettangolo.calcolaArea();

    }
}