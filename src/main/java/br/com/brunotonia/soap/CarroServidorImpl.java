package br.com.brunotonia.soap;

import br.com.brunotonia.soap.dao.CarroDAO;
import br.com.brunotonia.soap.vo.Carro;
import javax.jws.WebService;

@WebService(endpointInterface = "br.com.brunotonia.soap.CarroServidor")
public class CarroServidorImpl implements CarroServidor {

    @Override
    public Carro buscar(Integer id) throws Exception {
        return new CarroDAO().selecionar(id);
    }

    @Override
    public boolean adicionar(Carro carro) {
        return new CarroDAO().adicionar(carro);
    }

    @Override
    public Carro[] listar() throws Exception {
        return new CarroDAO().listar();
    }
    
    
    
}
