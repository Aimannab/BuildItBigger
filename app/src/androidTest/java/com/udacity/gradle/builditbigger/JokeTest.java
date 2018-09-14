package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;


/**
 * Created by Aiman Nabeel on 24/08/2018.
 */

@RunWith(AndroidJUnit4.class)
public class JokeTest extends AndroidTestCase{

    @Test
    public void testAsyncTask() {

       try {
            EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
            //Extracting context using InstrumentationRegistry
            Context context = InstrumentationRegistry.getTargetContext();
            asyncTask.execute(new Pair<Context, String>(context, "Manfred"));

            String joke = asyncTask.get(60, TimeUnit.SECONDS);

            assertTrue(joke.length()>0);
        }

        catch (Exception e) {
           fail("JokeTest failed. Session timed out");
        }
    }
}
