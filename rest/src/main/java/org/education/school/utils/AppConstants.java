package org.education.school.utils;

public enum AppConstants {
    PORT(8090);

    private int constants;

    private AppConstants(final int value){
        this.constants = value;
    }

    public int getValue(){
        return constants;
    }
}
