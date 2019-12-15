# Pronote API Java client

Un client pour [l'API Pronote](https://github.com/Litarvan/pronote-api) en Java

## Import

### Gradle

```groovy
repositories {
    maven {
        url 'https://litarvan.github.io/maven'
    }
}

dependencies {
    implementation 'fr.litarvan:pronote-api:1.0.0'
}
```

### Maven

```xml 
<dependency>
    <groupId>fr.litarvan</groupId>
    <artifactId>pronote-api</artifactId>
    <version>1.0.0</version>
</dependency>

```

## Utilisation

La requête login est optionnelle, si elle n'est pas faite, la requête fetch la fera au passage.

Une erreur RequestException peut être lâchée par les deux fonctions en cas d'erreur de connexion ou de lecture.
Si une erreur autre que "Mauvais identifiants" est renvoyée, merci d'ouvrir une issue sur l'API Pronote.

```java
PronoteAPI api = new PronoteAPI("http://127.0.0.1:21727/");

try {
    api.login(new LoginRequest("username", "password", "pronote url", "cas");
} catch (RequestException e) {
    ... // Mauvais identifiants
}

FetchResponse response = api.fetch(new FetchResponse("username", "password", "pronote url", "cas");
System.out.println(String.format("Welcome %s !", response.getName()));
```