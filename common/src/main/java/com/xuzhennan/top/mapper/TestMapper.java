package com.xuzhennan.top.mapper;

import com.xuzhennan.top.model.Test;
import com.xuzhennan.top.model.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface TestMapper {
    @SelectProvider(type=TestSqlProvider.class, method="countByExample")
    long countByExample(TestExample example);

    @DeleteProvider(type=TestSqlProvider.class, method="deleteByExample")
    int deleteByExample(TestExample example);

    @Delete({
        "delete from test",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into test (test1, test2, test3)",
        "values (#{test1,jdbcType=BIT}, #{test2,jdbcType=CHAR}, #{test3,jdbcType=DATE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Test record);

    @InsertProvider(type=TestSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Test record);

    @SelectProvider(type=TestSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="test1", property="test1", jdbcType=JdbcType.BIT),
        @Result(column="test2", property="test2", jdbcType=JdbcType.CHAR),
        @Result(column="test3", property="test3", jdbcType=JdbcType.DATE)
    })
    List<Test> selectByExampleWithRowbounds(TestExample example, RowBounds rowBounds);

    @SelectProvider(type=TestSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="test1", property="test1", jdbcType=JdbcType.BIT),
        @Result(column="test2", property="test2", jdbcType=JdbcType.CHAR),
        @Result(column="test3", property="test3", jdbcType=JdbcType.DATE)
    })
    List<Test> selectByExample(TestExample example);

    @Select({
        "select",
        "id, test1, test2, test3",
        "from test",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="test1", property="test1", jdbcType=JdbcType.BIT),
        @Result(column="test2", property="test2", jdbcType=JdbcType.CHAR),
        @Result(column="test3", property="test3", jdbcType=JdbcType.DATE)
    })
    Test selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Test record);

    @Update({
        "update test",
        "set test1 = #{test1,jdbcType=BIT},",
          "test2 = #{test2,jdbcType=CHAR},",
          "test3 = #{test3,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Test record);
}