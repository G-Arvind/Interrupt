package layout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arvind.svceinterrupt.InstructionActivity;
import com.example.arvind.svceinterrupt.MailInterface;
import com.example.arvind.svceinterrupt.MyInterface;
import com.example.arvind.svceinterrupt.R;
import com.example.arvind.svceinterrupt.RegisterActivity;

import java.util.HashMap;


public class Login extends Fragment implements MyInterface {

    TextView signup;

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
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_login, container, false);
        signup=(TextView)rootView.findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
            }
        });
        return rootView;

    }


    @Override
    public void fragmentNowVisible() {
        Log.d("Debug", "Login visible");
    }



    }






