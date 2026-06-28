package androidx.compose.foundation.text2.input;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text2/input/MaxLengthFilter;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "", "component1", "", "component2", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "valueWithChanges", "Lkotlin/r2;", "transformInput", "", "toString", "maxLength", "inCodepoints", "copy", TTDownloadField.TT_HASHCODE, "", "other", "equals", "I", "Z", "<init>", "(IZ)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMaxLengthTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxLengthTransformation.kt\nandroidx/compose/foundation/text2/input/MaxLengthFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes.dex */
final class MaxLengthFilter implements InputTransformation {
    private final boolean inCodepoints;
    private final int maxLength;

    public MaxLengthFilter(int i5, boolean z4) {
        boolean z5;
        this.maxLength = i5;
        this.inCodepoints = z4;
        if (i5 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return;
        }
        throw new IllegalArgumentException(("maxLength must be at least zero, was " + i5).toString());
    }

    private final int component1() {
        return this.maxLength;
    }

    private final boolean component2() {
        return this.inCodepoints;
    }

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = maxLengthFilter.maxLength;
        }
        if ((i6 & 2) != 0) {
            z4 = maxLengthFilter.inCodepoints;
        }
        return maxLengthFilter.copy(i5, z4);
    }

    @l
    public final MaxLengthFilter copy(int i5, boolean z4) {
        return new MaxLengthFilter(i5, z4);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxLengthFilter)) {
            return false;
        }
        MaxLengthFilter maxLengthFilter = (MaxLengthFilter) obj;
        return this.maxLength == maxLengthFilter.maxLength && this.inCodepoints == maxLengthFilter.inCodepoints;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxLength) * 31) + Boolean.hashCode(this.inCodepoints);
    }

    @l
    public String toString() {
        String str;
        if (this.inCodepoints) {
            str = "maxLengthInCodepoints";
        } else {
            str = "maxLengthInChars";
        }
        return "InputTransformation." + str + "(maxLength=" + this.maxLength + ')';
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldBuffer textFieldBuffer) {
        int length;
        if (this.inCodepoints) {
            length = textFieldBuffer.getCodepointLength();
        } else {
            length = textFieldBuffer.getLength();
        }
        if (length > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
