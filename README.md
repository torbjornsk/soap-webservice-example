Example SoapUI stub:

```<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:exam="http://example/">
      <soapenv:Header/>
      <soapenv:Body>
         <exam:sayHelloWorldFrom>
            <!--Optional:-->
            <someStuff>
               <!--Optional:-->
               <someBoolean>?</someBoolean>
               <!--Optional:-->
               <someInteger>?</someInteger>
               <!--Optional:-->
               <someString>?</someString>
               <!--Optional:-->
               <somethingElse>
                  <!--Optional:-->
                  <someOtherString>?</someOtherString>
               </somethingElse>
            </someStuff>
         </exam:sayHelloWorldFrom>
      </soapenv:Body>
   </soapenv:Envelope>```