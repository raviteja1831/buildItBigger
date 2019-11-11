package com.android.jokesandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class JokesActivityFragment extends Fragment {

    public JokesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View jokesFragmentView = inflater.inflate(R.layout.fragment_jokes_activity,container,false);

        Intent jokesIntent = getActivity().getIntent();

//        String joke = jokesIntent.getStringExtra("jokes");
//
//        TextView textView = jokesFragmentView.findViewById(R.id.jokes_text_view);
//        textView.setText(joke);

        String jokeFromGCE = getActivity().getIntent().getStringExtra("gce_result");
        TextView textView = jokesFragmentView.findViewById(R.id.jokes_text_view);
        textView.setText(jokeFromGCE);

        return jokesFragmentView;
    }

}
