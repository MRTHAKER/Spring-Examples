package jj;
import org.springframework.jdbc.core.*;
public class Employeedao {
private JdbcTemplate jd;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jd = jdbcTemplate;
}
public int saveEmp(Employee e) {
	String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
	return jd.update(query);
}
public int updateEmployee(Employee e) {
	String query="update employee setname='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"')";
	return jd.update(query);
}
public int deleteEmployee(Employee e) {
	String query="delete from employee where id="+e.getId();
	return jd.update(query);
}
}
