public abstract class Animal {
    protected String imie;

    public Animal(String imie){
        this.imie = imie;
    }

    public abstract String getTyp();
    public String getImie(){
        return imie;
    }
}
