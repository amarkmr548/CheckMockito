package com.src;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.stubbing.answers.AnswerReturnValuesAdapter;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest(App.class)
public class AppTest {
	@Test
	public void testStaticMethod(){
		PowerMockito.mockStatic(App.class, new Answer<String>() {
			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				return "check";
			}
		});
		
		System.out.println(App.testMock());
	}
}
