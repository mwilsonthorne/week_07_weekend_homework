public abstract class MusicalInstrument extends Item {

        private Material material;
        private Colour colour;

    public MusicalInstrument(String name, int priceBought, int priceSold, Material material, Colour colour){
            super(name, priceBought, priceSold);
            this.material = material;
            this.colour = colour;
        }

     public Material getMaterial(){
        return this.material;
     }

     public Colour getColour(){
        return this.colour;
     }


    }

