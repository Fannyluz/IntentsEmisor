package com.example.intentsemisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton ckb_opcion01;
    RadioButton ckb_opcion02;
    RadioButton ckb_opcion03;
    RadioButton ckb_opcion04;
    RadioButton ckb_opcion05;
    RadioButton ckb_opcion06;
    RadioButton ckb_opcion07;
    RadioButton ckb_opcion08;
    Button btn_Enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckb_opcion01 = (RadioButton)findViewById(R.id.rdo01);
        ckb_opcion02 = (RadioButton)findViewById(R.id.rdo02);
        ckb_opcion03 = (RadioButton)findViewById(R.id.rdo03);
        ckb_opcion04 = (RadioButton)findViewById(R.id.rdo04);
        ckb_opcion05 = (RadioButton)findViewById(R.id.rdo05);
        ckb_opcion06 = (RadioButton)findViewById(R.id.rdo06);
        ckb_opcion07 = (RadioButton)findViewById(R.id.rdo07);
        ckb_opcion08 = (RadioButton)findViewById(R.id.rdo08);
        btn_Enviar =(Button)findViewById(R.id.btn_enviar);

        btn_Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);


if(ckb_opcion01.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion01.getText().toString());

}
else if(ckb_opcion02.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion02.getText().toString());

}
else if(ckb_opcion03.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion03.getText().toString());

}
else if(ckb_opcion04.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion04.getText().toString());

}
else if(ckb_opcion05.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion05.getText().toString());

}
else if(ckb_opcion06.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion06.getText().toString());

}else if(ckb_opcion07.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion07.getText().toString());

}else if(ckb_opcion08.isChecked())
{
    sendIntent.putExtra(Intent.EXTRA_TEXT,ckb_opcion08.getText().toString());

}
                sendIntent.setType("text/plain");
                if(null != sendIntent.resolveActivity(getPackageManager()))
                    startActivity(Intent.createChooser(sendIntent,getResources().getText(R.string.send_to)));
            }
        });


    }
}
