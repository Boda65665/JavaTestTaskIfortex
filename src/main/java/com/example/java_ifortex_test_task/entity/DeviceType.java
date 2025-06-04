package com.example.java_ifortex_test_task.entity;

import lombok.Getter;

@Getter
public enum DeviceType {
    MOBILE(0, "Mobile"),
    DESKTOP(1, "Desktop");

    private final int code;
    private final String description;

    DeviceType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static DeviceType fromCode(int code) {
        for (DeviceType type : DeviceType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown device type code: " + code);
    }

}
