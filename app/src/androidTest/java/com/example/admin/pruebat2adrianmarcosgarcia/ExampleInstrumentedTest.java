package com.example.admin.pruebat2adrianmarcosgarcia;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<MyLogin> {


    private Button bt_login_entrar;
    MyLogin actividad;

    public ExampleInstrumentedTest() {
        super(MyLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        bt_login_entrar = (Button) actividad.findViewById(R.id.bt_login_entrar);
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testLoginSignup() {

        TouchUtils.clickView(this, bt_login_entrar);


    }
}
