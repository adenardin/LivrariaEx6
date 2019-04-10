package br.edu.qi.service;

import javax.xml.ws.Endpoint;
import br.edu.qi.service.LivrariaWs;

public class LivrariaPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/bibliotecaWS", new LivrariaWs());
	}
}
