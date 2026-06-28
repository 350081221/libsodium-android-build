package mirror.android.content;

import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import mirror.RefClass;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class AttributionSourceState {
    public static Class<?> TYPE = RefClass.load((Class<?>) AttributionSourceState.class, "android.content.AttributionSourceState");
    public static RefObject<Parcelable[]> next;
    public static RefObject<String> packageName;
    public static RefObject<Integer> pid;
    public static RefObject<IBinder> token;
    public static RefObject<Integer> uid;

    public static void next(Object obj, Parcelable[] parcelableArr) {
        RefObject<Parcelable[]> refObject = next;
        if (refObject != null) {
            refObject.set(obj, parcelableArr);
        }
    }

    public static void packageName(Object obj, String str) {
        RefObject<String> refObject = packageName;
        if (refObject != null) {
            refObject.set(obj, str);
        }
    }

    public static void token(Object obj, IBinder iBinder) {
        RefObject<IBinder> refObject = token;
        if (refObject != null) {
            refObject.set(obj, iBinder);
        }
    }

    public static void uid(Object obj, int i5) {
        RefObject<Integer> refObject = uid;
        if (refObject != null) {
            refObject.set(obj, Integer.valueOf(i5));
        }
    }

    public static Parcelable[] next(Object obj) {
        RefObject<Parcelable[]> refObject = next;
        if (refObject != null) {
            return refObject.get(obj);
        }
        return null;
    }

    public static String packageName(Object obj) {
        RefObject<String> refObject = packageName;
        if (refObject != null) {
            return refObject.get(obj);
        }
        return null;
    }

    public static IBinder token(Object obj) {
        RefObject<IBinder> refObject = token;
        if (refObject != null) {
            return refObject.get(obj);
        }
        return null;
    }

    public static int uid(Object obj) {
        RefObject<Integer> refObject = uid;
        if (refObject != null) {
            return refObject.get(obj).intValue();
        }
        return Process.myUid();
    }
}
