package com.ruoyi.web.controller.ac;

import com.ruoyi.ac.domain.DoorStaffRecordCount;
import com.ruoyi.ac.service.IAccessControlDataImplService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @name: DataController
 * @user: luGuanYu
 * @date: 2024/9/19 15:20
 * @functionalExpression:
 */

@RestController
@RequestMapping("/access")
public class DataController {

    private final IAccessControlDataImplService iAccessControlDataImplService;

    public DataController(IAccessControlDataImplService iAccessControlDataImplService) {
        this.iAccessControlDataImplService = iAccessControlDataImplService;
    }

    @PostMapping("/batchInsert")
    public int batchInsert(@RequestBody List<DoorStaffRecordCount> doorStaffRecordCounts){
        return iAccessControlDataImplService.batchInsert(doorStaffRecordCounts);
    }

}
