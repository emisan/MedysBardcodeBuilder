# MedysBardcodeBuilder
Small utility to produce a barcode image out of informations provided in a xml-file

<b>Referenced Libraries needed in the projects build-path</b>
<ul>
 <li>Apache Commons CLI 1.0, get it here : https://mvnrepository.com/artifact/commons-cli/commons-cli/1.0</li>
  <li>Apache XML serializer 2.7.1, get it here : https://mvnrepository.com/artifact/org.apache.xml/serializer/2.7.1</li>
 <li>Avalon-Framework 4.2.0, get it here : https://mvnrepository.com/artifact/avalon-framework/avalon-framework/4.2.0<li
 <li>barcode4j 2.1.0 , get it here : https://mvnrepository.com/artifact/net.sf.barcode4j/barcode4j/2.1</li>
  <li>FOP 0.20.5 (Apache), get it here : https://mvnrepository.com/artifact/fop/fop/0.20.5</li>
  <li>jdom 1.0, get it here : https://mvnrepository.com/artifact/jdom/jdom/1.0</li>
</ul>

if Batik can not be found through Barcode4J-Jar and Apache FOP
get it here : https://mvnrepository.com/artifact/batik/batik/1.5

The Apache FOP project moved on to Version 2.x. This Project has not been tested in new FOP Version, maybe try to get the new ones and try to build the whole up without errors :) (should work, maybe if Apache didn't deprecated methods from 0.20.5)
