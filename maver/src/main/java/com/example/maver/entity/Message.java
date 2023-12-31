package com.example.maver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
//来自于
    String fromUser;
//    给谁
    String toUser;
//    消息内容
    String message;



}
