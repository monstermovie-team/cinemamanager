package edu.nf.movie.test;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.moviehall.entity.MovieInfo;
import edu.nf.movie.moviehall.entity.MovieUpdown;
import edu.nf.movie.moviehall.service.MovieHallService;
import edu.nf.movie.moviehall.service.MovieInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CinemaDaoTest {

    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private MovieHallService movieHallService;

    @Autowired
    private MovieInfoService movieInfoService;

    @Test
    public void loadUserByUsername() {
        UserDetails info = cinemaService.loadUserByUsername("987654321");
        System.out.println(info.getPassword() + info.getUsername());
    }

    @Test
    public void testMovieType() {
        PageInfo<MovieUpdown> pageInfo = movieHallService.listMoveUpdownInfo(1, 2);
        pageInfo.getList().forEach(movieUpdown -> System.out.println(movieUpdown.getMovieHallInfo().getHallName()));
    }

    /*@Test
    public void testMovieInfo(){
        List<MovieInfo> list = movieInfoService.listMovieInfo();
        list.forEach(movieInfo -> System.out.println(movieInfo.getMovieId() + movieInfo.getMovieName()));
    }*/

}