# 🚀 MVP.md – Preponderous Website

This document defines the **Minimum Viable Product (MVP)** for the Preponderous Software website. The goal is to create a clean, navigable, and secure website that allows users to:

- Learn about Preponderous Software
- Browse featured projects
- Sign up for an account and manage their profile

---

## ✅ MVP Feature Checklist

### 🧱 Core Pages

- [ ] `/` – Landing page with welcome message and links to featured projects
- [ ] `/projects` – Grid or list view of projects grouped by category (Games, Assets, Templates)
- [ ] `/about` – Brief mission statement and vision for Preponderous Software
- [ ] `/contact` – Basic contact information or placeholder for future contact form
- [ ] `/legal` – License and compliance documents (MIT License, Copyright)

---

### 🧑‍💻 User Authentication (via [UserAuth](https://github.com/Preponderous-Software/UserAuth))

- [ ] `/register` – Form for new users to create an account
- [ ] `/login` – Login form with validation and JWT-based session creation
- [ ] Session token stored client-side securely (e.g., `localStorage`)
- [ ] JWT validated on backend before allowing access to protected routes
- [ ] `/dashboard` – User dashboard for logged-in users
- [ ] `/logout` – Clears session and redirects to home

---

### 🌐 Functionality & UX

- [ ] Navbar with navigation links (Home, Projects, About, Login/Register)
- [ ] Footer with GitHub link, license, and year
- [ ] Mobile responsive styling using Bootstrap
- [ ] Interactive components powered by HTMX (e.g., login status, forms)
- [ ] Flash messages for errors/success (e.g., login failure, registration complete)

---

### ⚙️ Technical

- [ ] Java 21 with Spring Boot (Thymeleaf templating)
- [ ] Buildable via `./gradlew build` and `docker build`
- [ ] Run locally via `./gradlew bootRun` or `docker compose up`
- [ ] Application accessible at `http://localhost:8080`
- [ ] Basic tests pass via `./gradlew test`

---

### 🔒 Security

- [ ] Passwords hashed using bcrypt in UserAuth backend
- [ ] Token expiration and route protection implemented
- [ ] HTTPS required for production deployment

---

## 🎯 MVP Completion Criteria

The MVP is considered complete when:

- A new user can visit the site, register, log in, and access a personal dashboard.
- The site is styled and responsive.
- All routes function without critical bugs.
- Code builds, runs, and passes tests locally and via Docker.

---

_Last updated: August 4, 2025_