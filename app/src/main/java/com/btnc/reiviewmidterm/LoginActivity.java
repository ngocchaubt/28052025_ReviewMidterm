package com.btnc.reiviewmidterm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.btnc.reiviewmidterm.connectors.AccountConnector;
import com.btnc.reiviewmidterm.models.Account;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    CheckBox chkSaveLoginInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        addViews();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    private void addViews() {
        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        chkSaveLoginInfo=findViewById(R.id.chkSaveLoginInfo);
    }

    public void do_login(View view) {
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        AccountConnector ac=new AccountConnector();
        Account acc=ac.login(username,password);
        if (acc!=null)
        {
            Intent intent=new Intent(this, ProductManagementActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,
                    "Login failed, please check your account again!", Toast.LENGTH_SHORT).show();
        }

    }
    public void saveLoginInInformation()
    {
        SharedPreferences preferences=getSharedPreferences("LOGIN_INFORMATION",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();
        boolean isSave=chkSaveLoginInfo.isChecked();
        editor.putString("USERNAME",username);
        editor.putString("PASSWORD",password);
        editor.putBoolean("SAVED",isSave);
        editor.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveLoginInInformation();
    }
    public void restoreLoginInformation()
    {
        SharedPreferences preferences=getSharedPreferences("LOGIN_INFORMATION",MODE_PRIVATE);
        String username = preferences.getString("USERNAME","");
        String password = preferences.getString("PASSWORD","");
        boolean isSave=preferences.getBoolean("SAVED",true);
        if(isSave)
        {
            edtUsername.setText(username);
            edtPassword.setText(password);
            chkSaveLoginInfo.setChecked(isSave);
        }
    }

    //phục hồi dữ liệu
    @Override
    protected void onResume() {
        super.onResume();
        restoreLoginInformation();
    }
}