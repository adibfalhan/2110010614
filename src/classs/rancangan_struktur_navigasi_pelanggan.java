/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classs;

/**
 *
 * @author HP
 */
public class rancangan_struktur_navigasi_pelanggan {
    private String produk, kategori;
    private int keranjang_belanja;
    
     public void setProduk(String qq){
        produk = qq;        
    }
    
     public void setKategori(String ww){
        kategori = ww;
    }
     
    public void setKeranjangBelanja(int rr){
        keranjang_belanja = rr;
    } 
    
    public String getProduk()
    {
        return produk;
    }
    
     public String getKategori()
    {
        return kategori;
    }        
     
      public int getKeranjangBelanja()
    {
        return keranjang_belanja;
    }        
}
