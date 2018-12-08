package cloud.dalston.api.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayInitApplication 
{
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(ApiGatewayInitApplication.class).web(true).run(args);
    }
}
