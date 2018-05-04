package com.students.zen.calculator1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class about extends AppCompatActivity implements View.OnClickListener {
    Button b0, b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutscreen);

        b1 = (Button) findViewById(R.id.back);
        b2 = (Button) findViewById(R.id.at1);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    public void onClick(View view)

    {
        switch (view.getId()) {



            case R.id.back:
                Intent k = new Intent(this, first.class);
                startActivity(k);
                break;
            case R.id.at1:

                Intent j = new Intent(this, about1.class);
                startActivity(j);
                break;

        }
    }
    public void connect(View v ){
        Intent intent=new Intent(Intent.ACTION_SEND);
        String[] recipients={"bloagmsr28@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Subject text here...");
        intent.putExtra(Intent.EXTRA_TEXT,"Body of the content here...");
        intent.putExtra(Intent.EXTRA_CC,"mailcc@gmail.com");
        intent.setType("text/html");
        intent.setPackage("com.google.android.gm");
        startActivity(Intent.createChooser(intent, "Send mail"));
    }

}
