package com.example.demo.controller;

import com.example.demo.dto.requests.Items;
import com.example.demo.dto.requests.ProductRequest;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ProductController
 * This controller exposes REST APIs for managing products.
 * The application uses an in-memory data store (ArrayList),
 * so data is NOT persisted after application restart.
 */
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    /**
     * Create a new product item.
     *
     * @param productRequest request body containing product details
     * @return ProductResponse indicating success or failure
     *
     * URL: POST /items
     */
    @PostMapping("/items")
    public ProductResponse createItems(@Valid @RequestBody ProductRequest productRequest){
        return productService.addProductItems(productRequest);
    }

    /**
     * Fetch all product items stored in memory.
     *
     * @return list of all items
     *
     * URL: GET /get/all/items
     */
    @GetMapping("get/all/items")
    public List<Items> getAllItems(){
        return productService.getAllProductItems();
    }

    /**
     * Fetch a product item by product ID.
     *
     * @param productId product identifier
     * @return matching Items object
     *
     * URL: GET /get/by/{product_id}
     */
    @GetMapping("get/by/{product_id}")
    public Items getByProductId( @PathVariable("product_id") Integer productId){
        return productService.getByProductId(productId);
    }

}
