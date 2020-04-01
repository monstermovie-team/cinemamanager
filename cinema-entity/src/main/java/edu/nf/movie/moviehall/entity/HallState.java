package edu.nf.movie.moviehall.entity;

import lombok.Data;

/**
 * @author Administrator
 * 影厅后台管理员用户信息
 */
@Data
public class HallState {

    /**
     * ID
     */
    private Integer stateId;
    /**
     * 影厅状态
     */
    private String hallState;

}
