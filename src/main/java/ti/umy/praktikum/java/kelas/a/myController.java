/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.praktikum.java.kelas.a;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.myService;

/**
 *
 * @author Dedi Wardani
 */



@Controller
public class myController {
    
    @RequestMapping("/show") //nama path atau url
    public String getView(){
        
        return "myprofile";
    }
    
    @RequestMapping("/showdata")
   // @ResponseBody 
    public String getdata(Model kurir){
        
        myService getserv = new myService();
        
        ArrayList<List<String>> isipaket = new ArrayList<>();
        
        isipaket = getserv.myData();
        
        kurir.addAttribute("namapaket", isipaket);//proses pengiriman
                
        return "viewproduct"; //Halaman Tujuan
    }
    
}
