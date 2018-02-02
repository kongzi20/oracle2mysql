DROP TABLE wf_his_extend;###
CREATE TABLE wf_his_extend (
id DECIMAL(9) NOT NULL ,
wf_id DECIMAL(9) NULL ,
json_data CLOB NULL ,
xml_data CLOB NULL ,
create_date DATETIME NULL 
)




;###
COMMENT ON TABLE wf_his_extend IS '流程扩展历史表';
COMMENT ON COLUMN wf_his_extend.id IS '主键ID';
COMMENT ON COLUMN wf_his_extend.wf_id IS 'Wf_define表主键';
COMMENT ON COLUMN wf_his_extend.json_data IS '定义中相关的json数据';
COMMENT ON COLUMN wf_his_extend.xml_data IS 'Xml数据';
COMMENT ON COLUMN wf_his_extend.create_date IS '创建时间';