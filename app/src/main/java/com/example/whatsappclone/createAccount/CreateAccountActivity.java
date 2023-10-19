package com.example.whatsappclone.createAccount;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.whatsappclone.R;
import com.example.whatsappclone.databinding.ActivityCreateAccountBinding;
import com.example.whatsappclone.login.LoginActivity;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityCreateAccountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setListeners();
    }

    private void setListeners(){



        binding.tvLoginAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int itemId = view.getId();

        if(itemId == binding.tvLoginAccount.getId()){
            /* OnBackPressed esta deprecado, esta es la nueva forma de gestionar el pulsar el botón hacia atrás*/
            new OnBackPressedCallback(true) {
                @Override
                public void handleOnBackPressed() {
                    finish();
                }
            }.handleOnBackPressed();
        }
    }
}