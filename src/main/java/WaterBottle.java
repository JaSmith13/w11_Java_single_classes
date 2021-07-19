public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void Drink(){
        this.volume -= 10;
    }

    public void EmptyBottle(){
        this.volume = 0;
    }

    public void FillBottle(){
        this.volume = 100;
    }
}
