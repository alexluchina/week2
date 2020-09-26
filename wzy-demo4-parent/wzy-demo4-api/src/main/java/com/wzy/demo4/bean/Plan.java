package com.wzy.demo4.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 计划表
 * </p>
 *
 * @author alex
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_plan")
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 计划名称
     */
    @TableField("plan_name")
    private String planName;

    /**
     * 计划总金额
     */
    @TableField("amount")
    private BigDecimal amount;

    /**
     * 负责人
     */
    @TableField("manager")
    private String manager;

    /**
     * 计划说明
     */
    @TableField("description")
    private String description;

    /**
     * 部门Id
     */
    @TableField("dept_id")
    private Integer deptId;


}
