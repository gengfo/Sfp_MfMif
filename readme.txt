refer to mf/mif framework usage document

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

1. setup new managed server
	mfMifUsageServer 7051 
	machine
	deployment nonstage
	setup classpath: %CLASSPATH%;D:/GengXY/MyProgs/MfMif-Weblogic-Src/mf-mif-usage/to-deploy/appConfig
	
	
	
http://localhost:7051/MF_MIF_Usage_Server/SendMsg

config data source

146.222.65.142
irarpdb
arpowner/arpowner


dependency:
art
tsc
jsmwarpper.jar
tibco ems .jar

update web.xml for mf servlet


sessions.xml
jmsProviderConfig.xml


-Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=8444,server=y,suspend=n