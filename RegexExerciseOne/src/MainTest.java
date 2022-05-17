import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void allCapTest() {
		String actual = "LKSDJFLSKDJFLSDKFJSLKFJOIEUROWIEUROWIEUR";
		String expected = "[A-Z\\s]+";
		assertTrue(actual.matches(expected));
	}
	
	@Test
	void allCapTest2() {
		String actual = "aKSDJFLSKDJFLSDKFJSLKFJOIEUROWIEUROWIEUR";
		String expected = "[A-Z\\s]+";
		assertFalse(actual.matches(expected));
	}
	
	@Test
	void hasNumTest() {
		String actual = "1KSDJFLSKDJFLSDKFJSLKFJOIEUROWIEUROWIEUR";
		String expected = ".*[0-9].*";
		assertTrue(actual.matches(expected));
	}
	
	@Test
	void hasNumTest2() {
		String actual = "KSDJFLSKDJFLSDKFJSLKFJOIEUROWIEUROWIEUR";
		String expected = ".*[0-9].*";
		assertFalse(actual.matches(expected));
	}
	
	@Test
	void validPhoneTest() {
		String actual = "(123)456-7890";
		String expected = "\\(\\d{3}\\)\\d{3}-\\d{4}";
		assertTrue(actual.matches(expected));
	}
	
	@Test
	void validPhoneTest2() {
		String actual = "(123)456_7890";
		String expected = "\\(\\d{3}\\)\\d{3}-\\d{4}";
		assertFalse(actual.matches(expected));
	}
	
	@Test
	void validDateTest() {
		String actual = "21/12/2001";
		String expected = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
		assertTrue(actual.matches(expected));
	}
	
	@Test
	void validDateTest2() {
		//this one is opposite format of mm/dd/yyyy
		//therefore it should be false
		String actual = "12/21/2001";
		String expected = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
		assertFalse(actual.matches(expected));
	}

}
