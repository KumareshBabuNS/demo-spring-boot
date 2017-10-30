To run this app in your local computer:
```
./mvnw spring-boot:run
```


To test, add username password by: 
```
curl localhost:8080/addStore -X POST -d '{"username":"store01","password":"1234"}' -H 'Content-type: application/json'
```

To verify username / password:

```
curl localhost:8080/login -X POST -d '{"username":"store01","password":"1234"}' -H 'Content-type: application/json'
```

To push this app to PCF, first you need to create a MySQL from PCF Marketplace, name it to appleStoreDb, then run 
```
./mvnw clean package
cf push
```
