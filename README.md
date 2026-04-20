# 📱 Phonebook Web UI Automation Framework (Hybrid Approach)

A professional-grade automated testing framework for the Phonebook Web Application. This project demonstrates a **Hybrid Architecture**, blending the flexibility of the **Action-Oriented (Helper) Pattern** with robust centralized management.

## 🎯 Business Goal
To provide a scalable and maintainable automation solution that ensures the quality of core user flows: authentication, contact management, and data integrity across the web interface.

## 🛠 Tech Stack
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF5722?style=for-the-badge&logo=testng&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Lombok](https://img.shields.io/badge/lombok-%23000000.svg?style=for-the-badge&logo=lombok&logoColor=white)

## 🏗 Architecture & Design Patterns
- **OOD Focus**: The framework is built with a focus on Object-Oriented Design (OOD) to ensure that UI changes require minimal adjustments in the code logic.
- **Dynamic DataProviders**: Leveraged **Reflection API** to intelligently route data sources based on test method names, reducing boilerplate code.
- **Hybrid Manager-Helper Pattern**: Centralized orchestration via `ApplicationManager` with specialized logic delegated to functional helpers (`UserHelper`, `ContactHelper`).
- **Advanced Monitoring**: Implemented `EventFiringWebDriver` with custom `WDListener`/`TestNGListener` to capture every driver action and automate logging.
- **DTO & Data Management**: High-cleanliness data handling using **Lombok Builders** for User and Contact entities.
- **Data-Driven Testing (DDT)**: Seamless integration with external **CSV data providers** for exhaustive test coverage.
- **Robust Synchronization**: Intelligent use of implicit and explicit waits to handle dynamic web elements.

## 🚀 Getting Started
1. **Prerequisites**: Ensure you have JDK 11+ installed.
2. **Clone the repo**: 
   ```bash
   git clone https://github.com/Alllmighty/Phonebook-Web-UI-Framework-Hybrid.git
   ```
3. **Run Tests**:
   ```bash
   ./gradlew test
   ```
4. **Configuration**: Environment settings can be adjusted in src/test/resources/.