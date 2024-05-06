public class Cat extends Animal implements Moveable {
    public Cat(String imie){
        super(imie);
    }

    public String getTyp(){
        return "Cat";
    }

    public void start(){
        System.out.println(getTyp() + "START!");
    }

    public void stop(){
        System.out.println(getTyp() + "STOP!");
    }
}
