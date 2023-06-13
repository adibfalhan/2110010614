/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erd;

/**
 *
 * @author HP
 */
public class Erd {
    public static void main(String[]args){
        er entity=new er();
        
        entity.kategori="merk";
        entity.pelanggan="surya";
        entity.ongkir=20000;
        
        System.out.println("kategori: " +entity.kategori);
        System.out.println("nama pelanggan: " +entity.pelanggan);
        System.out.println("harga ongkir: " +entity.ongkir);
    }
}
