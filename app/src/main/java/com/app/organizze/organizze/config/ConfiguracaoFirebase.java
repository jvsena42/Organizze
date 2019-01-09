package com.app.organizze.organizze.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao;
    private static DatabaseReference firebase;

    //Retornar a instancia doo firebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao() {
        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }

    //Retornar instancia do firebaseDatabase
    public static DatabaseReference getFirebaseDatabase(){
        if (firebase==null){
            firebase = FirebaseDatabase.getInstance().getReference();
        }
        return firebase;
    }
}
