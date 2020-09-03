/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev2;

public class RastgeleKarakter {
    
    private int RastgeleSayiUreteci(int minimumDeger, int maksimumDeger)
    {
        int bulunanSayi = minimumDeger + (int)(System.nanoTime()%((maksimumDeger - minimumDeger) + 1));
        return bulunanSayi;
    }
    
    private boolean BuyukVeyaKucukSec()
    {
        int buyukVeyaKucuk = RastgeleSayiUreteci(0,1);
        if(buyukVeyaKucuk==1) return true;
        else return false;
    }
    
    private char BuyukHarfUreteci()
    {
        char[] buyukHarfler = new char[]{'A','B','C','D','E','F','G','H','I',
                                        'J','K','L','M','N','O','P','Q','R','S',
                                        'T','U','V','W','X','Y','Z'};
        return buyukHarfler[RastgeleSayiUreteci(0,25)];
    }
    
    private char KucukHarfUreteci()
    {
        char[] kucukHarfler = new char[]{'a','b','c','d','e','f','g','h','i',
                                        'j','k','l','m','n','o','p','q','r','s',
                                        't','u','v','w','x','y','z'};
        
        return kucukHarfler[RastgeleSayiUreteci(0,25)];
    
    }
    
    private char RastgeleHarfUreteci()
    {
        char uretilenHarf;
        boolean buyukMuKucukMu = BuyukVeyaKucukSec();
        if (buyukMuKucukMu) uretilenHarf = BuyukHarfUreteci();
        else uretilenHarf = KucukHarfUreteci();
        return uretilenHarf;
    }
    
    
    
    //////////////////////////////////
    public String HarfveyaKelimeUret(int uretilecekHarfSayisi)
    {
        String uretilenHarfler="";
        for(int i=0; i<uretilecekHarfSayisi; i++)
        {
            uretilenHarfler += RastgeleHarfUreteci();
        }
        return uretilenHarfler;
    }
    
    public String AralıktanHarfUreteci(char solHarf, char sagHarf, int kacTaneAlinacak)
    {
        String rastgeleSecilenHarf = "";
        for(int i=0; i<kacTaneAlinacak; i++)
        {
            rastgeleSecilenHarf += (char)RastgeleSayiUreteci((int)solHarf, (int)sagHarf);
        }
                return rastgeleSecilenHarf;
    }
    
   
    public String VerilenDizidenHarfUreteci(char[] harfDizisi, int kacTaneAlinacak)
    {
        String alinanKarakterler = "";
        for(int i=0; i<kacTaneAlinacak; i++)
        {
            alinanKarakterler+=harfDizisi[RastgeleSayiUreteci(0,harfDizisi.length-1)];
        }
        return alinanKarakterler;
    }
    
    public String CumleUret(int cumleUzunlugu, int kelimeHarfUzunlugu)
    {
        String uretilenCumle = "";
        for(int i=0; i<cumleUzunlugu; i++)
        {
            uretilenCumle += HarfveyaKelimeUret(kelimeHarfUzunlugu) + " ";
        }
        return uretilenCumle;
    }
}
