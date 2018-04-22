public abstract class Literature extends Item implements IDisplayable, ISellable{


    public Literature(String name, int priceBought, int priceSold){
        super(name, priceBought, priceSold);
    }

    public String displayItemInWindow(String label) {
        return label;
    }

    public double calculateMarkUp() {
        return this.finalPrice();
    }
}
