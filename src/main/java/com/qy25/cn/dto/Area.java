package com.qy25.cn.dto;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/9 19:50
 * @Version 1.0
 */
public class Area {

    /**
     * reason : success
     * result : [{"id":"110000","name":"北京市","fid":"0","level_id":"1"},{"id":"120000","name":"天津市","fid":"0","level_id":"1"},{"id":"130000","name":"河北省","fid":"0","level_id":"1"},{"id":"140000","name":"山西省","fid":"0","level_id":"1"},{"id":"150000","name":"内蒙古自治区","fid":"0","level_id":"1"},{"id":"210000","name":"辽宁省","fid":"0","level_id":"1"},{"id":"220000","name":"吉林省","fid":"0","level_id":"1"},{"id":"230000","name":"黑龙江省","fid":"0","level_id":"1"},{"id":"310000","name":"上海市","fid":"0","level_id":"1"},{"id":"320000","name":"江苏省","fid":"0","level_id":"1"},{"id":"330000","name":"浙江省","fid":"0","level_id":"1"},{"id":"340000","name":"安徽省","fid":"0","level_id":"1"},{"id":"350000","name":"福建省","fid":"0","level_id":"1"},{"id":"360000","name":"江西省","fid":"0","level_id":"1"},{"id":"370000","name":"山东省","fid":"0","level_id":"1"},{"id":"410000","name":"河南省","fid":"0","level_id":"1"},{"id":"420000","name":"湖北省","fid":"0","level_id":"1"},{"id":"430000","name":"湖南省","fid":"0","level_id":"1"},{"id":"440000","name":"广东省","fid":"0","level_id":"1"},{"id":"450000","name":"广西壮族自治区","fid":"0","level_id":"1"},{"id":"460000","name":"海南省","fid":"0","level_id":"1"},{"id":"500000","name":"重庆市","fid":"0","level_id":"1"},{"id":"510000","name":"四川省","fid":"0","level_id":"1"},{"id":"520000","name":"贵州省","fid":"0","level_id":"1"},{"id":"530000","name":"云南省","fid":"0","level_id":"1"},{"id":"540000","name":"西藏自治区","fid":"0","level_id":"1"},{"id":"610000","name":"陕西省","fid":"0","level_id":"1"},{"id":"620000","name":"甘肃省","fid":"0","level_id":"1"},{"id":"630000","name":"青海省","fid":"0","level_id":"1"},{"id":"640000","name":"宁夏回族自治区","fid":"0","level_id":"1"},{"id":"650000","name":"新疆维吾尔自治区","fid":"0","level_id":"1"},{"id":"710000","name":"台湾省","fid":"0","level_id":"1"},{"id":"810000","name":"香港","fid":"0","level_id":"1"},{"id":"820000","name":"澳门","fid":"0","level_id":"1"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 110000
         * name : 北京市
         * fid : 0
         * level_id : 1
         */

        private String id;
        private String name;
        private String fid;
        private String level_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getLevel_id() {
            return level_id;
        }

        public void setLevel_id(String level_id) {
            this.level_id = level_id;
        }
    }
}
