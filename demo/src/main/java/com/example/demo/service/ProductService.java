package com.example.demo.service;

import com.example.demo.dto.requests.Items;
import com.example.demo.dto.requests.ProductRequest;
import com.example.demo.dto.response.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ArrayList<Items> items = new ArrayList<>();

    public ProductResponse addProductItems(ProductRequest productRequest){
        Items productItem= Items.builder().id(productRequest.getProductId()).name(productRequest.getName()).description(productRequest.getDescription()).build();
        items.add(productItem);
        return ProductResponse.builder().success(true).message("product added successfully").build();
    }

    public List<Items> getAllProductItems(){
        if(!items.isEmpty()){
            return items;
        }
        return null;
    }

    public Items getByProductId(Integer productId){
        return items.stream().filter(x->x.getId().equals(productId))
                .findFirst().orElseThrow();
    }
}
