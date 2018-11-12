package th.ac.kku.cs.lab9

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val mID = intent.getStringExtra("pID")
        val mFirstname = intent.getStringExtra("pFirstname")
        val mLastname = intent.getStringExtra("pLastname")
        this.idText.text ="ID: "+ mID
        this.firstText.text ="Firstname: "+ mFirstname
        this.lastText.text ="Lastname: "+mLastname
    }
    fun onClickClose(view: View){
        finish()
    }
}