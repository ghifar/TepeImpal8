/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author abu
 */
public class Sewa24Jam implements StrategiPenyewaan{

    @Override
    public double kalkulasiBiaya(long biaya) {
        double total = biaya*20/100;//diskon20persen
        return total;
    }
    
}
