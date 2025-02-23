package edu.npu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.npu.entity.FailCachedCarpooling;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author wangminan
* @description 针对表【fail_cached_carpooling】的数据库操作Mapper
* @createDate 2023-05-13 11:42:08
* @Entity edu.npu.entity.FailCachedCarpooling
*/
@Mapper
public interface FailCachedCarpoolingMapper extends BaseMapper<FailCachedCarpooling> {

    @Select("SELECT * FROM fail_cached_carpooling WHERE id % #{shardTotal} = #{shardIndex} LIMIT #{count}")
    List<FailCachedCarpooling> selectListByShardIndex(int shardIndex, int shardTotal, int count);
}




