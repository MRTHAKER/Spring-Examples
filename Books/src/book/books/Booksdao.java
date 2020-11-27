package book.books;
import org.springframework.jdbc.core.*;

public class Booksdao {
	private JdbcTemplate jd;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jd = jdbcTemplate;
	}
	public int saveBook() {
		return jd.update("");
	}
}
