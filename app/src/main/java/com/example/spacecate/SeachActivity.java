package com.example.spacecate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SeachActivity extends Activity {

    TextView textView;
    private String[] mString=new String[]{"aaa","bbb","ccc"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*textView=findViewById(R.id.main_searchtv);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(2);
                //返回
                finish();
            }
        });*/
    }
}
