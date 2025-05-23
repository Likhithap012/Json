# Json

This project is a hands-on guide to working with JSON in Java. It covers how to parse, generate, and manipulate JSON data using popular libraries. The code is modular, beginner-friendly, and aligned with real-world data interaction scenarios.

✅ Created using **Maven** for efficient dependency management and modular build process.

---

## Roadmap 🛤️

This repository is designed to provide foundational and advanced knowledge of handling JSON in Java for applications like REST APIs, configuration files, and data transformation.

---

🚀 **Code Contains**:

📥 **Parsing JSON Data**  
Understand:
  • Reading JSON from files and strings  
  • Deserializing JSON into Java objects using libraries like Jackson and Gson  

📤 **Generating JSON**  
Learn:
  • Creating JSON objects from Java classes  
  • Serializing Java objects back to JSON strings  


🛠️ **Common Use Cases**  
  • Config file parsing  
  • Simple data exchange structures  
  • Conversion between JSON and collections  

---

## 🔧 Built with Maven

This project uses **Maven** for build automation and dependency management. All required libraries are included via Maven dependencies.

### 🧩 Supported Libraries

- Jackson
- Gson
- org.json (optional/native approach)

---

## 📦 Ways to Add JSON Dependencies

This project supports **three methods** to add JSON-handling libraries in Maven:

### 1. Jackson (FasterXML)

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.14.1</version>
</dependency>
````

### 2. Gson (by Google)

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10</version>
</dependency>
```

### 3. org.json (Lightweight, Java Native Feel)

```xml
<dependency>
  <groupId>org.json</groupId>
  <artifactId>json</artifactId>
  <version>20220320</version>
</dependency>
```

---



## 💡 How to Run

```bash
# Clone the repository
git clone https://github.com/Likhithap012/Json.git
```


