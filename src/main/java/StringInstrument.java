public class StringInstrument extends MusicalInstrument implements IPlayable, ISellable {

    private StringInstrumentType stringInstrumentType;

    public StringInstrument(String name,int priceBought, int priceSold, Material material, Colour colour, StringInstrumentType stringInstrumentType){
        super(name, priceBought, priceSold, material, colour);
        this.stringInstrumentType = stringInstrumentType;
    }

    public StringInstrumentType getStringInstrumentType(){
        return this.stringInstrumentType;
    }


    public String playObject (String stringSound) {
        return stringSound;
    }


    public double calculateMarkUp() {
        return this.finalPrice();
    }
}
