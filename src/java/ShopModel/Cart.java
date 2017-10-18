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
public class Cart {
    
    private List<Product> produk;

    public Cart() {
        this.produk = new ArrayList<>();
    }

    /**
     * @return the produk
     */
    public List<Product> getProduk() {
        return produk;
    }

    /**
     * @param produk the produk to set
     */
    public void setProduk(List<Product> produk) {
        this.produk = produk;
    }
    
    
}
