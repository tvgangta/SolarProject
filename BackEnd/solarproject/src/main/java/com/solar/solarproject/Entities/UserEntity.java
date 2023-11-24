package com.solar.solarproject.Entities;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.SpringApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;


@Entity
@Table(name="users")
public class UserEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String username;
        private String password;
        private String userType;
        private boolean meterAccess;
        private String aadhar_no;

        public UserEntity(){};
//        public UserEntity(int id, String username, String password, String userType, boolean meterAccess, String aadhar_no) {
//                this.id = id;
//                this.username = username;
//                this.password = password;
//                this.userType = userType;
//                this.meterAccess = meterAccess;
//                this.aadhar_no = aadhar_no;
//        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getUserType() {
                return userType;
        }

        public void setUserType(String userType) {
                this.userType = userType;
        }

        public boolean isMeterAccess() {
                return meterAccess;
        }

        public void setMeterAccess(boolean meterAccess) {
                this.meterAccess = meterAccess;
        }

        public String getAadhar_no() {
                return aadhar_no;
        }

        public void setAadhar_no(String aadhar_no) {
                this.aadhar_no = aadhar_no;
        }

}