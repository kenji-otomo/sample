package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExerciseMathTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFactorial1() {
		assertEquals(1, ExerciseMath.factorial(1) ,"1 失敗");
	}
	@Test
	void testFactorial2() {
		assertEquals(2, ExerciseMath.factorial(2) ,"2 失敗");
	}
	@Test
	void testFactorial3() {
		assertEquals(6, ExerciseMath.factorial(3) ,"3 失敗");
		
	}
	@Test
	void testFactorial4() {
		assertEquals(24, ExerciseMath.factorial(4) ,"4 失敗");
	}
	@Test
	void testFactorial5() {
		assertEquals(120, ExerciseMath.factorial(5) ,"5 失敗");
	}
	@Test
	void testFactorial6() {
		
		//エラーを返せばcatchに送られるため、そのままテスト成功する
		//
		//数値が違うためダメだった場合はテストが失敗
		//数値が合致してしまった場合もfailに送られるためテスト失敗
		//
		try {
			assertEquals(1, ExerciseMath.factorial(0) ,"6 失敗");
			fail();
		} catch (Exception e) {
			assertEquals("渡された値が正しくありません", e.getMessage(),"例外のメッセージが正しくありません");
		}
	}

}
