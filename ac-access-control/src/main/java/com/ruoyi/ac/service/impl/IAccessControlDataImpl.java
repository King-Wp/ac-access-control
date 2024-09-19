package com.ruoyi.ac.service.impl;

import com.ruoyi.ac.domain.DoorStaffRecordCount;
import com.ruoyi.ac.mapper.DoorStaffRecordCountMapper;
import com.ruoyi.ac.service.IAccessControlDataImplService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @name: AccessControlDataImpl
 * @user: luGuanYu
 * @date: 2024/9/19 11:54
 * @functionalExpression:
 */

@Service
public class IAccessControlDataImpl implements IAccessControlDataImplService {

    private final DoorStaffRecordCountMapper doorStaffRecordCountMapper;

    public IAccessControlDataImpl(DoorStaffRecordCountMapper doorStaffRecordCountMapper) {
        this.doorStaffRecordCountMapper = doorStaffRecordCountMapper;
    }

    @Override
    public int batchInsert(List<DoorStaffRecordCount> doorStaffRecordCounts) {
        return doorStaffRecordCountMapper.batchInsert(doorStaffRecordCounts);
    }
}
