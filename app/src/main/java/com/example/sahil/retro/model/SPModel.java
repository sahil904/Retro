package com.example.sahil.retro.model;

import java.util.List;

public class SPModel {

    private String msg;
    private List<BannerBean> banner;
    private List<ServiceBean> service;
    private List<RatingBean> rating;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<BannerBean> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerBean> banner) {
        this.banner = banner;
    }

    public List<ServiceBean> getService() {
        return service;
    }

    public void setService(List<ServiceBean> service) {
        this.service = service;
    }

    public List<RatingBean> getRating() {
        return rating;
    }

    public void setRating(List<RatingBean> rating) {
        this.rating = rating;
    }

    public static class BannerBean {
        /**
         * id : 1
         * status :
         * image : http://spffacilities.com/Admin_pannel/pages/uploads/Cleaning.png
         */

        private String id;
        private String status;
        private String image;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public static class ServiceBean {
        /**
         * id : 3
         * description :  TUTION for School Students,
         COACHING for GRADUATION,
         COACHING for GOVT JOBS,
         COMPUTER EDUCATION,
         10TH,
         12TH,
         GRADUATION,
         VOCATIONAL TRAINING,

         * service_name : EDUCATION
         * status :
         * image : http://spffacilities.com/Admin_pannel/pages/uploads/edu.png
         */

        private String id;
        private String description;
        private String service_name;
        private String status;
        private String image;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getService_name() {
            return service_name;
        }

        public void setService_name(String service_name) {
            this.service_name = service_name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public static class RatingBean {
        /**
         * id : 6
         * name : afzal kham
         * description : good
         * rating : 5.0
         * user_id : 54
         * cdate : 12/04/2018
         */

        private String id;
        private String name;
        private String description;
        private String rating;
        private String user_id;
        private String cdate;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getCdate() {
            return cdate;
        }

        public void setCdate(String cdate) {
            this.cdate = cdate;
        }
    }
}
