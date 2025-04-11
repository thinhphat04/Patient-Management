# Patient Management Platform

## Overview

The Patient Management Platform is a microservices-based system designed to manage patient records, user authentication, and billing operations within a healthcare environment. The platform supports full CRUD capabilities for patient records, secure user authentication using JWTs, and billing services via gRPC. An API Gateway provides a single entry point for client requests, ensuring effective routing, security, and protocol transformation between front-end and back-end services.

## Technologies

- **Spring Boot:** For building core microservices (AuthService, PatientService).
- **Spring Cloud Gateway:** Implements an API Gateway to route and secure incoming REST requests.
- **gRPC & Protocol Buffers:** Used for high-performance communication between services (e.g., PatientService to BillingService).
- **JWT:** Provides secure user authentication and token management.
- **Apache Kafka:** Facilitates asynchronous event streaming, logging, and real-time data processing.
- **Docker & Docker Compose:** Containerizes services for consistent deployment and scalability.
- **AWS (Optional):** For infrastructure automation, CI/CD pipelines, and advanced cloud features.

## Responsibilities

- **AuthService:**  
  - Authenticate users and generate JWT tokens.
  - Provide endpoints like `/login` for user authentication and `/validate` for token validation.

- **PatientService:**  
  - Manage patient records with full CRUD functionality.
  - Serve as the primary REST API for handling patient data.
  - Call BillingService via gRPC for billing-related operations.

- **BillingService:**  
  - Process billing transactions and create invoices.
  - Expose gRPC endpoints to handle billing requests from PatientService.

- **API Gateway:**  
  - Serve as the single entry point for all client requests.
  - Route requests based on specified predicates (e.g., path-based routing).
  - Apply filters (e.g., JWT validation, path rewriting) to ensure security and proper routing.

- **Kafka:**  
  - Enable asynchronous event messaging to track patient record changes and billing events.
  - Support real-time analytics and logging across the system.


