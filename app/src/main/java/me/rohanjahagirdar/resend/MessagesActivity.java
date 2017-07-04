package me.rohanjahagirdar.resend;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MessagesActivity extends AppCompatActivity {
    @BindView(R.id.messageText)
    EditText messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sendButton)
    public void onClick(View view) {
        String message = messageText.getText().toString();
        System.out.print(message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
