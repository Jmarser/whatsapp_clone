package com.example.whatsappclone.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.whatsappclone.createAccount.CreateAccountActivity;
import com.example.whatsappclone.databinding.ActivityLoginBinding;
import com.example.whatsappclone.utils.Constantes;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

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