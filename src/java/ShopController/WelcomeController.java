/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopController;

import ShopModel.Cart;
import ShopModel.Product;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/Welcome")
public class WelcomeController {

    @RequestMapping()
    public String welcome(Model model){
        
        Product p = new Product(1,"Mesin Cuci", 800000, 3L, "mesincuci.jpg");
        Product p1 = new Product(2,"Lemari", 500000, 2, "lemari.jpg");
        Product p2 = new Product(3,"TV", 12000, 1200000, "tv.jpg");
        Product p3 = new Product(4,"Kulkas", 2000000, 3, "kulkas.jpg");
        Cart cart = new Cart();
        cart.getProduk().add(p);
        cart.getProduk().add(p1);
        cart.getProduk().add(p2);
        cart.getProduk().add(p3);
        
        
    model.addAttribute("msg", "Selamat Datang Di Website ini");
    model.addAttribute("msg1", "---Shopping day Harga Termurah SeAsia---");
    model.addAttribute("tes", cart);
    
    return "Welcome";
    }
    
   
     
    
}

