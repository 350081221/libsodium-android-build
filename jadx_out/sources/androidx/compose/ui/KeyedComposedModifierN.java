package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@Stable
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015\u0012\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR!\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifierN;", "Landroidx/compose/ui/ComposedModifier;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "fqName", "Ljava/lang/String;", "getFqName", "()Ljava/lang/String;", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "factory", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;Lv3/l;Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends ComposedModifier {

    @l
    private final String fqName;

    @l
    private final Object[] keys;

    public KeyedComposedModifierN(@l String str, @l Object[] objArr, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        super(lVar, qVar);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
            if (l0.g(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return true;
            }
        }
        return false;
    }

    @l
    public final String getFqName() {
        return this.fqName;
    }

    @l
    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
