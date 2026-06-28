package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.v;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b1\u00102J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u000fH\u0096\u0002J,\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002J\u000f\u0010\u0019\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u0006\u0010!\u001a\u00020\u0000J\u0013\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020&H\u0016R&\u0010)\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010\u0018\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010,\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010.¨\u00063"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "T", DatabaseFileArchive.COLUMN_KEY, "get", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "getOrElse", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lv3/a;)Ljava/lang/Object;", "getOrElseNullable", "", "iterator", b.f22420d, "Lkotlin/r2;", "set", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "contains", "containsImportantForAccessibility$ui_release", "()Z", "containsImportantForAccessibility", "child", "mergeChild$ui_release", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "mergeChild", "peer", "collapsePeer$ui_release", "collapsePeer", "copy", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "props", "Ljava/util/Map;", "isMergingSemanticsOfDescendants", "Z", "setMergingSemanticsOfDescendants", "(Z)V", "isClearingSemantics", "setClearingSemantics", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1747#2,3:200\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n78#1:200,3\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, a {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;

    @l
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    public final void collapsePeer$ui_release(@l SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                v action = accessibilityAction.getAction();
                if (action == null) {
                    action = ((AccessibilityAction) value).getAction();
                }
                map.put(key, new AccessibilityAction(label, action));
            }
        }
    }

    public final <T> boolean contains(@l SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.props.containsKey(semanticsPropertyKey);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        Set<SemanticsPropertyKey<?>> keySet = this.props.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (((SemanticsPropertyKey) it.next()).isImportantForAccessibility$ui_release()) {
                return true;
            }
        }
        return false;
    }

    @l
    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        if (l0.g(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics) {
            return true;
        }
        return false;
    }

    public final <T> T get(@l SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t5 = (T) this.props.get(semanticsPropertyKey);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(@l SemanticsPropertyKey<T> semanticsPropertyKey, @l v3.a<? extends T> aVar) {
        T t5 = (T) this.props.get(semanticsPropertyKey);
        return t5 == null ? aVar.invoke() : t5;
    }

    @m
    public final <T> T getOrElseNullable(@l SemanticsPropertyKey<T> semanticsPropertyKey, @l v3.a<? extends T> aVar) {
        T t5 = (T) this.props.get(semanticsPropertyKey);
        return t5 == null ? aVar.invoke() : t5;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final void mergeChild$ui_release(@l SemanticsConfiguration semanticsConfiguration) {
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            l0.n(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object merge = key.merge(obj, value);
            if (merge != null) {
                this.props.put(key, merge);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(@l SemanticsPropertyKey<T> semanticsPropertyKey, T t5) {
        if ((t5 instanceof AccessibilityAction) && contains(semanticsPropertyKey)) {
            Object obj = this.props.get(semanticsPropertyKey);
            l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
            Map<SemanticsPropertyKey<?>, Object> map = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) t5;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            v action = accessibilityAction2.getAction();
            if (action == null) {
                action = accessibilityAction.getAction();
            }
            map.put(semanticsPropertyKey, new AccessibilityAction(label, action));
            return;
        }
        this.props.put(semanticsPropertyKey, t5);
    }

    public final void setClearingSemantics(boolean z4) {
        this.isClearingSemantics = z4;
    }

    public final void setMergingSemanticsOfDescendants(boolean z4) {
        this.isMergingSemanticsOfDescendants = z4;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(key.getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
