package com.example.whatsappclone.FCM;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.whatsappclone.utils.Constantes;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d(Constantes.TAG_FCM, "Token: " + token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d(Constantes.TAG_FCM, "Mensaje FCM: " + message.getNotification().getBody());
    }

}
