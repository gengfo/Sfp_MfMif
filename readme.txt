refer to mf/mif framework usage document

-> not need called as webservice, just called by servlet
-> deployed to weblogic

-- change scope start--
1. sessions.xml
jmsProviderConfigProject.xsd
jmsProviderConfig.xml for path
jmsProviderConfigProject.xml

2. mifSystem.xml for data source

3. jar  jsmwarpper.jar

4. jar tbjms

5. transactionConfig.xml

6. web.xml
 6.1 mf servlet
 6.2 mif servlet
 

------- change scope end-------
1. create ems objects factory/queue, etc
		
	create factory XAGenericConnectionFactory xageneric URL=tcp://localhost:7222	***
	create factory GenericConnectionFactory xageneric URL=tcp://localhost:7222	***
	
	create queue RS.IPS.TEST.MSG.QUEUE secure 
	grant queue RS.IPS.TEST.MSG.QUEUE user=ivoadmin all
	
	create queue RS.IPS.TEST.MSG.QUEUEEXCEPTION secure 
	grant queue RS.IPS.TEST.MSG.QUEUEEXCEPTION user=ivoadmin all

1. setup new managed server in domain: C:\oracle\Middleware\user_projects\domains\arp_domain
	mfMifUsageServer 7051 
	machine
	deployment nonstage
	setup classpath: %CLASSPATH%;D:/GengXY/MyProgs/MfMif-Weblogic-Src/mf-mif-usage/to-deploy/appConfig
	jvm parameter: -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=8553,server=y,suspend=n	//or set the port to others to avoid conflict with admin server
	jvm parameter: -Dtoplink.xml.platform=oracle.toplink.platform.xml.jaxp.JAXPPlatform
	
2. config data source ipsDev, and attached to mfMifUsageServer
	146.222.65.142
	irarpdb
	arpowner/arpowner
	
3. build app
	ant -f build-server.xml package

3. deploy application 
	D:\GengFo\MyProgs\GitHub\Sfp_MfMif\to-deploy	
	
	
	
http://localhost:7051/MF_MIF_Usage_Server/SendMsg


dependency:
art
tsc
jsmwarpper.jar
tibco ems .jar

update web.xml for mf servlet

sessions.xml
jmsProviderConfig.xml


