package com.hyman.prototype.weeklylog;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 14:26
 */
@Getter
@Setter
public class Attachment implements Serializable {

    private String name;

    public void download() {
        System.out.println("下载附件..., 附件名为：" + name);
    }
}
