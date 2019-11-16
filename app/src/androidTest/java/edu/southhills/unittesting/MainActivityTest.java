package edu.southhills.unittesting;

import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){

        TextView tv = mActivity.findViewById(R.id.tvMainText);
        assertNotNull(tv);
    }

    @Test
    public void testIsTextCorrect(){

        TextView tv = mActivity.findViewById(R.id.tvMainText);

        String actual = tv.getText().toString();
        Assert.assertEquals("Hello World!", actual);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}