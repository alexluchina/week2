package com.wzy.demo4.entity;

import com.wzy.demo4.bean.Plan;
import lombok.*;

/**
 * Created by mi on 2020/9/24
 * @author mi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PlanVO extends Plan {
    //部门名称
    private String deptName;
}
