package com.util.maps;

public class Department {
    private String deptName;
    private int deptId;
    private String deptHead;

    public Department() {

    }

    public Department(String deptName, int deptId, String deptHead) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.deptHead = deptHead;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptId=" + deptId +
                ", deptHead='" + deptHead + '\'' +
                '}';
    }
}
