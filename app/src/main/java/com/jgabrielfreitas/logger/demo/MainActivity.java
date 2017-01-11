package com.jgabrielfreitas.logger.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.jgabrielfreitas.logger.Logger;

public class MainActivity extends AppCompatActivity {

  Button   logButton;
  EditText messageEditText;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    messageEditText = (EditText) findViewById(R.id.messageEditText);
    logButton       = (Button)   findViewById(R.id.logButton);

    logButton.setOnClickListener(new OnClickListener() {
      @Override public void onClick(View view) {
        String messageToLog = messageEditText.getText().toString();
        new Logger().error(messageToLog);
      }
    });
  }
}
