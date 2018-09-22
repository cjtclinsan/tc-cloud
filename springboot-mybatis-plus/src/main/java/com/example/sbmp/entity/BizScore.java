package com.example.sbmp.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
@TableName("biz_score")
public class BizScore extends Model<BizScore> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer score;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "BizScore{" +
			"id=" + id +
			", score=" + score +
			"}";
	}
}
