# Realice otra prueba con el codigo que esta em la carpeta deposito
La salida siguente es el error
```
sep 27, 2023 3:47:18 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFORMACIÓN: Refreshing org.apache.cxf.bus.spring.BusApplicationContext@e720b71: display name [org.apache.cxf.bus.spring.BusApplicationContext@e720b71]; startup date [Wed Sep 27 15:47:18 ART 2023]; root of context hierarchy
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-corba.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-jaxws.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-soap.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-xml.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-addr.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-javascript-client.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-local.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-http.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-management.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-http-jetty.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-http.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.support.DefaultListableBeanFactory registerBeanDefinition
INFORMACIÓN: Overriding bean definition for bean 'org.apache.cxf.transport.http.policy.HTTPClientAssertionBuilder': replacing [Generic bean: class [org.apache.cxf.transport.http.policy.HTTPClientAssertionBuilder]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]] with [Generic bean: class [org.apache.cxf.transport.http.policy.HTTPClientAssertionBuilder]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.support.DefaultListableBeanFactory registerBeanDefinition
INFORMACIÓN: Overriding bean definition for bean 'org.apache.cxf.transport.http.policy.HTTPServerAssertionBuilder': replacing [Generic bean: class [org.apache.cxf.transport.http.policy.HTTPServerAssertionBuilder]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]] with [Generic bean: class [org.apache.cxf.transport.http.policy.HTTPServerAssertionBuilder]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.support.DefaultListableBeanFactory registerBeanDefinition
INFORMACIÓN: Overriding bean definition for bean 'org.apache.cxf.transport.http.policy.NoOpPolicyInterceptorProvider': replacing [Generic bean: class [org.apache.cxf.transport.http.policy.NoOpPolicyInterceptorProvider]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]] with [Generic bean: class [org.apache.cxf.transport.http.policy.NoOpPolicyInterceptorProvider]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.support.DefaultListableBeanFactory registerBeanDefinition
INFORMACIÓN: Overriding bean definition for bean 'org.apache.cxf.transport.http.ClientOnlyHTTPTransportFactory': replacing [Generic bean: class [org.apache.cxf.transport.http.ClientOnlyHTTPTransportFactory]; scope=singleton; abstract=false; lazyInit=true; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]] with [Generic bean: class [org.apache.cxf.transport.http.ClientOnlyHTTPTransportFactory]; scope=singleton; abstract=false; lazyInit=true; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [META-INF/cxf/cxf-extension-http.xml]]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-jms.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-object-binding.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-http-binding.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-jaxrs-binding.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-ws-security.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-policy.xml]
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFORMACIÓN: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-extension-rm.xml]
sep 27, 2023 3:47:18 PM org.springframework.context.support.AbstractApplicationContext obtainFreshBeanFactory
INFORMACIÓN: Bean factory for application context [org.apache.cxf.bus.spring.BusApplicationContext@e720b71]: org.springframework.beans.factory.support.DefaultListableBeanFactory@7530ad9c
sep 27, 2023 3:47:18 PM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFORMACIÓN: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@7530ad9c: defining beans [cxf,org.apache.cxf.bus.spring.BusApplicationListener,org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor,org.apache.cxf.bus.spring.Jsr250BeanPostProcessor,org.apache.cxf.bus.spring.BusExtensionPostProcessor,org.apache.cxf.resource.ResourceManager,org.apache.cxf.configuration.Configurer,org.apache.cxf.binding.BindingFactoryManager,org.apache.cxf.transport.DestinationFactoryManager,org.apache.cxf.transport.ConduitInitiatorManager,org.apache.cxf.wsdl.WSDLManager,org.apache.cxf.phase.PhaseManager,org.apache.cxf.workqueue.WorkQueueManager,org.apache.cxf.buslifecycle.BusLifeCycleManager,org.apache.cxf.endpoint.ServerRegistry,org.apache.cxf.endpoint.ServerLifeCycleManager,org.apache.cxf.endpoint.ClientLifeCycleManager,org.apache.cxf.transports.http.QueryHandlerRegistry,org.apache.cxf.endpoint.EndpointResolverRegistry,org.apache.cxf.headers.HeaderManager,org.apache.cxf.catalog.OASISCatalogManager,org.apache.cxf.endpoint.ServiceContractResolverRegistry,org.apache.cxf.binding.corba.CorbaBindingFactory,org.apache.cxf.binding.corba.wsdl.WSDLExtensionRegister#0,org.apache.cxf.jaxws.context.WebServiceContextResourceResolver,org.apache.cxf.jaxws.context.WebServiceContextImpl,org.apache.cxf.binding.soap.SoapBindingFactory,org.apache.cxf.binding.soap.SoapTransportFactory,org.apache.cxf.binding.soap.customEditorConfigurer,org.apache.cxf.binding.xml.XMLBindingFactory,org.apache.cxf.ws.addressing.policy.AddressingAssertionBuilder,org.apache.cxf.ws.addressing.policy.AddressingPolicyInterceptorProvider,org.apache.cxf.ws.addressing.policy.UsingAddressingAssertionBuilder,org.apache.cxf.javascript.JavascriptQueryHandlerRegistry,org.apache.cxf.transport.local.LocalTransportFactory,org.apache.cxf.transport.http.policy.HTTPClientAssertionBuilder,org.apache.cxf.transport.http.policy.HTTPServerAssertionBuilder,org.apache.cxf.transport.http.policy.NoOpPolicyInterceptorProvider,org.apache.cxf.transport.http.ClientOnlyHTTPTransportFactory,org.apache.cxf.management.InstrumentationManager,org.apache.cxf.transport.http_jetty.JettyHTTPTransportFactory,org.apache.cxf.transport.jms.JMSTransportFactory,org.apache.cxf.binding.object.ObjectBindingFactory,org.apache.cxf.binding.http.HttpBindingFactory,org.apache.cxf.jaxrs.JAXRSBindingFactory,org.apache.cxf.ws.security.policy.WSSecurityPolicyLoader,org.apache.cxf.ws.policy.AssertionBuilderRegistry,org.apache.cxf.ws.policy.PolicyInterceptorProviderRegistry,org.apache.cxf.ws.policy.attachment.external.DomainExpressionBuilderRegistry,org.apache.cxf.ws.policy.attachment.external.EndpointReferenceDomainExpressionBuilder,org.apache.cxf.ws.policy.PolicyBuilder,org.apache.cxf.ws.policy.PolicyEngine,org.apache.cxf.ws.policy.attachment.wsdl11.Wsdl11AttachmentPolicyProvider,org.apache.cxf.ws.policy.attachment.ServiceModelPolicyProvider,org.apache.cxf.ws.policy.mtom.MTOMAssertionBuilder,org.apache.cxf.ws.policy.mtom.MTOMPolicyInterceptorProvider,org.apache.cxf.ws.rm.RMManager,org.apache.cxf.ws.rm.policy.RMPolicyInterceptorProvider,org.apache.cxf.ws.rm.RMAssertionBuilder]; root of factory hierarchy
sep 27, 2023 3:47:20 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suites have not been configured, falling back to cipher suite filters.
sep 27, 2023 3:47:20 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suite filters have not been configured, falling back to default filters.
sep 27, 2023 3:47:20 PM org.apache.cxf.transport.https.SSLUtils getCiphersFromList
INFORMACIÓN: The cipher suites have been set to TLS_AES_256_GCM_SHA384, TLS_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_RSA_WITH_AES_256_CBC_SHA, TLS_DHE_DSS_WITH_AES_256_CBC_SHA, TLS_DHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_DSS_WITH_AES_128_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_EMPTY_RENEGOTIATION_INFO_SCSV.  
sep 27, 2023 3:47:21 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suites have not been configured, falling back to cipher suite filters.
sep 27, 2023 3:47:21 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suite filters have not been configured, falling back to default filters.
sep 27, 2023 3:47:21 PM org.apache.cxf.transport.https.SSLUtils getCiphersFromList
INFORMACIÓN: The cipher suites have been set to TLS_AES_256_GCM_SHA384, TLS_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_RSA_WITH_AES_256_CBC_SHA, TLS_DHE_DSS_WITH_AES_256_CBC_SHA, TLS_DHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_DSS_WITH_AES_128_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_EMPTY_RENEGOTIATION_INFO_SCSV.  
sep 27, 2023 3:47:21 PM org.apache.cxf.configuration.spring.ConfigurerImpl getBeanName
INFORMACIÓN: Could not determine bean name for instance of class org.apache.cxf.jaxws.JaxWsClientFactoryBean.
sep 27, 2023 3:47:21 PM org.apache.cxf.service.factory.ReflectionServiceFactoryBean buildServiceFromWSDL
INFORMACIÓN: Creating Service {http://aduana.gov.py/webservices}serviciodeposito from WSDL: https://securetest.aduana.gov.py/sgd2/serviciodeposito?wsdl
sep 27, 2023 3:47:21 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suites have not been configured, falling back to cipher suite filters.
sep 27, 2023 3:47:21 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suite filters have not been configured, falling back to default filters.
sep 27, 2023 3:47:21 PM org.apache.cxf.transport.https.SSLUtils getCiphersFromList
INFORMACIÓN: The cipher suites have been set to TLS_AES_256_GCM_SHA384, TLS_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_RSA_WITH_AES_256_CBC_SHA, TLS_DHE_DSS_WITH_AES_256_CBC_SHA, TLS_DHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_DSS_WITH_AES_128_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_EMPTY_RENEGOTIATION_INFO_SCSV.  
Invoking consultarImportador...
sep 27, 2023 3:47:54 PM org.apache.cxf.ws.policy.AssertionBuilderRegistryImpl build
ADVERTENCIA: No assertion builder for type {http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}WssX509V1Token11 registered.
sep 27, 2023 3:47:55 PM org.apache.cxf.ws.policy.AssertionBuilderRegistryImpl build
ADVERTENCIA: No assertion builder for type {http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}IncludeTimestamp registered.
sep 27, 2023 3:47:55 PM org.apache.cxf.ws.policy.AssertionBuilderRegistryImpl build
ADVERTENCIA: No assertion builder for type {http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}EncryptSignature registered.
sep 27, 2023 3:47:55 PM org.apache.cxf.ws.policy.AssertionBuilderRegistryImpl build
ADVERTENCIA: No assertion builder for type {http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}OnlySignEntireHeadersAndBody registered.
sep 27, 2023 3:47:55 PM org.apache.cxf.ws.policy.AssertionBuilderRegistryImpl build
ADVERTENCIA: No assertion builder for type {http://schemas.xmlsoap.org/ws/2005/07/securitypolicy}SignBeforeEncrypting registered.
sep 27, 2023 3:47:55 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suites have not been configured, falling back to cipher suite filters.
sep 27, 2023 3:47:55 PM org.apache.cxf.transport.https.SSLUtils getCiphersuites
INFORMACIÓN: The cipher suite filters have not been configured, falling back to default filters.
sep 27, 2023 3:47:55 PM org.apache.cxf.transport.https.SSLUtils getCiphersFromList
INFORMACIÓN: The cipher suites have been set to TLS_AES_256_GCM_SHA384, TLS_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256, TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_RSA_WITH_AES_256_CBC_SHA, TLS_DHE_DSS_WITH_AES_256_CBC_SHA, TLS_DHE_RSA_WITH_AES_128_CBC_SHA, TLS_DHE_DSS_WITH_AES_128_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDH_RSA_WITH_AES_256_CBC_SHA, TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDH_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_GCM_SHA384, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_EMPTY_RENEGOTIATION_INFO_SCSV.  
sep 27, 2023 3:49:27 PM org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler doSignBeforeEncrypt
ADVERTENCIA: Sign before encryption failed due to : null
sep 27, 2023 3:49:27 PM org.apache.cxf.phase.PhaseInterceptorChain doIntercept
ADVERTENCIA: Interceptor has thrown exception, unwinding now
org.apache.cxf.interceptor.Fault
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.doSignBeforeEncrypt(AsymmetricBindingHandler.java:145)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.handleBinding(AsymmetricBindingHandler.java:90)
	at org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JOutInterceptor$PolicyBasedWSS4JOutInterceptorInternal.handleMessage(PolicyBasedWSS4JOutInterceptor.java:133)
	at org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JOutInterceptor$PolicyBasedWSS4JOutInterceptorInternal.handleMessage(PolicyBasedWSS4JOutInterceptor.java:73)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:236)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:483)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:309)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:261)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:73)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:124)
	at com.sun.proxy.$Proxy37.consultarImportador(Unknown Source)
	at py.gov.aduana.webservices.ServiciodepositoSoap_ServiciodepositoSoap_Client.main(ServiciodepositoSoap_ServiciodepositoSoap_Client.java:83)
Caused by: org.apache.cxf.ws.policy.PolicyException
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AbstractBindingBuilder.policyNotAsserted(AbstractBindingBuilder.java:261)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AbstractBindingBuilder.getSignatureBuider(AbstractBindingBuilder.java:1237)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.doSignature(AsymmetricBindingHandler.java:386)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.doSignBeforeEncrypt(AsymmetricBindingHandler.java:107)
	... 11 more
Caused by: org.apache.ws.security.WSSecurityException: General security error (No certificates for user 800637321 were found for signature)
	at org.apache.ws.security.message.WSSecSignature.prepare(WSSecSignature.java:314)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AbstractBindingBuilder.getSignatureBuider(AbstractBindingBuilder.java:1233)
	... 13 more

Exception in thread "main" javax.xml.ws.soap.SOAPFaultException: Fault string, and possibly fault code, not set
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:146)
	at com.sun.proxy.$Proxy37.consultarImportador(Unknown Source)
	at py.gov.aduana.webservices.ServiciodepositoSoap_ServiciodepositoSoap_Client.main(ServiciodepositoSoap_ServiciodepositoSoap_Client.java:83)
Caused by: org.apache.cxf.ws.policy.PolicyException
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AbstractBindingBuilder.policyNotAsserted(AbstractBindingBuilder.java:261)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AbstractBindingBuilder.getSignatureBuider(AbstractBindingBuilder.java:1237)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.doSignature(AsymmetricBindingHandler.java:386)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.doSignBeforeEncrypt(AsymmetricBindingHandler.java:107)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AsymmetricBindingHandler.handleBinding(AsymmetricBindingHandler.java:90)
	at org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JOutInterceptor$PolicyBasedWSS4JOutInterceptorInternal.handleMessage(PolicyBasedWSS4JOutInterceptor.java:133)
	at org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JOutInterceptor$PolicyBasedWSS4JOutInterceptorInternal.handleMessage(PolicyBasedWSS4JOutInterceptor.java:73)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:236)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:483)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:309)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:261)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:73)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:124)
	... 2 more
Caused by: org.apache.ws.security.WSSecurityException: General security error (No certificates for user 800637321 were found for signature)
	at org.apache.ws.security.message.WSSecSignature.prepare(WSSecSignature.java:314)
	at org.apache.cxf.ws.security.wss4j.policyhandlers.AbstractBindingBuilder.getSignatureBuider(AbstractBindingBuilder.java:1233)
	... 13 more
```

# Esta es la salida del programa cuando lo ejecutamos.

```
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
```
