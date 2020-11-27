package book.books;
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
}
