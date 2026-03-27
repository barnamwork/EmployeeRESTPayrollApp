# AddressBook App - Spring Boot

## Description

This project is a Spring Boot REST API for managing Address Book data. It demonstrates CRUD operations using Controller, DTO, Service Layer, and in-memory storage.

---

## Tech Stack

* Java
* Spring Boot
* REST API
* Maven

---

## Features

* Get all contacts
* Get contact by ID
* Create contact
* Update contact
* Delete contact

---

## Project Structure

```
com.bridgelabz.addressbookapp
│
├── controller
├── dto
├── model
├── service
```

---

## API Endpoints

### Get All Contacts

GET /addressbook/

### Get Contact By ID

GET /addressbook/get/{id}

### Create Contact

POST /addressbook/create

### Update Contact

PUT /addressbook/update/{id}

### Delete Contact

DELETE /addressbook/delete/{id}

---

## Sample JSON

```
{
  "name": "Barnam",
  "city": "Chennai"
}
```

---

## CURL Commands

### Create

curl -X POST -H "Content-Type: application/json" --data-binary "@data.json" http://localhost:8080/addressbook/create

### Get All

curl http://localhost:8080/addressbook/

### Get By ID

curl http://localhost:8080/addressbook/get/1

### Update

curl -X PUT -H "Content-Type: application/json" --data-binary "@data.json" http://localhost:8080/addressbook/update/1

### Delete

curl -X DELETE http://localhost:8080/addressbook/delete/1

---

## GitFlow

* Each UC implemented in separate feature branch
* Merged into develop branch
* Branches preserved using -k flag

---

## Author

Barnam
