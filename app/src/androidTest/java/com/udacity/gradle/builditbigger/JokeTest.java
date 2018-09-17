package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

import com.example.android.joketellerandroidlib.JokesActivity;
import com.example.android.joketellerlib.JokeTeller;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static com.example.android.joketellerandroidlib.JokesFragment.MOVIE_JOKE_KEY_EXTRA;


/**
 * Created by Aiman Nabeel on 24/08/2018.
 */

@RunWith(AndroidJUnit4.class)
public class JokeTest extends AndroidTestCase{

    private static final String TAG = JokeTest.class.getSimpleName();
    //Extracting context using InstrumentationRegistry
    Context context = InstrumentationRegistry.getTargetContext();
    EndpointsAsyncTask.Callback callback;

    @Test
    public void testAsyncTask() {

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(callback);
            //Extracting context using InstrumentationRegistry
            //Context context = InstrumentationRegistry.getTargetContext();
            asyncTask.execute(new Pair<Context, String>(context, "Manfred"));

            try {
            String joke = asyncTask.get();
            Log.d(TAG, "Joke text: " + joke);
                assertNotNull(joke);
                //assertTrue(joke.length()>0);
        }

        catch (Exception e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }
}
