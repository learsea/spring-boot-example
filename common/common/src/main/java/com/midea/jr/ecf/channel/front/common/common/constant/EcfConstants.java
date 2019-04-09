package com.midea.jr.ecf.channel.front.common.common.constant;

public class EcfConstants {
    /** 美的付常量 */
    // 000表示成功
    public static final String RETURN_CODE_000 = "00000";
    // 999表示不成功
    public static final String RETURN_CODE_999 = "99999";
    // 美的付query_user接口 用户不存在
    public static final String MIDEAPAY_QUERYUSER_NO = "110071009";
    // 美的付注册平台
    public static final String MIDEAPAY_REGIST_FORM = "02";
    // 美的付身份证类型
    public static final String MIDEAPAY_IDENTITY_TYPE = "01";
    // 美的付平台信用卡
    public static final String MIDEAPAY_CREDIT = "CREDIT";
    // 美的付平台储蓄卡
    public static final String MIDEAPAY_DEBIT = "DEBIT";
    // 美的付平台接口正常
    public static final String MIDEAPAY_OK = "1001";
    // 美的付平台人民币代码id
    public static final String MIDEAPAY_CURID = "156";
    // 美的付平台语言
    public static final String MIDEAPAY_LANGUAGE = "ZH";
    // 美的付平台编码
    public static final String MIDEAPAY_CHARSET = "UTF-8";
    // 美的付平台签名方式
    public static final String MIDEAPAY_SIGN_TYPE = "MD5_RSA_TW";
    // ecf 渠道类型
    public static final String ECF_CHANEL_TYPE = "08";
    // ecf 渠道提交授信 身份证类型
    public static final String ECF_ID_TYPE = "20";
    // 美的付用户查询接口
    public static final String MIDEAPAY_QUERY_USER = "query_user";
    // 美的付卡列表查询接口
    public static final String MIDEAPAY_BANK_LIST = "bank_list";
    // 美的付用户修改密码获得token接口
    public static final String MIDEAPAY_WALLET_ACCESS_TOKEN = "wallet_access_token";
    // 美的付用户修改密码接口
    public static final String MIDEAPAY_WALLET_ACCESS_VERIFY = "wallet_access_verify";
    // 美的付用户修改密码接口,PC端
    public static final String MIDEAPAY_PAY_PWD_SET = "pay_pwd_set";
    // 美的付发送短信接口接口
    public static final String MIDEAPAY_BIND_CARD_PREPARE = "bind_card_prepare";
    // 美的付短信验证接口
    public static final String MIDEAPAY_BIND_CARD_CONFIRM = "bind_card_confirm";
    // 美的付设置还款卡接口
    public static final String MIDEAPAY_REPAY_BANK_CARD = "repay_bank_card";
    // 美的付b2c还款接口
    public static final String MIDEAPAY_TRADE_B2C_TRADE = "trade_b2c_trade";
    // 美的付b2c还款接口
    public static final String MIDEAPAY_BATCH_B2C_TRADE = "batch_b2c_pay";
    // 美的付登录获得token接口
    public static final String MIDEAPAY_WALLET_AUTH_TOKEN = "wallet_auth_token";
    // 用户注册
    public static final String MIDEAPAY_WALLET_REGIST_BGREGIST = "wallet_regist_bgregist";
    // 美的付查单接口
    public static final String MIDEAPAY_ORDER_QUERY = "trade_b2c_order_query";
    // 美的付批量查单接口
    public static final String MIDEAPAY_BATCH_ORDER_QUERY = "batch_b2c_order_query";
    // 请求支付密码校验页面
    public static final String MIDEAPAY_REPAY_PWD_CHECK = "pay_pwd_check";
    // 美的付找回支付密码页面
    public static final String MIDEAPAY_REPAY_PWD_RETRIEVE = "pay_pwd_retrieve";
    // 美的付查单接口，无此订单
    public static final String MIDEAPAY_CHECK_ORDER_NO = "110020008";
    // 美的付查单接口，无此订单110093209
    public static final String MIDEAPAY_BATCH_CHECK_ORDER_NO = "110093008";
    // 美的付查单接口，映射不存在
    public static final String MIDEAPAY_CHECK_ORDER_NO_D = "110093209";
    // 验签通过后的操作，(PWDM:支付密码管理)本次支付密码管理输入的值固定为PWDM
    public static final String MIDEAPAY_OPERATE = "PWDM";
    // 美的付获取PC端token接口
    public static final String MIDEAPAY_CASHIER_AUTH_TOKEN = "cashier_auth_token";
    // 美的付获取PC端token接口
    public static final String SYSTEM_NAME = "jrchannel";
    // 美的付获取PC端token接口
    public static final String SUB_SYSTEM = "ecf_front";
    // 来源渠道
    public static final String REGIST_FROM = "01";
    public static final String USER_TYPE = "01";

    // 证件类型如下：01：身份证 02：护照 03：港澳通行证 04：回乡证 05：台胞证 06：警官证 07：士兵证 08：军官证 99：其它证件
    // 目前只支持身份证。
    public static final String IDENTITY_TYPE = "01";

