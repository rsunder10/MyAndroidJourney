package com.example.sunder.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clr;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operand1=(EditText)findViewById(R.id.editOperand1);
        operand2=(EditText)findViewById(R.id.editOperand2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        result=(TextView) findViewById(R.id.results);
        clr=(Button)findViewById(R.id.clr);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand1.setText("");
                operand2.setText("");
                result.setText("0.00");
                operand1.clearFocus();
                operand2.clearFocus();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                    Double value1=Double.parseDouble(operand1.getText().toString());
                    Double value2=Double.parseDouble(operand2.getText().toString());
                    Double val_eq =value1+value2;
                    operand1.clearFocus();
                    operand2.clearFocus();
                    result.setText(val_eq.toString());
                }else{
                    Toast.makeText(MainActivity.this,"Dont Leave the form Empty",Toast.LENGTH_LONG).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                    Double value1=Double.parseDouble(operand1.getText().toString());
                    Double value2=Double.parseDouble(operand2.getText().toString());
                    Double val_eq =value1*value2;
                    result.setText(val_eq.toString());
                    operand1.clearFocus();
                    operand2.clearFocus();
                }else{
                    Toast.makeText(MainActivity.this,"Dont Leave the form Empty",Toast.LENGTH_LONG).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                    Double value1=Double.parseDouble(operand1.getText().toString());
                    Double value2=Double.parseDouble(operand2.getText().toString());
                    Double val_eq =value1/value2;
                    result.setText(val_eq.toString());
                    operand1.clearFocus();
                    operand2.clearFocus();
                }else{
                    Toast.makeText(MainActivity.this,"Dont Leave the form Empty",Toast.LENGTH_LONG).show();
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)){
                    Double value1=Double.parseDouble(operand1.getText().toString());
                    Double value2=Double.parseDouble(operand2.getText().toString());
                    Double val_eq =value1-value2;
                    result.setText(val_eq.toString());
                    operand1.clearFocus();
                    operand2.clearFocus();
                }else{
                    Toast.makeText(MainActivity.this,"Dont Leave the form Empty",Toast.LENGTH_LONG).show();
                }
            }
        });
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
