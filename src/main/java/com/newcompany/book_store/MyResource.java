package com.newcompany.book_store;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.springframework.context.support.ClassPathXmlApplicationContext;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bookStore.daoGenericCI.AuthorDAO;
import com.bookStore.daoGenericCI.AuthorDAOImpl;
//import com.bookStore.dao.AuthorDAO;
//import com.bookStore.dao.AuthorDAOImpl;
import com.bookStore.model.Author;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	static final Logger LOG = LoggerFactory.getLogger(MyResource.class);
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Author> getIt() {
    	
    	//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //-- getting services from context --//

        //AuthorDAO adao= (AuthorDAO) ctx.getBean("authorService");
    	
		LOG.trace("Hello World!");		
		LOG.debug("How are you today?");		
		LOG.info("I am fine.");		
		LOG.warn("I love programming.");		
		LOG.error("I am programming.");
    	
    	Reader rd = null;
		
		try {
			rd = Resources.getResourceAsReader("sqlmap-config.xml");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
	    
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
    	
    	AuthorDAO adao = new AuthorDAOImpl(smc);
    	
    	/*Author a = new Author();
    	a.setAuthorid("A007");
    	a.setAuthaddress("IND");
    	a.setAuthname("Srinivas");
    	
    	try {
			adao.insert(a);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
    	
    	try {
			return adao.selectByExample(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return null;
    }
}
