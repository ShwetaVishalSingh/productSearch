package com.shweta.serachapi.domain;

import javax.validation.Payload;
import java.util.*;
import java.util.Map.Entry;

public class InMemoryProductSearchRepository implements ProductSearchRepository {
    private List<String> products = new ArrayList<>();
    Map<String, List<String>> productsMap = new HashMap<>();
    boolean useMap = true;


    @Override
    public String fetchSearchProduct(String productName) {
        List<String> filteredProducts = new ArrayList<>();
        if(useMap)
        {
            for (Entry<String, List<String>> products : productsMap.entrySet()){
                String product = products.getKey();
                if(product.contains(productName))
                {
                    //return products.getValue();
                }
               /* for(String productToBeMatched : productFromMap)
                {
                    if(productToBeMatched.contains(productName))
                    {
                        filteredProducts.add(productToBeMatched);
                    }
                }*/
            }
        }else {
            for (String product : products) {
                if (product.contains(productName)) {
                    filteredProducts.add(product);
                }
            }

        }
                return "";
    }

    @Override
    public void addProducts(com.shweta.serachapi.infrastructure.Payload payload) {

    }

        public void addProducts(Payload payload) {
        if (useMap) {
            addProductsInMap();
        } else {
            addProductsInList();

        }


    }

    private void addProductsInMap() {
        productsMap.put("egg" , Arrays.asList("Egg","eggOmlett","eggPaneer","eggSandwitch","eggRoll","eggCurry"));
        productsMap.put("mango" , Arrays.asList("Mango","MangoShake","MangoChuty","MangoPickles"));
        productsMap.put("potato" , Arrays.asList("potato","potatoMess","Potato Roll","PotatoTomato"));
    }

    private void addProductsInList() {
        products.add("mango");
        products.add("mangoShake");
        products.add("mangoChutny");
        products.add("mangoPickels");


        products.add("Egg");
        products.add("eggOmlett");
        products.add("eggPaneer");
        products.add("eggSandwitch");
        products.add("eggRoll");
        products.add("eggCurry");


        products.add("Potato");
        products.add("potato mess");
        products.add("potato sandwich");
        products.add("potato roll");
        products.add("potato curry");
        products.add("potato pickle");


        products.add("bread");
        products.add("garlic bread");
        products.add("pizza bread");
        products.add("bread sanwich");
        products.add("bread roll");
        products.add("bread omlett");
    }
}
