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

    /**
     * Save an Instance state once u are doing a rotation
     */
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState!!.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    /**
     * Restore the Instance
     */

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
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
