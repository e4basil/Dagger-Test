package com.test.codefolks.daggertest.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("HasColumns")
    @Expose
    private int hasColumns;
    @SerializedName("ErrorMessage")
    @Expose
    private String errorMessage;
    @SerializedName("LoginResult")
    @Expose
    private LoginResult loginResult;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHasColumns() {
        return hasColumns;
    }

    public void setHasColumns(int hasColumns) {
        this.hasColumns = hasColumns;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LoginResult getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    private class LoginResult {
        @SerializedName("Employeename")
        @Expose
        private String employeename;
        @SerializedName("EmployeeID")
        @Expose
        private int employeeID;
        @SerializedName("UserID")
        @Expose
        private int userID;
        @SerializedName("BranchID")
        @Expose
        private int branchID;
        @SerializedName("Designation")
        @Expose
        private String designation;

        public String getEmployeename() {
            return employeename;
        }

        public void setEmployeename(String employeename) {
            this.employeename = employeename;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        public int getBranchID() {
            return branchID;
        }

        public void setBranchID(int branchID) {
            this.branchID = branchID;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }
    }
}
