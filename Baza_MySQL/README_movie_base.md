# Ustawienia bazy MySQL
## Java zaawansowana

> [!NOTE]
> ### Instalacja MySql

### [MySQL Installer](https://dev.mysql.com/downloads/installer/)
- wybrać mniejszy plik (2.1M)
- wybrać `No thanks, just start my download.`
- **Choosing a Setup Type**: `Custom`:
  - MySQL Servers (wybrać najnowszy);
  - Application \ MySQL Workbench (wybrać najnowszy)
- Next \ Execute
- Group Replication
  - Standalone MySQL Server / Classic MySQL Replication
- Type and Networking
  - Config Type: Development Computer
- Authentication Method
  - Use Strong Password Encryption for Authentication
- Account and Rules
  - podać wymyślone hasło
- Windows Service
  - [x] Configure MySQL Server as a Windows Service
    - Windows Service Name: `MySQL80` 
  - [x] Start the SQL Server at System Startup

  **services.msc**

![img_01.png](img/img_01.png)

- Standard System Account

### MySQL Workbench

Uruchomić program MySQL Workbench 

Welcome to MySQL Workbench
 - MySQL Connections
   - Local Instance MySQL80
   - Wpisać hasło
   - File \ Open SQLScript \ `Wybrać bazę MySQL`

![img_02.png](img/img_02.png)

### Intellij IDEA

![img_03.png](img/img_03.png)

zawartość pliku `application.properties`, aby połączyć się z bazą MySQL:

```java
spring.datasource.url=jdbc:mysql://localhost:3306/movieservicedb
spring.datasource.username=root
spring.datasource.password=Qwerty12
```
zawartość pliku `pom.xml`, z odpowiednimi dependencjami, aby połączyć się z bazą MySQL:

```java
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.26</version>
</dependency>
```
