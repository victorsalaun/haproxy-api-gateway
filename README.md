# HAPROXY API Gateway

Ce projet consiste à faire un test simple sur HAProxy (sur une problèmatique entreprise)

Il est constitué de deux applications sous Spring Boot et d'un Dockerfile pour créer une image HAProxy.

## Usage

Builder les deux applications Spring Boot

    mvn clean package
    
Builder la première application

    cd app1/target
    java -jar app1-0.0.1-SNAPSHOT.jar

Tester la première application sur l'url `http://localhost:8100/app1/sayHello`

Builder la deuxième application

    cd app2/target
    java -jar app2-0.0.1-SNAPSHOT.jar

Tester la première application sur l'url `http://localhost:8200/app2/sayHello`

Créer l'image docker HAProxy

    cd haproxy
    docker build -t haproxy .

Récupérer l'IP de la machine et remplacer dans la prochaine commande les IP contenu dans le paramètre add-host

Lancer l'image HAProxy

    docker run -d -p 56789:56789 --add-host=dockerappone:192.168.1.93 --add-host=dockerapptwo:192.168.1.93 --name my-running-haproxy haproxy

Tester l'HAProxy sur l'url `http://localhost:56789/stats`

Maintenant il est possible d'attaquer les deux application en passant par l'HAProxy :

 * `http://localhost:56789/app1/sayHello`
 * `http://localhost:56789/app2/sayHello`