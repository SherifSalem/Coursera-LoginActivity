package com.example.www.loginactivity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUtilsTest {
    private LoginUtils utils;
    @Before
    public void setUp(){
        utils = new LoginUtils();
    }
    @Test
    public void aValidEmailAddressPasses() throws Exception {
        assertTrue(utils.isValidEmailAddrerss("foo@bar.com"));
    }
    @Test
    public void anInvalidEmailAddressFails() throws Exception {
        assertFalse(utils.isValidEmailAddrerss("invalid"));
    }
    @Test
    public void localPartLengthForValidEmailAddress() throws Exception {
        assertEquals(1, utils.getLocalPartLength("a@b.com"));
    }
}