package com.noliveira.demo_park_api.util;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EstacionamentoUtils {
	
	// 2023-03-16T15:23:48.616463500
	// 20230316-152121
	
	public static String gerarRecibo() {
		LocalDateTime date = LocalDateTime.now();
		String recibo = date.toString().substring(0,19);
		return recibo.replace("-", "")
				.replace(":", "")
				.replace("T", "-");
	}
	
}
