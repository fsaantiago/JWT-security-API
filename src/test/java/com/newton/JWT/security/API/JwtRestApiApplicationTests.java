package com.newton.JWT.security.API;

import com.newton.JWT.security.API.model.LoginRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwtRestApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void main() {
		JwtRestApiApplication.main(new String[]{});
	}

	@Test
	void loginRequest() {
		LoginRequest loginRequest = new LoginRequest();
	}

	@Test
	void loginRequestConstructor() {
		LoginRequest loginRequest = new LoginRequest("username", "password");
	}

	@Test
	void loginRequestGetUsername() {
		LoginRequest loginRequest = new LoginRequest("username", "password");
		loginRequest.getUsername();
	}

	@Test
	void loginRequestSetUsername() {
		LoginRequest loginRequest = new LoginRequest("username", "password");
		loginRequest.setUsername("username");
	}

	@Test
	void loginRequestGetPassword() {
		LoginRequest loginRequest = new LoginRequest("username", "password");
		loginRequest.getPassword();
	}

	@Test
	void loginRequestSetPassword() {
		LoginRequest loginRequest = new LoginRequest("username", "password");
		loginRequest.setPassword("password");
	}
}
