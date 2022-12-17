/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsoapcovid;

import services.Covidall;

/**
 *
 * @author prosf
 */
public class ClientSOAPCovid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c = printCovidByID(1);
        System.out.println(c);
    }
    
    private static String printCovidByID(int id){
        Covidall covid = findCovidById(id);
        return  covid.toString();
    }

    private static Covidall findCovidById(int id) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.findCovidById(id);
    }
    
}
