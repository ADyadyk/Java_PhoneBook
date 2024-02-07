package com.github.ADyadyk.model;

import java.util.Date;

public class Entry {
    private String familyName;
    private String name;
    private String fatherName;
    private String birthday;
    private String telephoneNumber;
    private String sex;

    private Entry(Builder builder) {
        this.familyName = builder.familyName;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.birthday = builder.birthday;
        this.telephoneNumber = builder.telephoneNumber;
        this.sex = builder.sex;
    }

    public Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String familyName;
        private String name;
        private String fatherName;
        private String birthday;
        private String telephoneNumber;
        private String sex;

        public Builder familyName(String familyName){
            this.familyName = familyName;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder fatherName(String fatherName){
            this.fatherName = fatherName;
            return this;
        }
        public Builder birthday(String birthday){
            this.birthday = birthday;
            return this;
        }
        public Builder telephoneNumber(String telephoneNumber){
            this.telephoneNumber = telephoneNumber;
            return this;
        }
        public Builder sex(String sex){
            this.sex = sex;
            return this;
        }

        public Entry build(){
            return new Entry(this);
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",
                familyName, name, fatherName, birthday, telephoneNumber, sex);
    }
}
