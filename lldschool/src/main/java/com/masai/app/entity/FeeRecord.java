package com.masai.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FeeRecord {

    private int studentId;
    private float feeAmount;
    private Date dueDate;
    private float paidAmount;

}
