package t2;

import android.content.Context;
import com.lody.virtual.remote.VAppInstallerResult;
import com.yuanqi.group.home.models.AppInfoLite;
import java.io.File;
import java.util.List;
import org.jdeferred.p;

/* loaded from: classes3.dex */
public interface a {
    String a(String str);

    p<List<com.yuanqi.group.home.models.c>, Throwable, Void> b(Context context);

    boolean c(String str, int i5);

    VAppInstallerResult d(AppInfoLite appInfoLite);

    p<List<com.yuanqi.group.home.models.c>, Throwable, Void> e(Context context, File file);

    p<List<com.yuanqi.group.home.models.b>, Throwable, Void> f();
}
