package com.example.arvind.svceinterrupt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Registration_Events extends AppCompatActivity {
    CardView flex, ichallenge, generic, terminal, logic, pitch, inquiz, ds, techno, ppt, aws, pipe;

    Boolean flex1, ichallenge1, generic1, terminal1, logic1, pitch1, inquiz1, ds1, techno1, ppt1, aws1, pipe1;

    Button regevent;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        flex1 = false;
        ichallenge1 = false;
        generic1 = false;
        terminal1 = false;
        logic1 = false;
        pitch1 = false;
        inquiz1 = false;
        ds1 = false;
        techno1 = false;
        ppt1 = false;

        aws1 = false;
        pipe1 = false;

        flex = (CardView) findViewById(R.id.flexe);
        ichallenge = (CardView) findViewById(R.id.ichallengee);
        generic = (CardView) findViewById(R.id.generice);
        terminal = (CardView) findViewById(R.id.terminale);
        logic = (CardView) findViewById(R.id.logice);
        pitch = (CardView) findViewById(R.id.pitche);
        inquiz = (CardView) findViewById(R.id.inquize);
        ds = (CardView) findViewById(R.id.dse);
        techno = (CardView) findViewById(R.id.technoe);
        ppt = (CardView) findViewById(R.id.ppte);

        pipe = (CardView) findViewById(R.id.pipee);
        aws = (CardView) findViewById(R.id.awse);

        regevent = (Button) findViewById(R.id.regevent);

      //  EventsArray.array[12] = 0;


        flex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flex1 == false){
                    flex1 = true;
                    EventsArray.array[3] = 1;
                }
                else{
                    flex1 = false;
                    EventsArray.array[3] = 0;
                }

                if (flex1 == true) {
                    Log.v("TAG", "EXEC");
                    flex.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    flex.setBackgroundColor(getResources().getColor(R.color.black));
                }


            }
        });
        ichallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ichallenge1 == false){
                    ichallenge1 = true;
                    EventsArray.array[8] = 1;
                }
                else{
                    ichallenge1 = false;
                    EventsArray.array[8] = 0;
                }

                if (ichallenge1 == true) {
                    ichallenge.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    ichallenge.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });
        generic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (generic1 == false){
                    generic1 = true;
                    EventsArray.array[4] = 1;
                }
                else{
                    generic1 = false;
                    EventsArray.array[4] = 0;
                }

                if (generic1 == true) {
                    generic.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    generic.setBackgroundColor(getResources().getColor(R.color.black));
                }


            }
        });
        terminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (terminal1 == false){
                    EventsArray.array[5] = 1;
                    terminal1 = true;
                }
                else{
                    terminal1 = false;
                    EventsArray.array[5] = 0;
                }

                if (terminal1 == true) {
                    terminal.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    terminal.setBackgroundColor(getResources().getColor(R.color.black));
                }


            }
        });
        logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (logic1 == false){
                    logic1 = true;
                    EventsArray.array[0] = 1;
                }
                else{
                    logic1 = false;
                    EventsArray.array[0] = 0;
                }

                if (logic1 == true) {
                    logic.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    logic.setBackgroundColor(getResources().getColor(R.color.black));
                }

            }
        });
        pitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pitch1 == false){
                    pitch1 = true;
                    EventsArray.array[1] = 1;
                }
                else{
                    pitch1 = false;
                    EventsArray.array[1] = 0;
                }

                if (pitch1 == true) {
                    pitch.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    pitch.setBackgroundColor(getResources().getColor(R.color.black));
                }


            }
        });
        inquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inquiz1 == false){
                    EventsArray.array[2] = 1;
                    inquiz1 = true;
                }
                else{
                    EventsArray.array[2] = 0;
                    inquiz1 = false;
                }

                if (inquiz1 == true) {
                    inquiz.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    inquiz.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ds1 == false){
                    ds1 = true;
                    EventsArray.array[10] = 1;
                }
                else{
                    ds1 = false;
                    EventsArray.array[10] = 0;
                }

                if (ds1 == true) {
                    ds.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    ds.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });
        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (techno1 == false){
                    EventsArray.array[7] = 1;
                    techno1 = true;
                }
                else{
                    EventsArray.array[7] = 0;
                    techno1 = false;
                }

                if (techno1 == true) {
                    techno.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    techno.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ppt1 == false){
                    EventsArray.array[6] = 1;
                    ppt1 = true;
                }
                else{
                    EventsArray.array[6] = 0;
                    ppt1 = false;
                }

                if (ppt1 == true) {
                    ppt.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    ppt.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });

        pipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (pipe1 == false){
                    pipe1 = true;
                    EventsArray.array[9] = 1;
                }
                else{
                    pipe1 = false;
                    EventsArray.array[9] = 0;
                }

                if (pipe1 == true) {
                    pipe.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    pipe.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });
        aws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (aws1 == false){
                    EventsArray.array[11] = 1;
                    aws1 = true;
                }
                else{
                    EventsArray.array[11] = 0;
                    aws1 = false;
                }

                if (aws1 == true) {
                    aws.setBackgroundColor(getResources().getColor(R.color.gray));
                } else {
                    aws.setBackgroundColor(getResources().getColor(R.color.black));
                }
            }
        });

        regevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               addEvents();
            }
        });


    }

    private void addEvents() {
        // Tag used to cancel the request
        String tag_string_req_events = "req_login_events";


        Log.d("TAG", "REGG CLICKED " );


        StringRequest strReq = new StringRequest(Request.Method.POST,
                AppConfig.URL_EVENTS, new Response.Listener<String>() {


            @Override
            public void onResponse(String response) {
                Log.d("TAG", "Login Response: " + response.toString());

                //response is a html page
                //if success move to main activity of the app
                try {

                    //create a login session
                    Toast.makeText(getApplicationContext(),
                            "Successfully Registered", Toast.LENGTH_LONG).show();


                } catch (Exception e) {
                    // JSON error
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Json error: " + e.getMessage(), Toast.LENGTH_LONG).show();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", "Login Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();

            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("mobile", MobileNumber.userMobileNumber);
                Log.d("TAG","mobile: "+MobileNumber.userMobileNumber);
                for (int i = 1; i <= EventsArray.array.length; i++) {
                    params.put("event" + i, EventsArray.array[i-1] +"");
                    Log.d("TAG","event"+ i+":"+EventsArray.array[i-1] +"");
                }
                return params;
            }

        };
        AppController.getInstance().addToRequestQueue(strReq);


    }
}
