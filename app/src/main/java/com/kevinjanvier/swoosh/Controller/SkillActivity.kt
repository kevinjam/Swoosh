package com.kevinjanvier.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kevinjanvier.swoosh.Model.Player
import com.kevinjanvier.swoosh.Utilities.EXTRA_LEAGUE
import com.kevinjanvier.swoosh.R
import com.kevinjanvier.swoosh.Utilities.EXTRA_PLAYER
import com.kevinjanvier.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

//    var league = ""
//    var skill =""
    lateinit var player:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)



    }



    fun onBeginnerClick(view: View){
        ballerBtn.isChecked = false
        player.skill = "beginner"

    }

    fun onBallerClick(view: View){
        beginnerBtn.isChecked = false
        player.skill ="baller"

    }

    fun onSkillFinishClicked(view: View){
        if (player.skill != ""){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "Please Select Skill Level", Toast.LENGTH_SHORT).show()
        }


    }
}
