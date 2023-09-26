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
		auth.setToken("CjxhdXRoPgoJPGlkIHVuaXF1ZV9pZD0iMSIgc3JjPSJDPXB5LCBPPWRuYSwgT1U9c29maWEsIENOPXdzYWF0ZXN0IiBnZW5fdGltZT0iMjAyMy0wOS0yNlQxMzo1MToyNS4wMDAtMDM6MDAiIGV4cF90aW1lPSIyMDIzLTA5LTI3VDEzOjUxOjI1LjAwMC0wMzowMCIvPgoJPG9wZXJhdGlvbiB2YWx1ZT0iZ3JhbnRlZCIgdHlwZT0ibG9naW4iPgoJCTxsb2dpbiB1aWQ9IkM9UFksIE89UFRQLCBPVT1USSwgQ049ODAwNjM3MzIxIiBzZXJ2aWNlPSJzZXJ2aWNpb3NpcCIgYXV0aG1ldGhvZD0iY21zIj4KCQk8L2xvZ2luPgoJPC9vcGVyYXRpb24+CjwvYXV0aD4K");
		auth.setFirma("B1a1SZOxqUxqejs6Ga24V2R6gXy71Ebs6e3aRWYHqg+Hb8FULM4j/UK9ykhc/O/oD7fUtx/i1+jZrdFBNcGSDummiSjK9ktOHaE/3DY0bC9AmVoxi8gjuy6C414X6pxy+VFQYvMer5F66c5U+y59tZ1iD5HQHCm+hkZbDW6wh4rfKSGp4f9RmJuoDLBDmlmYe3//TBEyf3jmyDBPGAvG7QzGvx1zzhlOrZBbn2fqNHDyQsQ3jCLRIPWVbobTp6Fpo28ygP5DM+Tjt2dzeArHTE40/kR0QjuKuTK98YX2jsNSFjwqD6J8QnAM2DzdHBKL27HxoabWBt44EWCNbxVC2g==");
		auth.setCodAduana("704");
		auth.setUsuario("800637321");
		Serviciodeposito service = new Serviciodeposito();
		ServiciodepositoSoap proxy = service.getServiciodepositoSoap(); //"https://securetest.aduana.gov.py/sgd2/serviciodeposito?wsdl", "Serviciodeposito");
		String wsPropertiesName = "/800637321.properties";
					
		/*	
		InputStream wsStream = ts.getClass().getResourceAsStream(wsPropertiesName);
		if(wsStream == null){
			throw new Exception("No existe archivo de propiedades '" + wsPropertiesName + "'");
		}
		Properties config = new Properties();
		config.load(new BufferedReader(new InputStreamReader(wsStream)));
		*/
		java.net.URL prop = ts.getClass().getResource(wsPropertiesName);
		
		((BindingProvider)proxy).getRequestContext().put(SecurityConstants.CALLBACK_HANDLER, new KeystorePasswordCallback("800637321"));
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.SIGNATURE_PROPERTIES, prop);
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.ENCRYPT_PROPERTIES, prop);
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.SIGNATURE_USERNAME, "800637321");
        ((BindingProvider)proxy).getRequestContext().put(SecurityConstants.ENCRYPT_USERNAME, "sipsws");
        
        ImportadorRespuestaConsulta resp = proxy.consultarImportador("9876543210", auth);
        System.out.println("Resultado " + resp.getImportador().getRazonSocial());
	}
	
}
