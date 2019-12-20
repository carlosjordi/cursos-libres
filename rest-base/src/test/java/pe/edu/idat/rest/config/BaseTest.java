package pe.edu.idat.rest.config;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes= {
	TestConfig.class	
})
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void dataSourceTest() {
		assertNotNull(dataSource);
	}
	
	
	
}
