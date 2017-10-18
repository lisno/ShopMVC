/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */

public class Product {
    
    private Integer productId;
    private String name;
    private double harga;
    private long quantity;
    private String image;
    private Cart cart;
    
    

    public Product() {
    }

    public Product(Integer productId, String name, double harga, long quantity, String image) {
        this.productId = productId;
        this.name = name;
        this.harga = harga;
        this.quantity = quantity;
        this.image = image;
       
    }
    

   


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return the quantity
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }     
     
    
    public List<Product> getAllProd(){
        
        List<Product> prod = new ArrayList<>();
        for (Product product : prod) {
            
        }
        return prod;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the cart
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * @param cart the cart to set
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    /**
     * @return the productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
     
    
}
