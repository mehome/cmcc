package com.tangbaobao.pojo;

import java.util.List;

/**
 * `typeId` varchar(50) NOT NULL,
 * `typeName` varchar(10) DEFAULT NULL,
 */
public class SectionNoType {
    private String typeId;
    private String typeName;
    /**
     * 配置一对多关系
     */
    private List<Resource> resources;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "SectionNoType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", resources=" + resources +
                '}';
    }
}
