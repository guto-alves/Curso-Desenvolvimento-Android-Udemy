package com.gutotech.organizze.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFirebase {
    private static FirebaseAuth auth;
    private static DatabaseReference databaseReference;

    public static FirebaseAuth getFirebaseAuth() {
        if (auth == null)
            auth = FirebaseAuth.getInstance();
        return auth;
    }

    public static DatabaseReference getFirebaseDatabase() {
        if (databaseReference == null)
            databaseReference = FirebaseDatabase.getInstance().getReference();
        return databaseReference;
    }
}
