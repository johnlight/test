import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@Import(DBConfiguration.class)
@TestPropertySource(locations= "classpath:test.properties")
public class DatabaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void testing(){
        jdbcTemplate.query("select 1", new SingleColumnRowMapper<>(Integer.class));
    }
}
