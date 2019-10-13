package com.example.tugaslistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<ModelList>()

        list.add(ModelList("PRESIDEN INDONESIA KE 1", "Dr. Ir. H. Soekarno", R.drawable.soekarno))
        list.add(ModelList("PRESIDEN INDONESIA KE 2", "H. M. Soeharto", R.drawable.soeharto))
        list.add(ModelList("PRESIDEN INDONESIA KE 3", "B. J. Habibie", R.drawable.habibie))
        list.add(ModelList("PRESIDEN INDONESIA KE 4", "Abdurrahman Wahid", R.drawable.gusdur))
        list.add(ModelList("PRESIDEN INDONESIA KE 5", "Megawati", R.drawable.megawati))
        list.add(ModelList("PRESIDEN INDONESIA KE 6", "Soesilo Bambang Yudhoyono", R.drawable.sby))
        list.add(ModelList("PRESIDEN INDONESIA KE 7", "Joko Widodo", R.drawable.jokowi))
        listview.adapter = MyListAdapter(this, R.layout.row_list, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Presiden pertama Republik Indonesia, Soekarno yang biasa dipanggil Bung Karno, lahir di Surabaya, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970. Ayahnya bernama Raden Soekemi Sosrodihardjo dan ibunya Ida Ayu Nyoman Rai.", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "Soeharto adalah Presiden kedua Republik Indonesia. Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921. Bapaknya bernama Kertosudiro seorang petani yang juga sebagai pembantu lurah dalam pengairan sawah desa, sedangkan ibunya bernama Sukirah.", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Presiden ketiga Republik Indonesia, Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936. Beliau merupakan anak keempat dari delapan bersaudara, pasangan Alwi Abdul Jalil Habibie dan RA. Tuti Marini Puspowardojo. Habibie yang menikah dengan Hasri Ainun Habibie pada tanggal 12 Mei 1962 ini dikaruniai dua orang putra yaitu Ilham Akbar dan Thareq Kemal.", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Abdurrahman Wahid yang akrab dipanggil Gus Dur menjabat Presiden RI ke-4 mulai 20 Oktober 1999 hingga 24 Juli 2001. Beliau lahir tanggal 4 Agustus 1940 di desa Denanyar, Jombang, Jawa Timur. Gus Dur adalah putra pertama dari enam bersaudara.", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Presiden Republik Indonesia ke-5, Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947. Sebelum diangkat sebagai presiden, beliau adalah Wakil Presiden RI yang ke-8 dibawah pemerintahan Abdurrahman Wahid.", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Susilo Bambang Yudhoyono adalah presiden RI ke-6. Berbeda dengan presiden sebelumnya, beliau merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu Presiden putaran II 20 September 2004. Lulusan terbaik AKABRI (1973) yang akrab disapa SBY ini lahir di Pacitan.", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Sejak lahir pada 21 Juni 1961 di Rumah Sakit Brayat Minulyo, Joko Widodo tinggal bersama keluarganya di sebuah rumah kontrakan yang berlokasi di tepi sebuah sungai di Solo. Hidup mereka sangat sederhana.", Toast.LENGTH_LONG).show()
            }
        }
    }
}