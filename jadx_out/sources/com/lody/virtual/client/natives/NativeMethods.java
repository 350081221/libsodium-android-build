package com.lody.virtual.client.natives;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Parcel;
import android.os.Parcelable;
import com.lody.virtual.client.NativeEngine;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import dalvik.system.DexFile;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class NativeMethods {
    public static int gAudioRecordMethodType;
    public static Method gAudioRecordNativeCheckPermission;
    public static Method gAudioRecordNativeSetup;
    public static int gCameraMethodType;
    public static Method gCameraNativeSetup;
    public static Method gMediaRecorderNativeSetup;
    public static Method gNativeLoad;
    public static Method gNativeMask;
    public static Method gOpenDexFileNative;

    static {
        try {
            init();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @SuppressLint({"PrivateApi"})
    private static Method getAudioRecordNativeSetup() {
        Method method;
        try {
            Class cls = Integer.TYPE;
            method = AudioRecord.class.getDeclaredMethod("native_setup", Object.class, Object.class, int[].class, cls, cls, cls, cls, int[].class, String.class, Long.TYPE);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        if (method == null) {
            try {
                Class cls2 = Integer.TYPE;
                return AudioRecord.class.getDeclaredMethod("native_setup", Object.class, Object.class, cls2, cls2, cls2, cls2, cls2, int[].class, String.class);
            } catch (NoSuchMethodException unused2) {
                return method;
            }
        }
        return method;
    }

    private static Method getCameraNativeSetup() {
        Method[] declaredMethods = Camera.class.getDeclaredMethods();
        if (declaredMethods != null) {
            for (Method method : declaredMethods) {
                if ("native_setup".equals(method.getName())) {
                    return method;
                }
            }
            return null;
        }
        return null;
    }

    @SuppressLint({"BlockedPrivateApi"})
    private static Method getMediaRecorderNativeSetup() {
        Method method;
        try {
            if (BuildCompat.isS()) {
                try {
                    method = MediaRecorder.class.getDeclaredMethod("native_setup", Object.class, String.class, Parcel.class);
                } catch (NoSuchMethodException unused) {
                    method = MediaRecorder.class.getDeclaredMethod("native_setup", Object.class, String.class, Parcelable.class);
                }
            } else {
                method = MediaRecorder.class.getDeclaredMethod("native_setup", Object.class, String.class, String.class);
            }
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            try {
                return MediaRecorder.class.getDeclaredMethod("native_setup", Object.class, String.class);
            } catch (NoSuchMethodException unused3) {
                return method;
            }
        }
        return method;
    }

    @SuppressLint({"BlockedPrivateApi"})
    private static void init() {
        try {
            gNativeMask = NativeEngine.class.getDeclaredMethod("nativeMark", new Class[0]);
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
        if (BuildCompat.isR()) {
            try {
                gNativeLoad = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, Class.class);
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            }
        }
        gMediaRecorderNativeSetup = getMediaRecorderNativeSetup();
        Method audioRecordNativeSetup = getAudioRecordNativeSetup();
        gAudioRecordNativeSetup = audioRecordNativeSetup;
        if (audioRecordNativeSetup != null && audioRecordNativeSetup.getParameterTypes().length == 10) {
            gAudioRecordMethodType = 2;
        } else {
            gAudioRecordMethodType = 1;
        }
        Method[] declaredMethods = DexFile.class.getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            Method method = declaredMethods[i5];
            if (method.getName().equals("openDexFileNative")) {
                gOpenDexFileNative = method;
                break;
            }
            i5++;
        }
        Method method2 = gOpenDexFileNative;
        if (method2 != null) {
            method2.setAccessible(true);
            gCameraMethodType = -1;
            Method cameraNativeSetup = getCameraNativeSetup();
            if (cameraNativeSetup != null) {
                int paramsIndex = MethodParameterUtils.getParamsIndex(cameraNativeSetup.getParameterTypes(), String.class);
                gCameraNativeSetup = cameraNativeSetup;
                gCameraMethodType = paramsIndex + 16;
            }
            for (Method method3 : AudioRecord.class.getDeclaredMethods()) {
                if (method3.getName().equals("native_check_permission") && method3.getParameterTypes().length == 1 && method3.getParameterTypes()[0] == String.class) {
                    gAudioRecordNativeCheckPermission = method3;
                    method3.setAccessible(true);
                    return;
                }
            }
            return;
        }
        throw new RuntimeException("Unable to find method : openDexFileNative");
    }
}
