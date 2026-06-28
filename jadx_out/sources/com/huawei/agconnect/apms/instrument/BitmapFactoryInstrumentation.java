package com.huawei.agconnect.apms.instrument;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.i0;
import java.io.FileDescriptor;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class BitmapFactoryInstrumentation {
    public static Bitmap decodeByteArray(byte[] bArr, int i5, int i6, BitmapFactory.Options options) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeByteArray(bArr, i5, i6, options);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeByteArray"), i0.BITMAP);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i5, i6, options);
        TraceManager.exitMethod();
        return decodeByteArray;
    }

    public static Bitmap decodeFile(String str) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeFile(str);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeFile"), i0.BITMAP);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        TraceManager.exitMethod();
        return decodeFile;
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeFileDescriptor"), i0.BITMAP);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        TraceManager.exitMethod();
        return decodeFileDescriptor;
    }

    public static Bitmap decodeResource(Resources resources, int i5, BitmapFactory.Options options) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeResource(resources, i5, options);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeResource"), i0.BITMAP);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i5, options);
        TraceManager.exitMethod();
        return decodeResource;
    }

    public static Bitmap decodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeResourceStream"), i0.BITMAP);
        Bitmap decodeResourceStream = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
        TraceManager.exitMethod();
        return decodeResourceStream;
    }

    public static Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeStream"), i0.BITMAP);
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
        TraceManager.exitMethod();
        return decodeStream;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i5, int i6) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeByteArray(bArr, i5, i6);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeByteArray"), i0.BITMAP);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i5, i6);
        TraceManager.exitMethod();
        return decodeByteArray;
    }

    public static Bitmap decodeFile(String str, BitmapFactory.Options options) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeFile(str, options);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeFile"), i0.BITMAP);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        TraceManager.exitMethod();
        return decodeFile;
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeFileDescriptor"), i0.BITMAP);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
        TraceManager.exitMethod();
        return decodeFileDescriptor;
    }

    public static Bitmap decodeResource(Resources resources, int i5) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeResource(resources, i5);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeResource"), i0.BITMAP);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i5);
        TraceManager.exitMethod();
        return decodeResource;
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        if (Agent.isDisabled()) {
            return BitmapFactory.decodeStream(inputStream);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "BitmapFactory#decodeStream"), i0.BITMAP);
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        TraceManager.exitMethod();
        return decodeStream;
    }
}
