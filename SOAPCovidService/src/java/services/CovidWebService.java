/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Covidall;

/**
 *
 * @author prosf
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplicationTestPU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findCovidById")
    public Covidall findCovidById(@WebParam(name = "id") int id) {
        EntityManager em = emf.createEntityManager();
        Covidall co = em.find(Covidall.class, id);
        //TODO write your implementation code here:
        return co;
    }   
    
    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    

    

    

    
}
