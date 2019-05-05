package com.yxp423.ssmempl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: yxp
 * @CreateDate: 2019-05-04 12:10
 * @Version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Travel {

    public Integer applyId;
    public String userId;
    public Date startTime;
    public Date endTime;
    public String duration;
    public String place;
    public String desc;
    public String status;
    public String reviewerId;

}
