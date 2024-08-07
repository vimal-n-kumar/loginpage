package com.accenture.loginpage.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.accenture.loginpage.entities.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserService {

	private static final String COLLECTION_NAME = "user";

	// SAVE USER
	public String saveUser(User user) throws InterruptedException, ExecutionException {
		Firestore firestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> apiFuture = firestore.collection(COLLECTION_NAME).document(user.getName()).set(user);
		return apiFuture.get().getUpdateTime().toString();
	}

	// GET USER
	public List<User> getUser() throws InterruptedException, ExecutionException {

		Firestore firestore = FirestoreClient.getFirestore();

		Iterable<DocumentReference> documentRef = firestore.collection(COLLECTION_NAME).listDocuments();

		Iterator<DocumentReference> iterator = documentRef.iterator();

		List<User> userList = new ArrayList();
		User user = null;

		while (iterator.hasNext()) {
			DocumentReference documentRef1 = iterator.next();
			ApiFuture<DocumentSnapshot> future = documentRef1.get();
			DocumentSnapshot documentSnapshot = future.get();

			user = documentSnapshot.toObject(User.class);
			userList.add(user);
		}
		return userList;

	}

}
