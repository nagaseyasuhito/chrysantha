package com.github.nagaseyasuhito.chrysantha.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.github.nagaseyasuhito.chrysantha.service.UUIDService;

@Path("uuid")
public class UUIDResource {
	@Inject
	private UUIDService uuidService;

	@GET
	public String get() {
		return this.uuidService.generate();
	}
}
