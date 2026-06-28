package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/SearchBarColors;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/graphics/Color;", "containerColor", "J", "getContainerColor-0d7_KjU", "()J", "dividerColor", "getDividerColor-0d7_KjU", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "Landroidx/compose/material3/TextFieldColors;", "getInputFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "<init>", "(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SearchBarColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long dividerColor;

    @p4.l
    private final TextFieldColors inputFieldColors;

    private SearchBarColors(long j5, long j6, TextFieldColors textFieldColors) {
        this.containerColor = j5;
        this.dividerColor = j6;
        this.inputFieldColors = textFieldColors;
    }

    public /* synthetic */ SearchBarColors(long j5, long j6, TextFieldColors textFieldColors, kotlin.jvm.internal.w wVar) {
        this(j5, j6, textFieldColors);
    }

    public boolean equals(@p4.m Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!kotlin.jvm.internal.l0.g(SearchBarColors.class, cls)) {
            return false;
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.material3.SearchBarColors");
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        if (Color.m3735equalsimpl0(this.containerColor, searchBarColors.containerColor) && Color.m3735equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && kotlin.jvm.internal.l0.g(this.inputFieldColors, searchBarColors.inputFieldColors)) {
            return true;
        }
        return false;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2115getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m2116getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    @p4.l
    public final TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    public int hashCode() {
        return (((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.dividerColor)) * 31) + this.inputFieldColors.hashCode();
    }
}
