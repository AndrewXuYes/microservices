package com.xuzhennan.top.mapper;

import com.xuzhennan.top.model.Order;
import com.xuzhennan.top.model.OrderExample;
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

public interface OrderMapper {
    @SelectProvider(type=OrderSqlProvider.class, method="countByExample")
    long countByExample(OrderExample example);

    @DeleteProvider(type=OrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderExample example);

    @Delete({
        "delete from order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into order (user, product, ",
        "number, sumprice)",
        "values (#{user,jdbcType=CHAR}, #{product,jdbcType=CHAR}, ",
        "#{number,jdbcType=INTEGER}, #{sumprice,jdbcType=REAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Order record);

    @SelectProvider(type=OrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="product", property="product", jdbcType=JdbcType.CHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="sumprice", property="sumprice", jdbcType=JdbcType.REAL)
    })
    List<Order> selectByExampleWithRowbounds(OrderExample example, RowBounds rowBounds);

    @SelectProvider(type=OrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="product", property="product", jdbcType=JdbcType.CHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="sumprice", property="sumprice", jdbcType=JdbcType.REAL)
    })
    List<Order> selectByExample(OrderExample example);

    @Select({
        "select",
        "id, user, product, number, sumprice",
        "from order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="product", property="product", jdbcType=JdbcType.CHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="sumprice", property="sumprice", jdbcType=JdbcType.REAL)
    })
    Order selectByPrimaryKey(Integer id);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update order",
        "set user = #{user,jdbcType=CHAR},",
          "product = #{product,jdbcType=CHAR},",
          "number = #{number,jdbcType=INTEGER},",
          "sumprice = #{sumprice,jdbcType=REAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Order record);
}