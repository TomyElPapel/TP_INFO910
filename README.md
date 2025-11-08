Burfin Thomas

L’application déployée est une API Spring Boot qui gère les sujets et les membres, fonctionnant comme un forum.

L’API repose sur une base de données PostgreSQL et dispose de deux endpoints destinés à vérifier son fonctionnement :
- {url}/api/test/hello/{nom} → renvoie la réponse : « Bonjour {nom} ».
- {url}/api/test/users → retourne la liste des utilisateurs, permettant de tester la connexion à la base de données.


Pour deployer l'application :

#### Lancer Minikube :
```
minikube start
```

#### Creation de l'image :
```
docker build -t evergreen-backend:latest ./evergreendata-api
```

#### Creation des secrets :
```
kubectl apply -f manifests/secrets.yaml
```

#### Deployement de PostgreSQL :
```
kubectl apply -f manifests/postgres-deployment.yaml
kubectl apply -f manifests/postgres-service.yaml
```

#### Deployement de PostgreSQL :
```
kubectl apply -f manifests/postgres-deployment.yaml
kubectl apply -f manifests/postgres-service.yaml
```

#### Pour tester et obtenir l'url de l'api ####
```
minikube service evergreen-frontend --url
```