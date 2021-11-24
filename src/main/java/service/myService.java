/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Dedi Wardani
 */

public class myService {
    
    public ArrayList<List<String>> myData(){
        
        ArrayList<List<String>> tabel = new ArrayList<>();
        
        tabel.add(Arrays.asList("Speaker","Soni"));
        tabel.add(Arrays.asList("Headphone","Gbl"));
        tabel.add(Arrays.asList("Router","cisci"));
        tabel.add(Arrays.asList("Switch","Microtak"));
        
        return tabel;
    }
    
}
