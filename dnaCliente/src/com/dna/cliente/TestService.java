package com.dna.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.ws.security.SecurityConstants;

import com.dna.deposito.Autenticacion;
import com.dna.deposito.ImportadorRespuestaConsulta;
import com.dna.deposito.Serviciodeposito;
import com.dna.deposito.ServiciodepositoSoap;

public class TestService {
	
	public static void main(String[] args) throws Exception {
		TestService ts = new TestService();
		Autenticacion auth = new Autenticacion();
		auth.setToken("CjxhdXRoPgoJPGlkIHVuaXF1ZV9pZD0iMSIgc3JjPSJDPXB5LCBPPWRuYSwgT1U9c29maWEsIENOPXdzYWF0ZXN0IiBnZW5fdGltZT0iMjAyMy0wOS0yMFQwOTo0NzoxMS4wMDAtMDM6MDAiIGV4cF90aW1lPSIyMDIzLTA5LTIxVDA5OjQ3OjExLjAwMC0wMzowMCIvPgoJPG9wZXJhdGlvbiB2YWx1ZT0iZ3JhbnRlZCIgdHlwZT0ibG9naW4iPgoJCTxsb2dpbiB1aWQ9IkM9UFksIE89UFRQLCBPVT1USSwgQ049ODAwNjM3MzIxIiBzZXJ2aWNlPSJzZXJ2aWNpb3NpcCIgYXV0aG1ldGhvZD0iY21zIj4KCQk8L2xvZ2luPgoJPC9vcGVyYXRpb24+CjwvYXV0aD4K");
		auth.setFirma("HYpHvLYkVamIqDfvKXiLEhguZQKE2oW1KOpI4n3B1XvfI66Rnwf4gZQLdLPPKQ4COV+uRGZgqBsBGw7hq5wHQTZ5h85l9wS9OpVKzPo8hOzCDa6nj4gQ32zpzmUGljYVQPtW4FF7wAX5eP0EQ3+GRn0VjQGYmzdCPYs+KxuCUvyyp7suQZ99tkZZlw1X6ieACayMcu8UY066rUL3KwooXmc0zbwIv5Fpt/9ZYx1rsMw07YrTFZU6YBbey0wAke5SPu0UPE6AHBcvZu0vMfZtKzqfgobtCnZnv1IPwpcA732qsmRaFnp1iYTI8nEyzozO+i+xLOgOMH5iUFWCimVybA==");
		auth.setCodAduana("704");
		auth.setUsuario("800637321");
		Serviciodeposito service = new Serviciodeposito();
		ServiciodepositoSoap proxy = service.getServiciodepositoSoap(); //"https://securetest.aduana.gov.py/sgd2/serviciodeposito?wsdl", "Serviciodeposito");
		String wsPropertiesName = "/800637321.properties";
		//String wsPropertiesName = "afip/800637321.properties";			
		
		InputStream wsStream = ts.getClass().getResourceAsStream(wsPropertiesName);
		if(wsStream == null){
			throw new Exception("No existe archivo de propiedades '" + wsPropertiesName + "'");
		}
		Properties config = new Properties();
		config.load(new BufferedReader(new InputStreamReader(wsStream)));
		
		((BindingProvider)proxy).getRequestContext().put(SecurityConstants.CALLBACK_HANDLER, new KeystorePasswordCallback("800637321"));
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.SIGNATURE_PROPERTIES, ts.getClass().getResourceAsStream(wsPropertiesName));
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.ENCRYPT_PROPERTIES, ts.getClass().getResourceAsStream(wsPropertiesName));
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.SIGNATURE_USERNAME, "800637321");
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.ENCRYPT_USERNAME, "sipsws");
        
        ImportadorRespuestaConsulta resp = proxy.consultarImportador("9876543210", auth);
        System.out.println("Resultado " + resp.getImportador().getRazonSocial());
	}
	
}
