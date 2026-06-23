Event Management System (Full-Stack)
A modular and scalable Spring Boot application designed to streamline event planning, service bookings, and membership administration. This project demonstrates core backend engineering principles, including MVC architecture, Session-based State Management, and Object-Relational Mapping (ORM).

🚀 User Quick Guide
The Problem: Managing diverse event services (Catering, Photography) while maintaining user sessions and handling complex membership business rules.

The Solution: A decoupled system where Admins manage core configurations, Vendors manage inventory, and Users experience a seamless shopping-cart flow.

Highlights: Implemented Rule #13—an automated business logic that fetches and pre-sets a 6-month extension for memberships during updates.

🛠️ Technical Stack
Core: Java 21, Spring Boot 3.4.x

Persistence: Spring Data JPA with Hibernate ORM

Database: H2 In-Memory Database (Ideal for rapid evaluation/testing)

Templating: Thymeleaf for server-side rendering

Build Tool: Maven

📂 Key Features
Admin Dashboard: Centralized hub for system maintenance and role management.

Vendor Inventory System: Real-time CRUD operations to add and update event services.

Stateful Shopping Cart: Utilizes HttpSession to persist user selections across multiple pages without database overhead for transient data.

Bypassed Security for Evaluation: For ease of review, authentication is currently bypassed so you can jump straight into the logic.

📋 How to Run & Explore
Clone: git clone https://github.com/Anushka890459/EVENTMANAGEMENTSYSTEM.git

Run: Execute EventmanagementApplication.java in your IDE.

Entry Point: Open http://localhost:8080/admin/maintenance to start the flow.

🗄️ Database Inspection (H2 Console)
To see the data persistence in action:

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:eventdb

User/Pass: sa/keep password blank for h2 connection
