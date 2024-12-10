package com.fatihbilgin.kotlindersleri.Odev2

fun main() {

    // ----Birinci Soru----
    val kenarSayisi = 4
    val icAci = Functions().hesaplaIcAci(kenarSayisi = kenarSayisi)
    // Kenar sayısı 3'ten büyükse sonucu yazdırılır, aksi halde uyarı mesajı gösterilir.
    println(if (kenarSayisi > 2) "Birinci Soru: $icAci" else "Kenar sayısı en az 3 olmalıdır.")

    // ----İkinci Soru----
    val gunSayisi = 15
    val maas = Functions().hesaplaMaas(gunSayisi)
    println("İkinci Soru: $maas ₺")

    // ----Ucuncu Soru----
    val otoparkSure = 3
    val ucret = Functions().hesaplaOtoparkUcret(otoparkSure)
    println("Ucuncu Soru: $ucret ₺")

    // ----Dorduncu Soru----
    val kilometre = 10.0
    val mil = Functions().kmToMiles(kilometre)
    println("Dorduncu Soru: $mil mil")

    //----Besinci Soru----
    val kenar1 = 5
    val kenar2 = 10
    val alan = Functions().dikdortgenAlani(kenar1, kenar2)
    println("Besinci Soru: $alan")

    //----Altıncı Soru----
    val sayi = 5
    val fakt = Functions().faktoriyel(sayi)
    println("Altıncı Soru: $fakt")

    //----Yedinci Soru----
    val kelime = "EKSELANS"
    val eSayisi = Functions().sayEHarfi(kelime)
    println("Yedinci Soru: $eSayisi adet 'e' harfi var.")

}