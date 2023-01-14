package com.masai.app.Dao;

import com.masai.app.entity.FeeRecord;

import java.util.List;

public interface FeeDao {

    void create(FeeRecord feeRecord);
    FeeRecord read(int studentId);
    void update(FeeRecord feeRecord);
    List<FeeRecord> getByClass(String className);
    int getTotalFeesPaidThisMonth(int currentMonth, int currentYear);
}
