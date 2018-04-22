public class Antique extends MusicalInstrument implements IDisplayable {

    private AntiqueInstrumentType antiqueInstrumentType;

    public Antique(String name, int priceBought, int priceSold, Material material, Colour colour, AntiqueInstrumentType antiqueInstrumentType){
        super(name, priceBought, priceSold, material, colour);
        this.antiqueInstrumentType = antiqueInstrumentType;
    }

    public AntiqueInstrumentType getAntiqueInstrumentType(){
        return this.antiqueInstrumentType;
    }


    public String displayItemInWindow(String label) {
        return label;
    }


}
