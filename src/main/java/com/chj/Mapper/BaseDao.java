package com.chj.Mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ：chj
 * @date ：Created in 2020/11/14 17:02
 * @params :  统用Mapper
 */
public interface BaseDao<T> extends Mapper<T>, MySqlMapper<T> {
}
