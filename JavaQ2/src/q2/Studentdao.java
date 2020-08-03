package q2;
import org.springframework.jdbc.core.*;

import q2.Student;

public class Studentdao {
	private JdbcTemplate jd;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jd = jdbcTemplate;
	}
	public int saveStudent(Student s) {
		String query="insert into student values("+s.getId()+",'"+s.getName()+"',"+s.getMarks()+")";
		return jd.update(query);
	}
	public int updateStudent(Student s) {
		String query="update student setname='"+s.getName()+"',marks="+s.getMarks()+" where id="+s.getId()+")";
		return jd.update(query);
	}
	public int deleteStudent(Student s) {
		String query="delete from student where id="+s.getId();
		return jd.update(query);
	}
}
