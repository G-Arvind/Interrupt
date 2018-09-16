package layout;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lazytomatostudios.interrupt18.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Route.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Route#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Route extends Fragment {
    ProgressDialog progress;
    WebView browser;


    public Route() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_route, container, false);

        progress=new ProgressDialog(getContext());
        browser = (WebView) view.findViewById(R.id.webviewr);

        progress.setTitle("Loading");
        progress.show();
        browser.setVisibility(View.GONE);

        browser.setWebViewClient(new WebViewClient() {

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                browser.setVisibility(View.VISIBLE);
                progress.dismiss();
            }

        });

        WebSettings webSettings = browser.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        browser.loadUrl("https://www.svce.ac.in/departments/transport/routes.php#nav");

        return view;
    }


}