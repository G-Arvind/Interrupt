package layout;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.arvind.svceinterrupt.MyInterface;
import com.example.arvind.svceinterrupt.R;
import com.github.siyamed.shapeimageview.RoundedImageView;

public class Home extends Fragment implements MyInterface {



    ImageButton fbbutton,instabutton,mailbutton,webbutton;

    RoundedImageView org1,org2,org3,org4;

    static String FACEBOOK_URL = "https://www.facebook.com/svceinterrupt";
    static String FACEBOOK_PAGE_ID = "svceinterrupt";

    public Home() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_home, container, false);
        fbbutton=(ImageButton)v.findViewById(R.id.fbbutton);
        instabutton=(ImageButton)v.findViewById(R.id.instabutton);
        mailbutton=(ImageButton)v.findViewById(R.id.mailbutton);
        webbutton=(ImageButton)v.findViewById(R.id.webbutton);

        org1=(RoundedImageView)v.findViewById(R.id.org1);
        org2=(RoundedImageView)v.findViewById(R.id.org2);
        org3=(RoundedImageView)v.findViewById(R.id.org3);
        org4=(RoundedImageView)v.findViewById(R.id.org4);

        fbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(getContext());
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);

            }
        });
        instabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent instagramIntent = new Intent(Intent.ACTION_VIEW);
                instagramIntent.setPackage("com.instagram.android");
                String instagramUrl = "http://instagram.com/_u/interrupt_svce";
                instagramIntent.setData(Uri.parse(instagramUrl));
                try {
                    startActivity(instagramIntent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/_u/interrupt_svce")));
                }

            }
        });
        mailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email[] = { "interrupt2k17@gmail.com" };
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
                startActivity(emailIntent);

            }
        });
        webbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.http://interrupt2k18.in/"));
                startActivity(browserIntent);

            }
        });

        org1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7708026256"));
                startActivity(intent);

            }
        });
        org2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9500132964"));
                startActivity(intent);

            }
        });
        org3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9840476486"));
                startActivity(intent);

            }
        });
        org4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9500185799"));
                startActivity(intent);

            }
        });



        return v;
    }
    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) {
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else {
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL;
        }
    }

    @Override
    public void fragmentNowVisible() {

    }
}
