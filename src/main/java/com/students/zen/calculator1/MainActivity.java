package com.students.zen.calculator1;

import android.content.Intent;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
// powerohit@gmail.com

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     evaluate eval  = new evaluate();
    double ans;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,ba,bs,bm,bd,beq,bdot,trig,toast,back;
    EditText ed;
    StringBuilder sb = null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.first);

        b0=(Button)findViewById(R.id.bt0);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        b5=(Button)findViewById(R.id.bt5);
        b6=(Button)findViewById(R.id.bt6);
        b7=(Button)findViewById(R.id.bt7);
        b8=(Button)findViewById(R.id.bt8);
        b9=(Button)findViewById(R.id.bt9);
        bc=(Button)findViewById(R.id.btc);
        ba=(Button)findViewById(R.id.bta);
        bs=(Button)findViewById(R.id.bts);
        bm=(Button)findViewById(R.id.btm);
        bd=(Button)findViewById(R.id.btd);
        beq=(Button)findViewById(R.id.bteq);
        bdot=(Button)findViewById(R.id.btdot);
        trig=(Button)findViewById(R.id.tr);
        back=(Button)findViewById(R.id.home);
        ed=(EditText)findViewById(R.id.et1);
        toast=(Button) findViewById(R.id.toast);


        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bc.setOnClickListener(this);
        ba.setOnClickListener(this);
        bs.setOnClickListener(this);
        bm.setOnClickListener(this);
        bd.setOnClickListener(this);
        beq.setOnClickListener(this);
        bdot.setOnClickListener(this);
        trig.setOnClickListener(this);
        toast.setOnClickListener(this);
        back.setOnClickListener(this);

        sb = new StringBuilder();
    }

    @Override
    public void onClick(View view)

    {
        switch (view.getId())
        {

            case R.id.bt0 : sb.append(0);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt1 : sb.append(1);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt2 : sb.append(2);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt3 : sb.append(3);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt4 : sb.append(4);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt5 : sb.append(5);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt6 : sb.append(6);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt7 : sb.append(7);
                            ed.setText(sb.toString());
                            break;

            case R.id.bt8 : sb.append(8);
                            ed.setText(sb.toString());
                            break;


            case R.id.bt9 : sb.append(9);
                            ed.setText(sb.toString());
                            break;

            case R.id.bta : sb.append('+');
                            ed.setText(sb.toString());
                            break;

            case R.id.bts : sb.append('-');
                            ed.setText(sb.toString());
                            break;

            case R.id.btm : sb.append('*');
                            ed.setText(sb.toString());
                            break;

            case R.id.btd : sb.append('/');
                            ed.setText(sb.toString());
                            break;

            case R.id.btc : ed.setText("         ");
                            int i = sb.length();
                            sb.delete(0,i+1);
                            break;

            case R.id.bteq : ans = eval.infix(sb.toString());
                             ed.setText(String.valueOf(ans));
                             // ed.setText(Double.parseDouble(ans));
                             break;

            case R.id.tr :   Intent t=new Intent(this,trigo.class);
                             startActivity(t);
                             break;

            case R.id.btdot : sb.append('.');
                ed.setText(sb.toString());
                break;
            case R.id.home : Intent j=new Intent(this,first.class);
                            startActivity(j);
                             break;
            default :
                     Toast.makeText(this,"Not coded yet",Toast.LENGTH_SHORT).show();
        }

    }



}
