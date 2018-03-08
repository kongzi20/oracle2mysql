package com.iris.egrant.oracle2mysql;

import java.util.Arrays;
import java.util.List;

public class TableName {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		 String mysqlTableStr = "ACT_GE_BYTEARRAY,ACT_GE_PROPERTY,ACT_HI_ACTINST,ACT_HI_ATTACHMENT,ACT_HI_COMMENT,ACT_HI_DETAIL,ACT_HI_PROCINST,ACT_HI_TASKINST,ACT_ID_GROUP,ACT_ID_INFO,ACT_ID_MEMBERSHIP,ACT_ID_USER,ACT_RE_DEPLOYMENT,ACT_RE_PROCDEF,ACT_RU_EVENT_SUBSCR,ACT_RU_EXECUTION,ACT_RU_IDENTITYLINK,ACT_RU_JOB,ACT_RU_TASK,ACT_RU_VARIABLE,AJAXTREE_CATEGORY,AJAXTREE_DATA,APPLICANT_SUBJECT,APPLICATION_SETTING,APPPRJ_CHECK_RESULTS,APPPRJ_CHECK_RULES,APP_EXCEPTION,APP_ORG_EXCEPTION,APP_PRJ,APP_PRJ_ITEMS,APP_PRJ_PRINT_NO,ARCHIVE_FILES,ATTACH_LOG,ATTACH_SUB,ATTACH_TEMPLATE,AUDIT_ACTION_TYPE,AUDIT_COMMENT,AUDIT_COMMENT_EXTEND,AUDIT_LOG,AVOIDANCE_RULE,BANGDAN_123_2013,BANGDAN_530_2013,BANGDAN_ALL,BANGDAN_FUWUWAIBAO_2013,BANGDAN_GAOCHENGZHANG100_2013,BANGDAN_GAOXIN_2013,BANGDAN_GUOYOU_2013,BANGDAN_JISHUXIANJIN_2013,BANGDAN_NASHUI100_2013,BANGDAN_ZHONGDIANGUGAN100_2013,BANGDAN_ZONGBU_2013,BANK_LOANS,BLACKLIST,BLACK_LIST,BONUS_INFO,BUDGET_DEDUCE_DETAIL,BUDGET_DEDUCE_DETAIL_LOG,BUDGET_DEDUCE_FUND,BUDGET_DEDUCE_FUND_LOG,BUDGET_DEDUCE_MAIN,BUDGET_DEDUCE_MAIN_LOG,BUDGET_EVALUATION,BUDGET_EVALUATION_LOG,BUDGET_FUND_FUNCTION,BUDGET_FUND_FUNC_LOG,BU_SCHEDULE,CACHE_MANAGE,CAPTURE_SET,CB_DATA,CHARGE_RESULT,CHECK_COMMENT,COLLECT_REPORT,COMMON_AUDIT_OPTION,COMPARE_CONTENT_SETTING,COMPARE_LIST,COMPARE_LIST_SNAPSHOT_JL,COMPARE_QUEUE,COMPARE_QUEUE_BAK,COMPARE_RESULT,COMPARE_RESULT_HIS,COMPARE_SOURCE,COMPARE_TEMPLATE_SETTING,COMPARE_TEMP_TBL,COM_AUDIT_TRAIL,COM_STATISTICS,CONST_AREA,CONST_CATEGORY,CONST_DICTIONARY,CONST_DISCIPLINE,CONST_DISCIPLINE_TEMP,CONST_LABORATORY,CONST_NATURE_TYPE,CONST_PDF_DATA,CONST_REGION,CONST_REMOTING_DB,CONST_RESEARCH_AREA_TEMP,CONST_RESEARCH_KEYWORD_TEMP,CONST_SORT_NAME,CONST_STATUS,CONST_STAT_YEAR,CONST_SUBJECT,CONST_TEMPLATE,CONST_TEMPLATE_ITEMS,CONTRACT_AUDIT_COMMENT,CONTRACT_REPORT_DATA,COOPERATIVE_TARGETCONFIG,CPT_COMPONENT_CONFIG,CPT_HELP_TIPS,CPT_PIE_CHART,CPT_PSN_HELPTIPS,CPT_TREE_DATA,CRITERIA_SET,CRITERIA_SET1,CR_PRJ,CR_PRJ_DETAILS_ITEM,CR_PRJ_GRANT,CR_SETTING,CTR_EDIT_LOG,DBJG_LOAN_INFO,DISCODE_KEYWORD,DISCODE_RESEARCH,DISNO_UNITNO_RULES,DIV_SETTING,DIV_SETTING_BAK,DS_2013,EGRANT_PROPOSAL_PROF,EVACTIVITY,EVALUATION,EVALUATION_EXTEND,EVALUATION_RESET,EVALUATION_RESULT,EVATVCONTAINER_INITLOG,EVATV_CONTAINER,EVATV_GROUP,EVATV_ORG,EVATV_REPLACE,EVATV_TYPE,EVA_APP_PRJ,EVA_APP_PRJ_ITEMS,EVA_PRP_ORG,EVA_REVIEW_LOG,EVA_REVIEW_LOG_2012,EVA_REVIEW_LOG_2015,EVCONST_SETTING,EVEXP_GROUP_PSN,EVEXP_GROUP_TITLE,EVEXP_REVIEW_STAT,EVFORM,EVFORM_ITEMS,EVFORM_ITEM_OPTIONS,EVNOTIFY_MAIL_TEMPLATE,EVPRJ_DETAIL,EVPRJ_FILES,EVPRJ_MEMBER,EVPRJ_OUTCOME,EVPRJ_STATISTIC,EVREVIEWER,EVREVIEWER_REVIEW_OFFICE,EVREVIEWER_UNOFFICIAL,EVSUB_TEMPLATE,EVSYN_COMMENT,EXCEL_REPORT,EXCEPT_INS,EXCEPT_PRJ,EXIT_RESULT,EXP_LABEL,EXP_STATUS,EXTRACT_TO_COMPARE_SETTING,FACT_GDSSY,FACT_GDSSY_BAK,FIN_RPT_DETAIL,FIN_RPT_SCHEDULE,FORM_BASE_LIBRARY,FORM_GRANT_NATURE,FORM_INIT_ITEM,FORM_INIT_TAB,FORM_NODE_MODE_SETTING,FUNDING_SCHEME,FUND_INCOME,FUND_ITEM,FUND_LOG,FUND_LOG_BAK,FUND_MAKEUP,FUND_PROJECT,FUND_RATE_ITEMS,FUND_SETTING,FUND_SETTING20141202,FUND_SETTING_BAK,GENPDFLOG,GENPDF_LOG,GQ_COLUMN_DESCRIPTION,GQ_DATA,GQ_DATACOLUMN_MAPPING,GQ_MENU,GQ_MENU_MAPPING,GQ_PANEL,GQ_REPORT_COLUMNS,GQ_REPORT_TEMPLATE,GRANT_AGREEMENT,GRANT_AMT_RATE,GRANT_AMT_RATE2,GRANT_APPROVE_PERSON,GRANT_ATTACH,GRANT_AWARD_LEVEL,GRANT_COMPARE_NODE,GRANT_LIMIT,GRANT_NOTES,GRANT_NOTES_BAK,GRANT_PERSON_ADMIN,GRANT_RULE_SETTING,GRANT_SCHEDULE,GRANT_SETTING,GRANT_SETTING2,GRANT_SETTING_ANNUAL,GRANT_SETTING_ANNUAL20141202,GRANT_SETTING_ANNUAL_1230,GRANT_SETTING_ANNUAL_BAK,GRANT_SETTING_BAK,GRANT_SETTING_COPY,GRANT_SETTING_EXTEND,GRANT_SETTING_EXTEND_BAK,GRANT_SL,GRANT_SUBJECT,GRANT_TEMPLATE,GRANT_TOPIC,GRANT_TOPIC_GROUP,HN_HELP_MANAGMENT,INDEX_PAGE_NOTICE,INIT_ACL_SQL_CONFIG,INVEST_INFO,INVEST_INFO_WX6992,INVEST_PLAN,JBPM4_DEPLOYMENT,JBPM4_DEPLOYPROP,JBPM4_EXECUTION,JBPM4_HIST_ACTINST,JBPM4_HIST_DETAIL,JBPM4_HIST_PROCINST,JBPM4_HIST_TASK,JBPM4_HIST_VAR,JBPM4_ID_GROUP,JBPM4_ID_MEMBERSHIP,JBPM4_ID_USER,JBPM4_JOB,JBPM4_LOB,JBPM4_PARTICIPATION,JBPM4_PROPERTY,JBPM4_SWIMLANE,JBPM4_TASK,JBPM4_VARIABLE,KEY_EVENT_INFO,KEY_EVENT_ITEM,LABEL_DETAIL,LOAN_INFO,LOAN_INFO_BAK,LOAN_RENEW_INFO,LOAN_TYPE_INFO,LOCKS,MAIL_CUSTOM_TEMPLATE,MAIL_LOG,MAIL_LOG_ATTACHMENT,MAIL_SEND_QUEUE,MAIL_SERVER_LIST,MAIL_TEMPLATE,MAIL_TEMPLATE_ATTACHMENT,MODIFY_BANK_LOG,MV_GENZONG_TOTAL,MV_GENZONG_TOTAL_WEI,MV_GENZONG_TOTAL_YI,MV_GENZONG_TOTAL_YING,MV_HETONG_TOTAL,MV_HETONG_TOTAL_WEI,MV_HETONG_TOTAL_YI,MV_HETONG_TOTAL_YING,MV_ORG_BASIC_MONTH,MV_YANSHOU_TOTAL,MV_YANSHOU_TOTAL_WEI,MV_YANSHOU_TOTAL_YI,MV_YANSHOU_TOTAL_YING,NAME_CHANGE_LOG,NODE_NAME_LOGIN_NUMBER,NODE_NAME_LOGIN_NUMBER_BAK,NUMBER_CHECK_DATA,NUMBER_CHECK_SETTING,OFFICE_MATTER_RULE,OFFICE_WORKDAY_SET,OFF_TYPE_ADMIN,ORGANIZATION,ORGANIZATION_BASIC_DATA,ORGANIZATION_BASIC_DATA44,ORGANIZATION_MAP,ORGANIZATION_SHAREHOLDER,ORGANIZATION_SPILT,ORGANIZATION_YEAR_DATA,ORGANIZATION_YEAR_DATA44,ORG_ADDRESS,ORG_ADDRESS2,ORG_DEPARTMENT,ORG_GRANT_PSN,ORG_OFFICE,ORG_OFFICE_ROLE,ORG_OFFICE_UNITNO,ORG_OFFICE_UNITNO2,ORG_OFFICE_UNITNO_BAK,ORG_PARTMENT,ORG_PROPERTY,ORG_RANK,ORG_RECOMMEND,PARAM_TEMPLATE,PAY_NOTICE_PLAN,PDF_ATTACHMENT,PDF_MONITOR_INFO,PDF_RESET_LOGS,PDF_TEMPLATE,PDIRECTION,PDIRECTION_EXTEND,PDISCIPLINE,PDISCIPLINE_EXTEND,PERFORMANCE_BATCH,PERFORMANCE_CATEGORY,PERFORMANCE_DATA,PERFORMANCE_EVENT_PLAN,PERFORMANCE_EXTRACT_SETTING,PERFORMANCE_ITEM_TYPE,PERFORMANCE_MACRO_ECONOMY_DATA,PERFORMANCE_MAIN,PERSON,PERSON_DEPT,PERSON_DEPT_ADMIN,PERSON_DIV,PERSON_DIV_BAK,PERSON_OFFICE,PERSON_ORG,PERSON_ORG_ADMIN,PERSON_ORG_REGISTER,PERSON_SUB,PERSON_WORKDAY_SET,PER_PATENTS,PER_PATENTS_APP,PER_PATENTS_FOR,PER_PERIODICALS,PER_REWARDS,PER_SOFTWARES,PER_STANDARDS,PER_TALENTS,PER_TECHNOLOGYS,PFM_BATCH_GROUP,PFM_EVALUTION_ITEMS,PFM_FORM_ITMES,PFM_FORM_ITMES_T,PFM_PRJ_GROUP,PFM_REVIEWER,PJ_MEMBER,PJ_ORG,POLICY_CLAUSE,POLICY_GRANT_SETTING,PRESEARCH,PRESEARCH_EXTEND,PRJNOTIFY_MAIL_TEMPLATE,PRJNOTIFY_SMS_TEMPLATE,PRJPAYNOTIFY_MAIL_TEMPLATE,PRJ_BUDGET,PRJ_PAY_BATCH,PRJ_PAY_BATCH_QU,PRJ_PAY_NOTICE_ATTACHMENT,PRJ_PAY_PLAN,PRJ_PAY_PLAN_BAK_1125,PRJ_PAY_PLAN_BAK_1125_2,PRJ_PAY_PLAN_EXTEND,PRJ_PAY_PLAN_SOURCE,PRJ_UPLOAD_FILE,PROCESS_VIEW_CONFIG,PRODUCT_INFO,PROJECT_EXTEND,PROJECT_TMP,PROPOSAL,PROPOSALEXPS,PROPOSAL_AUDIT_COMMENT,PROPOSAL_AWARD_OBJECTION,PROPOSAL_AWARD_REVIEW,PROPOSAL_BU_EXTEND,PROPOSAL_CACHED,PROPOSAL_EQUIPMENT,PROPOSAL_ORGANIZATIONS,PROPOSAL_PERFORMANCE_WC,PROPOSAL_PERFORMANCE_YQ,PROPOSAL_PERSONS,PROPOSAL_RULE,PROPOSAL_RULE_0303,PROPOSAL_RULE_BAK,PROPOSAL_RULE_BAK2,PROPOSAL_RULE_EXCEPTION,PROPOSAL_RULE_PARAM,PROPOSAL_RULE_PARAM_0303,PROPOSAL_RULE_PARAM_BAK,PROPOSAL_RULE_PARAM_BAK2,PROPOSAL_RULE_PARAM_T,PROPOSAL_RULE_T,PROPOSAL_SL_REPORT,PROPOSAL_SPLIT,PRP_ATTACH,PRP_CHECK_SNAPSHOT,PRP_COMPARE_RESULT,PRP_COMPARE_RESULT_BAK,PRP_COMPARE_RESULT_SNAPSHOT_JL,PRP_EV_COMMENTS,PRP_EXCEPTION_LOG,PRP_GUID,PRP_ORGANIZATION,PRP_ORG_SPILT,PRP_PERSON,PRP_PROJECTS,PRP_RULES,PRP_RULE_CHECK_RESULT,PRP_TOUNIT_RULES,PSN_AUDIT,PSN_BU_SCHEDULE,PSN_GUID,PSN_ROLE_RANGLE,PSN_SHORTCUT,PSN_SHORTCUT_INIT,PSN_SHORTCUT_TOTAL,PSN_TOTAL_PROPOSAL,PUBLISH_REVIEW_RESULT_COMMENT,QRTZ_BLOB_TRIGGERS,QRTZ_CALENDARS,QRTZ_CRON_TRIGGERS,QRTZ_FIRED_TRIGGERS,QRTZ_JOB_DETAILS,QRTZ_LOCKS,QRTZ_PAUSED_TRIGGER_GRPS,QRTZ_SCHEDULER_STATE,QRTZ_SIMPLE_TRIGGERS,QRTZ_SIMPROP_TRIGGERS,QRTZ_TASK_DETAIL_LOG,QRTZ_TASK_LOG,QRTZ_TRIGGERS,QRTZ_TRIGGERS_EXTEND,QUARTZ_CRON_EXPRESSION,QUEUE_TASK_EVENT,QUEUE_TASK_LOG,RANGLE_DISC,RANGLE_DIVCODE,RANGLE_GRANT_TYPE,RANGLE_INCLUDE_PRJ,RATE_INFO,RATE_INFO_BAK,RCSX_CONSTANT_DEPLOY,RCSX_STUD_INFO_BASE,RCSX_STUD_INFO_SCHOOL,RCSX_TEMPORARY,RECORD_CHANGE_INFO,RECORD_GRANT,RECORD_GRANT_BAK,RECORD_INFO,RECORD_ORG_INFO,REGISTEREDSERVICEIMPL,REPAY_PLAN,REPAY_RESULT,REPORT_COMMENT,REPORT_DELIVERABLE_EXTEND,REPORT_ORGINFO_VIEW,REPORT_PROGRESS_LIST,REPORT_PROGRESS_TABLE,REPORT_RULE,REPORT_RULE_ITEMS,REPORT_SCHEDULE,REPORT_WARNING,RESEARCH_AREA,RESEARCH_KEYWORD,REVIEW_UPLOAD_FILE,RISK_FUND_CONFIG,RISK_INFO,RISK_PUBLISH_INFO,ROLE_DIRECT,RP_ORGANIZATION_BASIC_DATA,RP_ORG_YEAR_STATISC,RS_ATTRIBUTES,RULE_OPER,RULE_PARAM_TEMPLATE,RULE_TEMPLATE,SECURITY_CONFIG,SECURITY_LOG,SERVICETICKET,SLJK_CASE_BASE,SMS_CUSTOM_TEMPLATE,SMS_LOG,SMS_RECEIVE,SMS_TEMPLATE,SPECIAL_FUND,SPECIAL_FUND_BAK,SPECIAL_REPORT_FILE,SPECIAL_REPORT_FILE_LOG,STAT_CHARTS,STAT_CHARTS_DATA,STAT_CHARTS_DATA_C171124,STAT_CONFIGURATION,STAT_CONST,STAT_CSKDATA_HISTORY,STAT_CSK_ORG,STAT_DETAIL,STAT_DETAIL_2013,STAT_DETAIL_2014,STAT_DS_2010,STAT_DS_2011,STAT_DS_2012,STAT_DS_2013,STAT_DS_2013_BAK,STAT_MAIN,STAT_MAIN_2013,STAT_MAIN_2014,STAT_ORGANIZATION99,STAT_ORGANIZATION_ALL_DATA,STAT_ORGANIZATION_BASIC_DATA,STAT_ORGANIZATION_BASIC_DATA2,STAT_ORGANIZATION_BASIC_DATA99,STAT_ORGANIZATION_BASIC_DATA_9,STAT_ORGANIZATION_BASIC_DATA_B,STAT_ORGANIZATION_BASIC_DATA_M,STAT_ORGANIZATION_BASIC_DATA_T,STAT_ORGANIZATION_LIST,STAT_ORGANIZATION_LIST98,STAT_ORGANIZATION_LIST_9,STAT_ORGANIZATION_LIST_BAK1211,STAT_ORGANIZATION_LIST_T,STAT_ORGANIZATION_MONTH_DATA,STAT_ORGANIZATION_MONTH_DATA_M,STAT_ORGANIZATION_Q11_DATA,STAT_ORGANIZATION_Q12_DATA,STAT_ORGANIZATION_Q13_DATA,STAT_ORGANIZATION_Q14_DATA,STAT_ORGANIZATION_YEAR_DATA,STAT_ORGANIZATION_YEAR_DATA2,STAT_ORGANIZATION_YEAR_DATA_B,STAT_ORGANIZATION_YEAR_DATA_M,STAT_ORG_BASIC_DATA_MS,STAT_ORG_ECONOMIC_ITEM,STAT_ORG_MONTH_DATA_MS,STAT_ORG_PROPERTY,STAT_ORG_PROPERTY3,STAT_ORG_PROPERTY_9,STAT_ORG_PROPERTY_B,STAT_ORG_PROPERTY_CONST,STAT_ORG_PROPERTY_CONST_9,STAT_ORG_YEAR_DATA_MS,STAT_P_TEMP,STAT_REPORTPROGRESS,STAT_SQL_CONFIG,STAT_TJJ_DATA_T,SUPPLEMENT_COMMENT,SYNDATALOG,SYNDATA_PROCESS,SYNDATA_TASK,SYNDATA_TASK_HISTORY,SYS_AUTHORITIE,SYS_EXPORT_SCHEMA_01,SYS_EXPORT_SCHEMA_02,SYS_EXPORT_SCHEMA_03,SYS_EXPORT_SCHEMA_04,SYS_EXPORT_SCHEMA_05,SYS_EXPORT_SCHEMA_06,SYS_EXPORT_SCHEMA_07,SYS_EXPORT_SCHEMA_08,SYS_EXPORT_SCHEMA_09,SYS_EXPORT_SCHEMA_10,SYS_EXPORT_SCHEMA_12,SYS_EXPORT_SCHEMA_14,SYS_EXPORT_SCHEMA_15,SYS_EXPORT_SCHEMA_16,SYS_EXPORT_SCHEMA_17,SYS_FAQ,SYS_LOG,SYS_OFF_ROLE_ADMIN,SYS_PAGE_NOTES,SYS_PAGE_TIPS,SYS_PATCH,SYS_PATCH_NET,SYS_PERSON_GRANT,SYS_RESOURCE,SYS_RESOURCE_AUTHORITIE,SYS_RESOURCE_URL,SYS_ROLE,SYS_ROLE_ADMIN,SYS_ROLE_AUTHORITIE,SYS_ROLE_PSN_AUTHORITIE,SYS_SHORTCUT_MENU,SYS_USER,SYS_USER_ROLE,TABLE_CONFIG,TASK_BALANCE,TASK_CONTROL,TASK_LOG,TASK_LOG_XC,TB_NODE_LIST,TB_USER,TEMPLATE_ITEMS,TEMP_HISTORY_PROJECT100,TEMP_HISTORY_PROJECT11,TEMP_HISTORY_PROJECT12,TEMP_HISTORY_PROJECT2,TEMP_HISTORY_PROJECT21,TEMP_HISTORY_PROJECT22,TEMP_HISTORY_PROJECT23,TEMP_HISTORY_PROJECT24,TEMP_HISTORY_PROJECT25,TEMP_HISTORY_PROJECT26,TEMP_HISTORY_PROJECT26_XDJ,TEMP_HISTORY_PROJECT27_KJ,TEMP_HISTORY_PROJECT27_SWJ,TEMP_HISTORY_PROJECT29_530,TEMP_HISTORY_PROJECT29_KJ,TEMP_HISTORY_PROJECT2_GJ,TEMP_HISTORY_PROJECT2_SHENG,TEMP_HISTORY_PROJECT2_WENTI,TEMP_HISTORY_PROJECT3,TEMP_HISTORY_PROJECT30_KJ,TEMP_HISTORY_PROJECT31_GJ,TEMP_HISTORY_PROJECT32,TEMP_HISTORY_PROJECT33,TEMP_HISTORY_PROJECT34,TEMP_HISTORY_PROJECT34_JXWGJ,TEMP_HISTORY_PROJECT35,TEMP_HISTORY_PROJECT36,TEMP_HISTORY_PROJECT36_SHENG,TEMP_HISTORY_PROJECT37,TEMP_HISTORY_PROJECT37_RENCAI,TEMP_HISTORY_PROJECT38_FWY2009,TEMP_HISTORY_PROJECT4,TEMP_HISTORY_PROJECT40,TEMP_HISTORY_PROJECT41,TEMP_HISTORY_PROJECT42,TEMP_HISTORY_PROJECT43,TEMP_HISTORY_PROJECT44,TEMP_HISTORY_PROJECT45,TEMP_HISTORY_PROJECT46,TEMP_HISTORY_PROJECT47,TEMP_HISTORY_PROJECT48,TEMP_HISTORY_PROJECT49,TEMP_HISTORY_PROJECT50,TEMP_HISTORY_PROJECT51,TEMP_HISTORY_PROJECT52,TEMP_HISTORY_PROJECT55,TEMP_HISTORY_PROJECT56,TEMP_HISTORY_PROJECT57,TEMP_HISTORY_PROJECT58,TEMP_HISTORY_PROJECT59,TEMP_HISTORY_PROJECT60,TEMP_HISTORY_PROJECT8,TEMP_HISTORY_PROJECT88,TEMP_HISTORY_PROJECT99,TEMP_HISTORY_PROJECT_XD,TEMP_INVEST_PRJ,TEMP_LOAN_INFO,TICKETGRANTINGTICKET,TMP_BANGDANG,TRAINING_UNIT,TRAINING_UNIT_PERSONS,TRANSFER_FILE,TRANSFER_PAYMENT,TRANSFER_PAYMENT_GRANT,TRUSTED_SECURITY_CONFIG,UNIT_MAIL_TEMPLATE,UNREPAY_ITEMS,UNREPAY_ITEMS_BAK,USER_OPINIONS,USER_ROLE_AUTHORITY,USER_ROLE_RESOURCE,WAITINITPERMISSIONS,WAITSPLITPROPOSAL,WF_ACTION,WF_BUSINESS_SETTING,WF_DEFINE,WF_EXPORT_CONFIG,WF_EXTEND,WF_HIS_EXTEND,WF_HIS_TASK,WF_LINES,WF_NODES,WF_NODE_ACTION,WF_PARAM_TEMPLATE,WF_RULE,WF_RULE_PARAM,WF_RULE_TEMPLATE,WF_RULE_TEMPLATE_PARAM,WF_TASK,WF_TASK_ACTOR,WF_TASK_ACTOR_TEMPLATE,WL_LLR_APPSERVER_1,WL_LLR_APPSERVER_2,WL_LLR_APPSERVER_PDF1,WL_LLR_APPSERVER_TASK,WL_LLR_JYFMS_JSP,WL_LLR_JYFMS_TEST1,WL_LLR_NSKJJR_TEST,WL_LLR_SFMS_TEST,WL_LLR_SFMS_TEST_DEV,WL_LLR_SFMS_TEST_TASK,WL_LLR_WXFMS_JSP,WL_LLR_WXFMS_TEST,WORKFLOW_NODE,WORKFLOW_RULE,WORKFLOW_TASK,XINXING_ALL,XINXING_JIENENGHUANBAO,XINXING_NENGYUAN,XINXING_RUANJIANFUWUWAIBAO,XINXING_SEHNGWUCHANYE,XINXING_WEIDIANZI,XINXING_WULIANWANG,XINXING_XINCAILIAO,XML_COMPARE,XML_SPLIT,XML_UPDATE,ZHUYW";
		 String orcleTableStr = "ACT_GE_BYTEARRAY,ACT_GE_PROPERTY,ACT_HI_ACTINST,ACT_HI_ATTACHMENT,ACT_HI_COMMENT,ACT_HI_DETAIL,ACT_HI_PROCINST,ACT_HI_TASKINST,ACT_ID_GROUP,ACT_ID_INFO,ACT_ID_MEMBERSHIP,ACT_ID_USER,ACT_RE_DEPLOYMENT,ACT_RE_PROCDEF,ACT_RU_EVENT_SUBSCR,ACT_RU_EXECUTION,ACT_RU_IDENTITYLINK,ACT_RU_JOB,ACT_RU_TASK,ACT_RU_VARIABLE,AJAXTREE_CATEGORY,AJAXTREE_DATA,APPLICANT_SUBJECT,APPLICATION_SETTING,APPPRJ_CHECK_RESULTS,APPPRJ_CHECK_RULES,APP_EXCEPTION,APP_ORG_EXCEPTION,APP_PRJ,APP_PRJ_ITEMS,APP_PRJ_PRINT_NO,ARCHIVE_FILES,ATTACH_LOG,ATTACH_SUB,ATTACH_TEMPLATE,AUDIT_ACTION_TYPE,AUDIT_COMMENT,AUDIT_COMMENT_EXTEND,AUDIT_LOG,AVOIDANCE_RULE,BANGDAN_123_2013,BANGDAN_530_2013,BANGDAN_ALL,BANGDAN_FUWUWAIBAO_2013,BANGDAN_GAOCHENGZHANG100_2013,BANGDAN_GAOXIN_2013,BANGDAN_GUOYOU_2013,BANGDAN_JISHUXIANJIN_2013,BANGDAN_NASHUI100_2013,BANGDAN_ZHONGDIANGUGAN100_2013,BANGDAN_ZONGBU_2013,BANK_LOANS,BLACKLIST,BLACK_LIST,BONUS_INFO,BUDGET_DEDUCE_DETAIL,BUDGET_DEDUCE_DETAIL_LOG,BUDGET_DEDUCE_FUND,BUDGET_DEDUCE_FUND_LOG,BUDGET_DEDUCE_MAIN,BUDGET_DEDUCE_MAIN_LOG,BUDGET_EVALUATION,BUDGET_EVALUATION_LOG,BUDGET_FUND_FUNCTION,BUDGET_FUND_FUNC_LOG,BU_SCHEDULE,CACHE_MANAGE,CAPTURE_SET,CB_DATA,CHANGE_REQUEST,CHARGE_RESULT,CHECK_COMMENT,COLLECT_REPORT,COMMON_AUDIT_OPTION,COMPARE_CONTENT_SETTING,COMPARE_LIST,COMPARE_LIST_SNAPSHOT_JL,COMPARE_QUEUE,COMPARE_QUEUE_BAK,COMPARE_RESULT,COMPARE_RESULT_HIS,COMPARE_SOURCE,COMPARE_TEMPLATE_SETTING,COMPARE_TEMP_TBL,COMPLAIN,COMPLAIN_REPLY,COM_AUDIT_TRAIL,COM_STATISTICS,CONST_AREA,CONST_CATEGORY,CONST_DICTIONARY,CONST_DISCIPLINE,CONST_DISCIPLINE_TEMP,CONST_LABORATORY,CONST_NATURE_TYPE,CONST_PDF_DATA,CONST_REGION,CONST_REMOTING_DB,CONST_RESEARCH_AREA_TEMP,CONST_RESEARCH_KEYWORD_TEMP,CONST_SORT_NAME,CONST_STATUS,CONST_STAT_YEAR,CONST_SUBJECT,CONST_TEMPLATE,CONST_TEMPLATE_ITEMS,CONTRACT,CONTRACT_AUDIT_COMMENT,CONTRACT_EXTEND,CONTRACT_REPORT_DATA,CONTRACT_TMP,COOPERATIVE_TARGETCONFIG,CPT_COMPONENT_CONFIG,CPT_HELP_TIPS,CPT_PIE_CHART,CPT_PSN_HELPTIPS,CPT_TREE_DATA,CRITERIA_SET,CRITERIA_SET1,CR_ATTACHMENT_TEMPLATE,CR_PRJ,CR_PRJ_DETAILS_ITEM,CR_PRJ_DETAILS_LOG,CR_PRJ_GRANT,CR_SETTING,CTR_COMPARE_STATE,CTR_EDIT_LOG,DBJG_LOAN_INFO,DISCODE_KEYWORD,DISCODE_RESEARCH,DISNO_UNITNO_RULES,DIV_SETTING,DIV_SETTING_BAK,DS_2013,EGRANT_PROPOSAL_PROF,EVACTIVITY,EVALUATION,EVALUATION_EXTEND,EVALUATION_RESET,EVALUATION_RESULT,EVATVCONTAINER_INITLOG,EVATV_CONTAINER,EVATV_GROUP,EVATV_ORG,EVATV_REPLACE,EVATV_TYPE,EVA_APP_PRJ,EVA_APP_PRJ_ITEMS,EVA_PRP_ORG,EVA_REVIEW_LOG,EVA_REVIEW_LOG_2012,EVA_REVIEW_LOG_2015,EVCONST_SETTING,EVEXP_GROUP_PSN,EVEXP_GROUP_TITLE,EVEXP_REVIEW_STAT,EVFORM,EVFORM_ITEMS,EVFORM_ITEM_OPTIONS,EVNOTIFY_MAIL_TEMPLATE,EVPRJ_DETAIL,EVPRJ_FILES,EVPRJ_MEMBER,EVPRJ_OUTCOME,EVPRJ_STATISTIC,EVREVIEWER,EVREVIEWER_REVIEW_OFFICE,EVREVIEWER_UNOFFICIAL,EVSUB_TEMPLATE,EVSYN_COMMENT,EXCEL_REPORT,EXCEPT_INS,EXCEPT_PRJ,EXIT_RESULT,EXP_LABEL,EXP_STATUS,EXTRACT_TO_COMPARE_SETTING,FACT_GDSSY,FACT_GDSSY_BAK,FIN_RPT_DETAIL,FIN_RPT_SCHEDULE,FORM_BASE_LIBRARY,FORM_GRANT_NATURE,FORM_INIT_ITEM,FORM_INIT_TAB,FORM_NODE_MODE_SETTING,FUNDING_SCHEME,FUND_INCOME,FUND_ITEM,FUND_ITEM_EXTENDS,FUND_LOG,FUND_LOG_BAK,FUND_MAKEUP,FUND_PROJECT,FUND_RATE_ITEMS,FUND_SETTING,FUND_SETTING20141202,FUND_SETTING_BAK,GENPDFLOG,GENPDF_LOG,GQ_COLUMN_DESCRIPTION,GQ_DATA,GQ_DATACOLUMN_MAPPING,GQ_MENU,GQ_MENU_MAPPING,GQ_PANEL,GQ_REPORT_COLUMNS,GQ_REPORT_TEMPLATE,GRANT_AGREEMENT,GRANT_AMT_RATE,GRANT_AMT_RATE2,GRANT_APPROVE_PERSON,GRANT_ATTACH,GRANT_AWARD_LEVEL,GRANT_COMPARE_NODE,GRANT_LIMIT,GRANT_NOTES,GRANT_NOTES_BAK,GRANT_PERSON_ADMIN,GRANT_RULE_SETTING,GRANT_SCHEDULE,GRANT_SETTING,GRANT_SETTING2,GRANT_SETTING_ANNUAL,GRANT_SETTING_ANNUAL20141202,GRANT_SETTING_ANNUAL_1230,GRANT_SETTING_ANNUAL_BAK,GRANT_SETTING_BAK,GRANT_SETTING_COPY,GRANT_SETTING_EXTEND,GRANT_SETTING_EXTEND_BAK,GRANT_SETTING_LOG,GRANT_SL,GRANT_SUBJECT,GRANT_TEMPLATE,GRANT_TOPIC,GRANT_TOPIC_GROUP,HN_HELP_MANAGMENT,INDEX_PAGE_NOTICE,INIT_ACL_SQL_CONFIG,INVEST_INFO,INVEST_INFO_WX6992,INVEST_PLAN,INVEST_PRJ,INVEST_PRJ_WX6992,JBPM4_DEPLOYMENT,JBPM4_DEPLOYPROP,JBPM4_EXECUTION,JBPM4_HIST_ACTINST,JBPM4_HIST_DETAIL,JBPM4_HIST_PROCINST,JBPM4_HIST_TASK,JBPM4_HIST_VAR,JBPM4_ID_GROUP,JBPM4_ID_MEMBERSHIP,JBPM4_ID_USER,JBPM4_JOB,JBPM4_LOB,JBPM4_PARTICIPATION,JBPM4_PROPERTY,JBPM4_SWIMLANE,JBPM4_TASK,JBPM4_VARIABLE,JD_DATA,KEY_EVENT_INFO,KEY_EVENT_ITEM,LABEL_DETAIL,LOAN_INFO,LOAN_INFO_BAK,LOAN_RENEW_INFO,LOAN_TYPE_INFO,LOCKS,MAIL_CUSTOM_TEMPLATE,MAIL_LOG,MAIL_LOG_ATTACHMENT,MAIL_SEND_QUEUE,MAIL_SERVER_LIST,MAIL_TEMPLATE,MAIL_TEMPLATE_ATTACHMENT,MODIFY_BANK_LOG,MV_DWTJ,MV_DW_JB,MV_DW_TZ,MV_DW_YJ,MV_GENZONG_TOTAL,MV_GENZONG_TOTAL_WEI,MV_GENZONG_TOTAL_YI,MV_GENZONG_TOTAL_YING,MV_HETONG_TOTAL,MV_HETONG_TOTAL_WEI,MV_HETONG_TOTAL_YI,MV_HETONG_TOTAL_YING,MV_LIXIANG_TOTAL,MV_LIXIANG_TOTAL_PROJECT,MV_NEW_QIYE_SHENBAO,MV_ORG_BASIC_MONTH,MV_PROJECT_CMP,MV_PT_TZ,MV_SHENBAO_DAYCOUNT,MV_SHENBAO_ONEDONECOUNT,MV_SHENBAO_RETURNCOUNT,MV_SHENTAO_TOTAL,MV_SHENTAO_TOTAL_ACCEPT,MV_SHENTAO_TOTAL_INCLUDE10,MV_SHENTAO_TOTAL_SUBMIT,MV_YANSHOU_TOTAL,MV_YANSHOU_TOTAL_WEI,MV_YANSHOU_TOTAL_YI,MV_YANSHOU_TOTAL_YING,MV_YQ_TZ,MV_ZIZHU,MV_ZIZHU_LIXIANG,MV_ZIZHU_TOTAL,MV_ZIZHU_TOTAL_PROJECT,NAME_CHANGE_LOG,NODE_NAME_LOGIN_NUMBER,NODE_NAME_LOGIN_NUMBER_BAK,NOTICE_PAGE,NOTICE_PAGE_NOTES,NUMBER_CHECK_DATA,NUMBER_CHECK_SETTING,OFFICE_MATTER_RULE,OFFICE_WORKDAY_SET,OFF_TYPE_ADMIN,ORGANIZATION,ORGANIZATION_BASIC_DATA,ORGANIZATION_BASIC_DATA44,ORGANIZATION_EXTEND,ORGANIZATION_MAP,ORGANIZATION_SHAREHOLDER,ORGANIZATION_SPILT,ORGANIZATION_YEAR_DATA,ORGANIZATION_YEAR_DATA44,ORG_ADDRESS,ORG_ADDRESS2,ORG_DEPARTMENT,ORG_GRANT_PSN,ORG_OFFICE,ORG_OFFICE_ROLE,ORG_OFFICE_UNITNO,ORG_OFFICE_UNITNO2,ORG_OFFICE_UNITNO_BAK,ORG_PARTMENT,ORG_PROPERTY,ORG_RANK,ORG_RECOMMEND,OTHER_PROJECT,PARAM_TEMPLATE,PAY_NOTICE_PLAN,PDF_ATTACHMENT,PDF_MONITOR_INFO,PDF_RESET_LOGS,PDF_TEMPLATE,PDIRECTION,PDIRECTION_EXTEND,PDISCIPLINE,PDISCIPLINE_EXTEND,PERFORMANCE_BATCH,PERFORMANCE_CATEGORY,PERFORMANCE_DATA,PERFORMANCE_EVENT_PLAN,PERFORMANCE_EXTRACT_SETTING,PERFORMANCE_ITEM_DETAIL,PERFORMANCE_ITEM_TYPE,PERFORMANCE_MACRO_ECONOMY_DATA,PERFORMANCE_MAIN,PERSON,PERSON_DEPT,PERSON_DEPT_ADMIN,PERSON_DIV,PERSON_DIV_BAK,PERSON_EXTEND,PERSON_OFFICE,PERSON_ORG,PERSON_ORG_ADMIN,PERSON_ORG_REGISTER,PERSON_SUB,PERSON_WORKDAY_SET,PER_PATENTS,PER_PATENTS_APP,PER_PATENTS_FOR,PER_PERIODICALS,PER_REWARDS,PER_SOFTWARES,PER_STANDARDS,PER_TALENTS,PER_TECHNOLOGYS,PFM_BATCH_GROUP,PFM_EVALUTION_ITEMS,PFM_FORM_ITMES,PFM_FORM_ITMES_T,PFM_PRJ_GROUP,PFM_REVIEWER,PJ_MEMBER,PJ_ORG,POCR_BAK,POLICY_CLAUSE,POLICY_GRANT_SETTING,PRESEARCH,PRESEARCH_EXTEND,PRJNOTIFY_MAIL_TEMPLATE,PRJNOTIFY_SMS_TEMPLATE,PRJPAYNOTIFY_MAIL_TEMPLATE,PRJ_BUDGET,PRJ_PAY_BATCH,PRJ_PAY_BATCH_QU,PRJ_PAY_NOTICE,PRJ_PAY_NOTICE_ATTACHMENT,PRJ_PAY_PLAN,PRJ_PAY_PLAN_BAK_1125,PRJ_PAY_PLAN_BAK_1125_2,PRJ_PAY_PLAN_EXTEND,PRJ_PAY_PLAN_SOURCE,PRJ_PERSONS,PRJ_UPLOAD_FILE,PROCESS_VIEW_CONFIG,PRODUCT_INFO,PROJECT,PROJECT_EXTEND,PROJECT_TMP,PROPOSAL,PROPOSALEXPS,PROPOSAL_AUDIT_COMMENT,PROPOSAL_AWARD_OBJECTION,PROPOSAL_AWARD_REVIEW,PROPOSAL_BU_EXTEND,PROPOSAL_CACHED,PROPOSAL_CACHED_EXTEND,PROPOSAL_COMPARA_XML,PROPOSAL_EQUIPMENT,PROPOSAL_EXTEND,PROPOSAL_ORGANIZATIONS,PROPOSAL_PERFORMANCE_WC,PROPOSAL_PERFORMANCE_YQ,PROPOSAL_PERSONS,PROPOSAL_REPORT_DATA,PROPOSAL_RULE,PROPOSAL_RULE_0303,PROPOSAL_RULE_BAK,PROPOSAL_RULE_BAK2,PROPOSAL_RULE_EXCEPTION,PROPOSAL_RULE_PARAM,PROPOSAL_RULE_PARAM_0303,PROPOSAL_RULE_PARAM_BAK,PROPOSAL_RULE_PARAM_BAK2,PROPOSAL_RULE_PARAM_T,PROPOSAL_RULE_T,PROPOSAL_SL_REPORT,PROPOSAL_SPLIT,PRP_ATTACH,PRP_CHECK_SNAPSHOT,PRP_COMPARE_RESULT,PRP_COMPARE_RESULT_BAK,PRP_COMPARE_RESULT_SNAPSHOT_JL,PRP_EV_COMMENTS,PRP_EXCEPTION_LOG,PRP_EXTRACT_XML_LOG,PRP_GUID,PRP_ORGANIZATION,PRP_ORGANIZATION_CHECK_RESULTS,PRP_ORG_SPILT,PRP_PERSON,PRP_PRODUCTS,PRP_PROJECTS,PRP_RULES,PRP_RULE_CHECK_RESULT,PRP_TOUNIT_RULES,PSN_AUDIT,PSN_BU_SCHEDULE,PSN_GUID,PSN_PRODUCTS,PSN_ROLE_RANGLE,PSN_SHORTCUT,PSN_SHORTCUT_INIT,PSN_SHORTCUT_TOTAL,PSN_TOTAL_OUTCOME,PSN_TOTAL_PROPOSAL,PUBLISH_REVIEW_RESULT_COMMENT,QRTZ_BLOB_TRIGGERS,QRTZ_CALENDARS,QRTZ_CRON_TRIGGERS,QRTZ_FIRED_TRIGGERS,QRTZ_JOB_DETAILS,QRTZ_LOCKS,QRTZ_PAUSED_TRIGGER_GRPS,QRTZ_SCHEDULER_STATE,QRTZ_SIMPLE_TRIGGERS,QRTZ_SIMPROP_TRIGGERS,QRTZ_TASK_DETAIL_LOG,QRTZ_TASK_LOG,QRTZ_TRIGGERS,QRTZ_TRIGGERS_EXTEND,QUARTZ_CRON_EXPRESSION,QUEUE_TASK_EVENT,QUEUE_TASK_LOG,RANGLE_DISC,RANGLE_DIVCODE,RANGLE_GRANT_TYPE,RANGLE_INCLUDE_PRJ,RATE_INFO,RATE_INFO_BAK,RCSX_CHANGEREQUEST,RCSX_CONSTANT_DEPLOY,RCSX_PROJECT,RCSX_REPORT,RCSX_STUD_INFO_BASE,RCSX_STUD_INFO_SCHOOL,RCSX_TEMPORARY,RECORD_CHANGE_INFO,RECORD_GRANT,RECORD_GRANT_BAK,RECORD_INFO,RECORD_ORG_INFO,REGISTEREDSERVICEIMPL,REPAY_PLAN,REPAY_RESULT,REPORT_CERTIFICATE,REPORT_COMMENT,REPORT_COMPLETION,REPORT_DELIVERABLE_EXTEND,REPORT_ORGINFO_VIEW,REPORT_PROGRESS,REPORT_PROGRESS_LIST,REPORT_PROGRESS_TABLE,REPORT_RULE,REPORT_RULE_ITEMS,REPORT_SCHEDULE,REPORT_WARNING,RESEARCH_AREA,RESEARCH_KEYWORD,REVIEW_UPLOAD_FILE,RISK_FUND_CONFIG,RISK_INFO,RISK_PUBLISH_INFO,ROLE_DIRECT,RP_ORGANIZATION_BASIC_DATA,RP_ORG_YEAR_STATISC,RS_ATTRIBUTES,RULE_OPER,RULE_PARAM_TEMPLATE,RULE_TEMPLATE,SECURITY_CONFIG,SECURITY_LOG,SERVICETICKET,SLJK_CASE_BASE,SMS_CUSTOM_TEMPLATE,SMS_LOG,SMS_RECEIVE,SMS_TEMPLATE,SPECIAL_FUND,SPECIAL_FUND_BAK,SPECIAL_REPORT_FILE,SPECIAL_REPORT_FILE_LOG,STAT_CHARTS,STAT_CHARTS_DATA,STAT_CHARTS_DATA_C171124,STAT_CONFIGURATION,STAT_CONST,STAT_CSKDATA_HISTORY,STAT_CSK_ORG,STAT_DETAIL,STAT_DETAIL_2013,STAT_DETAIL_2014,STAT_DS_2010,STAT_DS_2011,STAT_DS_2012,STAT_DS_2013,STAT_DS_2013_BAK,STAT_MAIN,STAT_MAIN_2013,STAT_MAIN_2014,STAT_ORGANIZATION99,STAT_ORGANIZATION_ALL_DATA,STAT_ORGANIZATION_BASIC_DATA,STAT_ORGANIZATION_BASIC_DATA2,STAT_ORGANIZATION_BASIC_DATA99,STAT_ORGANIZATION_BASIC_DATA_9,STAT_ORGANIZATION_BASIC_DATA_B,STAT_ORGANIZATION_BASIC_DATA_M,STAT_ORGANIZATION_BASIC_DATA_T,STAT_ORGANIZATION_LIST,STAT_ORGANIZATION_LIST98,STAT_ORGANIZATION_LIST_9,STAT_ORGANIZATION_LIST_BAK1211,STAT_ORGANIZATION_LIST_T,STAT_ORGANIZATION_MONTH_DATA,STAT_ORGANIZATION_MONTH_DATA_M,STAT_ORGANIZATION_Q11_DATA,STAT_ORGANIZATION_Q12_DATA,STAT_ORGANIZATION_Q13_DATA,STAT_ORGANIZATION_Q14_DATA,STAT_ORGANIZATION_YEAR_DATA,STAT_ORGANIZATION_YEAR_DATA2,STAT_ORGANIZATION_YEAR_DATA_B,STAT_ORGANIZATION_YEAR_DATA_M,STAT_ORG_BASIC_DATA_MS,STAT_ORG_ECONOMIC_ITEM,STAT_ORG_MONTH_DATA_MS,STAT_ORG_PROPERTY,STAT_ORG_PROPERTY3,STAT_ORG_PROPERTY_9,STAT_ORG_PROPERTY_B,STAT_ORG_PROPERTY_CONST,STAT_ORG_PROPERTY_CONST_9,STAT_ORG_YEAR_DATA_MS,STAT_P_TEMP,STAT_REPORTPROGRESS,STAT_SQL_CONFIG,STAT_TJJ_DATA_T,SUPPLEMENT_COMMENT,SYNDATALOG,SYNDATA_PROCESS,SYNDATA_TASK,SYNDATA_TASK_HISTORY,SYS_AUTHORITIE,SYS_EXPORT_SCHEMA_01,SYS_EXPORT_SCHEMA_02,SYS_EXPORT_SCHEMA_03,SYS_EXPORT_SCHEMA_04,SYS_EXPORT_SCHEMA_05,SYS_EXPORT_SCHEMA_06,SYS_EXPORT_SCHEMA_07,SYS_EXPORT_SCHEMA_08,SYS_EXPORT_SCHEMA_09,SYS_EXPORT_SCHEMA_10,SYS_EXPORT_SCHEMA_12,SYS_EXPORT_SCHEMA_14,SYS_EXPORT_SCHEMA_15,SYS_EXPORT_SCHEMA_16,SYS_EXPORT_SCHEMA_17,SYS_FAQ,SYS_LOG,SYS_OFF_ROLE_ADMIN,SYS_PAGE_NOTES,SYS_PAGE_TIPS,SYS_PATCH,SYS_PATCH_NET,SYS_PERSON_GRANT,SYS_RESOURCE,SYS_RESOURCE_AUTHORITIE,SYS_RESOURCE_URL,SYS_ROLE,SYS_ROLE_ADMIN,SYS_ROLE_AUTHORITIE,SYS_ROLE_PSN_AUTHORITIE,SYS_SHORTCUT_MENU,SYS_TEMP_FBT,SYS_USER,SYS_USER_ROLE,TABLE_CONFIG,TASK_BALANCE,TASK_CONTROL,TASK_LOG,TASK_LOG_XC,TB_NODE_LIST,TB_USER,TEMPLATE_ITEMS,TEMP_HISTORY_PROJECT100,TEMP_HISTORY_PROJECT11,TEMP_HISTORY_PROJECT12,TEMP_HISTORY_PROJECT2,TEMP_HISTORY_PROJECT21,TEMP_HISTORY_PROJECT22,TEMP_HISTORY_PROJECT23,TEMP_HISTORY_PROJECT24,TEMP_HISTORY_PROJECT25,TEMP_HISTORY_PROJECT26,TEMP_HISTORY_PROJECT26_XDJ,TEMP_HISTORY_PROJECT27_KJ,TEMP_HISTORY_PROJECT27_SWJ,TEMP_HISTORY_PROJECT29_530,TEMP_HISTORY_PROJECT29_KJ,TEMP_HISTORY_PROJECT2_GJ,TEMP_HISTORY_PROJECT2_SHENG,TEMP_HISTORY_PROJECT2_WENTI,TEMP_HISTORY_PROJECT3,TEMP_HISTORY_PROJECT30_KJ,TEMP_HISTORY_PROJECT31_GJ,TEMP_HISTORY_PROJECT32,TEMP_HISTORY_PROJECT33,TEMP_HISTORY_PROJECT34,TEMP_HISTORY_PROJECT34_JXWGJ,TEMP_HISTORY_PROJECT35,TEMP_HISTORY_PROJECT36,TEMP_HISTORY_PROJECT36_SHENG,TEMP_HISTORY_PROJECT37,TEMP_HISTORY_PROJECT37_RENCAI,TEMP_HISTORY_PROJECT38_FWY2009,TEMP_HISTORY_PROJECT4,TEMP_HISTORY_PROJECT40,TEMP_HISTORY_PROJECT41,TEMP_HISTORY_PROJECT42,TEMP_HISTORY_PROJECT43,TEMP_HISTORY_PROJECT44,TEMP_HISTORY_PROJECT45,TEMP_HISTORY_PROJECT46,TEMP_HISTORY_PROJECT47,TEMP_HISTORY_PROJECT48,TEMP_HISTORY_PROJECT49,TEMP_HISTORY_PROJECT50,TEMP_HISTORY_PROJECT51,TEMP_HISTORY_PROJECT52,TEMP_HISTORY_PROJECT55,TEMP_HISTORY_PROJECT56,TEMP_HISTORY_PROJECT57,TEMP_HISTORY_PROJECT58,TEMP_HISTORY_PROJECT59,TEMP_HISTORY_PROJECT60,TEMP_HISTORY_PROJECT8,TEMP_HISTORY_PROJECT88,TEMP_HISTORY_PROJECT99,TEMP_HISTORY_PROJECT_XD,TEMP_INVEST_PRJ,TEMP_LOAN_INFO,TICKETGRANTINGTICKET,TMP_BANGDANG,TRAINING_UNIT,TRAINING_UNIT_PERSONS,TRANSFER_FILE,TRANSFER_PAYMENT,TRANSFER_PAYMENT_GRANT,TRUSTED_SECURITY_CONFIG,UNIT_MAIL_TEMPLATE,UNREPAY_ITEMS,UNREPAY_ITEMS_BAK,USER_OPINIONS,USER_ROLE_AUTHORITY,USER_ROLE_RESOURCE,WAITINITPERMISSIONS,WAITSPLITPROPOSAL,WF_ACTION,WF_BUSINESS_SETTING,WF_DEFINE,WF_EXPORT_CONFIG,WF_EXTEND,WF_HIS_EXTEND,WF_HIS_TASK,WF_LINES,WF_NODES,WF_NODE_ACTION,WF_PARAM_TEMPLATE,WF_RULE,WF_RULE_PARAM,WF_RULE_TEMPLATE,WF_RULE_TEMPLATE_PARAM,WF_TASK,WF_TASK_ACTOR,WF_TASK_ACTOR_TEMPLATE,WL_LLR_APPSERVER_1,WL_LLR_APPSERVER_2,WL_LLR_APPSERVER_PDF1,WL_LLR_APPSERVER_TASK,WL_LLR_JYFMS_JSP,WL_LLR_JYFMS_TEST1,WL_LLR_NSKJJR_TEST,WL_LLR_SFMS_TEST,WL_LLR_SFMS_TEST_DEV,WL_LLR_SFMS_TEST_TASK,WL_LLR_WXFMS_JSP,WL_LLR_WXFMS_TEST,WORKFLOW_NODE,WORKFLOW_RULE,WORKFLOW_TASK,XINXING_ALL,XINXING_JIENENGHUANBAO,XINXING_NENGYUAN,XINXING_RUANJIANFUWUWAIBAO,XINXING_SEHNGWUCHANYE,XINXING_WEIDIANZI,XINXING_WULIANWANG,XINXING_XINCAILIAO,XML_COMPARE,XML_SPLIT,XML_UPDATE,XML_UPDATE_LOG,ZHUYW" ;
		 List<String> mysqlList = Arrays.asList(mysqlTableStr.split(",")) ;
		  List<String> oracleList = Arrays.asList(orcleTableStr.split(",")) ;
		  for (String oItem : oracleList) {
			  if(!mysqlList.contains(oItem)){
				  System.out.println(oItem);
			  }
		   } 
	}
}
