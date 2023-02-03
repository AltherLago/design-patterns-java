package gof.facade;

import subSystem1.crm.CrmService;
import subSystem2.cep.CepApi;

public class Facade {
    
    public void migrateClient(String name, String cep){

        String city = CepApi.getInstancia().recuperarCity(cep);
        String state = CepApi.getInstancia().recuperateEstate(cep);

        CrmService.registreClient(name, cep, city, state);
    }
}
