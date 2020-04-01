package edu.nf.movie.moviehall.service.impl;

import edu.nf.movie.cinema.service.exception.DataAccessException;
import edu.nf.movie.moviehall.dao.MovieHallDao;
import edu.nf.movie.moviehall.entity.MovieInfo;
import edu.nf.movie.moviehall.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieInfoService")
public class MovieInfoServiceImpl implements MovieInfoService {

    @Autowired
    private MovieHallDao movieHallDao;

    @Override
    public List<MovieInfo> listMovieInfo() {
        List<MovieInfo> list = movieHallDao.listMovieInfo();
        return list;
    }

    @Override
    public List<MovieInfo> findMovieInfoById(Integer movieId) {
        try{
            List<MovieInfo> list = movieHallDao.findMovieInfoById(movieId);
            return list;
        }catch (Exception e){
            e.printStackTrace();
            throw new DataAccessException("服务器内部错误，请稍后访问!");
        }
    }

    @Override
    public List<MovieInfo> findMovieInfoByName(String movieName) {
        try{
            List<MovieInfo> list = movieHallDao.findMovieInfoByName(movieName);
            return list;
        }catch (Exception e){
            e.printStackTrace();
            throw new DataAccessException("服务器内部错误，请稍后访问!");
        }
    }

}
