package com.example.getmesocialservice.service;

import com.example.getmesocialservice.Model.FirebaseUser;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

@Service
public class FirebaseService {

    public FirebaseApp intializeFirebase() throws IOException {

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:getmesocial-service-firebase.json");

        FileInputStream serviceAccount = new FileInputStream(resource.getFile());

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://getmesocial-service.firebaseio.com")
                .build();

        return FirebaseApp.initializeApp(options);
    }

    public FirebaseUser authenticatin(String idToken) throws IOException, FirebaseAuthException {

        String uid = FirebaseAuth.getInstance(intializeFirebase()).verifyIdToken(idToken).getUid();
        String name = FirebaseAuth.getInstance(intializeFirebase()).verifyIdToken(idToken).getName();
        String email = FirebaseAuth.getInstance(intializeFirebase()).verifyIdToken(idToken).getEmail();

        return new FirebaseUser(uid, name, email);
    }


}

