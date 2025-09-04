# 🍔 Food Delivery Automation

This project automates the workflow of a **Food Delivery Application** (like Swiggy/Zomato) using **Selenium WebDriver, TestNG, and Maven**.  
It follows the **Page Object Model (POM)** design pattern for clean, maintainable, and scalable test automation.  
The project also integrates **Extent Reports** for rich HTML reporting.

---

## 📌 Features
- ✅ Automates end-to-end food ordering flow  
- ✅ Uses **Page Object Model (POM)** for scalability  
- ✅ Cross-browser execution support  
- ✅ Parallel test execution using TestNG  
- ✅ Generates **HTML reports** with screenshots (Extent Reports)  
- ✅ CI/CD friendly (can be integrated with Jenkins / GitHub Actions)

---

## 🛠️ Tech Stack
- **Language**: Java (JDK 17+)  
- **Automation Tool**: Selenium WebDriver 4.x  
- **Test Framework**: TestNG  
- **Build Tool**: Maven  
- **Driver Management**: WebDriverManager  
- **Reports**: Extent Reports  

---

## 📂 Project Structure
Food-Delivery-Automation/
 ├── src/
 │   ├── main/java/com/automation/pages/      # POM classes
 │   │    ├── HomePage.java
 │   │    ├── RestaurantPage.java
 │   │    ├── CartPage.java
 │   │    └── CheckoutPage.java
 │   ├── main/java/com/automation/utils/      # Utilities
 │   │    └── BaseTest.java
 │   ├── test/java/com/automation/tests/      # Test classes
 │   │    └── FoodDeliveryTest.java
 ├── reports/                                 # Test reports
 ├── pom.xml
 ├── testng.xml
 ├── README.md
 └── .gitignore
