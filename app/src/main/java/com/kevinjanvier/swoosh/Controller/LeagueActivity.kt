package com.kevinjanvier.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kevinjanvier.swoosh.Model.Player
import com.kevinjanvier.swoosh.Utilities.EXTRA_LEAGUE
import com.kevinjanvier.swoosh.R
import com.kevinjanvier.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
//    var selectedLeague = ""

    var player =  Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun onMenLeague(view:View){
        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

//        selectedLeague = "men"
        player.league ="men"


    }

    fun onWomenLeague(view:View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

//        selectedLeague = "women"
        player.league = "women"

    }

    fun Coed(view: View){

        mensLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

//        selectedLeague = "coed"
        player.league = "Co-ed"

    }

    fun onLeagueNextClick(view:View){
       if (player.league != ""){
           val skill = Intent(this, SkillActivity::class.java)
           skill.putExtra(EXTRA_PLAYER, player)
           startActivity(skill)
       }else{
           Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
       }

    }


}
