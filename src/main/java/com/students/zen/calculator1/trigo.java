package com.students.zen.calculator1;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class trigo extends AppCompatActivity implements View.OnClickListener
{
    Button one,two,three,four,five,six,seven,eight,nine,ten,ele,twe,thir,fourt;
    EditText ed1;
    double degree;
    String val;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.trignoscreen);

        one=(Button)findViewById(R.id.btc);
        two=(Button)findViewById(R.id.btb);
        three=(Button)findViewById(R.id.btfact);
        four=(Button)findViewById(R.id.btpi);
        five=(Button)findViewById(R.id.btexp);
        six=(Button)findViewById(R.id.btcot);
        seven=(Button)findViewById(R.id.btsec);
        eight=(Button)findViewById(R.id.btcosec);
        nine=(Button)findViewById(R.id.btsin);
        ten=(Button)findViewById(R.id.btcos);
        ele=(Button)findViewById(R.id.bttan);
        twe=(Button)findViewById(R.id.btsqrt);
        thir=(Button)findViewById(R.id.btxy);
        fourt=(Button)findViewById(R.id.btlog);
        ed1=(EditText)findViewById(R.id.et1);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
        ele.setOnClickListener(this);
        twe.setOnClickListener(this);
        thir.setOnClickListener(this);
        fourt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {

        switch(view.getId())
        {
            case R.id.btsin: val=ed1.getText().toString();
                             degree=Double.parseDouble(val);
                             degree=degree*(3.142/180);
                             degree=Math.sin(degree);
                             ed1.setText(String.valueOf(degree));
                             break;

            case R.id.btcos: val=ed1.getText().toString();
                             degree=Double.parseDouble(val);
                             degree=degree*(3.142/180);
                             degree=Math.cos(degree);
                             ed1.setText(String.valueOf(degree));
                             break;

            case R.id.bttan: val=ed1.getText().toString();
                             degree=Double.parseDouble(val);
                             degree=degree*(3.142/180);
                             degree=Math.tan(degree);
                             ed1.setText(String.valueOf(degree));
                             break;

            case R.id.btcot: val=ed1.getText().toString();
                             degree=Double.parseDouble(val);
                             degree=degree*(3.142/180);
                             degree=1/Math.tan(degree);
                             ed1.setText(String.valueOf(degree));
                             break;

            case R.id.btsec: val=ed1.getText().toString();
                             degree=Double.parseDouble(val);
                             degree=degree*(3.142/180);
                             degree=1/Math.cos(degree);
                             ed1.setText(String.valueOf(degree));
                             break;

            case R.id.btcosec: val=ed1.getText().toString();
                               degree=Double.parseDouble(val);
                               degree=degree*(3.142/180);
                               degree=1/Math.sin(degree);
                               ed1.setText(String.valueOf(degree));
                               break;

            case R.id.btfact: val=ed1.getText().toString();
                              int fact=Integer.parseInt(val);
                              int i=1,f=1;
                              while(i<=fact)
                              {
                                f=f*i;
                                i++;
                              }
                              ed1.setText(String.valueOf(f));
                              break;

            case R.id.btc: ed1.setText("");
                break;

            case R.id.btsqrt: val=ed1.getText().toString();
                              degree= Double.parseDouble(val);
                              degree=Math.sqrt(degree);
                              ed1.setText(String.valueOf(degree));
                              break;

            case R.id.btb: Intent j=new Intent(this,MainActivity.class);
                           startActivity(j);
                           break;

            case R.id.btlog:  val=ed1.getText().toString();
                              degree= Double.parseDouble(val);
                              degree=Math.log(degree);
                              ed1.setText(String.valueOf(degree));
                              break;

            case R.id.btexp:  val=ed1.getText().toString();
                              degree= Double.parseDouble(val);
                              degree=Math.exp(degree);
                              ed1.setText(String.valueOf(degree));
                              break;

            case R.id.btpi:   double pi=3.142;
                              ed1.setText(String.valueOf(pi));
                              break;

            case R.id.btxy:  val=ed1.getText().toString();
                degree= Double.parseDouble(val);
                degree=degree * degree;
                ed1.setText(String.valueOf(degree));
                break;


        }
    }
}
