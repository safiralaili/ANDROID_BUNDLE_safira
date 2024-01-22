package com.example.android_bundle_safira

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity() : AppCompatActivity(), Parcelable {
    private lateinit var namaEdit: EditText
    private lateinit var umurEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY: String = "nama"
    private val AGE_KEY: String = "umur"
    private val CLASS_KEY: String = "kelas"

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        umurEdit = findViewById(R.id.umurEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        submitBtn = findViewById(R.id.submitBtn)

        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(AGE_KEY, umurEdit.text.toString())
            intent.putExtra(CLASS_KEY, kelasEdit.text.toString())
            startActivity(intent)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        private fun MainActivity(parcel: Parcel): MainActivity {

            return TODO("Provide the return value")
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}

class MainActivity2 {

}

