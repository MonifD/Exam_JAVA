# Projet Spring Boot : Chat Motivant

Ce projet est composé de deux applications Spring Boot :
1. **quoteApi** : Une API qui fournit des citations inspirantes aléatoires.
2. **application** : Une application principale qui permet aux utilisateurs de discuter et de recevoir des réponses inspirantes.

---

## **Prérequis**

- **Java 17** ou supérieur.
- **Eclipse IDE** (ou tout autre IDE compatible avec Spring Boot).
- **MySQL** pour la base de données.
- **Maven** pour la gestion des dépendances.
- **Git** pour cloner le projet.

---

## **Cloner le projet**

1. **Ouvrez un terminal**.
2. **Clonez le repository Git** :
   ```bash
   git clone https://github.com/MonifD/Exam_JAVA.git
    ```
3. **Naviguez dans le répertoire du projet** :
    ```bash
        cd Exam_JAVA
    ```
## **Configuration de la base de données**

1. **Créer une base de données MySQL** :
   - Nom de la base de données : `Citation`.
   - Vous pouvez utiliser la commande suivante dans MySQL :
     ```sql
     CREATE DATABASE Citation;
     ```
---

## **Lancement des applications**

### **1. Lancer quoteApi**

1. **Importer le projet dans Eclipse** :
   - File > Open Projet from File System.
   - Sélectionnez le dossier `quoteApi`.
   
2. **Modifier les informations de connexion** :
   - Dans le fichier `application.properties` de **quoteApi**, modifiez les propriétés suivantes :
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/Citation
     spring.datasource.username=VOTRE_NOM_UTILISATEUR
     spring.datasource.password=VOTRE_MOT_DE_PASSE
     ```
   - Remplacez `VOTRE_NOM_UTILISATEUR` et `VOTRE_MOT_DE_PASSE` par vos identifiants MySQL.

3. **Lancer l'application** :
   - Cliquez droit sur `QuoteApiApplication.java` > Run As > Java Application.
   - L'API sera disponible sur `http://localhost:8080`.

### **2. Lancer application**

1. **Importer le projet dans Eclipse** :
   - File > Open Projet from File System.
   - Sélectionnez le dossier `application`.
   
2. **Modifier les informations de connexion** :
   - Dans le fichier `application.properties` de **application**, modifiez les propriétés suivantes :
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/Citation
     spring.datasource.username=VOTRE_NOM_UTILISATEUR
     spring.datasource.password=VOTRE_MOT_DE_PASSE
     ```
   - Remplacez `VOTRE_NOM_UTILISATEUR` et `VOTRE_MOT_DE_PASSE` par vos identifiants MySQL.

3. **Lancer l'application** :
   - Cliquez droit sur `Application.java` > Run As > Java Application.
   - L'application sera disponible sur `http://localhost:8081`.
   
---

## **Routes disponibles**

### **quoteApi**
- **GET `/api/getQuote`** :
  - Retourne une citation inspirante aléatoire.
  - Exemple de réponse :
    ```json
    "Stay hungry, stay foolish."
    ```

### **application**
- **GET `/chat`** :
  - Affiche la page de conversation.
  - Les utilisateurs peuvent entrer leur nom et leur message.
- **POST `/chat`** :
  - Envoie le message de l'utilisateur et retourne une réponse inspirante.
- **GET `/admin`** :
  - Affiche la liste des utilisateurs ayant posté des messages.
- **GET `/admin/{username}`** :
  - Affiche toutes les conversations d'un utilisateur spécifique.

---

## **Structure des projets**

### **1. Premier API**
#### **quoteApi**
```
quoteApi/
├── src/main/java/
│     ├── message.quoteApi/
│     │     └── QuoteApiApplication.java
│     ├── message.quoteApi.controller/
│     │     └── QuoteController.java
│     ├── message.quoteApi.model/
│     │     └── Quote.java
│     ├── message.quoteApi.repository/
│     │     └── QuoteRepository.java
│     └── message.quoteApi.service/
│           └── DataInitializer.java
│           └── QuoteService.java
├── src/main/resources/
│     ├── static/
│     ├── templates/
│     │     └── DisplayQuote.html
│     ├── application.properties
│     └── data.sql
└── pom.xml
```

### **1. Deuxième API / Application**
#### **application**
```
Application/
├── src/main/java/
│     ├── principale.application/
│     │     └── Application.java
│     ├── principale.application.config/
│     │     └── AppConfig.java
│     ├── principale.application.controller/
│     │     └── AdminController.java
│     │     └── ConversationController.java
│     ├── principale.application.model/
│     │     └── Conversation.java
│     ├── principale.application.repository/
│     │     └── ConversationRepository.java
│     └── principale.application.service/
│           └── ConversationService.java
│           └── QuoteService.java
├── src/main/resources/
│     ├── static/
│     │     └── styles.css
│     ├── templates/
│     │     └── admin.html
│     │     └── conversation.html
│     │     └── user-conversation.html
│     ├── application.properties
└── pom.xml
```


---

## **Conseils et bonnes pratiques**

### Toujours lancer quoteApi avant application :

- L'application dépend de l'API pour obtenir des citations.

