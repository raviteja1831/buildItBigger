package com.udacity.gradle.builditbigger;

import android.content.Context;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    private Context context;

    @Test
    public void verifyAtleastOneJokePresent() {
        String randomJoke;
        context = InstrumentationRegistry.getTargetContext();
        try {
            randomJoke = new EndpointsAsyncTask().execute(context).get();
            assertNotNull(randomJoke);
            assertTrue(randomJoke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}