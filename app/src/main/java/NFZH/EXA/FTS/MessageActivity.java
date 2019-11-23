package NFZH.EXA.FTS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent  = getIntent();

        String message = "This is the defaul value";
        if (intent.hasExtra("message"))
        {
            message = intent.getExtras().getString("message");
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView text = findViewById(R.id.textView);
        text.setText(message);
    }
}
