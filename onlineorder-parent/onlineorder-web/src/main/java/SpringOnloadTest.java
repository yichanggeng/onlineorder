import java.math.BigDecimal;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.BeanClass;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:custom/spring-context.xml"})
public class SpringOnloadTest {

	@Autowired
	BasicDataSource dataSource;
	@Autowired
	BeanClass beanClass;
	
	@Test
	public void test(){
		System.out.println(dataSource);
		
	}
	
	
	public static void main(String[] args) {
		BigDecimal cash = new BigDecimal( 100000 );
		BigDecimal lv = new BigDecimal( 1.12 );
		BigDecimal result = new BigDecimal(0);
		
		
		int times = 30;
		for(int i = 0; i < times ; i++){
			result = result.add(cash);
			result = result.multiply( lv );
		}
		
		System.out.println( result.doubleValue() );

	}
	
	
	
	
	
	
	
}