    /** 短信发送模块 */
    // 短信发送成功码
    public static final String MSG_CODE_SUCCESS = "000";
    public static final String MSG_CODE_ERROR = "111";
    public static final String CKECK_CODE_SUCCESS = "00000";

    /** 文档中心 */
    public static final String DOC_CENTER_DOCCODE = "doccode";
    public static final String DOC_CENTER_DOCKIND = "dockind";
    public static final String DOC_CENTER_DOCTYPE = "doctype";

    /** 流程处理 */
    // 为处理
    public static final String UNFINISH = "0";
    // 处理完成
    public static final String FINISH = "1";

    /** 系统表名 */
    // 自动还款表
    public static final String ECF_AUTORETRUN_BANKINFO = "t_ecf_autoreturn_bankinfo";
    // 用户基本信息表
    public static final String ECF_BASEINFO = "t_ecf_baseinfo";
    // 用户签署合同表
    public static final String ECF_CONTRACT = "t_ecf_contract";
    // 易签宝注册表
    public static final String ECF_EMPLOYE_SIGNATURE = "t_ecf_employe_signature";
    // 投诉建议表
    public static final String ECF_FEEDBACK = "t_ecf_feedback";
    // 用户影像信息表
    public static final String ECF_IMAGEINFO = "t_ecf_imageinfo";
    // 用户职业信息表
    public static final String ECF_OCCUPATION = "t_ecf_occupation";
    // 订单表
    public static final String ECF_ORDER = "t_ecf_order";
    // 自动还款卡尾数表
    public static final String ECF_PAYBANKINFO = "ecf_paybankinfo";
    // 用户操作流程表
    public static final String ECF_PROCESS_RECORD = "t_ecf_process_record";
    // 用户亲属关系 表
    public static final String ECF_RELATIONSHIP = "t_ecf_relationship";
    // 还款支付同表
    public static final String ECF_REPAYMENT = "t_ecf_repayment";
    // 还款支付详情 表
    public static final String ECF_REPAYMENT_DETAIL = "t_ecf_repayment_detail";
    // 还款支付子订单表
    public static final String ECF_REPAYMNET_SUB = "t_ecf_repayment_sub";
    // 商户表
    public static final String ECF_STORE = "t_ecf_store";
    // 短信验证码表
    public static final String ECF_VALIDATECODE = "t_ecf_validatecode";
    //不需要芝麻征信
    public  static final String ZMXY_NO="zmxyno";
    // 送货地址信息表
    public static final String ECF_DELIVERY_ADDRESS = "t_ecf_delivery_address";

    // 提示语表
    public static final String ECF_TIP = "t_ecf_tip";

    // 提示线下旗舰店关闭语表信息
    public static final String ECF_TIP_CODE = "1000";

    // 现金贷场景关闭提示语表
    public static final String LOAN_TIP_CODE = "1001";
    // 分期商城场景关闭提示语表信息
    public static final String FENQI_TIP_CODE = "1002";

    // 	芝麻征信开关
    public static final String ECF_SWITCH_CODE = "1000";
    //核心卡列表的代扣卡
    public static final Integer WITHHOLD_Y = 1;
    //核心卡列表的非代扣卡
    public static final Integer WITHHOLD_N = 2;

    /** 文档中心文件类型 */
    public static enum DOC_TYPE {

        /** 身份证正面 */
        POSITIVE("DOC001"),

        /** 身份证反面 */
        NEGATIVE("DOC002"),

        /** 活体照片 */
        LIVEING("DOC003"),

        /** 银行卡照片 */
        BANKCARDIMG("DOC010");

        private String code;

        private DOC_TYPE(String code) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    /**
     * 合同类型
     * @author  liwy
     * 模板类型
     *	07	合同模板
     *	08	服务协议
     *	09	授权书
     *	10	第三方协议
     *	11	法律文书送达地址确认书
     *	12	注册协议
     *	99  其他
     *
     */
    public static enum CONTRACTTYPE {

        /** 个人分期贷款合同  O类员工贷*/
        LOAN("DOC012"),

        /** 服务协议*/
        SERVICE_AGREEMENT("DOC013"),

        /** 授权书*/
        CERTIFICATE_AUTHORIZATION("DOC014"),

        /** 代扣协议*/
        THIRD("DOC015"),

        /** 法律文书送达地址确认书*/
        LEGAL("DOC016"),

        /** 注册协议*/
        REGISTER("DOC017"),

        /** O类员工贷*/
        OLEI("DOC020"),

        /** 分期商城未签署合同*/
        UNSIGN_FENQI("DOC021"),
        /** 分期商城已经签署*/
        FENQI("DOC022"),

        /**工资代扣授权书(未签署)*/
        UNSINGN_SALARY_AUTHORIZATION("DOC023"),
        /**工资代扣授权书(已签署)*/
        SALARY_AUTHORIZATION("DOC024"),

