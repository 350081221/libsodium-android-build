package mirror.android.content;

import android.content.pm.ProviderInfo;
import android.os.IInterface;
import mirror.RefBoolean;
import mirror.RefClass;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class ContentProviderHolderOreo {
    public static Class<?> TYPE = RefClass.load((Class<?>) ContentProviderHolderOreo.class, "android.app.ContentProviderHolder");
    public static RefObject<ProviderInfo> info;
    public static RefBoolean noReleaseNeeded;
    public static RefObject<IInterface> provider;
}
