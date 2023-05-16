/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classs;

/**
 *
 * @author HP
 */
public class logical_relational_structure {
    private String pelanggan, kategori;
    private int ongkir;
    
     public void setPelanggan(String qq){
        pelanggan = qq;        
    }
    
     public void setKategori(String ww){
        kategori = ww;
    }
     
    public void setOngkir(int rr){
        ongkir = rr;
    } 
    
    public String getPelanggan()
    {
        return pelanggan;
    }
    
     public String getKategori()
    {
        return kategori;
    }        
     
      public int getOngkir()
    {
        return ongkir;
    }        
}
