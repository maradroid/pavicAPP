package com.maradroid.pavicapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstNameTV;
    private TextView firstSurnameTV;
    private TextView firstBirthdayTV;
    private TextView firstBioTV;

    private TextView secondNameTV;
    private TextView secondSurnameTV;
    private TextView secondBirhtdayTV;
    private TextView secondBioTV;

    private InspiringPerson firstPerson;
    private InspiringPerson secondPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        makeDummyData();
        setDataToTextViews();
    }

    private void initViews() {
        firstNameTV = (TextView) findViewById(R.id.first_name_tv);
        firstSurnameTV  = (TextView) findViewById(R.id.first_surname_tv);
        firstBirthdayTV  = (TextView) findViewById(R.id.first_birthday_tv);
        firstBioTV  = (TextView) findViewById(R.id.first_bio_tv);

        secondNameTV  = (TextView) findViewById(R.id.second_name_tv);
        secondSurnameTV  = (TextView) findViewById(R.id.second_surname_tv);
        secondBirhtdayTV = (TextView) findViewById(R.id.second_birthday_tv);
        secondBioTV  = (TextView) findViewById(R.id.second_bio_tv);

    }

    private void makeDummyData() {

        firstPerson = new InspiringPerson("Zuhra", "Muhra", "45.6.7869.", "Dobar covijek");

        secondPerson = new InspiringPerson("Sime", "Zajebant", "23.4.1345.", "Vozi trabant");
    }

    private void setDataToTextViews() {

        firstNameTV.setText(firstPerson.getName());
        firstSurnameTV.setText(firstPerson.getSurname());
        firstBirthdayTV.setText(firstPerson.getBirthday());
        firstBioTV.setText(firstPerson.getBio());

        secondNameTV.setText(secondPerson.getName());
        secondSurnameTV.setText(secondPerson.getSurname());
        secondBirhtdayTV.setText(secondPerson.getBirthday());
        secondBioTV.setText(secondPerson.getBio());
    }
}
