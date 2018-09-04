package com.example.arvind.svceinterrupt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

public class registration extends AppCompatActivity {
    CardView flex,ichallenge,generic,terminal,logic,pitch,inquiz,ds,techno,ppt,tech,aws,pipe;

    Boolean flex1,ichallenge1,generic1,terminal1,logic1,pitch1,inquiz1,ds1,techno1,ppt1,tech1,aws1,pipe1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        flex1=false;
        ichallenge1=false;
        generic1=false;
        terminal1=false;
        logic1=false;
        pitch1=false;
        inquiz1=false;
        ds1=false;
        techno1=false;
        ppt1=false;
        tech1=false;
        aws1=false;
        pipe1=false;

        flex=(CardView)findViewById(R.id.flexe);
        ichallenge=(CardView)findViewById(R.id.ichallengee);
        generic=(CardView)findViewById(R.id.generice);
        terminal=(CardView)findViewById(R.id.terminale);
        logic=(CardView)findViewById(R.id.logice);
        pitch=(CardView)findViewById(R.id.pitche);
        inquiz=(CardView)findViewById(R.id.inquize);
        ds=(CardView)findViewById(R.id.dse);
        techno=(CardView)findViewById(R.id.technoe);
        ppt=(CardView)findViewById(R.id.ppte);
        tech=(CardView)findViewById(R.id.teche);
        pipe=(CardView)findViewById(R.id.pipee);
        aws=(CardView)findViewById(R.id.awse);


        flex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flex1==false)
                flex1=true;
                else
                flex1=false;

                if(flex1==true){
                    Log.v("TAG","EXEC");
                    flex.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    flex.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }


            }
        });
        ichallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ichallenge1==false)
                    ichallenge1=true;
                else
                    ichallenge1=false;

                if(ichallenge1==true){
                    ichallenge.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    ichallenge.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        generic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(generic1==false)
                    generic1=true;
                else
                    generic1=false;

                if(generic1==true){
                    generic.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    generic.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }


            }
        });
        terminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(terminal1==false)
                    terminal1=true;
                else
                    terminal1=false;

                if(terminal1==true){
                    terminal.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    terminal.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }


            }
        });
        logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(logic1==false)
                    logic1=true;
                else
                    logic1=false;

                if(logic1==true){
                    logic.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    logic.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }

            }
        });
        pitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pitch1==false)
                    pitch1=true;
                else
                    pitch1=false;

                if(pitch1==true){
                    pitch.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    pitch.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }


            }
        });
        inquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(inquiz1==false)
                    inquiz1=true;
                else
                    inquiz1=false;

                if(inquiz1==true){
                    inquiz.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    inquiz.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ds1==false)
                    ds1=true;
                else
                    ds1=false;

                if(ds1==true){
                    ds.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    ds.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(techno1==false)
                    techno1=true;
                else
                    techno1=false;

                if(flex1==true){
                    techno.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    techno.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ppt1==false)
                    ppt1=true;
                else
                    ppt1=false;

                if(ppt1==true){
                    ppt.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    ppt.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tech1==false)
                    tech1=true;
                else
                    tech1=false;

                if(tech1==true){
                    tech.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    tech.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        pipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pipe1==false)
                    pipe1=true;
                else
                    pipe1=false;

                if(pipe1==true){
                    pipe.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    pipe.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
        aws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(aws1==false)
                    aws1=true;
                else
                    aws1=false;

                if(aws1==true){
                    aws.setBackgroundColor(getResources().getColor(R.color.gray));
                }
                else {
                    aws.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
    }
}
