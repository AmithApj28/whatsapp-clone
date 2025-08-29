# whatsapp-clone
A real-time web chat application built using Spring Boot, WebSockets (STOMP over SockJS), Spring Data JPA, and HTML/CSS/JavaScript. This project mimics the basic functionalities of WhatsApp with a focus on live messaging, chat history, and a modern UI with smooth animations.

# 💬 WhatsApp Clone - Real-time Chat Application

A **WhatsApp-like chat application** built with **Spring Boot, WebSockets, and PostgreSQL**.  
It allows users to send and receive messages in real-time with message persistence.

---

## 🚀 Features
- 🔹 Real-time chat using **WebSockets (STOMP protocol)**  
- 🔹 **Message persistence** with PostgreSQL (saved in DB)  
- 🔹 **Chat history retrieval** for each user  
- 🔹 Simple & responsive **frontend with HTML, CSS, and JavaScript**  
- 🔹 Hover effects, animations, and user-friendly design  
- 🔹 REST APIs to fetch stored messages  

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, WebSocket, STOMP  
- **Database:** PostgreSQL (via Spring Data JPA)  
- **Frontend:** HTML, CSS, JavaScript  
- **Build Tool:** Maven  

---



## ⚡ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/whatsapp-clone.git
   cd whatsapp-clone
2. **Set up PostgreSQL Database**
    ```bash
    Set up PostgreSQL Database
3. **Update application.properties**
    ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/whatsapp_clone
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    
4.**Run the application**
   ```bash
   mvn clean install
   mvn spring-boot:run




    

   
   

