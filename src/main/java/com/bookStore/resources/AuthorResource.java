package com.bookStore.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.bookStore.dao.AuthorDAO;
import com.bookStore.dao.AuthorDAOImpl;
import com.bookStore.model.Author;

@Path("authors")
public class AuthorResource {
	
	private AuthorDAO authorDAO = new AuthorDAOImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Author> getAllHotels() {
		return authorDAO.selectByExample(null);
	}

}
