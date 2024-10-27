package cn.edu.xmu.javaee.productdemoaop.mapper.link.po;

import cn.edu.xmu.javaee.productdemoaop.mapper.generator.po.OnSalePo;

import java.time.LocalDateTime;

public class ProductAllPo_link {
    private Long id;
    private String skuSn;
    private String name;
    private Long originalPrice;
    private Long weight;
    private String barcode;
    private String unit;
    private String originPlace;
    private Integer commissionRatio;
    private Long freeThreshold;
    private Integer status;
    private Long creatorId;
    private String creatorName;
    private Long modifierId;
    private String modifierName;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private OnSalePo onSale; // 添加关联的OnSale对象

    // Getters 和 Setters
}
