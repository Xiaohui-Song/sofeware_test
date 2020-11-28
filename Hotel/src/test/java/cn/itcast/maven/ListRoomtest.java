package cn.itcast.maven;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.easymock.EasyMock;
//import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.junit.runners.Parameterized.Parameters;

import cn.itcast.maven.IData;
import cn.itcast.maven.ListHome_test;

public class ListRoomtest {
	
	private IData idata ;
	private ListHome_test listhome_test ;
	
	private String[][] rooms=new String[1][1];
	
	@Before
	public void setUp() throws Exception {
		
		for(int i=0 ; i<1 ; i++) {
			for(int j = 0 ; j<1 ; j++) {
				rooms[i][j] = "EMPTY";
		    }
	    }
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
		idata = EasyMock.createMock(IData.class);
		listhome_test = new ListHome_test(idata);
		EasyMock.expect(idata.getRoom()).andReturn(rooms).anyTimes();
		EasyMock.replay(idata);
		EasyMock.verify(idata);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		listhome_test.search();
		assertEquals("101\t\r\nEMPTY\t",outContent.toString());
	}

}
