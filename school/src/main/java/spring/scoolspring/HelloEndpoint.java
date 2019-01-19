package spring.scoolspring;

import lombok.Data;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Named
@Path("/")
public class HelloEndpoint {
    @Inject
    NamedParameterJdbcTemplate jdbcTemplate;

    @GET
    public String hello() {
        return "Hello World!";
    }

    @Data
    static class Result {
        public Result(int left2, int right2, long long1) {
		}
		private final int left=100;
        private final int right=100;
        private final long answer=200;
    }

    // SQL sample
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("calc")
    public Result calc(@QueryParam("left") int left, @QueryParam("right") int right) {
        MapSqlParameterSource source = new MapSqlParameterSource()
                .addValue("left", left)
                .addValue("right", right);
        return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
                (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
    }
}
