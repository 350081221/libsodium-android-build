package mirror.android.content;

import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;

/* loaded from: classes4.dex */
public class ContentProviderClientJB {
    public static Class TYPE = RefClass.load(ContentProviderClientJB.class, (Class<?>) android.content.ContentProviderClient.class);

    @MethodReflectParams({"android.content.ContentResolver", "android.content.IContentProvider", "boolean"})
    public static RefConstructor<android.content.ContentProviderClient> ctor;
}
