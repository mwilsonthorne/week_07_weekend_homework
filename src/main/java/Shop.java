import java.util.ArrayList;

public class Shop {

    private ArrayList<IDisplayable> window;
    private ArrayList<ISellable> stock;

    public Shop(){
        this.window = new ArrayList<>();
        this.stock = new ArrayList<>();
    }

    public int countWindowItems(){
        return this.window.size();
    }

    public int countStock(){
        return this.stock.size();
    }

    public void addWindowItems(IDisplayable item){
        this.window.add(item);
    }

    public void removeWindowItems(IDisplayable item){
        this.window.remove(item);
    }

    public void addStock(ISellable item){
        this.stock.add(item);
    }

    public void removeStock(ISellable item){
        this.stock.remove(item);
    }
}
