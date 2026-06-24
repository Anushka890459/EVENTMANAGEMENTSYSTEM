# 🎭 Event Management System (Full-Stack Enterprise App)

A modular and scalable Spring Boot enterprise application engineered to streamline event planning, service bookings, and membership administration. This project demonstrates robust backend engineering principles, including secure MVC architecture, Session-based State Management, and advanced Object-Relational Mapping (ORM).

🌐 **Live Production Link:** https://eventmanagementsystem-q2tr.onrender.com/user/items

---

## 🚀 Architectural Overview

* **The Problem:** Coordinating diverse event services (Catering, Decoration, Photography) while maintaining active user sessions and handling multi-tenant business rules without performance overhead.
* **The Solution:** A decoupled enterprise architecture where Admins handle core configurations, Vendors manage dynamic inventory, and Users experience a seamless, fully isolated stateful checkout flow.
* **Core Business Logic (Rule #13):** Implemented an automated enterprise rule within the service layer that dynamically fetches and injects a strict 6-month temporal extension for memberships during data updates.

---

## ✨ Key Architectural Features

* **🛡️ Admin Maintenance Hub:** A centralized administrative dashboard engineered for complete system maintenance, service audits, and comprehensive role administration.
* **🏪 Vendor Inventory Pipeline:** Implemented safe, isolated transactional CRUD operations allowing vendors to safely inject, modify, and track event inventories in real-time.
* **🛒 Stateful Dynamic Shopping Cart:** Utilizes native server-side `HttpSession` management to persist user service selections across multiple page views, eliminating unnecessary database I/O for temporary transient state.
* **⚡ Evaluation-Ready Access:** For ease of technical review and seamless hiring assessment, core authentication filters are currently bypassed so reviewers can immediately evaluate the application's underlying business logic.

---

## 🛠️ Technical Stack & Frameworks

| Component | Technology | Role / Execution Details |
| :--- | :--- | :--- |
| **Language & Engine** | Java 21 / Spring Boot 4.0.x | Core enterprise backbone and rapid dependency injection |
| **Persistence Layer** | Spring Data JPA (Hibernate v7.2) | Advanced object-relational mapping and database abstraction |
| **Database Engine** | H2 In-Memory Database | High-performance, low-latency relational data storage |
| **Template Engine** | Thymeleaf | Dynamic server-side UI rendering with strict data binding |
| **Build & Management** | Apache Maven | Project lifecycle management and dependency tracking |
| **Containerization** | Docker | Multi-stage production build optimization for cloud platforms |

---

## 🐳 Cloud Deployment & Environment

* **Cloud Infrastructure:** Fully containerized and actively hosted as a managed web service on **Render**.
* **Deployment Pipeline:** Integrated with multi-stage Dockerfile configurations to ensure minimum resource utilization and automated Continuous Delivery (`CD`) triggered via main branch GitHub pushes.
