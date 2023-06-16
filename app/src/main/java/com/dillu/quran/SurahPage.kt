package com.dillu.quran

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView

class SurahPage(): AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.surah_page)
        val surahNumber:Int = intent.getIntExtra("clickedItem",0)

        val surahName = findViewById<TextView>(R.id.surah_name)
        val surahArabicName = findViewById<TextView>(R.id.surah_arabic_name)

        val transliterationSwitch = findViewById<SwitchCompat>(R.id.transliteration_switch)
//        val transliteration = findViewById<TextView>(R.id.verse_text_transliteration)
//        if(!transliterationSwitch.isChecked) {
//            transliteration.visibility = View.GONE
//        }

        if(surahNumber==0){
            surahName.text = "1. Al-Fatihah(The Opening)"
            surahArabicName.text = "سُوْرَۃُ الفَاتِحَة"

            val verses = Datasource().alFatiha()
            val versesTransliteration = Datasource().AlFatihaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }
        else if(surahNumber==1){
            surahName.text = "2. Al-Baqarah(The Cow)"
            surahArabicName.text = "سُوْرَۃُ البَقَرَة"

            val verses = Datasource().alBaqarah()
            val versesTransliteration = Datasource().AlBaqrahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber==2){
            surahName.text = "3. Aali 'Imran(The Family of Imran)"
            surahArabicName.text = "سُوْرَۃ آلِ عِمْرَان"

            val verses = Datasource().AaliImran()
            val versesTransliteration = Datasource().AlImranTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber==3) {
            surahName.text = "4.An Nisa"
            surahArabicName.text = "سُوْرَۃُ النِّسَاء"

            val verses = Datasource().AnNisa()
            val versesTransliteration = Datasource().AnNisaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 4){
            surahName.text = "5.Al Ma'idah"
            surahArabicName.text = "سُوْرَۃُ المَائِدَة"

            val verses = Datasource().AlMaidah()
            val versesTransliteration = Datasource().AlMaedaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 5){
            surahName.text = "6.Al An'am"
            surahArabicName.text = "سُوْرَۃُ الأَنْعَام"

            val verses = Datasource().AlAnam()
            val versesTransliteration = Datasource().AlAnamTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 6){
            surahName.text = "7.Al A'raf"
            surahArabicName.text = "سُوْرَۃُ الأَعْرَاف"

            val verses = Datasource().AlAraf()
            val versesTransliteration = Datasource().AlArafTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 7){
            surahName.text = "8.Al Anfal"
            surahArabicName.text = "سُوْرَۃُ الأَنْفَال"

            val verses = Datasource().AlAnfal()
            val versesTransliteration = Datasource().AlAnfalTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 8){
            surahName.text = "9.At Taubah"
            surahArabicName.text = "سُوْرَۃُ التَّوْبَة"

            val verses = Datasource().AtTaubah()
            val versesTransliteration = Datasource().AtTawbahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 9){
            surahName.text = "10.Yunus"
            surahArabicName.text = "سُوْرَۃ يُونُس"

            val verses = Datasource().Yunus()
            val versesTransliteration = Datasource().YunusTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 10){
            surahName.text = "11.Hud"
            surahArabicName.text = "سُوْرَۃ هُود"

            val verses = Datasource().Hud()
            val versesTransliteration = Datasource().HudTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 11){
            surahName.text = "12.Yusuf"
            surahArabicName.text = "سُوْرَۃ يُوسُف"

            val verses = Datasource().Yusuf()
            val versesTransliteration = Datasource().YusufTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 12){
            surahName.text = "13.Ar Rad"
            surahArabicName.text = "سُوْرَۃ الرَّعْد"

            val verses = Datasource().ArRad()
            val versesTransliteration = Datasource().ArRadTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 13){
            surahName.text = "14.Ibrahim"
            surahArabicName.text = "سُوْرَۃُ إِبْرَاهِيم"

            val verses = Datasource().Ibrahim()
            val versesTransliteration = Datasource().IbrahimTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 14){
            surahName.text = "15.Al Hijr"
            surahArabicName.text = "سُوْرَۃُ الحِجْر"

            val verses = Datasource().AlHijr()
            val versesTransliteration = Datasource().AlHijrTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 15){
            surahName.text = "16.An Nahl"
            surahArabicName.text = "سُوْرَۃُ النَّحْل"

            val verses = Datasource().AnNahl()
            val versesTransliteration = Datasource().AnNahlTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 16){
            surahName.text = "17.Al Isra"
            surahArabicName.text = "سُوْرَۃُ الإِسْرَاء"

            val verses = Datasource().AlIsra()
            val versesTransliteration = Datasource().AlIsraTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 17){
            surahName.text = "18.Al Kahf"
            surahArabicName.text = "سُوْرَۃ الكَهْف"

            val verses = Datasource().AlKahf()
            val versesTransliteration = Datasource().AlKahfTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 18){
            surahName.text = "19.Maryam"
            surahArabicName.text = "سُوْرَۃ مَرْيَم"

            val verses = Datasource().Maryam()
            val versesTransliteration = Datasource().MaryamTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 19){
            surahName.text = "20.Taha"
            surahArabicName.text = "سُوْرَۃ طٰهٰ"

            val verses = Datasource().Taha()
            val versesTransliteration = Datasource().TahaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 20){
            surahName.text = "21.Al Anbiya"
            surahArabicName.text = "سُوْرَۃُ الأَنْبِيَاء"

            val verses = Datasource().AlAnbiya()
            val versesTransliteration = Datasource().AlAnbiyaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 21){
            surahName.text = "22.AlHajj"
            surahArabicName.text = "سُوْرَۃ الحَجّ"

            val verses = Datasource().AlHajj()
            val versesTransliteration = Datasource().AlHajjTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 22){
            surahName.text = "23.AlMuminun"
            surahArabicName.text = "سُوْرَۃُ المُؤْمِنُون"

            val verses = Datasource().AlMuminun()
            val versesTransliteration = Datasource().AlMuminunTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 23){
            surahName.text = "24.An Nur"
            surahArabicName.text = "سُوْرَۃ النُّور"

            val verses = Datasource().AnNur()
            val versesTransliteration = Datasource().AnNurTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 24){
            surahName.text = "25.AlFurqan"
            surahArabicName.text = "سُوْرَۃ الفُرْقَان"

            val verses = Datasource().AlFurqan()
            val versesTransliteration = Datasource().AlFurqanTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 25){
            surahName.text = "26.Ash Shuara"
            surahArabicName.text = "سُوْرَۃُ الشُّعَرَاء"

            val verses = Datasource().AshShuara()
            val versesTransliteration = Datasource().AshShuaraTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 26){
            surahName.text = "27.An Naml"
            surahArabicName.text = "سُوْرَۃُ النَّمْل"

            val verses = Datasource().AnNaml()
            val versesTransliteration = Datasource().AnNamlTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 27){
            surahName.text = "28.Al Qasas"
            surahArabicName.text = "سُوْرَۃُ القَصَص"

            val verses = Datasource().AlQasas()
            val versesTransliteration = Datasource().AlQasasTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 28){
            surahName.text = "29.Al Ankabut"
            surahArabicName.text = "سُوْرَۃُ العَنْكَبُوت"

            val verses = Datasource().AlAnkabut()
            val versesTransliteration = Datasource().AlAnkabutTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 29){
            surahName.text = "30.Ar Rum"
            surahArabicName.text = "سُوْرَۃ الرُّوم"

            val verses = Datasource().ArRum()
            val versesTransliteration = Datasource().ArRumTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 30){
            surahName.text = "31.Luqman"
            surahArabicName.text = "سُوْرَۃ لُقْمَان"

            val verses = Datasource().Luqman()
            val versesTransliteration = Datasource().LuqmanTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 31){
            surahName.text = "32.As Sajdah"
            surahArabicName.text = "سُوْرَۃُ السَّجْدَة"

            val verses = Datasource().AsSajdah()
            val versesTransliteration = Datasource().AsSajdahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 32){
            surahName.text = "33.Al Ahzab"
            surahArabicName.text = "سُوْرَۃُ الأَحْزَاب\t"

            val verses = Datasource().AlAhzab()
            val versesTransliteration = Datasource().AlAhzabTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 33){
            surahName.text = "34.Saba"
            surahArabicName.text = "سُوْرَۃ سَبَأ"

            val verses = Datasource().Saba()
            val versesTransliteration = Datasource().SabaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 34){
            surahName.text = "35.Fatir"
            surahArabicName.text = "سُوْرَۃ فَاطِر"

            val verses = Datasource().Fatir()
            val versesTransliteration = Datasource().FatirTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 35){
            surahName.text = "36.Ya-Sin"
            surahArabicName.text = "سُوْرَۃ يٰس"

            val verses = Datasource().YaSin()
            val versesTransliteration = Datasource().YaSinTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 36){
            surahName.text = "37.As Saffat"
            surahArabicName.text = "سُوْرَۃُ الصَّافَّات"

            val verses = Datasource().AsSaffat()
            val versesTransliteration = Datasource().AsSaffatTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 37){
            surahName.text = "38.Sad"
            surahArabicName.text = "سُوْرَۃ ص"

            val verses = Datasource().Sad()
            val versesTransliteration = Datasource().SadTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 38){
            surahName.text = "39.AzZumar"
            surahArabicName.text = "سُوْرَۃُ الزُّمَر"

            val verses = Datasource().AzZumar()
            val versesTransliteration = Datasource().AzZumarTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 39){
            surahName.text = "40.Ghafir"
            surahArabicName.text = "سُوْرَۃ غَافِر"

            val verses = Datasource().Ghafir()
            val versesTransliteration = Datasource().GhafirTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 40){
            surahName.text = "41.Fussilat"
            surahArabicName.text = "سُوْرَۃ فُصِّلَت"

            val verses = Datasource().Fussilat()
            val versesTransliteration = Datasource().FussilatTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 41){
            surahName.text = "42.Ash Shura"
            surahArabicName.text = "سُوْرَۃُ الشُّورىٰ"

            val verses = Datasource().AshShura()
            val versesTransliteration = Datasource().AshShuraTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 42){
            surahName.text = "43.Az Zukhruf"
            surahArabicName.text = "سُوْرَۃُ الشُّورىٰ"

            val verses = Datasource().AzZukhruf()
            val versesTransliteration = Datasource().AzZukhrufTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 43){
            surahName.text = "44.Ad Dukhan"
            surahArabicName.text = "سُوْرَۃ الدُّخَان"

            val verses = Datasource().AdDukhan()
            val versesTransliteration = Datasource().AdDukhanTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 44){
            surahName.text = "45.Al Jaathiyah"
            surahArabicName.text = "سُوْرَۃ الجَاثِيَة"

            val verses = Datasource().AlJaathiyah()
            val versesTransliteration = Datasource().AlJaathiyahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 45){
            surahName.text = "46.Al Ahqaf"
            surahArabicName.text = "سُوْرَۃُ الأَحْقَاف"

            val verses = Datasource().AlAhqaf()
            val versesTransliteration = Datasource().AlAhqafTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 46){
            surahName.text = "47.Muhammad"
            surahArabicName.text = "سُوْرَۃ مُحَمَّد"

            val verses = Datasource().Muhammad()
            val versesTransliteration = Datasource().MuhammadTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 47){
            surahName.text = "48.Al Fath"
            surahArabicName.text = "سُوْرَۃُ الفَتْح"

            val verses = Datasource().AlFath()
            val versesTransliteration = Datasource().AlFathTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 48){
            surahName.text = "49.Al Hujurat"
            surahArabicName.text = "سُوْرَۃُ الحُجُرَات"

            val verses = Datasource().AlHujurat()
            val versesTransliteration = Datasource().AlHujuratTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 49){
            surahName.text = "50.Qaf"
            surahArabicName.text = "سُوْرَۃ ق"

            val verses = Datasource().Qaf()
            val versesTransliteration = Datasource().QafTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 50){
            surahName.text = "51.Adh Dhariyat"
            surahArabicName.text = "سُوْرَۃُ الذَّارِيَات"

            val verses = Datasource().AdhDhariyat()
            val versesTransliteration = Datasource().AdhDhariyatTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 51){
            surahName.text = "52.At Tur"
            surahArabicName.text = "سُوْرَۃ الطُّور"

            val verses = Datasource().AtTur()
            val versesTransliteration = Datasource().AtTurTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 52){
            surahName.text = "53.An Najm"
            surahArabicName.text = "سُوْرَۃُ النَّجْم"

            val verses = Datasource().AnNajm()
            val versesTransliteration = Datasource().AnNajmTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 53){
            surahName.text = "54.Al Qamar"
            surahArabicName.text = "سُوْرَۃُ القَمَر"

            val verses = Datasource().AlQamar()
            val versesTransliteration = Datasource().AlQamarTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 54){
            surahName.text = "55.Ar Rahman"
            surahArabicName.text = "سُوْرَۃ الرَّحْمَٰن"

            val verses = Datasource().ArRahman()
            val versesTransliteration = Datasource().ArRahmanTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 55){
            surahName.text = "56.Al Waqiah"
            surahArabicName.text = "سُوْرَۃُ الوَاقِعَة"

            val verses = Datasource().AlWaqiah()
            val versesTransliteration = Datasource().AlWaqiahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 56){
            surahName.text = "57.Al Hadid"
            surahArabicName.text = "سُوْرَۃُ الحَدِيد"

            val verses = Datasource().AlHadid()
            val versesTransliteration = Datasource().AlHadidTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 57){
            surahName.text = "58.Al Mujadilah"
            surahArabicName.text = "سُوْرَۃُ المُجَادِلَة"

            val verses = Datasource().AlMujadilah()
            val versesTransliteration = Datasource().AlMujadilahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 58){
            surahName.text = "59.Al Hashr"
            surahArabicName.text = "سُوْرَۃُ الحَشْر"

            val verses = Datasource().AlHashr()
            val versesTransliteration = Datasource().AlHashrTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 59){
            surahName.text = "60.Al Mumtahanah"
            surahArabicName.text = "سُوْرَۃُ المُمْتَحَنَة"

            val verses = Datasource().AlMumtahanah()
            val versesTransliteration = Datasource().AlMumtahanahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 60){
            surahName.text = "61.As Saff"
            surahArabicName.text = "سُوْرَۃُ الصَّفّ"

            val verses = Datasource().AsSaff()
            val versesTransliteration = Datasource().AsSaffTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 61){
            surahName.text = "62.Al Jumu'ah"
            surahArabicName.text = "سُوْرَۃُ الجُمُعَة"

            val verses = Datasource().AlJumuah()
            val versesTransliteration = Datasource().AlJumuahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 62){
            surahName.text = "63.Al Munafiqun"
            surahArabicName.text = "سُوْرَۃُ المُنَافِقُون"

            val verses = Datasource().AlMunafiqun()
            val versesTransliteration = Datasource().AlMunafiqunTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 63){
            surahName.text = "64.At Taghabun"
            surahArabicName.text = "سُوْرَۃُ التَّغَابُن"

            val verses = Datasource().AtTaghabun()
            val versesTransliteration = Datasource().AtTaghabunTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 64){
            surahName.text = "65.At Talaq"
            surahArabicName.text = "سُوْرَۃُ الطَّلَاق"

            val verses = Datasource().AtTalaq()
            val versesTransliteration = Datasource().AtTalaqTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 65){
            surahName.text = "66.At Tahrim"
            surahArabicName.text = "سُوْرَۃُ التَّحْرِيم"

            val verses = Datasource().AtTahrim()
            val versesTransliteration = Datasource().AtTahrimTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 66){
            surahName.text = "67.Al Mulk"
            surahArabicName.text = "سُوْرَۃُ المُلْك"

            val verses = Datasource().AlMulk()
            val versesTransliteration = Datasource().AlMulkTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 67){
            surahName.text = "68.Al Qalam"
            surahArabicName.text = "سُوْرَۃ القَلَم"

            val verses = Datasource().AlQalam()
            val versesTransliteration = Datasource().AlQalamTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 68){
            surahName.text = "69.Al Haqqah"
            surahArabicName.text = "سُوْرَۃ الحَاقَّة"

            val verses = Datasource().AlHaqqah()
            val versesTransliteration = Datasource().AlHaqqahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 69){
            surahName.text = "70.Al Maarij"
            surahArabicName.text = "سُوْرَۃُ المَعَارِج"

            val verses = Datasource().AlMaarij()
            val versesTransliteration = Datasource().AlMaarijTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 70){
            surahName.text = "71.Nuh"
            surahArabicName.text = "سُوْرَۃ نُوح"

            val verses = Datasource().Nuh()
            val versesTransliteration = Datasource().NuhTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 71){
            surahName.text = "72.Al Jinn"
            surahArabicName.text = "سُوْرَۃُ الجِنّ"

            val verses = Datasource().AlJinn()
            val versesTransliteration = Datasource().AlJinnTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 72){
            surahName.text = "73.Al Muzzammil"
            surahArabicName.text = "سُوْرَۃُ المُزَّمِّل"

            val verses = Datasource().AlMuzzammil()
            val versesTransliteration = Datasource().AlMuzzammilTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 73){
            surahName.text = "74.Al Muddaththir"
            surahArabicName.text = "سُوْرَۃُ المُدَّثِّر"

            val verses = Datasource().AlMuddaththir()
            val versesTransliteration = Datasource().AlMuddaththirTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 74){
            surahName.text = "75.Al Qiyamah"
            surahArabicName.text = "سُوْرَۃُ القِيَامَة"

            val verses = Datasource().AlQiyamah()
            val versesTransliteration = Datasource().AlQiyamahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 75){
            surahName.text = "76.Al Insaan"
            surahArabicName.text = "سُوْرَۃُ الإِنْسَان"

            val verses = Datasource().AlInsaan()
            val versesTransliteration = Datasource().AlInsaanTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 76){
            surahName.text = "77.Al Mursalaat"
            surahArabicName.text = "سُوْرَۃُ المُرْسَلَات"

            val verses = Datasource().AlMursalaat()
            val versesTransliteration = Datasource().AlMursalaatTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 77){
            surahName.text = "78.An Naba"
            surahArabicName.text = "سُوْرَۃُ النَّبَأ"

            val verses = Datasource().AnNaba()
            val versesTransliteration = Datasource().AnNabaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 78){
            surahName.text = "79.An Naziat"
            surahArabicName.text = "سُوْرَۃُ النَّازِعَات"

            val verses = Datasource().AnNaziat()
            val versesTransliteration = Datasource().AnNaziatTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 79){
            surahName.text = "80.Abasa"
            surahArabicName.text = "سُوْرَۃ عَبَسَ"

            val verses = Datasource().Abasa()
            val versesTransliteration = Datasource().AbasaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 80){
            surahName.text = "81.At Takweer"
            surahArabicName.text = "سُوْرَۃُ التَّكْوِير"

            val verses = Datasource().AtTakweer()
            val versesTransliteration = Datasource().AtTakweerTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 81){
            surahName.text = "82.Al Infitar"
            surahArabicName.text = "سُوْرَۃُ الإِنْفِطَار"

            val verses = Datasource().AlInfitar()
            val versesTransliteration = Datasource().AlInfitarTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 82){
            surahName.text = "83.Al Mutaffifin"
            surahArabicName.text = "سُوْرَۃُ المُطَفِّفِين"

            val verses = Datasource().AlMutaffifin()
            val versesTransliteration = Datasource().AlMutaffifinTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 83){
            surahName.text = "84.Al Inshiqaaq"
            surahArabicName.text = "سُوْرَۃُ الإِنْشِقَاق"

            val verses = Datasource().AlInshiqaaq()
            val versesTransliteration = Datasource().AlInshiqaaqTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 84){
            surahName.text = "85.Al Buruj"
            surahArabicName.text = "سُوْرَۃُ البُرُوج"

            val verses = Datasource().AlBuruj()
            val versesTransliteration = Datasource().AlBurujTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 85){
            surahName.text = "86.At Tariq"
            surahArabicName.text = "سُوْرَۃُ الطَّارِق"

            val verses = Datasource().AtTariq()
            val versesTransliteration = Datasource().AtTariqTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 86){
            surahName.text = "87.Al Ala"
            surahArabicName.text = "سُوْرَۃُ الأَعْلَىٰ"

            val verses = Datasource().AlAla()
            val versesTransliteration = Datasource().AlAlaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 87){
            surahName.text = "88.Al Ghaashiyah"
            surahArabicName.text = "سُوْرَۃُ الغَاشِيَة"

            val verses = Datasource().AlGhaashiyah()
            val versesTransliteration = Datasource().AlGhaashiyahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 88){
            surahName.text = "89.Al Fajr"
            surahArabicName.text = "سُوْرَۃُ الفَجْر"

            val verses = Datasource().AlFajr()
            val versesTransliteration = Datasource().AlFajrTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 89){
            surahName.text = "90.Al Balad"
            surahArabicName.text = "سُوْرَۃُ البَلَد"

            val verses = Datasource().AlBalad()
            val versesTransliteration = Datasource().AlBaladTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 90){
            surahName.text = "91.As Shams"
            surahArabicName.text = "سُوْرَۃُ الشَّمْس"

            val verses = Datasource().AsShams()
            val versesTransliteration = Datasource().AsShamsTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 91){
            surahName.text = "92.Al Lail"
            surahArabicName.text = "سُوْرَۃُ اللَّيْل"

            val verses = Datasource().AlLail()
            val versesTransliteration = Datasource().AlLailTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 92){
            surahName.text = "93.Ad Duhaa"
            surahArabicName.text = "سُوْرَۃُ الضُّحَىٰ"

            val verses = Datasource().AdDuhaa()
            val versesTransliteration = Datasource().AdDuhaaTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 93){
            surahName.text = "94.Ash Sharh"
            surahArabicName.text = "سُوْرَۃُ الشَّرْح"

            val verses = Datasource().AshSharh()
            val versesTransliteration = Datasource().AshSharhTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 94){
            surahName.text = "95.At Tin"
            surahArabicName.text = "سُوْرَۃُ التِّين"

            val verses = Datasource().AtTin()
            val versesTransliteration = Datasource().AtTinTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 95){
            surahName.text = "96.Al Alaq"
            surahArabicName.text = "سُوْرَۃُ العَلَق"

            val verses = Datasource().AlAlaq()
            val versesTransliteration = Datasource().AlAlaqTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 96){
            surahName.text = "97.Al Qadr"
            surahArabicName.text = "سُوْرَۃُ القَدْر"

            val verses = Datasource().AlQadr()
            val versesTransliteration = Datasource().AlQadrTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 97){
            surahName.text = "98.Al Bayyinah"
            surahArabicName.text = "سُوْرَۃُ البَيِّنَة"

            val verses = Datasource().AlBayyinah()
            val versesTransliteration = Datasource().AlBayyinahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 98){
            surahName.text = "99.Az Zalzalah"
            surahArabicName.text = "سُوْرَۃُ الزَّلْزَلَة"

            val verses = Datasource().AzZalzalah()
            val versesTransliteration = Datasource().AzZalzalahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 99){
            surahName.text = "100.Al Adiyat"
            surahArabicName.text = "سُوْرَۃُ العَادِيَات"

            val verses = Datasource().AlAdiyat()
            val versesTransliteration = Datasource().AlAdiyatTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 100){
            surahName.text = "101.Al Qaariah"
            surahArabicName.text = "سُوْرَۃُ القَارِعَة"

            val verses = Datasource().AlQaariah()
            val versesTransliteration = Datasource().AlQaariahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 101){
            surahName.text = "102.At Takathur"
            surahArabicName.text = "سُوْرَۃُ التَّكَاثُر"

            val verses = Datasource().AtTakathur()
            val versesTransliteration = Datasource().AtTakathurTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 102){
            surahName.text = "103.Al Asr"
            surahArabicName.text = "سُوْرَۃُ العَصْر"

            val verses = Datasource().AlAsr()
            val versesTransliteration = Datasource().AlAsrTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 103){
            surahName.text = "104.Al Humazah"
            surahArabicName.text = "سُوْرَۃُ الهُمَزَة"

            val verses = Datasource().AlHumazah()
            val versesTransliteration = Datasource().AlHumazahTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 104){
            surahName.text = "105.Al Fil"
            surahArabicName.text = "سُوْرَۃُ الفِيل"

            val verses = Datasource().AlFil()
            val versesTransliteration = Datasource().AlFilTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 105){
            surahName.text = "106.Quraish"
            surahArabicName.text = "سُوْرَۃ قُرَيْش"

            val verses = Datasource().Quraish()
            val versesTransliteration = Datasource().QuraishTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 106){
            surahName.text = "107.Al Maaoon"
            surahArabicName.text = "سُوْرَۃُ المَاعُون"

            val verses = Datasource().AlMaaoon()
            val versesTransliteration = Datasource().AlMaaoonTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 107){
            surahName.text = "108.Al Kawthar"
            surahArabicName.text = "سُوْرَۃُ الكَوْثَر"

            val verses = Datasource().AlKawthar()
            val versesTransliteration = Datasource().AlKawtharTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 108){
            surahName.text = "109.Al Kafirun"
            surahArabicName.text = "سُوْرَۃُ الكَافِرُون"

            val verses = Datasource().AlKafirun()
            val versesTransliteration = Datasource().AlKafirunTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 109){
            surahName.text = "110.An Nasr"
            surahArabicName.text = "سُوْرَۃُ النَّصْر"

            val verses = Datasource().AnNasr()
            val versesTransliteration = Datasource().AnNasrTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 110){
            surahName.text = "111.Al Masad"
            surahArabicName.text = "سُوْرَۃُ المَسَد"

            val verses = Datasource().AlMasad()
            val versesTransliteration = Datasource().AlMasadTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 111){
            surahName.text = "112.Al Ikhlas"
            surahArabicName.text = "سُوْرَۃُ الإِخْلَاص"

            val verses = Datasource().AlIkhlas()
            val versesTransliteration = Datasource().AlIkhlasTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 112){
            surahName.text = "113.Al Falaq"
            surahArabicName.text = "سُوْرَۃُ الفَلَق"

            val verses = Datasource().lFalaq()
            val versesTransliteration = Datasource().AlFalaqTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }

        else if(surahNumber == 113){
            surahName.text = "114.An Nas"
            surahArabicName.text = "سُوْرَۃُ النَّاس"

            val verses = Datasource().AnNas()
            val versesTransliteration = Datasource().AnNasTransliteration()

            val recyclerViewVerses = findViewById<RecyclerView>(R.id.recycler_view_verses)
            recyclerViewVerses.adapter = SurahRecyclerViewAdapter(this, surahNumber, verses, versesTransliteration)
            recyclerViewVerses.setHasFixedSize(true)
        }


    }
}

