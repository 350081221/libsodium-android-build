package k1;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class b {
    public static boolean a(@NonNull String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
