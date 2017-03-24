package com.mockito.power.simple.test;

import com.mockito.power.simple.SimpleCode;
import com.mockito.power.simple.SimpleCode2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

/**
 * Created by 春哥 on 17/3/21.
 */
@RunWith(PowerMockRunner.class)
//@PrepareForTest(SimpleCode.class)
@PrepareForTest({SimpleCode.class, SimpleCode2.class})
public class CodeTest {

    //普通Mock
    @Test
    public void testCallArgumentInstance() {
        File file = PowerMockito.mock(File.class);
        SimpleCode underTest = new SimpleCode();
        PowerMockito.when(file.exists()).thenReturn(true);
        Assert.assertTrue(underTest.callArgumentInstance(file));
    }

    //Mock方法内部new出来的对象
    //PowerMockito.whenNew方法时，必须加注解@PrepareForTest和@RunWith
    //注解@PrepareForTest里写的类是需要mock的new对象代码所在的类。
    @Test
    public void testCallInternalInstance02() throws Exception {
        File file = PowerMockito.mock(File.class);
        SimpleCode underTest = new SimpleCode();
        PowerMockito.whenNew(File.class).withArguments("bbb").thenReturn(file);
        PowerMockito.when(file.exists()).thenReturn(true);
        Assert.assertTrue(underTest.callInternalInstance2("bbb"));
    }

    //Mock普通对象的final方法
    @Test
    public void testCallFinalMethod() throws Exception {
        SimpleCode2 simpleCode2 = PowerMockito.mock(SimpleCode2.class); //mock final class
        SimpleCode simpleCode = new SimpleCode();
        PowerMockito.when(simpleCode2.isAlive()).thenReturn(true);
        Assert.assertTrue(simpleCode.callFinalMethod(simpleCode2));
    }

    //Mock普通类的静态方法
    //当需要mock静态方法的时候，必须加注解@PrepareForTest和@RunWith。注解@PrepareForTest里写的类是静态方法所在的类。
    @Test
    public void testCallStaticMethod() throws Exception {
        SimpleCode simpleCode = new SimpleCode();
        PowerMockito.mockStatic(SimpleCode2.class);
        PowerMockito.when(SimpleCode2.isAliveStatic()).thenReturn(true);
        Assert.assertTrue(simpleCode.callStaticMethod());
    }

    //Mock 私有方法
    //和Mock普通方法一样，只是需要加注解@PrepareForTest(ClassUnderTest.class)，注解里写的类是私有方法所在的类。
    @Test
    public void testCallPrivateMethod() throws Exception {
        SimpleCode simpleCode = PowerMockito.mock(SimpleCode.class);
        PowerMockito.when(simpleCode.callPrivateMethod()).thenCallRealMethod();
        PowerMockito.when(simpleCode, "isExist").thenReturn(true);
        Assert.assertTrue(simpleCode.callPrivateMethod());
    }

    //Mock系统类的静态和final方法
    //和Mock普通对象的静态方法、final方法一样，只不过注解@PrepareForTest里写的类不一样 ，注解里写的类是需要调用系统方法所在的类。
    @Test
    public void testCallSystemStaticMethod() throws Exception {
        SimpleCode simpleCode = new SimpleCode();
        PowerMockito.mockStatic(System.class);
        PowerMockito.when(System.getProperty("aaa")).thenReturn("bbb");
        Assert.assertEquals("bbb", simpleCode.callSystemStaticMethod("aaa"));
    }

}
