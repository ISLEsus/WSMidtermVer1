package kz.iitu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"kz.iitu"})
public class SpringConfig {

  @Bean("schedulerSubjects")
  public List<Subject> getSubjectList() {

    //1. Fetch data from the Data Base and put into an Array List

    Connection connection = null;
    // Create an ArrayList
    ArrayList<Subject> subjectList = new ArrayList<>();
    try {
      // Load the MySQL JDBC driver
      String driverName = "com.mysql.cj.jdbc.Driver";
      Class.forName(driverName);

      // Create a connection to the database
      String serverName = "localhost:3306";
      String schema = "subjectdb";
      String url = "jdbc:mysql://" + serverName +  "/" + schema;
      String username = "ISL";
      String password = "";
      connection = DriverManager.getConnection(url, username, password);
      System.out.println("Successfully Connected to the database!");

    } catch (ClassNotFoundException e) {
      System.out.println("Could not find the database driver " + e.getMessage());

    } catch (SQLException e) {
      System.out.println("Could not connect to the database " + e.getMessage());
    }

    try {
      // Get a result set containing all data from subject
      Statement statement = connection.createStatement();
      ResultSet results = statement.executeQuery("SELECT * FROM subject");

      // For each row of the result set ...
      while (results.next()) {
        Subject subject = new Subject(results.getString("Day"), results.getString("SubjectGroup"), results.getString("Teacher"), results.getString("Time"), results.getString("SubjectName"));
        subjectList.add(subject);
      }

    } catch (SQLException e) {
      System.out.println("Could not retrieve data from the database " + e.getMessage());
    }
    return subjectList;
  }
}

