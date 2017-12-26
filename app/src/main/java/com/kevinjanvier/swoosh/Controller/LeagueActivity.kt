package com.kevinjanvier.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kevinjanvier.swoosh.Utilities.EXTRA_LEAGUE
import com.kevinjanvier.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenLeague(view:View){
        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "men"


    }

    fun onWomenLeague(view:View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "women"

    }

    fun Coed(view: View){

        mensLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        selectedLeague = "coed"

    }

    fun onLeagueNextClick(view:View){
       if (selectedLeague != ""){
           val skill = Intent(this, SkillActivity::class.java)
           skill.putExtra(EXTRA_LEAGUE, selectedLeague)
           startActivity(skill)
       }else{
           Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
       }

    }


}
