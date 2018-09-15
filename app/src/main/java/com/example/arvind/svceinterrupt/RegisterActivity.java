package com.example.arvind.svceinterrupt;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import layout.Login;

import static android.R.attr.typeface;

public class RegisterActivity extends AppCompatActivity {

    EditText emailEditText, passEditText, nameEditText,collegeEditText,phoneEditText,repass;
    Button registerButton;
    TextView toLogin;
    boolean connected = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        checkcon();
        if (connected==false)
        {
            View parentLayout = findViewById(android.R.id.content);
            Snackbar.make(parentLayout, "No Internet Connection", Snackbar.LENGTH_LONG)
                    .setAction("CLOSE", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            checkcon();
                        }
                    })
                    .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                    .show();
        }

        emailEditText = (EditText)findViewById(R.id.emailEditText);
        passEditText= (EditText)findViewById(R.id.passEditText);
        nameEditText= (EditText)findViewById(R.id.nameEditText);
        collegeEditText= (EditText)findViewById(R.id.collegeEditText);
        phoneEditText= (EditText)findViewById(R.id.phoneEditText);
        repass= (EditText)findViewById(R.id.repass);
        registerButton = (Button)findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(nameEditText.getText().toString())) {
                    nameEditText.setError("name required");
                    return;
                }
                if(TextUtils.isEmpty(emailEditText.getText().toString())){
                    emailEditText.setError("email required");
                    //Toast.makeText(getApplicationContext(), "insufficient credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!isEmailValid(emailEditText.getText().toString()))
                {
                    emailEditText.setError("Invaild mail Id");
                    return;
                }
                if(TextUtils.isEmpty(phoneEditText.getText().toString()) ){
                    phoneEditText.setError("number required");
                    //Toast.makeText(getApplicationContext(), "insufficient credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if((phoneEditText.getText().toString().length()!=10)){
                    phoneEditText.setError("Invalid Mobile number");
                    //Toast.makeText(getApplicationContext(), "insufficient credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(collegeEditText.getText().toString()) ){
                    collegeEditText.setError("college required");
                    //Toast.makeText(getApplicationContext(), "insufficient credentials", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(passEditText.getText().toString()) ){
                    passEditText.setError("password required");
                    //Toast.makeText(getApplicationContext(), "insufficient credentials", Toast.LENGTH_SHORT).show();
                    return;
                }


                if(!(passEditText.getText().toString().equals(repass.getText().toString()))){
                    Toast.makeText(getApplicationContext(), "password doesn't match", Toast.LENGTH_SHORT).show();
                    return;
                }

                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String password = passEditText.getText().toString().trim();
                String college = collegeEditText.getText().toString().trim();
                String phoneNumber = phoneEditText.getText().toString().trim();
                registerUser(name, email, password,college,phoneNumber);
            }
        });


    }
    private void registerUser(final String name, final String email,
                              final String password, final String college, final String phoneNumber) {

        StringRequest strReq = new StringRequest(Request.Method.POST,
                AppConfig.URL_REGISTER, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d("TAG", "Register Response: " + response.toString());


                try {
                    //JSONObject jObj = new JSONObject(response);
                    //boolean error = jObj.getBoolean("error");
                    //if (!error) {
                    // User successfully stored in MySQL
                    // Now store the user in sqlite
                    //  String uid = jObj.getString("uid");

                    //  JSONObject user = jObj.getJSONObject("user");
                    //String name = user.getString("name");
                    //String email = user.getString("email");
                    //String created_at = user
                    //      .getString("created_at");

                    Toast.makeText(getApplicationContext(), "User successfully registered,Email has been sent. Try login now!", Toast.LENGTH_LONG).show();

                    nameEditText.setText("");
                    phoneEditText.setText("");
                    passEditText.setText("");
                    emailEditText.setText("");
                    collegeEditText.setText("");
                    repass.setText("");

                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    Log.d("TAG","INTENT CHECK");
                    Log.d("TAG",MobileNumber.userMobileNumber);
                    intent.putExtra("position", 2);
                    startActivity(intent);
                    finish();

                    // Launch login activity
                    /*Intent intent = new Intent(
                            Register.this,
                            Login.class);
                    startActivity(intent);
                    finish();*/
                    // } else {

                    // Error occurred in registration. Get the error
                    // message
                    //   String errorMsg = jObj.getString("error_msg");
                    // Toast.makeText(getApplicationContext(),
                    //       errorMsg, Toast.LENGTH_LONG).show();
                    //}
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", "Registration Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();

            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting params to register url
                Map<String, String> params = new HashMap<String, String>();
                params.put("nameInput", name);
               // params.put("emailInput",email);
                params.put("emailInput", email);
               // params.put("numberInput", phoneNumber);
                params.put("passInput", password);
                params.put("collegeInput",college);
                params.put("numberInput",phoneNumber);
                params.put("event1", "0");params.put("event2", "0");params.put("event3", "0");params.put("event4", "0");params.put("event5", "0");
                params.put("event6", "0");params.put("event7", "0");params.put("event8", "0");params.put("event9", "0");params.put("event10", "0");
                params.put("event11", "0");params.put("event12", "0");
                return params;
            }

        };
        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq);
    }
    public void checkcon(){
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }
        else
            connected = false;
    }
    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


}
