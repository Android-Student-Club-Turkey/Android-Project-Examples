package com.serkanalc.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buttons
        val rockButton:Button= findViewById(R.id.rockbtn)
        val paperButton:Button= findViewById(R.id.paperbtn)
        val scissorButton:Button= findViewById(R.id.scissorbtn)
        val endButton:Button=findViewById(R.id.endbtn)

        //ImageViews
        val yourChoice:ImageView=findViewById(R.id.yourchoice)
        val appChoice: ImageView=findViewById(R.id.appchoice)

        // TextViews
        val resualtText:TextView=findViewById(R.id.resualtText)
        val winCounter:TextView=findViewById(R.id.winCounter)
        val loseCounter:TextView=findViewById(R.id.loseCounter)
        val scoreCounter:TextView=findViewById(R.id.scoreCounter)

        //Counter
        var score = 0
        var win= 0
        var lose= 0

        /*
        AppDecision 1 == Rock
        AppDecision 2 == Paper
        AppDecision 3 == scissor
         */

        rockButton.setOnClickListener {

            yourChoice.setImageResource(R.drawable.rock)



            val appDecision= (1..3).random()

            if(appDecision==1){
                appChoice.setImageResource(R.drawable.rock)
                resualtText.text="Draw"
                score +=10
                scoreCounter.text="Score:$score"
            }

            else if(appDecision== 2){
                appChoice.setImageResource(R.drawable.paper)
                resualtText.text="Lose"
                score-=30
                lose+=1
                loseCounter.text="Lose:$lose"
                scoreCounter.text="Score:$score"

            }

            else{
                appChoice.setImageResource(R.drawable.scissors)
                resualtText.text="win"
                score+=30
                win+=1
                winCounter.text="Win:$win"
                scoreCounter.text="Score:$score"
            }
        }
        paperButton.setOnClickListener {

            yourChoice.setImageResource(R.drawable.paper)

            var appDecision= (1..3).random()

            if(appDecision==1){
                appChoice.setImageResource(R.drawable.rock)
                resualtText.text="Win"
                score +=30
                win+=1
                winCounter.text="Win:$win"
                scoreCounter.text="Score:$score"
            }

            else if(appDecision== 2){
                appChoice.setImageResource(R.drawable.paper)
                resualtText.text="Draw"
                score+=10
                scoreCounter.text="Score:$score"


            }

            else{
                appChoice.setImageResource(R.drawable.scissors)
                resualtText.text="Lose"
                score-=30
                lose+=1
                loseCounter.text="Lose:$lose"
                scoreCounter.text="Score:$score"
            }
        }
        scissorButton.setOnClickListener {

            yourChoice.setImageResource(R.drawable.scissors)

            var appDecision= (1..3).random()

            if(appDecision==1){
                appChoice.setImageResource(R.drawable.rock)
                resualtText.text="Lose"
                score -=30
                lose+=1
                loseCounter.text="Lose:$lose"
                scoreCounter.text="Score:$score"
            }

            else if(appDecision== 2){
                appChoice.setImageResource(R.drawable.paper)
                resualtText.text="Draw"
                score+=30
                win+=1
                winCounter.text="Win:$win"
                scoreCounter.text="Score:$score"



            }

            else{
                appChoice.setImageResource(R.drawable.scissors)
                resualtText.text="Draw"
                score+=10
                scoreCounter.text="Score:$score"

            }
        }
        endButton.setOnClickListener {

            resualtText.text="Your Score: $score"

        }
    }
}