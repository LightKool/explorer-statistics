package com.github.ontio.explorer.statistics.mapper;

import com.github.ontio.explorer.statistics.model.Config;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ConfigMapper extends Mapper<Config> {
}