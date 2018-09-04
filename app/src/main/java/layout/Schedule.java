package layout;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.arvind.svceinterrupt.R;


public class Schedule extends Fragment {

    ProgressDialog progress;
    WebView browser;

    public Schedule() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

          progress = new ProgressDialog(getContext());
          browser =(WebView) view.findViewById(R.id.webview);

        progress.setMessage("Loading");
        progress.show();
        browser.setVisibility(View.GONE);

        browser.setWebViewClient(new WebViewClient() {

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                browser.setVisibility(View.VISIBLE);
                progress.hide();
            }

        });

        WebSettings webSettings = browser.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        browser.loadUrl("https://www.svce.ac.in/departments/transport/schedule.php#nav");

        return view;
    }

}
