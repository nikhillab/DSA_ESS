package com.dsa.ess.util;

public enum Constants {
    NEW_LINE("\n"),COMMA(","),NONE(" "), HYPHEN("-");


    private final String operation;

    private Constants(String operation) {
        this.operation=operation;
    }

    @Override
    public String toString() {
        return this.operation;
    }
}
