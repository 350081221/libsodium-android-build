package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@Stable
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016\u0012\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier2;", "Landroidx/compose/ui/ComposedModifier;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "fqName", "Ljava/lang/String;", "getFqName", "()Ljava/lang/String;", "key1", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "key2", "getKey2", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class KeyedComposedModifier2 extends ComposedModifier {

    @l
    private final String fqName;

    @m
    private final Object key1;

    @m
    private final Object key2;

    public KeyedComposedModifier2(@l String str, @m Object obj, @m Object obj2, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof KeyedComposedModifier2) {
            KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
            if (l0.g(this.fqName, keyedComposedModifier2.fqName) && l0.g(this.key1, keyedComposedModifier2.key1) && l0.g(this.key2, keyedComposedModifier2.key2)) {
                return true;
            }
        }
        return false;
    }

    @l
    public final String getFqName() {
        return this.fqName;
    }

    @m
    public final Object getKey1() {
        return this.key1;
    }

    @m
    public final Object getKey2() {
        return this.key2;
    }

    public int hashCode() {
        int i5;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int i6 = 0;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = (hashCode + i5) * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i6 = obj2.hashCode();
        }
        return i7 + i6;
    }
}
