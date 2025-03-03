# **Fintech Transaction Management System**

## **Overview**
This project is a **real-time transaction monitoring system** built with:
- **Spring Boot** (Backend Service)
- **GraphQL** (Query API)
- **Apache Kafka** (Message Queue for Real-time Processing)
- **PostgreSQL/MySQL** (Database for Persistent Storage)
- **Terraform** (Infrastructure as Code for GCP & AWS Deployment)

The system processes financial transactions in real-time, enabling fraud detection and secure transaction handling.

---

## **Architecture**
1. **Transaction Service (Spring Boot + GraphQL)**
   - Handles transaction creation and retrieval.
   - Publishes transactions to Kafka.
2. **Kafka Producer & Consumer**
   - Producer: Sends transaction events to Kafka topic.
   - Consumer: Listens to transaction events for processing.
3. **Database (PostgreSQL/MySQL)**
   - Stores transaction records.
4. **Deployment**
   - Deployable on **GCP & AWS using Terraform**.

---

## **Tech Stack**
| Technology | Purpose |
|------------|---------|
| **Spring Boot** | Backend API |
| **GraphQL** | Query Interface |
| **Kafka** | Event-driven Processing |
| **PostgreSQL/MySQL** | Database |
| **Terraform** | Infrastructure Management |
| **GCP/AWS** | Cloud Deployment |

---

## **Security: Encrypting Database Passwords**
To keep credentials secure:
**Use Environment Variables**

---

## **Contributors**
- **Sheetal G** - (https://github.com/stratopedia/transaction)

---

