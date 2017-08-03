package com.example.cahek.myapplication1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import android.util.Log;    //Для Логов


public class MainActivity extends Activity implements View.OnClickListener {

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity: onCreate()");

        //Находим кнопки
        Button button1 = (Button)findViewById(R.id.button1);

        //Присваиваем кнопкам обработчик
        button1.setOnClickListener(this);   //Обработчик находится в самом активити
    }

//            final Spinner feedbackSpinner1 = (Spinner) findViewById(R.id.Spinner1);
//            String spinner1= feedbackSpinner1.getSelectedItem().toString();
//
//            final EditText nameField2 = (EditText) findViewById(R.id.EditText2);
//            String name2 = nameField2.getText().toString();
//
//            final EditText nameField3 = (EditText) findViewById(R.id.EditText3);
//            String name3 = nameField3.getText().toString();
//
//            final EditText nameField4 = (EditText) findViewById(R.id.EditText4);
//            String name4 = nameField4.getText().toString();
//
//            final Spinner feedbackSpinner5 = (Spinner) findViewById(R.id.Spinner5);
//            String spinner5= feedbackSpinner5.getSelectedItem().toString();
//
//            final Spinner feedbackSpinner6 = (Spinner) findViewById(R.id.Spinner6);
//            String spinner6= feedbackSpinner6.getSelectedItem().toString();
//
//            final EditText nameField7 = (EditText) findViewById(R.id.EditText7);
//            String name7 = nameField7.getText().toString();
//
//            final CheckBox responseCheckbox8 = (CheckBox) findViewById(R.id.CheckBox8);
//            boolean Check8= responseCheckbox8.isChecked();
//
//            final CheckBox responseCheckbox9 = (CheckBox) findViewById(R.id.CheckBox9);
//            boolean Check9= responseCheckbox9.isChecked();
//
//            final EditText nameField10 = (EditText) findViewById(R.id.EditText10);
//            String name10 = nameField10.getText().toString();
//
//            final EditText nameField11 = (EditText) findViewById(R.id.EditText11);
//            String name11 = nameField11.getText().toString();
//
//            Button ButtonSendFeedback = (Button) findViewById(R.id.ButtonSendFeedback);
//            ButtonSendFeedback.setEnabled(false);       //Делаем кнопку неактивной
//
//    }
//
//    public void sendFeedback(View button) {
//
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }
}
