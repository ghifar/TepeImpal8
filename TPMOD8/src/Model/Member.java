/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author Firda Aminy Ma'ruf
 */
public class Member extends Akun{
    private String noMember;
    private ArrayList<Penyewaan> penyewaan;
    
    public Member(String nama, String username, String password) {
        super(nama, username, password);
    }
    
    public void sewaMobil (Penyewaan penyewaan){
        
    }

    public String getNoMember() {
        return noMember;
    }

    public void setNoMember(String noMember) {
        this.noMember = noMember;
    }

    public ArrayList<Penyewaan> getPenyewaan() {
        return penyewaan;
    }

    public void setPenyewaan(ArrayList<Penyewaan> penyewaan) {
        this.penyewaan = penyewaan;
    }
    
}
