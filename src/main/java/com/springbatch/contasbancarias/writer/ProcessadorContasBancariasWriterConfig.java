package com.springbatch.contasbancarias.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorContasBancariasWriterConfig {

	@Bean
	public ItemWriter processadorContasBancariasWriter() {
		return items -> items.forEach(System.out::println);
	}
}
