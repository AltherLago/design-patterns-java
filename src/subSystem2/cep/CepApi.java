package subSystem2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCity(String cep) {
        return "Salvador";
    }

    public String recuperateEstate(String cep){
        return "BA";
    }
}
