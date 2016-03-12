package com.example.giann_000.robox_official;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class buttonActivity extends AppCompatActivity {

    Button up, down, left, right,stop, uTurnRight, uTurnLeft, faster, slower;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        up  = (Button)findViewById(R.id.upbttn);
        down = (Button)findViewById(R.id.downbttn);
        left = (Button)findViewById(R.id.leftbttn);
        right = (Button)findViewById(R.id.rightbttn);
        stop = (Button)findViewById(R.id.stopbtnn);
        uTurnLeft = (Button)findViewById(R.id.UturnLbtnn);
        uTurnRight = (Button)findViewById(R.id.UturnRbttn);
        faster = (Button)findViewById(R.id.fasterbttn);
        slower = (Button)findViewById(R.id.slowerbttn);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Forward();
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Backward();
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Left();
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Right();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Stop();
            }
        });
        faster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Faster();
            }
        });
        slower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Slower();
            }
        });
        uTurnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UTurnLeft();
            }
        });
        uTurnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UTurnRight();
            }
        });
    }

    private void Forward()
    {

    }
    private void Backward()
    {

    }
    private void Left()
    {

    }
    private void Right()
    {

    }
    private void Stop()
    {

    }
    private void UTurnLeft()
    {

    }
    private void UTurnRight()
    {

    }
    private void Slower()
    {

    }
    private void Faster()
    {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_button, menu);
        return true;
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
