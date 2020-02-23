package com.technocrats.rtcp.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.technocrats.rtcp.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;
    WebView web1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);
        web1 = root.findViewById(R.id.web1);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setDomStorageEnabled(true);

        web1.setWebViewClient(new WebViewClient());

        web1.loadUrl("https://www.onlinegdb.com/online_c++_compiler");
        return root;
    }
}