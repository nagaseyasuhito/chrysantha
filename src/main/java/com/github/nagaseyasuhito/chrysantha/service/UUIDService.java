package com.github.nagaseyasuhito.chrysantha.service;

import java.util.UUID;

public class UUIDService {
	public String generate() {
		return UUID.randomUUID().toString();
	}
}