        /**	商户旗舰店注册协议(未签署)*/
        UNSINGN_MERCHANT_REGISTER("DOC025"),
        /**商户旗舰店注册协议(已签署)*/
        MERCHANT_REGISTER("DOC026"),

        /**商户合作协议(未签署)*/
        UNSINGN_MERCHANT_COOPERATION("DOC027"),
        /**商户合作协议(已签署)*/
        MERCHANT_COOPERATION("DOC028"),

        /**商户廉洁协议(未签署)*/
        UNSINGN_MERCHANT_HONEST("DOC029"),
        /**商户廉洁协议(已签署)*/
        MERCHANT_HONEST("DOC030"),
        /**  代扣授权书 **/
        AUTHORIZATION("DOC031"),
        /** 其他*/
        OTHERS("DOC099");

        private String code;

        private CONTRACTTYPE( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    /**
     * 订单类型
     * @author  zhangyz
     */
    public static enum ORDER_TYPE {


        /** 单笔单批 */
        ORDER_TYPE_COMMODITY("20"),

        /** 循环额度 */
        ORDER_TYPE_REVOLVE_CREDIT("10"),

        /**O类员工贷*/
        ORDER_TYPE_EMPLOYEE_LOAN("30"),

        /***/
        ORDER_TYPE_FENQI_CREDIT("40");
        private String code;

        private ORDER_TYPE( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    /**
     * 签署合同类型
     * @author  zhangyz
     */
    public static enum CHANNALE_TYPE {


        /** 单笔单批 */
        ORDER_TYPE_COMMODITY("2"),

        /** 循环额度 */
        ORDER_TYPE_REVOLVE_CREDIT("1"),

        /**O类员工贷*/
        ORDER_TYPE_EMPLOYEE_LOAN("3"),

        /**分期商城*/
        ORDER_TYPE_FENQI_CREDIT("4");
        private String code;

        private CHANNALE_TYPE( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    public static enum YN {
        /**
         * 是
         */
        Y("Y"),
        /**
         * 否
         */
        N("N");

        private String code;

        private YN( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    /**
     * 订单类型
     * @author  zhangyz
     */
    public static enum BIZ_TYPE {


        /** 原始的循环额度 */
        BIZ_TYPE_COMMODITY("0"),

        /** 现金贷*/
        BIZ_TYPE_EMPLOYEE_LOAN("1"),

        /**分期专区*/
        BIZ_TYPE_FENQI_CREDIT("2");

        private String code;

        private BIZ_TYPE( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    /**
     *
     * 默认状态
     * @author
     * @date 2017年11月6日 下午3:24:44
     */
    public static enum DEFAULT_STATUS {
        /**
         * 默认
         */
        DEFAULT("0"),

        /**
         * 非默认
         */
        NO_DEFAULT("1");

        private String code;

        private DEFAULT_STATUS( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    /**
     *
     * 删除状态
     * @author
     * @date 2017年11月6日 下午3:24:44
     */
    public static enum DELETE_STATUS {
        /**
         * 未删除
         */
        NO_DELETE("0"),

        /**
         * 已删除
         */
        DELETED("1");

        private String code;

        private DELETE_STATUS( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }

    }


    /**
     *
     * 发布状态
     * @author
     * @date 2017年11月6日 下午3:24:44
     */
    public static enum ISSUE_STATUS {
        /**
         * 未发布
         */
        NO_ISSUE("0"),

        /**
         * 已发布
         */
        ISSUE("1");

        private String code;

        private ISSUE_STATUS( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    public static enum ECFFRONT_ERRORCODE{
        /** **/
        YCLOANS_STATUS_ERRORCODE("99999");

        private String code;

        private ECFFRONT_ERRORCODE(String code) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    public static enum ORDER_PLAT {
        /**
         * 微信服务号
         */
        WE_CHAT("0"),

        /**
         * 小程序
         */
        MINI_PROGRAM("1"),
        /**
         * 	app
         */
        APP("2"),
        /**
         * 	ccs下单
         */
        CCS("3"),
        /**
         * 	支付网关系统
         */
        LITTLE_SWAN("4");

        private String code;

        private ORDER_PLAT( String code ) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }

    }

    public static enum MEICHANT_TIP{
        /**短信发送时间间隔60提示语 **/
        MEICHANT_SEND_MESSAGE("1004"),
        /**商户注册短信发送成功**/
        MEICHANT_SEND_SUCCESS("1005"),
        /**商户注册短信发送成功**/
        MEICHANT_SEND_FAIL("1006"),
        /**商户注册信息已经存在**/
        MEICHANT_INFO_OCCUPY("1007");
        private String code;

        private MEICHANT_TIP(String code) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }

    public static enum BOX_TYPE{
        /**社保**/
        SHEBAO("1"),
        /**公积金**/
        GONGJIJIN("2"),
        /**信用卡账单**/
        CREDIT("3");
        private String code;

        private BOX_TYPE(String code) {
            this.code = code;
        }

        public String Code() {
            return this.code;
        }
    }
}



