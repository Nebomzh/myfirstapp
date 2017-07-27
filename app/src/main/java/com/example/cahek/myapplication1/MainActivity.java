package com.example.cahek.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        final Spinner feedbackSpinner1 = (Spinner) findViewById(R.id.Spinner1);
        String spinner1= feedbackSpinner1.getSelectedItem().toString();

        final EditText nameField2 = (EditText) findViewById(R.id.EditText2);
        String name2 = nameField2.getText().toString();

        final EditText nameField3 = (EditText) findViewById(R.id.EditText3);
        String name3 = nameField3.getText().toString();

        final EditText nameField4 = (EditText) findViewById(R.id.EditText4);
        String name4 = nameField4.getText().toString();

        final Spinner feedbackSpinner5 = (Spinner) findViewById(R.id.Spinner5);
        String spinner5= feedbackSpinner5.getSelectedItem().toString();

        final Spinner feedbackSpinner6 = (Spinner) findViewById(R.id.Spinner6);
        String spinner6= feedbackSpinner6.getSelectedItem().toString();

        final EditText nameField7 = (EditText) findViewById(R.id.EditText7);
        String name7 = nameField7.getText().toString();

        final CheckBox responseCheckbox8 = (CheckBox) findViewById(R.id.CheckBox8);
        boolean Check8= responseCheckbox8.isChecked();

        final CheckBox responseCheckbox9 = (CheckBox) findViewById(R.id.CheckBox9);
        boolean Check9= responseCheckbox9.isChecked();

        final EditText nameField10 = (EditText) findViewById(R.id.EditText10);
        String name10 = nameField10.getText().toString();

        final EditText nameField11 = (EditText) findViewById(R.id.EditText11);
        String name11 = nameField11.getText().toString();

        Button ButtonSendFeedback = (Button) findViewById(R.id.ButtonSendFeedback);
        ButtonSendFeedback.setEnabled(false);       //Делаем кнопку неактивной

    }

    public void sendFeedback(View button) {

    }
}
