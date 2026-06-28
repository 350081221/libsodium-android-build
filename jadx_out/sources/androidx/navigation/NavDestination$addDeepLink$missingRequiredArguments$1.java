package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", DatabaseFileArchive.COLUMN_KEY, "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavDestination$addDeepLink$missingRequiredArguments$1 extends n0 implements l<String, Boolean> {
    final /* synthetic */ NavDeepLink $navDeepLink;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDestination$addDeepLink$missingRequiredArguments$1(NavDeepLink navDeepLink) {
        super(1);
        this.$navDeepLink = navDeepLink;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l String key) {
        l0.p(key, "key");
        return Boolean.valueOf(!this.$navDeepLink.getArgumentsNames$navigation_common_release().contains(key));
    }
}
