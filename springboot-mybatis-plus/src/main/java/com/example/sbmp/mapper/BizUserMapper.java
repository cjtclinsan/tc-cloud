package com.example.sbmp.mapper;

import com.example.sbmp.entity.BizUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
public interface BizUserMapper extends BaseMapper<BizUser> {
    List<BizUser> findUserAndScoreById();
}