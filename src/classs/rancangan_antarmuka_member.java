/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classs;

/**
 *
 * @author HP
 */
public class rancangan_antarmuka_member {
    private String produk, kategori;
    private int pembayaran;
    
     public void setProduk(String qq){
        produk = qq;        
    }
    
     public void setKategori(String ww){
        kategori = ww;
    }
     
    public void setPembayaran(int rr){
        pembayaran = rr;
    } 
    
    public String getProduk()
    {
        return produk;
    }
    
     public String getKategori()
    {
        return kategori;
    }        
     
      public int getPembayaran()
    {
        return pembayaran;
    }        
}
