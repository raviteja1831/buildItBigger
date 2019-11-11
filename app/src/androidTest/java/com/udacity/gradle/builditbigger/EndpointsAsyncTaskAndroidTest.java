package com.udacity.gradle.builditbigger;


import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskAndroidTest {
    private Context context;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldReturnAtLeastOneJoke(){
        context = InstrumentationRegistry.getTargetContext();
        try {
            String joke = new EndpointsAsyncTask().execute(context).get();
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}