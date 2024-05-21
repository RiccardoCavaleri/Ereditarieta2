public class Forma {
    Integer calcolo;
    public Forma(Integer base, Integer altezza){
        calcolo = base * altezza;
    }
    public void calcolaArea(){
        System.out.println(calcolo);
    }
}
