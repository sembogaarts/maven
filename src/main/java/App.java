import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Friet", 2.50);
        Product p2 = new Product(2, "Pizza", 4.62);
        Product p3 = new Product(3, "Burger", 3.36);

        List<Product> products = new ArrayList<Product>();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        System.out.println(convertToJson(products));
    }

    private static String convertToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try {
            jsonString = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

}