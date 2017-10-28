/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.jcr.NoSuchWorkspaceException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import org.apache.jackrabbit.commons.JcrUtils;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

/**
 *
 * @author jvasquez
 */
public class JackrabbitConnect {
    
    public static Session getConnection() throws NoSuchWorkspaceException, 
            RepositoryException{
       String url = "http://localhost:8000/server";
        Repository repository = JcrUtils.getRepository(url);
        SimpleCredentials creds = new SimpleCredentials("admin",
            "admin".toCharArray());
        Session jcrSession = repository.login(creds, "default"); 
        return jcrSession;
    }
    
    
}
