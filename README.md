# Security-Test
Teste do Spring Security
# Funcionalidades
-Custom Login Page

-Remember Me 

-403 and 404 Error Pages

-User and Password verification through JDBC

-Secured Passwords with BCrypt

-Https support

-Runtime reloading permissions

-Csrf enabled

# Https Support
To enable https follow these steps:

This example is assuming you are using a Tomcat server.

Open a terminal, go to TOMCAT_HOME/bin and execute:

keytool -genkey -alias tomcat -keyalg RSA -keystore C:\Temp\tomcat

When it's asked put the password and the detail information for the certificate

Edit the server.xml and change the following lines:

```
<Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
 maxThreads="150" SSLEnabled="true" scheme="https" secure="true"
 clientAuth="false" sslProtocol="TLS" 
 keystoreFile="c:\Temp\tomcat"
 keystorePassword="changeit"/>
```

Make sure you specified the correct cert location and password
