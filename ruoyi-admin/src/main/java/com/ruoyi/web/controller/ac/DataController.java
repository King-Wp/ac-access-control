package com.ruoyi.web.controller.ac;

import com.ruoyi.ac.domain.DoorStaffRecordCount;
import com.ruoyi.ac.service.IAccessControlDataImplService;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.core.domain.AjaxResult;
import org.apache.commons.collections4.CollectionUtils;
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
    public AjaxResult batchInsert(@RequestBody List<DoorStaffRecordCount> doorStaffRecordCounts){
        if (CollectionUtils.isNotEmpty(doorStaffRecordCounts)){
            int i = iAccessControlDataImplService.batchInsert(doorStaffRecordCounts);
            if(i>0){
                return AjaxResult.success();
            }
        }
        return AjaxResult.error(HttpStatus.NOT_MODIFIED,"写入数据异常");
    }

}
