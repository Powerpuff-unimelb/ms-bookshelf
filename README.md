## Bookshelf Micro-service


## Description

This is a microservice to manage books in the collective form of a bookshelf

## Run

to run this micro-service simply navigate to the root directory and run the command 

```bash
docker compose up --build -d
```
this will build the docker images for ms-bookshelf and the MySQL bookshelfDb and the execute the service on these containers 

## Configuration

### ms-bookshelf

internal docker port: 8085
external exposed port: 8085
API URLS: []

### ms-bookshelf

internal docker port: 3306
external exposed port: 3307
URL: jdbc:mysql://bookshelfdb:3306/bookshelfdb

### docker 
