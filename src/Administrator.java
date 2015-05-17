import java.util.ArrayList;
import java.util.List;

/**
 * Created by grs on 18/05/2015.
 */
public class Administrator {
    List<Drug> drugList;
    List<Manufacturer> manufacturerList;
    List<SuperStockiest> superStockiests;
    List<Stockiest> stockiests;
    List<Retailer> retailers;
    List<City> cities;

    public  Administrator(){
        drugList=new ArrayList();
        Drug drug=new Drug();
        manufacturerList=new ArrayList<Manufacturer>();
        Manufacturer manufacturer=new Manufacturer(drug);
        superStockiests=new ArrayList<SuperStockiest>();
        stockiests=new ArrayList<Stockiest>();
        retailers=new ArrayList<Retailer>();
        cities=new ArrayList<City>();
        City city=new City();
        SuperStockiest superStockiest=new SuperStockiest(city,drug);
        Stockiest stockiest=new Stockiest(city,drug,superStockiest);
        Retailer retailer=new Retailer(city,drug,stockiest);





    }
}
