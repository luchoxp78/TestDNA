Esta es la salida del programa cuando lo ejecutamos.

sept. 21, 2023 9:36:26 A. M. [com.sun.xml.ws.policy.EffectiveAlternativeSelector]  selectAlternatives
WARNING: WSP0075: Policy assertion "{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}AsymmetricBinding" was evaluated as "UNKNOWN".
sept. 21, 2023 9:36:26 A. M. [com.sun.xml.ws.policy.EffectiveAlternativeSelector]  selectAlternatives
WARNING: WSP0075: Policy assertion "{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}EncryptedParts" was evaluated as "UNKNOWN".
sept. 21, 2023 9:36:26 A. M. [com.sun.xml.ws.policy.EffectiveAlternativeSelector]  selectAlternatives
WARNING: WSP0075: Policy assertion "{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}SignedParts" was evaluated as "UNKNOWN".
sept. 21, 2023 9:36:26 A. M. [com.sun.xml.ws.policy.EffectiveAlternativeSelector]  selectAlternatives
WARNING: WSP0075: Policy assertion "{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}Wss10" was evaluated as "UNKNOWN".
sept. 21, 2023 9:36:26 A. M. [com.sun.xml.ws.policy.EffectiveAlternativeSelector]  selectAlternatives
WARNING: WSP0019: Suboptimal policy alternative selected on the client side with fitness "UNKNOWN".
Exception in thread "main" com.sun.xml.ws.fault.ServerSOAPFaultException: Client received SOAP Fault from server: These policy alternatives can not be satisfied: 
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}AsymmetricBinding: Received Timestamp does not match the requirements
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}InitiatorToken
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}X509Token: The received token does not match the token inclusion requirement
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}RecipientToken
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}IncludeTimestamp
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}EncryptSignature
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}OnlySignEntireHeadersAndBody
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}SignedParts: Soap Body is not SIGNED
{http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}EncryptedParts: Soap Body is not ENCRYPTED Please see the server log to find more detail regarding exact cause of the failure.
	at com.sun.xml.ws.fault.SOAP11Fault.getProtocolException(SOAP11Fault.java:163)
	at com.sun.xml.ws.fault.SOAPFaultBuilder.createException(SOAPFaultBuilder.java:98)
	at com.sun.xml.ws.client.sei.StubHandler.readResponse(StubHandler.java:223)
	at com.sun.xml.ws.db.DatabindingImpl.deserializeResponse(DatabindingImpl.java:176)
	at com.sun.xml.ws.db.DatabindingImpl.deserializeResponse(DatabindingImpl.java:263)
	at com.sun.xml.ws.client.sei.SyncMethodHandler.invoke(SyncMethodHandler.java:89)
	at com.sun.xml.ws.client.sei.SyncMethodHandler.invoke(SyncMethodHandler.java:62)
	at com.sun.xml.ws.client.sei.SEIStub.invoke(SEIStub.java:131)
	at com.sun.proxy.$Proxy33.consultarImportador(Unknown Source)
	at com.dna.cliente.TestService.main(TestService.java:45)
