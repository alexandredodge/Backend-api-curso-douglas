package io.github.alexandre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

	@Bean(name = "nomeAplicacao")
	public String nomeAplicacao() {
		return "Sistema de vendas";
	}
}
