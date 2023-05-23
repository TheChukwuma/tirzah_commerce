package com.tirzah.service;


import com.tirzah.model.Product;
import com.tirzah.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public Product save(Product newProduct){
        String uuid = java.util.UUID.randomUUID().toString();
        String cat;
        switch (newProduct.getCategory()){
            case CLOTHING:
                cat="CTH";
                break;
            case ELECTRONIC:
                cat="ELT";
                break;
            case HEALTH_AND_FITNESS:
                cat="HTH";
                break;
            case COMPUTING:
                cat="COM";
                break;
            case PHONE_AND_TABLETS:
                cat="PHO";
                break;
            case REAL_ESTATE:
                cat="REA";
                break;
            default:
                cat="NON";
            
        }
        String pUUID = cat + uuid;
        newProduct.setUuid(uuid);
        Product product = productRepository.save(newProduct);
        return product;

    }
}
