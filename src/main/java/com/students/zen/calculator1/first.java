

package com.students.zen.calculator1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class first extends AppCompatActivity implements View.OnClickListener {
    Button fb0, fb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstscreen);
        Toast.makeText(this,"we have reached first.java",Toast.LENGTH_LONG).show();

        fb1 = (Button) findViewById(R.id.about);

        fb1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)

    {
        switch (view.getId()) {



            case R.id.about:
                Intent k = new Intent(this, about.class);
                startActivity(k);

                break;
        }
    }
    public void show(View v)
    {

        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }
}
