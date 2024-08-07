package com.accenture.loginpage;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginpageApplication {

	public static void main(String[] args) throws IOException {
//
//		ClassLoader classLoader = LoginpageApplication.class.getClassLoader();
//
//		File file = new File(Objects.requireNonNull(classLoader.getResource("/src/main/resources/serviceAccountKey.json")).getFile());
//
//		FileInputStream serviceAccount = new FileInputStream(file.getAbsoluteFile());
//
//		FirebaseOptions options = new FirebaseOptions.Builder()
//				.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
//
//		FirebaseApp.initializeApp(options);

		SpringApplication.run(LoginpageApplication.class, args);
	}

}
