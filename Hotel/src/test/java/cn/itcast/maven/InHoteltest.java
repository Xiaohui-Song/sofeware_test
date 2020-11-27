package cn.itcast.maven;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import  cn.itcast.maven.IData;
import  cn.itcast.maven.InHotel;


public class InHoteltest {
	
	private Mockery context = new Mockery();
	
	private IData iData = null;
	private InHotel_test ih = null;

	@Before
	public void setUp() throws Exception {
		//生成一个mock对象
		iData = context.mock(IData.class);
				
		ih = new InHotel_test(iData);
		//设置期望
		context.checking(new Expectations() {{
			oneOf(iData).in_Out_Rooms(702,"Xiaohui");
			will(returnValue("Xiaohui成功入住702房间！"));		
				}});
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Xiaohui成功入住702房间！",ih.in(702,"Xiaohui"));
	}

}
