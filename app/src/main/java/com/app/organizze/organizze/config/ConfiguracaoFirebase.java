package com.app.organizze.organizze.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao;

    //Retornar a instancia doo firebase


    public static FirebaseAuth getFirebaseAutenticacao() {
        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}
