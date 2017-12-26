package com.kevinjanvier.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kevinjanvier.swoosh.Model.Player
import com.kevinjanvier.swoosh.R
import com.kevinjanvier.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

//        val league = intent.getStringExtra(EXTRA_LEAGUE)
//        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for a ${player.league} beginner ${player.skill} near you ... "
    }
}
