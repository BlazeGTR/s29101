package com.s29101.Bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BankApplicationTests {

	@Autowired
	private UserStorage userStorage;
	@Autowired
	private UserService userService;

	@AfterEach
	void cleanup()
	{
		userStorage.purgeList();
	}

	@Test
	void shouldNotFindUser()
	{
		//GIVEN
		userStorage.addUser(new User(1,100,"ABC","DEF"));

		//WHEN
		Optional<User> userByID = userService.findUserByID(2);

		//THEN
		assertThat(userByID).isNotPresent();
	}

	@Test
	void shouldNotFindUser2()
	{
		//GIVEN
		userStorage.addUser(new User(1,100,"ABC","DEF"));
		userStorage.addUser(new User(3,1002,"ABSC","DEFG"));

		//WHEN
		Optional<User> userByID = userService.findUserByID(2);

		//THEN
		assertThat(userByID).isNotPresent();
	}

	@Test
	void shouldFindUser()
	{
		//GIVEN
		userStorage.addUser(new User(1,100,"ABC","DEF"));
		userStorage.addUser(new User(2,1002,"ABSC","DEFG"));

		//WHEN
		Optional<User> userByID = userService.findUserByID(2);

		//THEN
		assertThat(userByID).isPresent();
	}

	@Test
	void shouldFindUser2()
	{
		//GIVEN
		userStorage.addUser(new User(1,100,"ABC","DEF"));

		//WHEN
		Optional<User> userByID = userService.findUserByID(1);

		//THEN
		assertThat(userByID).isPresent();
	}

	@Test
	void shouldReturnError1FromSend()
	{
		//GIVEN
			userStorage.addUser(new User(1,1000,"ABC","DEF"));

		//WHEN
			ReturnInfoObject ret = userService.sendTransfer(2,100);

		//THEN
			assertThat(ret.getStatusCode()).isEqualTo(1);
	}

	@Test
	void shouldReturnError2FromSend()
	{
		//GIVEN
		userStorage.addUser(new User(1,100,"ABC","DEF"));

		//WHEN
		ReturnInfoObject ret = userService.sendTransfer(1,1000);

		//THEN
		assertThat(ret.getStatusCode()).isEqualTo(2);
	}

	@Test
	void shouldReturnNoErrorFromSend()
	{
		//GIVEN
		userStorage.addUser(new User(1,1000,"ABC","DEF"));

		//WHEN
		ReturnInfoObject ret = userService.sendTransfer(1,100);

		//THEN
		assertThat(ret.getStatusCode()).isEqualTo(0);
		assertThat(ret.getNoweSaldo()).isEqualTo(900);
	}
}


//GIVEN


//WHEN


//THEN

