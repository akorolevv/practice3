package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("SetTextI18n")

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        EditText editText = new EditText(this);
        editText.setHint("Введите Email");
        editText.setId(View.generateViewId()); // уникальный идентификатор для EditText

        Button button = new Button(this);
        button.setText("Отправить");
        button.setId(View.generateViewId()); // Генерирует уникальный идентификатор для Button

        ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID; // Устанавливает левую границу EditText, совпадающую с левой границей родительского элемента
        editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID; // Устанавливает верхнюю границу EditText, совпадающую с верхней границей родительского элемента
        editTextLayout.rightToLeft = button.getId(); // Устанавливает правую границу EditText, совпадающую с левой границей Button.

        editText.setLayoutParams(editTextLayout);
        constraintLayout.addView(editText);

        ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        buttonLayout.leftToRight = editText.getId(); // Устанавливает левую границу Button, совпадающую с правой границей EditText
        buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID; // Устанавливает верхнюю границу Button, совпадающую с верхней границей родительского элемента

        button.setLayoutParams(buttonLayout);
        constraintLayout.addView(button);

        setContentView(constraintLayout);








        /*setContentView(R.layout.second_layout);
        TextView textView = findViewById(R.id.header);
        textView.setText("New Hello World!");

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float widthDp = displayMetrics.widthPixels / displayMetrics.density;
        float heightDp = displayMetrics.heightPixels / displayMetrics.density;
        textView.setText("Width: " + widthDp + " dp, Height: " + heightDp + " dp");


        float widthPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, widthDp, getResources().getDisplayMetrics());
        float heightPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, heightDp, getResources().getDisplayMetrics());

        TextView textView2 = findViewById(R.id.same);
        textView2.setText("Width: " + widthPx + " px, Height: " + heightPx + " px");
         */

        /*textView2.setPadding(0, 10, 0, 10);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 800, 0, 800);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView2.setLayoutParams(layoutParams);

         */




    }


}