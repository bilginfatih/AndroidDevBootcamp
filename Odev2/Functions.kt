package com.fatihbilgin.kotlindersleri.Odev2

class Functions {

    // ----Birinci Soru Fonksiyon----
    fun hesaplaIcAci(kenarSayisi: Int): Int {
        /**
         * Girilen kenar sayısına göre bir çokgenin bir iç açısını hesaplayan fonksiyon.
         * @param kenarSayisi Çokgenin kenar sayısı
         * @return Eğer kenar sayısı >= 3 ise her bir iç açının ölçüsünü döner, aksi halde 0 döner.
         */
         if (kenarSayisi > 2) {
             return ((kenarSayisi - 2) * 180) / kenarSayisi
        } else {
            return 0
        }
    }

    // ----İkinci Soru Fonksiyon----
    fun hesaplaMaas(gunSayisi: Int) : Int {
        /**
         * Girilen gün sayısına göre maaşı hesaplayan metod.
         * @param gunSayisi Çalışma gün sayısı
         * @return Hesaplanan maaş
         */
        val toplamSaat = gunSayisi * 8
        val saatUcret = 40
        val mesaiUcret = 80
        val mesaiLimit = 150

         if (toplamSaat <= mesaiLimit) {
                return toplamSaat * saatUcret
            } else {
                val mesaiSaat = toplamSaat - mesaiLimit
               return (mesaiLimit * saatUcret) + (mesaiSaat * mesaiUcret)
            }
    }

    // ----Ucuncu Soru Fonksiyon----
    fun hesaplaOtoparkUcret(otoparkSure : Int) : Int{
        /**
         * Girilen süreye göre otopark ücretini hesaplayan metot.
         * @param otoparkSure Otoparkta kalınan süre
         * @return Hesaplanan otopark ücreti
         */
        val ilkSaatUcreti = 50
        val ekSaatUcreti = 10

         if (otoparkSure <= 1) {
             return  ilkSaatUcreti
        } else {
             return  ilkSaatUcreti + ((otoparkSure - 1) * ekSaatUcreti)
        }
    }

    // ----Dorduncu Soru Fonksiyon----
    fun kmToMiles(kilometre: Double): Double {
        return kilometre * 0.621
    }

    // ----Besinci Soru Fonksiyon----
    fun dikdortgenAlani(kenar1: Int, kenar2: Int): Int {
        return kenar1 * kenar2
    }

    // ----Altıncı Soru Fonksiyon----
    fun faktoriyel(sayi: Int): Long {
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    // ----Yedinci Soru Fonksiyon----
    fun sayEHarfi(kelime: String): Int {
        return kelime.count { it == 'e' || it == 'E' }
    }

}