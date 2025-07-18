package com.example.rest_api;

import com.example.rest_api.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new UserRequest();
		System.out.println(user);
		user.setUserName("홍길동");
		user.setUserAge(10);
		user.setEmail("hong@gmail.com");
		user.setIsKorean(true);

		//직렬화
		var json = objectMapper.writeValueAsString(user);
		System.out.println(json);

		//역직렬화
		//var dto = objectMapper.readValue(json, UserRequest.class);
		//System.out.println(dto);
	}

}
