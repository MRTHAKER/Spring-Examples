package book.books;
import java.sql.*;
import java.util.List;

import org.springframework.jdbc.core.*;

public class Booksdao {
	private JdbcTemplate jd;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jd = jdbcTemplate;
	}
	public int saveBook(Books b) {
		String query="insert into employee values('"+b.getBrand()+"','"+b.getType()+"','"+b.getForGender()+"','"+b.getPrice()+"','"+b.getSize()+"','"+b.getAvailableOn()+"')";
		return jd.update(query);
	}
	
	public List<Books> getAllBooksRowMapper(){  
		 return jd.query("select Type from Books where Type='Ethnic",new RowMapper<Books>(){  
		    @Override  
		    public Books mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Books b=new Books();  
		        b.setBrand(rs.getNString(1));
		        b.setType(rs.getNString(2));
		        b.setForGender(rs.getNString(3));
		        b.setPrice(rs.getInt(4));
		        b.setSize(rs.getInt(5));
		        b.setAvailableOn(rs.getNString(6));
		        return b;  
		    }  
		    });  
}
}
