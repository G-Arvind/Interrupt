package layout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.arvind.svceinterrupt.AppConfig;
import com.example.arvind.svceinterrupt.AppController;
import com.example.arvind.svceinterrupt.EventActivity;
import com.example.arvind.svceinterrupt.InstructionActivity;
import com.example.arvind.svceinterrupt.MailInterface;
import com.example.arvind.svceinterrupt.MainActivity;
import com.example.arvind.svceinterrupt.MobileNumber;
import com.example.arvind.svceinterrupt.MyInterface;
import com.example.arvind.svceinterrupt.R;
import com.example.arvind.svceinterrupt.RegisterActivity;
import com.example.arvind.svceinterrupt.Registration_Events;


import java.util.HashMap;
import java.util.Map;


public class Login extends Fragment implements MyInterface {

    TextView signup;

    EditText emailEditText, passwordEditText;
    Button loginButton;
    TextView toRegistration;

    ScrollView scrollView;

    public LinearLayout loginpage,profilepage;




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
          //  mailInterface = (MailInterface) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement onFragmentChangeListener");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
        // Inflate the layout for this fragment

             rootView = inflater.inflate(R.layout.fragment_login, container, false);

            signup=(TextView)rootView.findViewById(R.id.signup);
            emailEditText = (EditText)rootView.findViewById(R.id.email);
            passwordEditText = (EditText)rootView.findViewById(R.id.password);
            loginButton = (Button)rootView.findViewById(R.id.login);

           loginpage = (LinearLayout)rootView.findViewById(R.id.login_page);
           profilepage =(LinearLayout) rootView.findViewById(R.id.prof_page);
         //  scrollView=(ScrollView)rootView.findViewById(R.id.ll);

        emailEditText.setText("");
        passwordEditText.setText("");

        if(MobileNumber.userMobileNumber.equals("dummy")){
            profilepage.setVisibility(View.GONE);
        }
        else {
            loginpage.setVisibility(View.GONE);
            profilepage.setVisibility(View.VISIBLE);
//            scrollView.setVisibility(View.GONE);
        }






        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(emailEditText.getText().toString())){
                    emailEditText.setError("number required");
                   // Toast.makeText(getContext(), "insufficient credentials!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if( TextUtils.isEmpty(passwordEditText.getText().toString())){
                    passwordEditText.setError("password required");
                    //Toast.makeText(getContext(), "insufficient credentials!", Toast.LENGTH_SHORT).show();
                    return;
                }
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                checkLogin(email, password);
                //to do code
            }
        });

        return rootView;

    }

    private void checkLogin(final String phoneNumber, final String password) {
        // Tag used to cancel the request
        String tag_string_req = "req_login";


        StringRequest strReq = new StringRequest(Request.Method.POST,
                AppConfig.URL_LOGIN, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d("TAG", "Login Response: " + response.toString());

                //response is a html page
                //if success move to main activity of the app
                try {
                    //create a login session
                   // session.setLogin(true);
                    String res = response.toString();
                    if(res.contains("window.location.href")){
                        MobileNumber.userMobileNumber=phoneNumber;
                        Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT).show();


                        loginpage.setVisibility(View.GONE);
                        profilepage.setVisibility(View.VISIBLE);
                     //   scrollView.setVisibility(View.GONE);
                        emailEditText.setText("");
                        passwordEditText.setText("");

                        //scrollView.setVisibility(View.GONE);
                        emailEditText.setText("");
                        passwordEditText.setText("");
                    }
                    else{
                        Toast.makeText(getContext(), "failed", Toast.LENGTH_SHORT).show();
                        MobileNumber.userMobileNumber=phoneNumber;
                        Toast.makeText(getContext(), "success", Toast.LENGTH_SHORT).show();


                        loginpage.setVisibility(View.GONE);
                        profilepage.setVisibility(View.VISIBLE);
                     //   scrollView.setVisibility(View.GONE);
                        emailEditText.setText("");
                        passwordEditText.setText("");

                        //scrollView.setVisibility(View.GONE);
                        emailEditText.setText("");
                        passwordEditText.setText("");
                    }


                } catch (Exception e) {
                    // JSON error
                    e.printStackTrace();
                    Toast.makeText(getContext(), "Json error: " + e.getMessage(), Toast.LENGTH_LONG).show();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", "Login Error: " + error.getMessage());
                Toast.makeText(getContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();

            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("numberInput", phoneNumber);
                params.put("passInput", password);

                return params;
            }

        };

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);
    }



    @Override
    public void fragmentNowVisible() {
        Log.d("Debug", "Login visible");
    }



    }






