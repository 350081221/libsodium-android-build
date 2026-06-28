package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import external.org.apache.commons.lang3.d;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

@SuppressLint({"LogConditional"})
/* loaded from: classes2.dex */
public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            System.out.println(str2 + "     " + getName(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i6 = 0; i6 < fields.length; i6++) {
                Field field = fields[i6];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i5) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i5 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static String getState(MotionLayout motionLayout, int i5) {
        return getState(motionLayout, i5, -1);
    }

    public static void logStack(String str, String str2, int i5) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i5, stackTrace.length - 1);
        String str3 = " ";
        for (int i6 = 1; i6 <= min; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i6].getFileName() + ":" + stackTrace[i6].getLineNumber() + ") " + stackTrace[i6].getMethodName()) + str3);
        }
    }

    public static void printStack(String str, int i5) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i5, stackTrace.length - 1);
        String str2 = " ";
        for (int i6 = 1; i6 <= min; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            String str3 = ".(" + stackTrace[i6].getFileName() + ":" + stackTrace[i6].getLineNumber() + ") ";
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static String getState(MotionLayout motionLayout, int i5, int i6) {
        int length;
        if (i5 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i5);
        if (i6 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i6) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i6 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i6) / length).toString().replace((char) 0, d.f15957a) + "_", "_");
    }

    public static String getName(Context context, int i5) {
        if (i5 == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            return context.getResources().getResourceEntryName(i5);
        } catch (Exception unused) {
            return "?" + i5;
        }
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        try {
            String str2 = iArr.length + "[";
            int i5 = 0;
            while (i5 < iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i5 == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(iArr[i5]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + iArr[i5] + " ";
                }
                str2 = sb2 + str;
                i5++;
            }
            return str2 + "]";
        } catch (Exception e5) {
            Log.v("DEBUG", e5.toString());
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + "  " + layoutParams.getClass().getName());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }
}
