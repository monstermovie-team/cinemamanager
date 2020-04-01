package edu.nf.movie.moviehall.entity;


import lombok.Data;

/**
 * @author Administrator
 * 电影信息
 */
@Data
public class MovieInfo {

    /**
     *电影编号
     */
    private Integer movieId;
    /**
     *电影名称
     */
    private String  movieName;
    /**
     *电影英文名
     */
    private String movieEnglishName;
    /**
     *电影想看数
     */
    private Integer movieWantToSee;
    /**
     *电影类型
     */
    private Integer movieType;
    /**
     *电影区域
     */
    private Integer movieRegion;
    /**
     *电影年代
     */
    private Integer movieYear;
    /**
     *电影状态
     */
    private Integer movieState;
    /**
     *电影时长
     */
    private Integer movieTime;
    /**
     *电影介绍
     */
    private String movieIntroduce;

}
