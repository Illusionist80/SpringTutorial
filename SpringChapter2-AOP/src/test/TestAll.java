package test;
import org.junit.Test;

import com.springtraining.springaop.proxy1.subclass.SpringAOPProxyTest8Client;
import com.springtraining.springaop.proxy2.interfaced.SpringAOPProxyTest9Client;
import com.springtraining.springaop.types1.AOPAppTestClient1;
import com.springtraining.springaop.types2.AOPAppTestClient2;
import com.springtraining.springaop.types3.AOPAppTestClient3;
import com.springtraining.springaop1.SpringAOTest4Client;
import com.springtraining.springaop2.annotated.SpringAOTest5Client;
import com.springtraining.springaop3.annotatedpointcut.SpringAOTest6Client;
import com.springtraining.springaop4.annotatedpointcut.SpringAOTest7Client;


public class TestAll {

	@Test
	public void test() {
		//xml based
		SpringAOTest4Client.main(null);
		
		//Annotated
		SpringAOTest5Client.main(null);
		SpringAOTest6Client.main(null);
		SpringAOTest7Client.main(null);
		//Proxy
		SpringAOPProxyTest8Client.main(null);
		SpringAOPProxyTest9Client.main(null);
		
		//Types
		AOPAppTestClient1.main(null);
		AOPAppTestClient2.main(null);
		AOPAppTestClient3.main(null);
	}

}
