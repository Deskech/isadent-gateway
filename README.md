# Api Gateway 

This API Gateway serves as a central hub for handling requests directed towards various microservices, including:
- Users Microservice

- Quotation Microservice

- Billing Microservice

- Payments Microservice

- Patients Microservice

The Gateway plays a crucial role in securing access to these microservices by validating incoming JWT tokens.When a request is received, the Gateway checks for the presence of a valid JWT token. If the token is valid, the request is forwarded to the appropriate microservice.

## Table of Contents
- [Installation](#installation)
- [License](#license)

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Deskech/isadent-gateway
   
## Prerequisites
- **Java 17**
- **Maven**

## License
Comming soon...