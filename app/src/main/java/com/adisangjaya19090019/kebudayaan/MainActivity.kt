package com.adisangjaya19090019.kebudayaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.gobaksodor,"Gobak Sodor","Indonesia","Arti Gobak Sodor" +
                " Gopak Sodor diambil dari dua kata, yakni gobak dan sodor. Menurut Kamus Besar Bahasa Indonesia (KBBI), gobak artinya permainan tradisional yang menggunakan lapangan berbentuk segi empat berpetak-petak. " +
                "Setiap garis dijaga oleh pihak penjaga, pihak yang masuk harus melewati garis dan jika kena sentuh oleh penjaga maka harus diganti. " +
                "Kata Sodor artinya menyodorkan ke depan atau mengulurkan tangan. Petugas yang berjaga menyodorkan badan dan tangannya bertugas untuk menyentuh pihak yang mencoba melewati garis."))

        data?.add(DataModel(R.drawable.layanglayang,"layang Layang","Indoneasia", "Salah satu macam permainan tradisional yang sangat populer di Indonesia ialah layang-layang. Permainan ini bisanya dilakukan di tempat-tempat terbuka, seperti lapangan hingga persawahan. " +
                "Seiring berjalannya waktu, bentuk layang-layang juga semakin berkembang, seperti bentuk burung, naga, hingga perahu." +
                "Tak hanya dilakukan anak-anak, orang dewasa pun cukup gemar bermain layang-layang. Apalagi saat musim kemarau tiba, hampir di berbagai daerah dapat ditemui orang-orang yang bermain layang-layang."))

        data?.add(DataModel(R.drawable.engrang,"Engrang","Indonesia", "Egrang merupakan salah satu macam permainan tradisional yang menggunakan batang bambu. " +
                "Permainan ini diperlukan keahlian khusus, pasalnya menaiki egrang tidak semudah yang dibayangkan. Sehingga bagi para pemula, sebelum berjalan menggunakan egrang sebaiknya berlatih menaiki egrang terlebih dahulu. " +
                "Apabila seseorang telah berhasil berjalan menggunakan egrang, biasanya mereka akan melakukan lomba lari di atas egrang. Sehingga permainan ini akan terlihat semakin menarik dan seru. "))

        data?.add(DataModel(R.drawable.congklak,"Congkla","Indonesia", "Congklak sudah dikenal hampir di seluruh wilayah Indonesia. " +
                "Congklak dimainkan menggunakan cangkang kerang yang juga disebut biji congklak dan papan congklak yang memiliki 16 lubang. Permainan ini hanya bisa dimainkan oleh dua orang saja. " +
                "Total keseluruhan biji congklak ada 98 buah yang nanti akan diisi pada lubang papan congklak. "))

        data?.add(DataModel(R.drawable.panggalan,"Panggalan/Gangsing","Indonesia", "dalah permainan zaman kuno yang masih ada hingga saat ini. Bentuknya seperti bola yang ditengahnya terdapat tali yang dililitkan dan diikat pusatnya." +
                "Jika tali dilempar dengan benar maka gasing akan memutar seimbang. " +
                "Permainan ini tidak sulit namun butuh kekuatan untuk melemparnya, karena jika ragu untuk melempar maka gasing bisa cepat jatuh."))

        data?.add(DataModel(R.drawable.pletekon,"Pakpakdor/Pletekon","Indonesia", "Pletekan hanya bisa ditemukan didaerah karena saat ini sudah jarang yang memainkan pletokkan. " +
                "Permainan ini terbuat dari bambu yang kuat agar tidak gampang pecah. Setelah itu bambu dibagi menjadi dua kemudian buat peluru menggunakan kertas yang dilitikan dan dibuat seperti bola. " +
                "Kemudian tambahkan daun pandan agar suaranya menjadi nyaring. Seteah semua bahan tersedia, lakukan penembakan ke arah lahan kosong."))

        data?.add(DataModel(R.drawable.ularnaga,"Ular Naga","Indonesia", "Permainan selanjutnya ada ular naga. Pada zaman dahulu permainan ini sangat digemari oleh anak~anak umur lima sampai dua belas tahun.  " +
                "Permainan ini lebih baik dilakukan di lapangan, karena semakin banyak pemain akan semakin seru. Biasanya permainan ini dilakukan lebih dari tujuh orang. Cara bermainnya dengan menentukan siapa yang menjadi penjaga dua orang dan sisanya berjalan melewati penjaga. " +
                "Untuk memilih penjaga, harus melakukan hompimpa agar lebih adil." + "/n"))

        data?.add(DataModel(R.drawable.jeblugan,"Jeblugan","Indonesia", "Permainan ini biasanya hanya dilakukan oleh anak-anak di bulan menjelang puasa. " +
                "Permainan ini juga biasa disebut meriam karena suaranya cukup keras. " +
                "Permainan ini kini sudah jarang dimainkan oleh anak-anak apalagi di zaman yang sudah modern seperti sekarang."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", itegit commit -m "first commit"am?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("daerah", item?.daerah)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}