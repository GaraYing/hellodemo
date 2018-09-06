package com.gara.hellodemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 消息实体
 * @author: GaraYing
 * @create: 2018-09-06 14:12
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    String body;
}
