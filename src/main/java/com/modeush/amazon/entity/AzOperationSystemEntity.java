package com.modeush.amazon.entity;

public class AzOperationSystemEntity {
    private Integer id;

    private String name;

    private String os;

    private String version;

    private String originVmPath;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getOriginVmPath() {
        return originVmPath;
    }

    public void setOriginVmPath(String originVmPath) {
        this.originVmPath = originVmPath == null ? null : originVmPath.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}