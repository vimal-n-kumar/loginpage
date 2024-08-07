package com.accenture.loginpage.services;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.accenture.loginpage.entities.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserService {

	private static final String COLLECTION_NAME = "user";

	public String saveUser(User user) throws InterruptedException, ExecutionException {
		Firestore firestore = FirestoreClient.getFirestore();

		ApiFuture<WriteResult> apiFuture = firestore.collection(COLLECTION_NAME).document(user.getName()).set(user);

		return apiFuture.get().getUpdateTime().toString();

	}

}
