package cn.edu.xmu.javaee.productdemoaop.mapper.link;

import cn.edu.xmu.javaee.productdemoaop.mapper.generator.po.OnSalePo;
import cn.edu.xmu.javaee.productdemoaop.mapper.manual.po.ProductAllPo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
@Mapper
public interface ProductAllMapper_link {

        @Select({
                "SELECT p.id AS product_id, p.sku_sn, p.name, p.original_price, p.weight, p.barcode, p.unit, ",
                "p.origin_place, p.commission_ratio, p.free_threshold, p.status, p.creator_id, ",
                "p.creator_name, p.modifier_id, p.modifier_name, p.gmt_create, p.gmt_modified, ",
                "o.id AS on_sale_id, o.price, o.begin_time, o.end_time, o.quantity, o.max_quantity, ",
                "o.creator_id AS on_sale_creator_id, o.creator_name AS on_sale_creator_name, ",
                "o.modifier_id AS on_sale_modifier_id, o.modifier_name AS on_sale_modifier_name, ",
                "o.gmt_create AS on_sale_gmt_create, o.gmt_modified AS on_sale_gmt_modified ",
                "FROM product p ",
                "LEFT JOIN goods_onsale o ON p.id = o.product_id AND o.begin_time <= NOW() AND o.end_time > NOW() ",
                "WHERE p.name = #{name,jdbcType=VARCHAR}"
        })
        @Results({
                @Result(column="product_id", property="id", jdbcType=JdbcType.BIGINT, id=true),
                @Result(column="sku_sn", property="skuSn", jdbcType=JdbcType.VARCHAR),
                @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
                @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.BIGINT),
                @Result(column="weight", property="weight", jdbcType=JdbcType.BIGINT),
                @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
                @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
                @Result(column="origin_place", property="originPlace", jdbcType=JdbcType.VARCHAR),
                @Result(column="commission_ratio", property="commissionRatio", jdbcType=JdbcType.INTEGER),
                @Result(column="free_threshold", property="freeThreshold", jdbcType=JdbcType.BIGINT),
                @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
                @Result(column="creator_id", property="creatorId", jdbcType=JdbcType.BIGINT),
                @Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
                @Result(column="modifier_id", property="modifierId", jdbcType=JdbcType.BIGINT),
                @Result(column="modifier_name", property="modifierName", jdbcType=JdbcType.VARCHAR),
                @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="on_sale_id", property="onSale.id", jdbcType=JdbcType.BIGINT),
                @Result(column="price", property="onSale.price", jdbcType=JdbcType.BIGINT),
                @Result(column="begin_time", property="onSale.beginTime", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="end_time", property="onSale.endTime", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="quantity", property="onSale.quantity", jdbcType=JdbcType.INTEGER),
                @Result(column="max_quantity", property="onSale.maxQuantity", jdbcType=JdbcType.INTEGER),
                @Result(column="on_sale_creator_id", property="onSale.creatorId", jdbcType=JdbcType.BIGINT),
                @Result(column="on_sale_creator_name", property="onSale.creatorName", jdbcType=JdbcType.VARCHAR),
                @Result(column="on_sale_modifier_id", property="onSale.modifierId", jdbcType=JdbcType.BIGINT),
                @Result(column="on_sale_modifier_name", property="onSale.modifierName", jdbcType=JdbcType.VARCHAR),
                @Result(column="on_sale_gmt_create", property="onSale.gmtCreate", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="on_sale_gmt_modified", property="onSale.gmtModified", jdbcType=JdbcType.TIMESTAMP)
        })
        List<ProductAllPo> findProductsByName_link(@Param("name") String name);

        @Select({
                "SELECT p.id AS product_id, p.sku_sn, p.name, p.original_price, p.weight, p.barcode, p.unit, ",
                "p.origin_place, p.commission_ratio, p.free_threshold, p.status, p.creator_id, ",
                "p.creator_name, p.modifier_id, p.modifier_name, p.gmt_create, p.gmt_modified, ",
                "o.id AS on_sale_id, o.price, o.begin_time, o.end_time, o.quantity, o.max_quantity, ",
                "o.creator_id AS on_sale_creator_id, o.creator_name AS on_sale_creator_name, ",
                "o.modifier_id AS on_sale_modifier_id, o.modifier_name AS on_sale_modifier_name, ",
                "o.gmt_create AS on_sale_gmt_create, o.gmt_modified AS on_sale_gmt_modified ",
                "FROM product p ",
                "LEFT JOIN goods_onsale o ON p.id = o.product_id AND o.begin_time <= NOW() AND o.end_time > NOW() ",
                "WHERE p.id = #{id,jdbcType=BIGINT}"
        })
        @Results({
                @Result(column="product_id", property="id", jdbcType=JdbcType.BIGINT, id=true),
                @Result(column="sku_sn", property="skuSn", jdbcType=JdbcType.VARCHAR),
                @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
                @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.BIGINT),
                @Result(column="weight", property="weight", jdbcType=JdbcType.BIGINT),
                @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
                @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
                @Result(column="origin_place", property="originPlace", jdbcType=JdbcType.VARCHAR),
                @Result(column="commission_ratio", property="commissionRatio", jdbcType=JdbcType.INTEGER),
                @Result(column="free_threshold", property="freeThreshold", jdbcType=JdbcType.BIGINT),
                @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
                @Result(column="creator_id", property="creatorId", jdbcType=JdbcType.BIGINT),
                @Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
                @Result(column="modifier_id", property="modifierId", jdbcType=JdbcType.BIGINT),
                @Result(column="modifier_name", property="modifierName", jdbcType=JdbcType.VARCHAR),
                @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="on_sale_id", property="onSale.id", jdbcType=JdbcType.BIGINT),
                @Result(column="price", property="onSale.price", jdbcType=JdbcType.BIGINT),
                @Result(column="begin_time", property="onSale.beginTime", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="end_time", property="onSale.endTime", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="quantity", property="onSale.quantity", jdbcType=JdbcType.INTEGER),
                @Result(column="max_quantity", property="onSale.maxQuantity", jdbcType=JdbcType.INTEGER),
                @Result(column="on_sale_creator_id", property="onSale.creatorId", jdbcType=JdbcType.BIGINT),
                @Result(column="on_sale_creator_name", property="onSale.creatorName", jdbcType=JdbcType.VARCHAR),
                @Result(column="on_sale_modifier_id", property="onSale.modifierId", jdbcType=JdbcType.BIGINT),
                @Result(column="on_sale_modifier_name", property="onSale.modifierName", jdbcType=JdbcType.VARCHAR),
                @Result(column="on_sale_gmt_create", property="onSale.gmtCreate", jdbcType=JdbcType.TIMESTAMP),
                @Result(column="on_sale_gmt_modified", property="onSale.gmtModified", jdbcType=JdbcType.TIMESTAMP)
        })
        List<ProductAllPo> findProductById_link(@Param("id") Long productId);

}
