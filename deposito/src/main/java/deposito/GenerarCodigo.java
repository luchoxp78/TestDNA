package deposito;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class GenerarCodigo {
	public static void main(String[] args) {
		WSDLToJava.main(new String[]{
				"-client",
				"-d","src/main/java",
				"https://securetest.aduana.gov.py/sgd2/serviciodeposito?wsdl"
			});
		System.out.println("Hecho, no olvide hacer Refresh.");
	}
}
