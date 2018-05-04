package com.students.zen.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class about1 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdfabout);


        PDFView pv = (PDFView) findViewById(R.id.pdfView);
        pv.fromAsset("paper.pdf").load();
    }

}
