/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author abu
 */
public class Aplikasi {
     private FileIO database;//load dari fileIO
    
      public void loadKategori() throws IOException, ClassNotFoundException{
        listKategori= (ArrayList<Kategori>) database.getObject("kategori.dat");
    }//get object loaddari fileIO database
    
    public void saveKategori() throws IOException{
        database.saveObject(listKategori, "kategori.dat");
    }//same with load kategori
            
    
}
