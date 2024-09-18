package com.gate.system.domain;

import lombok.Data;

@Data
public class DoorStaffRecordCount {

  // 主键
  private int id;

  // 姓名
  private String name;

  // 真实名字
  private String realname;

  // 楼层
  private String floorNum;

  // 设备ID
  private String deviceId;

  // 设备名称
  private String deviceName;

  // 项目名称
  private String projectName;

  // 建筑名称
  private String buildName;

  // 项目类型
  private String projectType;

  // 出-id
  private String outId;

  // 用户ID/自定义ID
  private String userId;

  // 项目ID
  private String projectId;

  // 开门类型
  private String opendoorType;

  // IC卡号
  private String icId;

  // 内容
  private String content;

  // 人脸注册图片
  private String facePicture;

  // 角色ID
  private String roleId;

  // 类型：0-入场，1-出场
  private String gateType;

  // 访问时间
  private String visitTime;

  // 是否已处理
  private int isDeal;

  // 处理数量
  private String dealNum;

  // 处理结果
  private String dealResult;

  // 是否被忽略
  private String isIgnore;

  // 是否删除
  private int isDel;

  // 用户姓名
  private String userName;

  // 开始日期
  private String startDate;

  // 结束日期
  private String endDate;

  // 楼层名字
  private String floorName;

  // 房间名字
  private String roomName;

  // 建筑ID
  private String buildId;

  // 楼层ID
  private String floorId;

  // 房间ID
  private String roomId;

  // 手机号码
  private String mobile;

  // 体温
  private String bodyTemperature;

  // 体温是否正常
  private int isNormal;

  // 是否失败
  private int isFail;

  // 数据分支
  private String branchId;

  // 性别
  private int gender;

  // 民族，1-汉族等
  private int nation;

  // 身份证卡号
  private String idCard;

  // 韦根卡号生成方式，0-公用卡号，1-自动生成，2-手动输入，3-不使用门禁卡号
  private int mjCardFrom;

  // ID卡卡号(二维码刷卡卡号)
  private String rfidCard;

  // 相似度
  private float similarity;

  // 注册图片的base64编码
  private String regPicInfo;

  // 抓拍图片的base64编码
  private String snapPicInfo;

  // 如果是调用远程开门的开门控制记录，返回此标识
  private int remoteOpenDoor;

  // 出生日期
  private String birthday;

  // 用户自定义ID
  private int customizeId;

  // 用户数据库ID
  private String databaseId;

}
