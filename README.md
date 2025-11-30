# 🧭 Service Discovery (Eureka Server)

The **Service Discovery** component is the central hub of the e-commerce microservices architecture. Built using **Spring Cloud Netflix Eureka**, it acts as a service registry that allows microservices to locate and communicate with each other dynamically without hardcoded hostnames or ports.



## 🚀 Key Features

### Core Functionality
* **Service Registry:** Maintains a live database of all available service instances (Product Service, User Service, etc.).
* **Service Discovery:** Allows client-side load balancers (like Spring Cloud LoadBalancer) in other services to query for available instances.
* **Health Monitoring:** continuously receives heartbeats from registered services. If a service stops sending heartbeats, it is removed from the registry to prevent routing failures.
* **Standalone Server:** Configured to act solely as a server and not a client (does not register with itself).

## 🛠️ Tech Stack

* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Cloud Framework:** Spring Cloud Netflix Eureka Server
* **Build Tool:** Maven

## ⚙️ Configuration

The application is configured to run on the standard Eureka port **8761**. Since this is the server, it explicitly disables client-side registration behavior.

**`application.properties`**:
```properties
spring.application.name=ServiceDiscoveryCapstone
server.port=8761

# Eureka Server Configuration
# Don't register with self
eureka.client.register-with-eureka=false
# Don't fetch registry (since I am the registry)
eureka.client.fetch-registry=false