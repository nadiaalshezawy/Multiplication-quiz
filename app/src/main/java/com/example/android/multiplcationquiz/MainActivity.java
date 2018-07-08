package com.example.android.multiplcationquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] correctanswer=new int[11];
    int[] useranswer=new int[11];
    int correctcounter=0;
    int index=1;
    int index2=1;
    boolean checkanswer=false;
    int qid;
    int aid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(index=1;index<11;index++) {
            Selectid(index);

        }


    }

    // this method  find the  id for the  question
    private void Selectid (int index)
    {

        switch (index) {
            case 1:  qid= R.id.question1;
                     aid=R.id.answer1;
            //    Log.v("MainActivity", " aid 1 qid 1 " + qid +" "+aid);
                break;
            case 2:  qid= R.id.question2;
                     aid=R.id.answer2;
             //   Log.v("MainActivity", " aid 1 qid 1 " + qid +" "+aid);
                break;
            case 3: qid= R.id.question3;
                    aid=R.id.answer3;
              //  Log.v("MainActivity", " aid 1 qid 1 " + qid +" "+aid);
                break;
            case 4:  qid= R.id.question4;
                     aid=R.id.answer4;
                break;
            case 5:  qid= R.id.question5;
                     aid=R.id.answer5;
                break;
            case 6:  qid= R.id.question6;
                     aid=R.id.answer6;
                break;
            case 7:  qid= R.id.question7;
                     aid=R.id.answer7;
                break;
            case 8: qid= R.id.question8;
                    aid=R.id.answer8;
                break;
            case 9: qid= R.id.question9;
                    aid=R.id.answer9;
                break;
            case 10:qid= R.id.question10;
                    aid=R.id.answer10;
                break;

            default: qid= R.id.question10;// need to fix this
                     aid=R.id.answer10;
                break;
        }

        if(!checkanswer)
        displayQuestion();

    }


    //  this method return random question
    private void displayQuestion( )
    {
        int random1, random2;
        Random r =new Random();
        random1=r.nextInt(10 )+1 ;
        random2=r.nextInt(10 ) +1;
        TextView question1=(TextView) findViewById(qid);
        question1.setText("Multiply " +random1 + " by "+random2);
        correctanswer[index]=random1*random2;
        Log.v("MainActivity", " correcta answer saved " + correctanswer[index]);
    }

   public void  checkanswer(View view)
    {
        if(index2<11)
        { checkanswer=true;
        Selectid(index2);
        EditText answer=(EditText) findViewById(aid);
        useranswer[index2]=Integer.parseInt(answer.getText().toString());
        Log.v("MainActivity", " user answer" + useranswer[index2]);

       if (useranswer[index2]==correctanswer[index2])
           Toast.makeText(this,"Your answer is correct",Toast.LENGTH_SHORT).show();//show toast message
        else
           Toast.makeText(this,"Your answer is wrong",Toast.LENGTH_SHORT).show();//show toast message

    ++index2;
    }}
}

