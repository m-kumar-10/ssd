/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        /**
         * Doing stuffs for Onclick Listener Of the NumberView and
         * going to Numbers Activity.
         */
        TextView NumbersTextView = (TextView) findViewById(R.id.numbers);
        NumbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentNumber = new Intent(MainActivity.this, Numbers.class);
                startActivity(IntentNumber);
            }
        });

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         *          * Doing stuffs for Onclick Listener Of the FamilyView and
         *          Going to Family Activity.
         */
        TextView familyTextView = (TextView) findViewById(R.id.family);
        // Declaring and Attaching OnClickListener with our familyTextView in concise way of codes.
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentFamily = new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(IntentFamily);

                Toast.makeText(v.getContext(), "Get Family Toast Message", Toast.LENGTH_SHORT).show();
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /**
         *          * Doing stuffs for Onclick Listener Of the ColorsView and
         *          Going to Colors Activity.
         */
        TextView ColorTextView = (TextView) findViewById(R.id.colors);
        ColorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentColors = new Intent(MainActivity.this, Colors.class);
                Toast.makeText(v.getContext(), "Get Colors Toast Message", Toast.LENGTH_SHORT).show();
                startActivity(IntentColors);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /**
         * Doing Stuffs for PhrasesView and
         * going to Phrases Activity
         */
        TextView PhrasesTextView = (TextView) findViewById(R.id.phrases);
        PhrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentPhrases = new Intent(MainActivity.this, Phrases.class);
                startActivity(IntentPhrases);
                Toast.makeText(v.getContext(), "Get Phrases Toast Message", Toast.LENGTH_SHORT).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }


}
