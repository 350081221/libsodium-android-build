package jonathanfinerty.once;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Once {
    public static final int THIS_APP_INSTALL = 0;
    public static final int THIS_APP_SESSION = 2;
    public static final int THIS_APP_VERSION = 1;

    /* renamed from: a, reason: collision with root package name */
    private static long f18981a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static PersistedMap f18982b;

    /* renamed from: c, reason: collision with root package name */
    private static PersistedSet f18983c;

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList<String> f18984d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Scope {
    }

    private Once() {
    }

    public static boolean beenDone(String str) {
        return beenDone(0, str, Amount.moreThan(0));
    }

    public static void clearAll() {
        f18982b.a();
        f18984d.clear();
    }

    public static void clearAllToDos() {
        f18983c.a();
    }

    public static void clearDone(String str) {
        f18982b.f(str);
        f18984d.remove(str);
    }

    public static void clearToDo(String str) {
        f18983c.d(str);
    }

    public static void initialise(Context context) {
        f18982b = new PersistedMap(context, "TagLastSeenMap");
        f18983c = new PersistedSet(context, "ToDoSet");
        if (f18984d == null) {
            f18984d = new ArrayList<>();
        }
        try {
            f18981a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Nullable
    public static Date lastDone(String str) {
        List<Long> b5 = f18982b.b(str);
        if (b5.isEmpty()) {
            return null;
        }
        return new Date(b5.get(b5.size() - 1).longValue());
    }

    public static void markDone(String str) {
        f18982b.e(str, new Date().getTime());
        f18984d.add(str);
        f18983c.d(str);
    }

    public static boolean needToDo(String str) {
        return f18983c.b(str);
    }

    public static void toDo(int i5, String str) {
        List<Long> b5 = f18982b.b(str);
        if (b5.isEmpty()) {
            f18983c.c(str);
            return;
        }
        Long l5 = b5.get(b5.size() - 1);
        if (i5 != 1 || l5.longValue() > f18981a) {
            return;
        }
        f18983c.c(str);
    }

    public static boolean beenDone(String str, CountChecker countChecker) {
        return beenDone(0, str, countChecker);
    }

    public static boolean beenDone(int i5, String str) {
        return beenDone(i5, str, Amount.moreThan(0));
    }

    public static boolean beenDone(int i5, String str, CountChecker countChecker) {
        List<Long> b5 = f18982b.b(str);
        int i6 = 0;
        if (b5.isEmpty()) {
            return false;
        }
        if (i5 == 0) {
            return countChecker.check(b5.size());
        }
        if (i5 != 2) {
            Iterator<Long> it = b5.iterator();
            while (it.hasNext()) {
                if (it.next().longValue() > f18981a) {
                    i6++;
                }
            }
            return countChecker.check(i6);
        }
        String[] strArr = (String[]) f18984d.toArray(new String[0]);
        int length = strArr.length;
        int i7 = 0;
        while (i6 < length) {
            if (strArr[i6].equals(str)) {
                i7++;
            }
            i6++;
        }
        return countChecker.check(i7);
    }

    public static void toDo(String str) {
        f18983c.c(str);
    }

    public static boolean beenDone(TimeUnit timeUnit, long j5, String str) {
        return beenDone(timeUnit, j5, str, Amount.moreThan(0));
    }

    public static boolean beenDone(TimeUnit timeUnit, long j5, String str, CountChecker countChecker) {
        return beenDone(timeUnit.toMillis(j5), str, countChecker);
    }

    public static boolean beenDone(long j5, String str) {
        return beenDone(j5, str, Amount.moreThan(0));
    }

    public static boolean beenDone(long j5, String str, CountChecker countChecker) {
        List<Long> b5 = f18982b.b(str);
        int i5 = 0;
        if (b5.isEmpty()) {
            return false;
        }
        for (Long l5 : b5) {
            if (l5.longValue() > new Date().getTime() - j5) {
                i5++;
            }
        }
        return countChecker.check(i5);
    }
}
