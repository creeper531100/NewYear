package com.example.newyear;

import static com.example.newyear.ChickenSoup.soup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    EditText mEdit;
    Map<View, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mEdit = findViewById(R.id.edittext);
        map = new HashMap<>();

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button7 = findViewById(R.id.button7);

        map.put(button1, "你的健康度: ");
        map.put(button2, "你的事業成功率有: ");
        map.put(button3, "你的財運有: ");
        map.put(button4, "你的成功脫單機率有: ");

        button1.setOnClickListener(this::onBtnClick);
        button2.setOnClickListener(this::onBtnClick);
        button3.setOnClickListener(this::onBtnClick);
        button4.setOnClickListener(this::onBtnClick);
        button7.setOnClickListener(this::getProducerList);
    }

    private void onBtnClick(View view) {
        showCompletionAlertDialog(map.get(view));
    }

    private void getProducerList(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }


    private void showCompletionAlertDialog(String a) {
        String name = mEdit.getText().toString();
        int number = ((int) (Math.random() * 100) + 1);
        int index = (int) ((float) (number / 100.0) * (float) soup.length);

        String title = name + a + number + "%\n";
        String msg = soup[index];

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(msg)
                .setPositiveButton("不好", null)
                .setIcon(R.drawable.ic_launcher_foreground)
                .show();
    }
}