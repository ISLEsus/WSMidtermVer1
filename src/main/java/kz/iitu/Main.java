package kz.iitu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      Scheduler scheduler = context.getBean("scheduler", Scheduler.class);
      scheduler.showMenu();
  }
}




//Connection connection = null;
//
//      try {
//
//        // Load the MySQL JDBC driver
//        String driverName = "com.mysql.cj.jdbc.Driver";
//        Class.forName(driverName);
//
//        // Create a connection to the database
//        String serverName = "localhost:3306";
//        String schema = "subjectdb";
//        String url = "jdbc:mysql://" + serverName +  "/" + schema;
//        String username = "ISL";
//        String password = "";
//
//        connection = DriverManager.getConnection(url, username, password);
//        System.out.println("Successfully Connected to the database!");
//
//      } catch (ClassNotFoundException e) {
//        System.out.println("Could not find the database driver " + e.getMessage());
//      } catch (SQLException e) {
//        System.out.println("Could not connect to the database " + e.getMessage());
//      }
//
//      try {
//        // Get a result set containing all data from subject
//        Statement statement = connection.createStatement();
//        ResultSet results = statement.executeQuery("SELECT * FROM subject");
//
//        ArrayList<Subject> subjectList = new ArrayList<>();
//        // For each row of the result set ...
//        while (results.next()) {
//
//          // Get the data from the current row using the column index - column data are in the VARCHAR format
//            //String data = results.getString("Day");
//            //System.out.println(data);
//
//            // Get the data from the current row using the column name - column data are in the VARCHAR format
//            // data = results.getString("Teacher");
//            // System.out.println("Fetching data by column name for row " + results.getRow() + " : " + data);
//
//          Subject subject = new Subject(results.getString("Day"), results.getString("SubjectGroup"), results.getString("Teacher"), results.getString("Time"), results.getString("SubjectName"));
//          subjectList.add(subject);
//          //subject.Display();
//        }
//
//          for (Subject subject : subjectList){
//              subject.Display();
//          }
//          // for (Account account : accounts) {
//          //      if (account.getCardNumber().equals(cardNumber)) {
//          //        Double finalBalance = account.getBalance() - sum;
//          //        account.setBalance(finalBalance);
//          //
//          //        System.out.println("Current updated balance: " + finalBalance);
//          //
//          //        return;
//          //      }
//          //    }
//
//        //return subjectList;
//
//      } catch (SQLException e) {
//        System.out.println("Could not retrieve data from the database " + e.getMessage());
//      }

  /*
   * Please note :
   * ResultSet API provides appropriate methods for retrieving data
   * based on each column data type e.g.
   *
   * boolean bool = rs.getBoolean("test_col");
   * byte b = rs.getByte("test_col");
   * short s = rs.getShort("test_col");
   * int i = rs.getInt("test_col");
   * long l = rs.getLong("test_col");
   * float f = rs.getFloat("test_col");
   * double d = rs.getDouble("test_col");
   * BigDecimal bd = rs.getBigDecimal("test_col");
   * String str = rs.getString("test_col");
   * Date date = rs.getDate("test_col");
   * Time t = rs.getTime("test_col");
   * Timestamp ts = rs.getTimestamp("test_col");
   * InputStream ais = rs.getAsciiStream("test_col");
   * InputStream bis = rs.getBinaryStream("test_col");
   * Blob blob = rs.getBlob("test_col");
   */

  //  public static void main(String[] args) {
//
//    public static ArrayList<Subject> getAllSubject() throws ClassNotFoundException, SQLException {
//      Connection conn=DBConnection.getDBConnection().getConnection();
//      Statement stm;
//      stm = conn.createStatement();
//      String sql = "Select * From subject";
//      ResultSet rst;
//      rst = stm.executeQuery(sql);
//      ArrayList<Subject> subjectList = new ArrayList<>();
//      while (rst.next()) {
//        Subject subject = new Subject(rst.getString("Day"), rst.getString("SubjectGroup"), rst.getString("Teacher"), rst.getString("Time"), rst.getDouble("SubjectName"));
//        subjectList.add(subject);
//      }
//      return subjectList;
//    }
//  }

