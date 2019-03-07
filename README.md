# Application Doodle

Application de sondage pour la prise de rendez vous.

## Fonctionnalités implémentées

#### Servlet:

* Création d'un utilisateur
* Affichage de tous les utilisateur

#### REST

* Récupération de la liste des sondages
* Récupération d'un sondage
* Ajout d'un utilisateur
* Récupération d'un utilisateur

## Fonctionnalités à venir

#### Servlet:

* Création d'un sondage
* Participation à un sondage
* Ajout des préférences alimentaires
* Voir résultats du sondage

#### REST

* Récupérer la liste des réunions
* Récupérer la liste des utilisateurs

## Prise en main

Ces instructions vous permettront d'installer et tester le projet sur votre machine. Le projet est en phase Alpha et ne possède donc pas d'interface homme machine mais uniquement le Back-End.

### Pré-requis

Pour pouvoir tester le projet vous avez besoin d'un IDE tel qu'IntelliJ. ainsi qu'un JDK tel que Java 11.

### Installation

#### Partie 1

Tout d'abord vous devez installer les librairies manquantes via le fichier POM.xml. Pour se faire sous IntelliJ cliquez droit dessus puis sélectez: 

```
Add as Maven Project
```

Ou

```
Maven>Reimport
```

Ou toute autre manipulation relative a votre IDE favoris.

#### Partie 2

Pour pouvoir utiliser JPA correctement il est nécessaire de configurer le fichier persistence.xml et modifier le bloc qui se nomme:

```
 <persistence-unit name="mysql">
 ...
 </persistence-unit>
```

En fonction de la configuration de la base de donnée que vous utilisez. Vous pouvez trouver de l'aide pour la configuration grâce à [cet article](https://thoughts-on-java.org/jpa-persistence-xml/).

**enfin n'ouliez pas de laisser le name du bloc à "mysql" et ce même si vous n'utilisez pas mysql comme moteur de BDD pour des raison de fonctionnement du code de l'application !**

## Crédits

### Développé grâce à

* [IntelliJ](https://www.jetbrains.com/idea/) - IDE utilisé
* [Maven](https://maven.apache.org/) - Gestionnaire de dépendances
* [MySQL](https://www.mysql.com/fr/) - Moteur de base de données utilisé

### Auteurs

* **Barais Olivier** - *Créateur du squelette*
* **Wacquet Adrien** - *Contributeur principal*
* **Kupratsevitch Vadim** - *Contributeur principal*

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

### License

Ce projet est sous licence MIT - voir le fichier [LICENSE.md](LICENSE.md) pour plus de détails
