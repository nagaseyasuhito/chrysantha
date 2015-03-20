package com.github.nagaseyasuhito.chrysantha.service;

import org.junit.Test;

import com.github.nagaseyasuhito.chrysantha.service.UUIDService;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class UUIDServiceTest {

	private UUIDService uuidService = new UUIDService();

	@Test
	public void generateSuccess() {
		assertThat(this.uuidService.generate(), notNullValue());
	}
}
