 package zjh.test.dubbo.client;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
 public class SpringBeanUtil implements ApplicationContextAware {

	    private static ApplicationContext applicationContext;		
	   
	    //获取applicationContext
	    public static ApplicationContext getApplicationContext() {
	        return applicationContext;
	    }
	
	    //通过name获取 Bean.
	    public static Object getBean(String name){
	    	if(name!=null && !name.trim().equals("")){
	    		return getApplicationContext().getBean(name);
	    	}
	    	return null;
	    }
	
	    //通过class获取Bean.
	    public static <T> T getBean(Class<T> clazz){
	        return getApplicationContext().getBean(clazz);
	    }
	
	    //通过name,以及Clazz返回指定的Bean
	    public static <T> T getBean(String name,Class<T> clazz){
	        return getApplicationContext().getBean(name, clazz);
	    }

		@Override
		public void setApplicationContext(ApplicationContext arg0) throws BeansException {
			 if(SpringBeanUtil.applicationContext == null) {
	            SpringBeanUtil.applicationContext = arg0;
	         }      
			
		}		
		
		

}