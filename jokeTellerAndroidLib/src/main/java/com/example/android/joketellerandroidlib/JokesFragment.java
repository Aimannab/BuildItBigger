package com.example.android.joketellerandroidlib;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Aiman Nabeel on 13/09/2018.
 */

public class JokesFragment extends Fragment {

    public static final String MOVIE_JOKE_KEY_EXTRA = "joke";

    public JokesFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jokes, container, false);
        setMovieJoke(view);

        return view;
    }

    private void setMovieJoke(View view) {
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(MOVIE_JOKE_KEY_EXTRA);
        if (joke != null) {
            TextView textView = view.findViewById(R.id.movie_joke);
            textView.setText(joke);
        }
    }
}
