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
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018\u0012\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier3;", "Landroidx/compose/ui/ComposedModifier;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "fqName", "Ljava/lang/String;", "getFqName", "()Ljava/lang/String;", "key1", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "key2", "getKey2", "key3", "getKey3", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class KeyedComposedModifier3 extends ComposedModifier {

    @l
    private final String fqName;

    @m
    private final Object key1;

    @m
    private final Object key2;

    @m
    private final Object key3;

    public KeyedComposedModifier3(@l String str, @m Object obj, @m Object obj2, @m Object obj3, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof KeyedComposedModifier3) {
            KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
            if (l0.g(this.fqName, keyedComposedModifier3.fqName) && l0.g(this.key1, keyedComposedModifier3.key1) && l0.g(this.key2, keyedComposedModifier3.key2) && l0.g(this.key3, keyedComposedModifier3.key3)) {
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

    @m
    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int i5;
        int i6;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int i7 = 0;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (hashCode + i5) * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i6 = obj2.hashCode();
        } else {
            i6 = 0;
        }
        int i9 = (i8 + i6) * 31;
        Object obj3 = this.key3;
        if (obj3 != null) {
            i7 = obj3.hashCode();
        }
        return i9 + i7;
    }
}
