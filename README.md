# StudentInfo
Spring boot based sample project for ssl implementation

## Java rest client

A sample rest client for this service is implemented [here](https://github.com/codegagan/RestClient)

## How to import the server certificate for java truststore

- Export certificate from store (Powershell commands)

```powershell

 & 'C:\Program Files\Java\jdk-10.0.1\bin\keytool.exe' -export -storetype PKCS12 -keystore keystore.p12 -alias wwh -file certificate.crt


```

- Import to java truststore


```powershell

& 'C:\Program Files\Java\jdk-10.0.1\bin\keytool.exe' -importcert -file certificate.crt -alias wwh  -keystore 'C:\Program Files (x86)\Java\jre1.8.0_121\lib\security\cacerts'


```

