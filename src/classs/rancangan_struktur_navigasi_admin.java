/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class rancangan_struktur_navigasi_admin {
    private String data_admin, produk, kategori;
    private int ongkir;
    
    public void setDataAdmin(String nm){
        data_admin = nm;
    }
    
    public void setProduk(String sm){
        produk = sm;        
    }
    
    public void setKategori(String km){
        kategori = km;
    }
    
    public void setOngkir(int om){
        ongkir = om;
    }
    
    public String getDataAdmin()
    {
        return data_admin;
    }       
    
    public String getProduk()
    {
        return produk;
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
