# Vérification du projet

Contrôles réalisés avant empaquetage :

- structure Maven racine + `metier` + `soap` ;
- POM XML bien formés ;
- `web.xml` bien formé ;
- `sun-jaxws.xml` bien formé ;
- WSDL documentaire bien formé ;
- quatre exemples SOAP XML bien formés ;
- présence de `@WebMethod(operationName = "studentRequestGet")` ;
- présence de `@RequestWrapper(localName = "studentRequestGet")` ;
- présence de `@WebMethod(operationName = "studentRequestSav")` ;
- présence de `@RequestWrapper(localName = "studentRequestSav")` ;
- paramètres nommés `matricule` et `student` ;
- `@WebResult(name = "student")` sur les deux réponses ;
- aucune balise XML `<return>` dans les réponses d'exemple ;
- captures 1366×768 présentes.

Limite de l'environnement de génération : Maven et Tomcat ne sont pas installés dans le conteneur utilisé pour préparer le devoir. La compilation complète `mvn clean package` et l'exécution réelle Tomcat/SoapUI doivent donc être faites sur la machine de remise. Le projet est structuré pour Java 17 / Tomcat 10 conformément au dépôt modèle.
