package Dzien4_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dzien4_mvc.Book;

public class BookDao {
	public static final String INSERT_INTO_BOOK = "INSERT INTO modul3.Book(title,author,isbn)VALUES(?,?,?)";
	public static final String DELETE_FROM_BOOK = "DELETE FROM modul3.Book where id=?";
	public static final String VIEW_ALL = "SELECT* FROM modul3.Book";

	public boolean insert(Book book) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root",
				"coderslab")) {

			PreparedStatement ps = conn.prepareStatement(INSERT_INTO_BOOK);
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getISBN());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean delete(Long id) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root",
				"coderslab")) {

			PreparedStatement ps = conn.prepareStatement(DELETE_FROM_BOOK);
			ps.setLong(1, id);
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<String> view() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root",
				"coderslab")) {

			Statement st = conn.createStatement();
			ResultSet resultSet = st.executeQuery(VIEW_ALL);
			List<String> books = new ArrayList<>();
			while (resultSet.next()) {

				long id = resultSet.getLong(1);
				String idString = id + "";
				String title = resultSet.getString(2);
				String author = resultSet.getString(3);
				String isbn = resultSet.getString(4);
				books.add(idString);
				books.add(title);
				books.add(author);
				books.add(isbn);

			}
			return books;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
