package com.mockito.power.simple;

import java.io.File;

/**
 * Created by 春哥 on 17/3/22.
 */
public class SimpleCode {

    //普通Mock
    public boolean callArgumentInstance(File file) {
        return file.exists();
    }


    //Mock方法内部new出来的对象
    public boolean callInternalInstance2(String path) {
        File file = new File(path);
        return file.exists();
    }

    //Mock普通对象的final方法
    public boolean callFinalMethod(SimpleCode2 refer) {
        return refer.isAlive();
    }

    public boolean callStaticMethod() {
        return SimpleCode2.isAliveStatic();
    }

    public boolean callPrivateMethod() {
        return isExist();
    }

    private boolean isExist() {
            return false;
    }

    public boolean callSystemFinalMethod(String str) {
        return str.isEmpty();
    }

    public String callSystemStaticMethod(String str) {
        return System.getProperty(str);
    }

}
