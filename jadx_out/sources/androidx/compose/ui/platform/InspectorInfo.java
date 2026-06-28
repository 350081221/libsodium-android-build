package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "properties", "Landroidx/compose/ui/platform/ValueElementSequence;", "getProperties", "()Landroidx/compose/ui/platform/ValueElementSequence;", t0.b.f22420d, "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InspectorInfo {
    public static final int $stable = 8;

    @p4.m
    private String name;

    @p4.l
    private final ValueElementSequence properties = new ValueElementSequence();

    @p4.m
    private Object value;

    @p4.m
    public final String getName() {
        return this.name;
    }

    @p4.l
    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    @p4.m
    public final Object getValue() {
        return this.value;
    }

    public final void setName(@p4.m String str) {
        this.name = str;
    }

    public final void setValue(@p4.m Object obj) {
        this.value = obj;
    }
}
