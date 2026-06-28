package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "Landroidx/compose/ui/autofill/AutofillType;", "autofillTypes", "Ljava/util/List;", "getAutofillTypes", "()Ljava/util/List;", "Landroidx/compose/ui/geometry/Rect;", "boundingBox", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "Lkotlin/Function1;", "", "Lkotlin/r2;", "onFill", "Lv3/l;", "getOnFill", "()Lv3/l;", "id", "I", "getId", "()I", "<init>", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lv3/l;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class AutofillNode {
    private static int previousId;

    @l
    private final List<AutofillType> autofillTypes;

    @m
    private Rect boundingBox;
    private final int id;

    @m
    private final v3.l<String, r2> onFill;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "()V", "previousId", "", "generateId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,105:1\n35#2:106\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:106\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i5;
            synchronized (this) {
                Companion companion = AutofillNode.Companion;
                AutofillNode.previousId++;
                i5 = AutofillNode.previousId;
            }
            return i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(@l List<? extends AutofillType> list, @m Rect rect, @m v3.l<? super String, r2> lVar) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = lVar;
        this.id = Companion.generateId();
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        if (l0.g(this.autofillTypes, autofillNode.autofillTypes) && l0.g(this.boundingBox, autofillNode.boundingBox) && l0.g(this.onFill, autofillNode.onFill)) {
            return true;
        }
        return false;
    }

    @l
    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    @m
    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    @m
    public final v3.l<String, r2> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int i5;
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int i6 = 0;
        if (rect != null) {
            i5 = rect.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = (hashCode + i5) * 31;
        v3.l<String, r2> lVar = this.onFill;
        if (lVar != null) {
            i6 = lVar.hashCode();
        }
        return i7 + i6;
    }

    public final void setBoundingBox(@m Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, v3.l lVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? kotlin.collections.w.E() : list, (i5 & 2) != 0 ? null : rect, lVar);
    }
}
