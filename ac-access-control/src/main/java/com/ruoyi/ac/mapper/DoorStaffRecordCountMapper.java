package com.ruoyi.ac.mapper;

import com.ruoyi.ac.domain.DoorStaffRecordCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoorStaffRecordCountMapper {

    int batchInsert(List<DoorStaffRecordCount> doorStaffRecordCounts);

}
