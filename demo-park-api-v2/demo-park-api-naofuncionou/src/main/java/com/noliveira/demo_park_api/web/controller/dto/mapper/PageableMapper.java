package com.noliveira.demo_park_api.web.controller.dto.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

import com.noliveira.demo_park_api.web.controller.dto.PageableDto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageableMapper {

	public static PageableDto toDto(Page page) {
		return new ModelMapper().map(page, PageableDto.class);
	}
}
