package com.example.sunguoqiang.app_001_leddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.sunguoqiang.hardlibrary.HardControl;

public class MainActivity extends AppCompatActivity {
    private Button button = null;
    private boolean ledon = false;
    private CheckBox checkboxled1 = null;
    private CheckBox checkboxled2 = null;
    private CheckBox checkboxled3 = null;
    private CheckBox checkboxled4 = null;

    class MyButtonLister implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            HardControl hardcontrol=new HardControl();


            ledon = !ledon;
            if(ledon) {
                button.setText("ALL OFF");
                checkboxled1.setChecked(true);
                checkboxled2.setChecked(true);
                checkboxled3.setChecked(true);
                checkboxled4.setChecked(true);

            }
            else {
                button.setText("ALL ON");
                checkboxled1.setChecked(false);
                checkboxled2.setChecked(false);
                checkboxled3.setChecked(false);
                checkboxled4.setChecked(false);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.BUTTON);

        button.setOnClickListener(new MyButtonLister());

        checkboxled1 = (CheckBox) findViewById(R.id.led1);
        checkboxled2 = (CheckBox) findViewById(R.id.led2);
        checkboxled3 = (CheckBox) findViewById(R.id.led3);
        checkboxled4 = (CheckBox) findViewById(R.id.led4);

/*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                ledon = !ledon;
                if(ledon)
                    button.setText("ALL OFF");
                else
                    button.setText("ALL ON");
            }
        });
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.led1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(),"LED1 ON",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"LED1 OFF",Toast.LENGTH_SHORT).show();
                    // Remove the meat
                }
                break;
            case R.id.led2:
                if (checked) {
                    Toast.makeText(getApplicationContext(),"LED2 ON",Toast.LENGTH_SHORT).show();
                    // Cheese me
                }
                else {
                    Toast.makeText(getApplicationContext(),"LED2 OFF",Toast.LENGTH_SHORT).show();
                    // I'm lactose intolerant
                }
                break;
            case R.id.led3:
                if (checked) {
                    Toast.makeText(getApplicationContext(),"LED3 ON",Toast.LENGTH_SHORT).show();
                    // Cheese me
                }
                else {
                    Toast.makeText(getApplicationContext(),"LED3 OFF",Toast.LENGTH_SHORT).show();
                    // I'm lactose intolerant
                }
                break;
            case R.id.led4:
                if (checked) {
                    Toast.makeText(getApplicationContext(),"LED4 ON",Toast.LENGTH_SHORT).show();
                    // Cheese me
                }
                else {
                    Toast.makeText(getApplicationContext(),"LED4 OFF",Toast.LENGTH_SHORT).show();
                    // I'm lactose intolerant
                }
                break;

            // TODO: Veggie sandwich
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
