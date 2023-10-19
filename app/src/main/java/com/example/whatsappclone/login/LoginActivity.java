package com.example.whatsappclone.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.whatsappclone.R;
import com.example.whatsappclone.createAccount.CreateAccountActivity;
import com.example.whatsappclone.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setListeners();
    }

    private void setListeners(){

        // ClickListener sin necesidad de lógica
        binding.tvNuevaCuenta.setOnClickListener(view -> startActivity(new Intent(this, CreateAccountActivity.class)));
    }
}