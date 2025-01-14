package com.noliveira.demo_park_api.web.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PageableDto {
	
	private List contentList = new ArrayList<>();
	private boolean first;
	private boolean last;
	@JsonProperty("page")
	private int number;
	private int size;
	@JsonProperty("pageElements")
	private int numberOfElements;
	private int totalPages;
	private int totalElements;
}
