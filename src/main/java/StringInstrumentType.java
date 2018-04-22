public enum StringInstrumentType {

    GUITAR(150),
    VIOLIN(50),
    DOUBLE_BASS(500),
    MANDOLIN(60),
    BANJO(80);

    private int price;

    StringInstrumentType(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


}
