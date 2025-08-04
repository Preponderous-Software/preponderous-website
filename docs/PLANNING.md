# 📘 PLANNING.md – Preponderous Website

This document outlines the current issues and future development plans for the official Preponderous Software website. The site is being built with Java 21, Spring Boot, Gradle, and Docker. It will serve as a hub for showcasing projects, connecting with the community, and offering account-based services in the future.

---

## ✅ Current Open Issues

### #10 – Organize projects into games, assets, and templates
Group listed projects on the homepage or /projects page by category for easier navigation and clarity.

### #9 – Fix or remove links at bottom of page
Audit footer links and either update or remove broken/outdated ones.

### #8 – Add card for 'Parpt' project
Include a visual and textual card on the projects page describing the *Parpt* tool, with a link to its GitHub repository.

### #5 – Fix "Main class name has not been configured" error upon docker build
Update `build.gradle` or `Dockerfile` to ensure that the main class is correctly defined for Spring Boot when containerized.

---

## 🧭 Planned Features and Improvements

### 🌐 Navigation and Content

- **Add dynamic /projects route**  
  Display categorized projects (Games, Assets, Templates) with descriptions, links, and status indicators.

- **Add /about page**  
  Describe the mission, values, and team behind Preponderous Software.

- **Add /contact page**  
  Display contact options, social media links, and possibly a contact form.

- **Improve footer layout and functionality**  
  Add navigation links, license information, and dynamic year updates.

- **Implement `/legal` route**  
  Host licensing, copyright, and compliance documents.

---

### 🔐 Authentication & User Accounts

- **Integrate UserAuth service**  
  Connect to the standalone UserAuth module for user registration, login, and JWT-based session management.

- **Add frontend forms for login/register**  
  Use Thymeleaf + HTMX to render interactive, responsive forms.

- **Create /dashboard route**  
  Allow logged-in users to manage their profile, view starred or followed projects, and adjust preferences.

- **Protect user routes**  
  Secure account-related pages with session token validation.

---

### 🧪 Testing & CI/CD

- **Improve unit test coverage**  
  Add controller and service tests using JUnit and Spring Boot test framework.

- **Set up GitHub Actions for CI**  
  Automate testing and Docker builds on push to `main`.

- **Add staging environment**  
  Deploy latest `main` branch to Fly.io or similar for review before production deployment.

---

### 🐳 Deployment & Infrastructure

- **Enable HTTPS with Let's Encrypt**  
  Ensure all traffic is encrypted using a reverse proxy like Traefik or Caddy.

- **Docker Compose for local dev**  
  Bundle app and database (if needed) into a full-stack local development environment.

- **Persistent Logging**  
  Configure log rotation and output streaming for long-term observability.

---

## 📌 Long-Term Goals

- Showcase dynamic stats for Preponderous projects (stars, contributors, commits)
- Add a blog or changelog section for community updates
- Support localization/internationalization (i18n)
- Offer download links or demos for each game/tool
- Display real-time GitHub issue activity using the GitHub API
- Enable newsletter signup (integrated with Mailchimp or Buttondown)
- Eventually support a modular plugin system for content extension

---

_Last updated: August 4, 2025_