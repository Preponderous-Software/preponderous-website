# PLANNING.md – Preponderous Website

This document outlines the strategic vision and development plans for the official Preponderous Software website. The site is being built with Java 21, Spring Boot, Gradle, and Docker. It will serve as a hub for showcasing projects, sharing the Reforged Initiative, connecting with the community, and eventually supporting account-based services.

---

## Core Objectives

- **Showcase Projects**  
  Present active, archived, and flagship projects in a clear, categorized way. Highlight how each connects to the broader Preponderous ecosystem.

- **Communicate Vision**  
  Provide a dedicated space to tell the story of Preponderous—from its origins (*Kreatures*, prototypes) to the present (*Reforged Initiative*).  
  Explain the five core services: UserAuth, Monetization, Viron, Tick, and Executor.

- **Foster Community**  
  Make it easy for contributors to get involved. Highlight Discord, GitHub, and RFCs, and provide pathways for onboarding.

- **Establish Identity**  
  Clearly communicate Preponderous’ mission, values, and unique role in building modular simulation-based games.

- **Support Growth**  
  Build the foundation for user accounts, dashboards, and interactive services powered by Preponderous modules.

---

## Planned Features

### Navigation and Content
- `/projects` → categorized overview of Games, Services, and Tools.  
- `/vision` → history, Reforged Initiative, and future direction.  
- `/community` → links to Discord, GitHub, contributor guides, and announcements.  
- `/about` → mission, values, and organizational story.  
- `/contact` → social links and optional form.  
- `/legal` → licensing, copyright, and compliance.

### Authentication & Accounts
- Integrate with **UserAuth** for registration, login, and session management.  
- Provide a `/dashboard` for authenticated users to manage their presence and preferences.  
- Secure account routes with token validation.

### Testing & Infrastructure
- Expand unit and integration tests for stability.  
- Automate builds, tests, and deployment with CI/CD pipelines.  
- Provide a staging environment for safe review before production release.  
- Support encrypted HTTPS traffic and persistent logging.

---

## Long-Term Goals

- Dynamic project stats (stars, contributors, commits).  
- Blog or changelog for community updates.  
- Internationalization (i18n) for global reach.  
- Download links or demos for games/tools.  
- Real-time GitHub activity integration.  
- Newsletter signup for ongoing updates.  
- Modular extension system for future content growth.  

---

_Last updated: August 17, 2025_