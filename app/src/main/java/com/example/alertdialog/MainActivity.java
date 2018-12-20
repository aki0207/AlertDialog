package com.example.alertdialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                /*AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("確認");
                builder.setMessage("ＸＸＸしてもよろしいですか？");
                builder.setPositiveButton("はい", null);
                builder.setNegativeButton("いいえ", null);
                builder.setNeutralButton("キャンセル", null);
                builder.create().show();
*/

                // アラート表示
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                // ダイアログの設定
                alertDialog.setTitle("Dialog作ってみたよん");          //タイトル
                alertDialog.setMessage("あなたは?");      //内容
                alertDialog.setPositiveButton("私が神だ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        context = getApplication();
                        Toast.makeText(context, "神様ぁ～", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNeutralButton("飛べない豚", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        context = getApplication();
                        Toast.makeText(context, "ぶひぃ～", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("NPC", null)
                        .show();

            }
        });









    }
}
