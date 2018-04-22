public class Accessory extends Item implements ISellable {

    private Catagory catagory;

    public Accessory(String name, double priceBought, double priceSold, Catagory catagory){
        super(name, priceBought, priceSold);
        this.catagory = catagory;
    }

    public Catagory getCatagory(){
        return this.catagory;
    }


    public double calculateMarkUp() {
        return this.finalPrice();
    }
}
