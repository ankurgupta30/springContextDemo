package ankur.test.spring.context.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ankur.test.spring.context.ManagedBeans.Bean1;
import ankur.test.spring.context.ManagedBeans.Bean2;

/**
 * Hello world!
 *
 */
@Configuration
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  context = new AnnotationConfigApplicationContext(App.class);
    	Bean1 firstBean = context.getBean(Bean1.class);
        System.out.println( "firstBean " + firstBean );
        
    	Bean2 secondBean =  context.getBean(Bean2.class);
        System.out.println( "secondBean " + secondBean );
    }
    
    @Bean
    public Bean1 getBean1(){
    	Bean1 bean1 = new Bean1();
    	bean1.setName("James Bean");
    	bean1.setOccupation("Teacher");
    	return bean1;
    }
    
    @Bean
    public Bean2 getBean2(){
    	Bean2 bean2 = new Bean2();
    	bean2.setName("Jason Bean2");
    	bean2.setAge(24);
    	return bean2;
    }
}
