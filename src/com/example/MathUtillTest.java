package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtillTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("テスト前の準備作業があればここに書く");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("テスト後の後始末があればここに書く");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("毎回テスト前に実行、毎テスト毎の準備があれば");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("毎テスト後に実行、テスト後の後始末があれば");
	}

	@Test
	void testPower1() {
	//	assertEquals(期待値, 実測値 , 期待値と実測値が一致しなかった場合のメッセージ);
		assertEquals(1, MathUtill.power(0, 0),"テストケース１失敗");
	}
	@Test
	void testPower2() {
		assertEquals(Double.POSITIVE_INFINITY, MathUtill.power(0, -1),"テストケース2失敗");
		
	}
	@Test
	void testPower3() {
	}

}
