/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author abu
 */
public class Controller implements ActionListener{
    
    Aplikasi app;
    
    viewRegister vRegister;
    viewMenuUtama vMenuUtama;
    RiwayatPenyewaan vRiwayatPenyewaan;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class ControllerLogin implements ActionListener{
        viewLogin vLogin;
        Aplikasi app;
        public ControllerLogin(Aplikasi app){
            this.vLogin= new viewLogin();
            this.vLogin.setVisible(true);
            this.app = app;
            
            this.vLogin.getLogin().addActionListener(this);
            this.vLogin.getRegister().addActionListener(this);
//            this.vLogin.getPassword().addActionListener(this);
//            this.vLogin.getUsername().addActionListener(this);text mah gausah bro
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object x= e.getSource();
            if(x.equals(vLogin.getLogin())){
                String nama = vLogin.getUsername().getText();
                String password = vLogin.getPassword().getText();
                if(nama.equals(app.findMember(nama)) && password.equals(app.findMemberP(password))){
                    ControllerMenuUtama cmu = new ControllerMenuUtama(app);
                    this.vLogin.setVisible(false);
                }
            }else if(x.equals(vLogin.getRegister())){
                ControllerRegister cr= new ControllerRegister(app);
                this.vLogin.setVisible(false);
                
            }
        }
    }//endcontrollerlogin
    
    
    public class ControllerRegister implements ActionListener{
        viewRegister vRegister;
        Aplikasi app;
        
        public ControllerRegister(Aplikasi app){
            this.vRegister = new viewRegister();
            this.vRegister.setVisible(true);
            this.app= app;
            
            this.vRegister.getKembali().addActionListener(this);
            this.vRegister.getRegister().addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object x = e.getSource();
            if(x.equals(vRegister.getKembali())){
                this.vRegister.setVisible(false);
            }
            else if(x.equals(vRegister.getRegister())){
                String nama= vRegister.getNama().getText();
                String username= vRegister.getUsername().getText();
                String password= vRegister.getPassword().getText();
                String uPassword = vRegister.getUlangpassword().getText();
                if(password == uPassword){
                    app.createAkun(nama, username, password);
                    JOptionPane.showMessageDialog(null, "Akun Berhasil Ditambahkan!!!!!");
                } else{
                    JOptionPane.showMessageDialog(null, "password tidak match gan!!!");
                }
                
            }
            
            else if(x.equals(vRegister.getKembali())){
                this.vRegister.setVisible(false);
                ControllerLogin cl= new ControllerLogin(app);
                
                
            }
        }
    }//endcontrollerRegister
    
    
    public class ControllerMenuUtama implements ActionListener{
        viewMenuUtama vMenuUtama;
        Aplikasi app;
        
        public ControllerMenuUtama(Aplikasi app){
            this.vMenuUtama= new viewMenuUtama();
            this.vMenuUtama.setVisible(true);
            this.app= app;
            
            this.vMenuUtama.getPenyewaan().addActionListener(this);
            this.vMenuUtama.getLihatRiwayatPenyewaan().addActionListener(this);
            this.vMenuUtama.getLogout().addActionListener(this);
        }
        
        
        

        @Override
        public void actionPerformed(ActionEvent e) {
            Object x = e.getSource();
        }
        
    }
    
    
    
}
