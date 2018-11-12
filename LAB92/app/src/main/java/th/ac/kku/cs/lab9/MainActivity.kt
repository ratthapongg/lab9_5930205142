package th.ac.kku.cs.lab9

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickRegis(view: View){
        val mID = idEDT.text.toString()
        val mFirstname = firstnameEDT.text.toString()
        val mLastname = lastnameEDT.text.toString()
        val i = Intent(applicationContext, SecondActivity::class.java)
        i.putExtra("pID",mID)
        i.putExtra("pFirstname",mFirstname)
        i.putExtra("pLastname",mLastname)
        startActivity(i)
    }
}