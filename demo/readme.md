# Spring Boot Product Demo Application

## Overview
This is a simple Spring Boot REST API that manages products using an
in-memory data store (`ArrayList`).  
No database is used. All data is lost when the application restarts.

The application is intended for demonstration and learning purposes.

---

## Tech Stack
- Java 21
- Spring Boot
- Spring Web
- Jakarta Bean Validation
- Lombok
- Gradle

---

## How to Run the Application

### Prerequisites
- Java 17 or above
- Gradle (or use Gradle Wrapper)

### Steps
```bash
./gradlew bootRun

The application will start on:

http://localhost:8000

API Endpoints
1. Create Product

POST /items

Creates a new product and stores it in memory.

Request Body
{
  "product_id": 1,
  "product_name": "vivo",
  "product_description": "mobile phone"
}

Response
{
  "success": true,
  "message": "product added successfully"
}


Validation:

product_id is required

product_name is required

product_description is required

2. Get All Products

GET /get/all/items

Returns all stored products.

Response
[
  {
    "id": 1,
    "name": "vivo",
    "description": "mobile phone"
  }
]

3. Get Product by ID

GET /get/by/{product_id}

Fetches a product by its ID.

Example:

GET /get/by/1

Response
{
  "id": 1,
  "name": "vivo",
  "description": "mobile phone"
}

