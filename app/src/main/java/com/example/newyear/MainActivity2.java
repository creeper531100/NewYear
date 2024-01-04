package com.example.newyear;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    String[] arr = {
            "是種自己的花，愛自己的宇宙，在不完美的生活裡，找到閃亮亮的快樂。",
            "是控制好身材，賺得了錢，是又美又能幹，充滿勇氣的樣子。",
            "是遇爛人能及時止損，遇爛事及時抽身，不責備、不抱怨、不自欺，往前走。",
            "是無論境地有多糟糕，永遠站在自己這一邊，不苟且、不認輸、不絕望、信自己。",
            "是在面臨外界衝擊時，不在後悔與絕望中沉淪，不搖擺、不慌張、不露怯、有能量。",
            "是把「這件事為什麼會發生在我身上」轉換成「這件事教我什麼」，去解決問題，而不是讓情緒無限蔓延。",
            "光與影，此起彼伏的，是青春的吶喊\n" +
                    "酒與菸，穿梭跳動的，是狂歡的魂魄\n" +
                    "年輕的心兒感染上了瘋狂的音符\n" +
                    "束縛的肉體點染上了叛逆的色彩\n" +
                    "酒與影，一口喝下最甜美的瓊漿\n" +
                    "菸與光，一口嚥下最炙熱的星火\n" +
                    "每一分，我的血液都在狂奔\n" +
                    "每一秒，我的大腦都在陶醉\n" +
                    "腳步虛浮，每踏的一步都是青春\n" +
                    "眼神迷離，每看的一瞬都是熱血\n" +
                    "歲月如梭，韶光伊始",
            "猶如烈焰亦如寒冰\n" +
                    "猶如蜂蜜亦如苦藥\n" +
                    "每一杯裡映著五顏六色的青春\n" +
                    "每一盞中泛著多彩多姿的光陰\n" +
                    "一同暢飲的是此刻，是歲月，是一去不復的昨日",
            "抬手便摘下了星辰\n" +
                    "轉眼又呼出了雲霞\n" +
                    "一口苦澀的，青春\n" +
                    "一口甜膩的，青春\n" +
                    "廿與廿是我對於熱血的思念\n" +
                    "星辰黯淡，雲霞散去，回味著每個",

            "別害怕別人怎麼看你，因為沒有人看你。\n" +
                    "\n" +
                    "失敗並不可怕，\n" +
                    "可怕的是你還相信這句話。\n" +
                    "\n" +
                    "有時候不努力一下，\n" +
                    "不知道什麼叫絕望。\n" +
                    "\n" +
                    "好好活下去，每天都有新打擊。\n" +
                    "\n" +
                    "最靠得住的是金錢，最靠不住的是人心。",

            "雨水澆灌起了青春\n" +
                    "寒風吹鼓起了信仰\n" +
                    "讓狂熱的心敲奏起永恆詩歌\n" +
                    "終將曾經的吾等\n" +
                    "必將遺忘的吾輩\n" +
                    "滲入到每一言詩歌\n" +
                    "沁入至每一刻歲月\n" +
                    "當暮時白髮，歲月糢糊了視野\n" +
                    "當旗幟褪黃，光陰抹去了鮮豔\n" +
                    "僅剩，追憶與靜",

            "你必須非常努力，才可以證明自己真的無能為力。\n" +
                    "\n" +
                    "下一個會更好。\n" +
                    "\n" +
                    "努力的過程通常是不具備說服力的，它沉悶、無味、平凡。\n" +
                    "\n" +
                    "這世界很可愛，別急著失望。\n" +
                    "\n" +
                    "一個人不能活得太容易，但也別把自己逼得太狠，你要有界線。\n" +
                    "\n" +
                    "你並非一無所有，你還有病和未完成的夢想。",
            "騙自己的時間久了，也會將一些不存在的事誤以為真。\n" +
                    "\n" +
                    "不愛你的人，比你想像中更不愛你。\n" +
                    "\n" +
                    "生活夠無趣了，千萬不要在無趣中老去。"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText mEdit = (EditText)findViewById(R.id.edittext);

        ((Button)findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int number = ((int)(Math.random()*100)+1);
                int index = (int)((float)(number / 100.0) * (float)arr.length);
                showCompletionAlertDialog(mEdit.getText().toString() + "你的健康度: " + number + "%\n", arr[index]);
            }
        });

        ((Button)findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int number = ((int)(Math.random()*100)+1);
                int index = (int)((float)(number / 100.0) * (float)arr.length);
                showCompletionAlertDialog(mEdit.getText().toString() + "你的事業成功率有: " + number + "%\n", arr[index]);
            }
        });

        ((Button)findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int number = ((int)(Math.random()*100)+1);
                int index = (int)((float)(number / 100.0) * (float)arr.length);
                showCompletionAlertDialog(mEdit.getText().toString() + "你的財運有: " + number + "%\n", arr[index]);
            }
        });

        ((Button)findViewById(R.id.button4)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int number = ((int)(Math.random()*100)+1);
                int index = (int)((float)(number / 100.0) * (float)arr.length);
                showCompletionAlertDialog(mEdit.getText().toString() + "你的成功脫單機率有: " + number + "%\n", arr[index]);
            }
        });

        ((Button)findViewById(R.id.button7)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 啟動新的MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    private void showCompletionAlertDialog(String title, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(msg)
                .setPositiveButton("不好", null)
                .setIcon(R.drawable.ic_launcher_foreground)
                .show();

    }
}