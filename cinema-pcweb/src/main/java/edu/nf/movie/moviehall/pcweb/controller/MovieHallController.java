package edu.nf.movie.moviehall.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.moviehall.entity.MovieCinema;
import edu.nf.movie.moviehall.entity.MovieHallInfo;
import edu.nf.movie.moviehall.entity.MovieInfo;
import edu.nf.movie.moviehall.pcweb.vo.ResultVO;
import edu.nf.movie.moviehall.entity.MovieUpdown;
import edu.nf.movie.moviehall.service.MovieHallService;
import edu.nf.movie.moviehall.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
public class MovieHallController extends BaseController{

    @Autowired
    private MovieHallService movieHallService;

    @Autowired
    private MovieInfoService movieInfoService;

    @InitBinder
    public void convertDate(WebDataBinder binder){
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    @GetMapping("/list_movie_updown")
    private ResultVO<PageInfo<MovieUpdown>> listMovieUpdown(Integer pageNum, Integer pageSize){
        PageInfo<MovieUpdown> pageInfo = movieHallService.listMoveUpdownInfo(pageNum,pageSize);
        return success(pageInfo);
    }

    @GetMapping("list_movie_info")
    private ResultVO<List<MovieInfo>> listMovieInfo(){
        List<MovieInfo> list = movieInfoService.listMovieInfo();
        return success(list);
    }

    @PostMapping("/find_movie_id")
    private ResultVO<List<MovieInfo>> findMovieInfoById(Integer movieId){
        List<MovieInfo> list = movieInfoService.findMovieInfoById(movieId);
        return success(list);
    }

    @PostMapping("/find_movie_name")
    private ResultVO<List<MovieInfo>> findMovieInfoByName(String movieName){
        List<MovieInfo> list = movieInfoService.findMovieInfoByName(movieName);
        return success(list);
    }

    @GetMapping("/list_movie_hall")
    private ResultVO<PageInfo<MovieHallInfo>> listMovieHall(Integer pageNum, Integer pageSize){
        PageInfo<MovieHallInfo> pageInfo = movieHallService.listMovieHall(pageNum, pageSize);
        return success(pageInfo);
    }

    @PostMapping("/add_movie_hall")
    private ResultVO addMovieHall(MovieHallInfo movieHallInfo){
        movieHallService.addMovieHall(movieHallInfo);
        return success("添加");
    }

    @PostMapping("/remove_movie_hall")
    private int removeMovieHall(Integer hallId){
        int size = movieHallService.removeMovieHall(hallId);
        return size;
    }

    @PostMapping("/get_movie_hall_by_id")
    private ResultVO<MovieHallInfo> getMovieHallById(Integer movieHallId){
        MovieHallInfo info = movieHallService.getMovieHallById(movieHallId);
        return success(info);
    }

    @PostMapping("/update_movie_hall")
    private void updateHallInfo(MovieHallInfo movieHallInfo){
        movieHallService.updateHallInfo(movieHallInfo);
    }

    @GetMapping("/list_movie_cinema")
    private ResultVO<List<MovieCinema>> listMovieCinemaInfo(){
        List<MovieCinema> list = movieHallService.listMovieCinemaInfo();
        return success(list);
    }
    @GetMapping("/get_cinema_id")
    private ResultVO<MovieCinema> getInfoByName(String cinemaName){
        MovieCinema cinema = movieHallService.getInfoByName(cinemaName);
        return success(cinema);
    }
}
