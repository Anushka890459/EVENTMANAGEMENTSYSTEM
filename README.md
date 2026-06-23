# 🎭 Event Management System (Full-Stack)

A modular and scalable Spring Boot enterprise application designed to streamline event planning, service bookings, and membership administration. This project demonstrates core backend engineering principles, including robust MVC architecture, Session-based State Management, and Object-Relational Mapping (ORM).

🌍 **Live Production Link:** [https://eventmanagementsystem-q2tr.onrender.com/user/items](https://eventmanagementsystem-q2tr.onrender.com/user/items)

---

## 🚀 Architectural Overview
* **The Problem:** Managing diverse event services (Catering, Photography) while maintaining user sessions and handling complex membership business rules efficiently.
* **The Solution:** A decoupled enterprise system where Admins manage core configurations, Vendors manage inventory, and Users experience a seamless, stateful shopping-cart flow.
* **Core Business Logic (Rule #13):** Implemented an automated business rule that dynamically fetches and pre-sets a strict 6-month extension for memberships during updates.

---

## 🛠️ Technical Stack
* **Core Framework:** Java 21, Spring Boot 4.0.x
* **Persistence Layer:** Spring Data JPA with Hibernate ORM (v7.2)
* **Containerization:** Docker (Multi-stage production build)
* **Database Engine:** H2 In-Memory Database (Ideal for rapid evaluation/testing)
* **Template Engine:** Thymeleaf for dynamic server-side UI rendering
* **Build Tool:** Maven

---

## 📂 Key Architectural Features
* **Admin Maintenance Hub:** Centralized dashboard for complete system maintenance, service audits, and role administration.
* **Vendor Inventory Management:** Real-time transactional CRUD operations to safely add, modify, and update event services.
* **Stateful Shopping Cart:** Utilizes `HttpSession` to persist user service selections across multiple pages, eliminating database overhead for temporary transient data.
* **Bypassed Security for Evaluation:** For ease of technical review, authentication filters are currently bypassed so you can jump straight into the application's core logic.

---

## 📋 How to Run & Explore

### Option 1: Explore the Live App
Simply click the [Live Deployment Link](https://eventmanagementsystem-q2tr.onrender.com/user/items) to view the application running live on Render cloud infrastructure via Docker containers.

### Option 2: Run Locally
1. **Clone the repository:**
```bash
   git clone [https://github.com/Anushka890459/EVENTMANAGEMENTSYSTEM.git](https://github.com/Anushka890459/EVENTMANAGEMENTSYSTEM.git)
   cd EVENTMANAGEMENTSYSTEM
