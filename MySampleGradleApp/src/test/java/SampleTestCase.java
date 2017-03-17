import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SampleTestCase {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Mock
	private HttpServletRequest request;
	
	@Test
	public void tstHttpServletRequest(){
		
		//when-Then pattern (Method stubbing)
		// SETUP
		MockitoAnnotations.initMocks(this); // initialize mock objects
		Mockito.when(request.getMethod()).thenReturn("GET"); // stubbing
		
		// EXECUTION
		String methodName =  request.getMethod();
		
		// VERIFICATION
		Assert.assertEquals("GET", methodName);
		Mockito.verify(request).getMethod();
	}
	
}
