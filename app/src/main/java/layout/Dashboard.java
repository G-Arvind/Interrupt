package layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.arvind.svceinterrupt.EventActivity;
import com.example.arvind.svceinterrupt.InstructionActivity;
import com.example.arvind.svceinterrupt.MailInterface;
import com.example.arvind.svceinterrupt.MyInterface;
import com.example.arvind.svceinterrupt.R;
import com.example.arvind.svceinterrupt.TransportActivity;
import com.example.arvind.svceinterrupt.Registration_Events;


public class Dashboard extends Fragment implements MyInterface {

   CardView flex,ichallenge,generic,terminal,logic,pitch,inquiz,ds,techno,ppt,tech,aws,pipe;

    MailInterface mailInterface;

    Button transport,instruct,register;

    public Dashboard() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mailInterface = (MailInterface) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement onFragmentChangeListener");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);
        flex=(CardView)view.findViewById(R.id.flex);
        ichallenge=(CardView)view.findViewById(R.id.ichallenge);
        generic=(CardView)view.findViewById(R.id.generic);
        terminal=(CardView)view.findViewById(R.id.terminal);
        logic=(CardView)view.findViewById(R.id.logic);
        pitch=(CardView)view.findViewById(R.id.pitch);
        inquiz=(CardView)view.findViewById(R.id.inquiz);
        ds=(CardView)view.findViewById(R.id.ds);
        techno=(CardView)view.findViewById(R.id.techno);
        ppt=(CardView)view.findViewById(R.id.ppt);
        tech=(CardView)view.findViewById(R.id.tech);
        pipe=(CardView)view.findViewById(R.id.pipe);
        aws=(CardView)view.findViewById(R.id.aws);
        transport=(Button) view.findViewById(R.id.transport);
        instruct=(Button)view.findViewById(R.id.instruct);
        register=(Button)view.findViewById(R.id.register);


        flex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent=new Intent(getActivity(), EventActivity.class);
                    intent.putExtra("name","flex");
                    startActivity(intent);
            }
        });
        ichallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","ichallenge");
                startActivity(intent);
            }
        });
        generic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","generic");
                startActivity(intent);
            }
        });
        terminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","terminal");
                startActivity(intent);
            }
        });
        logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","logic");
                startActivity(intent);
            }
        });
        pitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","pitch");
                startActivity(intent);
            }
        });
        inquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","inquiz");
                startActivity(intent);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","ds");
                startActivity(intent);
            }
        });
        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","techno");
                startActivity(intent);
            }
        });
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","ppt");
                startActivity(intent);
            }
        });
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","tech");
                startActivity(intent);
            }
        });
        pipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","pipe");
                startActivity(intent);
            }
        });
        aws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("name","aws");
                startActivity(intent);
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), TransportActivity.class);
                startActivity(intent);
            }
        });
        instruct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(), InstructionActivity.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), Registration_Events.class);
                startActivity(intent);
            }
        });
        return view;

    }




    @Override
    public void fragmentNowVisible() {
        Log.d("Debug", "Dashboard visible");
    }
}
