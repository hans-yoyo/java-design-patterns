package com.hyman.prototype.weeklylog;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 14:19
 */
@Getter
@Setter
public class WeeklyLogShallowClone implements Cloneable {

    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    public WeeklyLogShallowClone cloneSelf() {
        Object object;
        try {
            object = super.clone();
            return (WeeklyLogShallowClone) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
