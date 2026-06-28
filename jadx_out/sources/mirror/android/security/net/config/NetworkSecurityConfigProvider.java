package mirror.android.security.net.config;

import android.content.Context;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class NetworkSecurityConfigProvider {
    public static Class<?> TYPE = RefClass.load((Class<?>) NetworkSecurityConfigProvider.class, "android.security.net.config.NetworkSecurityConfigProvider");

    @MethodParams({Context.class})
    public static RefStaticMethod<Void> install;
}
