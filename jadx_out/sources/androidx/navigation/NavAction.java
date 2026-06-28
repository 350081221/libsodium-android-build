package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavAction;", "", "destinationId", "", "navOptions", "Landroidx/navigation/NavOptions;", "defaultArguments", "Landroid/os/Bundle;", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "getDestinationId", "()I", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1726#2,3:92\n1855#2,2:95\n*S KotlinDebug\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n*L\n63#1:92,3\n73#1:95,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavAction {

    @m
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;

    @m
    private NavOptions navOptions;

    @i
    public NavAction(@IdRes int i5) {
        this(i5, null, null, 6, null);
    }

    @i
    public NavAction(@IdRes int i5, @m NavOptions navOptions) {
        this(i5, navOptions, null, 4, null);
    }

    @i
    public NavAction(@IdRes int i5, @m NavOptions navOptions, @m Bundle bundle) {
        this.destinationId = i5;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@p4.m java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L78
            boolean r2 = r8 instanceof androidx.navigation.NavAction
            if (r2 != 0) goto Ld
            goto L78
        Ld:
            int r2 = r7.destinationId
            androidx.navigation.NavAction r8 = (androidx.navigation.NavAction) r8
            int r3 = r8.destinationId
            if (r2 != r3) goto L76
            androidx.navigation.NavOptions r2 = r7.navOptions
            androidx.navigation.NavOptions r3 = r8.navOptions
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r2 == 0) goto L76
            android.os.Bundle r2 = r7.defaultArguments
            android.os.Bundle r3 = r8.defaultArguments
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r2 != 0) goto L77
            android.os.Bundle r2 = r7.defaultArguments
            if (r2 == 0) goto L72
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L72
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L44
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L44
        L42:
            r8 = r0
            goto L6e
        L44:
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r7.defaultArguments
            r5 = 0
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r4.get(r3)
            goto L5f
        L5e:
            r4 = r5
        L5f:
            android.os.Bundle r6 = r8.defaultArguments
            if (r6 == 0) goto L67
            java.lang.Object r5 = r6.get(r3)
        L67:
            boolean r3 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r3 != 0) goto L48
            r8 = r1
        L6e:
            if (r8 != r0) goto L72
            r8 = r0
            goto L73
        L72:
            r8 = r1
        L73:
            if (r8 == 0) goto L76
            goto L77
        L76:
            r0 = r1
        L77:
            return r0
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavAction.equals(java.lang.Object):boolean");
    }

    @m
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    @m
    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        int i5;
        Set<String> keySet;
        Object obj;
        int i6;
        int hashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions = this.navOptions;
        if (navOptions != null) {
            i5 = navOptions.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = hashCode + i5;
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i8 = i7 * 31;
                Bundle bundle2 = this.defaultArguments;
                if (bundle2 != null) {
                    obj = bundle2.get(str);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    i6 = obj.hashCode();
                } else {
                    i6 = 0;
                }
                i7 = i8 + i6;
            }
        }
        return i7;
    }

    public final void setDefaultArguments(@m Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(@m NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavAction.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    public /* synthetic */ NavAction(int i5, NavOptions navOptions, Bundle bundle, int i6, w wVar) {
        this(i5, (i6 & 2) != 0 ? null : navOptions, (i6 & 4) != 0 ? null : bundle);
    }
}
