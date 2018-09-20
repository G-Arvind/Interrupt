package layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lazytomatostudios.interrupt18.EventActivity;
import com.lazytomatostudios.interrupt18.MyInterface;
import com.lazytomatostudios.interrupt18.R;
public class Sponsors extends Fragment implements MyInterface {
    public Sponsors() {
        // Required empty public constructor
    }

    TextView clctxt,deliumtxt,deetatxt;
    ImageView clc,delium,deeta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_sponsors, container, false);
        clctxt=(TextView)view.findViewById(R.id.clctxt);
        deliumtxt=(TextView)view.findViewById(R.id.deliumtxt);
        deetatxt=(TextView)view.findViewById(R.id.deetatxt);
        clc=(ImageView) view.findViewById(R.id.clc);
        delium=(ImageView)view.findViewById(R.id.delium);
        deeta=(ImageView)view.findViewById(R.id.deeta);

        clctxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                Intent intent;
                url = "https://www.careerlauncher.com/chennai/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        deliumtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url;
                Intent intent;
                url = "http://www.delium.co/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        deetatxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url;
                Intent intent;
                url = "http://deeta.org/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                Intent intent;
                url = "https://www.careerlauncher.com/chennai/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        delium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                Intent intent;
                url = "http://www.delium.co/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        deeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                Intent intent;
                url = "http://deeta.org/";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });

        return view;

    }

    @Override
    public void fragmentNowVisible() {
        Log.d("Debug", "Sponsors visible");
    }
}


