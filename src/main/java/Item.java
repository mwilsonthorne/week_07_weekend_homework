public abstract class Item {

    private String name;
    private double priceBought;
    private double priceSold;

    public Item(String name, double priceBought, double priceSold){
        this.name = name;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getName(){
        return this.name;
    }

    public double getPriceBought(){
        return this.priceBought;
    }

    public double getPriceSold(){
        return this.priceSold;
    }

    public double finalPrice(){
        return this.priceSold -= this.priceBought;

    }


    }



