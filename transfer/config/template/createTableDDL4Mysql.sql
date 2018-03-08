DROP TABLE CHANGE_REQUEST;###
create table CHANGE_REQUEST
(
  cr_code          NUMBER(9) not null,
  type_code        VARCHAR2(10) not null,
  source_value     VARCHAR2(1000),
  dest_value       VARCHAR2(1000),
  cr_xml           SYS.XMLTYPE,
  status           VARCHAR2(2),
  create_date      DATE,
  submit_date      DATE,
  submit_psn_code  NUMBER(9),
  affect_date      DATE,
  reason           VARCHAR2(1000),
  older_status     VARCHAR2(2),
  submit_role_code NUMBER(9),
  extend_flag      VARCHAR2(10),
  submit_org_code  NUMBER(9),
  raise_date       DATE
);###
comment on table CHANGE_REQUEST
  is '变更表 保存变更详情 包含单位变更 项目变更';
comment on column CHANGE_REQUEST.cr_code
  is '主键 seq_cr';
comment on column CHANGE_REQUEST.type_code
  is '变更类型  参照cr_setting';
comment on column CHANGE_REQUEST.source_value
  is '更改前内容';
comment on column CHANGE_REQUEST.dest_value
  is '更改后内容';
comment on column CHANGE_REQUEST.cr_xml
  is '更改内容 const_dictionary category=''cr_status''; select * from const_dictionary cd where cd.category=''cr_status'' ';
comment on column CHANGE_REQUEST.status
  is '变更状态';
comment on column CHANGE_REQUEST.create_date
  is '提出日期';
comment on column CHANGE_REQUEST.submit_date
  is '变更请求提交时间';
comment on column CHANGE_REQUEST.submit_psn_code
  is '变更提交人';
comment on column CHANGE_REQUEST.affect_date
  is '生效日期';
comment on column CHANGE_REQUEST.reason
  is '变更原因';
comment on column CHANGE_REQUEST.older_status
  is '原状态';
comment on column CHANGE_REQUEST.submit_role_code
  is '变更提出人角色';
comment on column CHANGE_REQUEST.extend_flag
  is '扩展信息 辅助控制流程 如项目变更中的是否变更为本单位负责人 变更单位时是否同时变更项目负责人';
comment on column CHANGE_REQUEST.submit_org_code
  is '变更提交人现时所在单位';
comment on column CHANGE_REQUEST.raise_date
  is '首次申请时间';
