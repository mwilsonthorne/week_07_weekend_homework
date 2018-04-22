public class CD extends Literature implements IPlayable {

    public CD(String name, int priceBought, int priceSold){
        super(name, priceBought, priceSold);
    }


    public String playObject(String sound) {
        return sound;

    }



}
