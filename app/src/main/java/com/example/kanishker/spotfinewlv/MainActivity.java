package com.example.kanishker.spotfinewlv;

import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Button btnenter = (Button) findViewById(R.id.btn_enter);

        Button dlog = (Button) findViewById(R.id.btn_dialog);

        /*btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt = new Intent(getApplicationContext(),ViewUser.class);
                startActivity(intt);

            }
        });*/

        dlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);
                View mview = getLayoutInflater().inflate(R.layout.dialog_login,null);

                final EditText memail = (EditText) mview.findViewById(R.id.txt_email);
                final EditText mpassword= (EditText) mview.findViewById(R.id.txt_pword);
                Button mloginn= (Button) mview.findViewById(R.id.btn_login);


                mloginn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String mail = "abcd";
                        String pword = "1234";

                        String mail2 = memail.getText().toString();
                        String pword2 = mpassword.getText().toString();

                        if(mail.equals(mail2) && pword.equals(pword2))
                        {
                            Toast.makeText(MainActivity.this,
                                   // R.string.success_login_msg,
                                    "login Successful", Toast.LENGTH_LONG).show();
                            Intent intt = new Intent(getApplicationContext(),ViewUser.class);
                            startActivity(intt);

                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,
                                    "login failed", Toast.LENGTH_LONG).show();

                        }

                    }
                });
                mbuilder.setView(mview);
                AlertDialog Dialog = mbuilder.create();
                Dialog.show();




            }
        });
    }
}
