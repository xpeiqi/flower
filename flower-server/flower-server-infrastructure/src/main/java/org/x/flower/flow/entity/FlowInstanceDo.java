package org.x.flower.flow.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class FlowInstanceDo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private LocalDateTime scheduleTriggerTime;

    private LocalDateTime actualTriggerTime;

    private LocalDateTime finishedTime;

    private Long instanceId;

    private Long flowId;

    private Integer state;

    private Integer runningTimes;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}