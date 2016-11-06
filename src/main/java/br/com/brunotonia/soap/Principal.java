package br.com.brunotonia.soap;

import javax.xml.ws.Endpoint;

public class Principal {
    
    public static void main(String[] args) {
	Endpoint.publish("http://127.0.0.1:9876/carro", new CarroServidorImpl());
    }
    
}
