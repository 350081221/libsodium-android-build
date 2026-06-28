package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "Args", "Landroidx/navigation/NavArgs;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nActivityNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavArgsLazy.kt\nandroidx/navigation/ActivityNavArgsLazyKt$navArgs$1\n*L\n1#1,47:1\n*E\n"})
/* loaded from: classes2.dex */
public final class ActivityNavArgsLazyKt$navArgs$1 extends n0 implements v3.a<Bundle> {
    final /* synthetic */ Activity $this_navArgs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavArgsLazyKt$navArgs$1(Activity activity) {
        super(0);
        this.$this_navArgs = activity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Bundle invoke() {
        Bundle bundle;
        Intent intent = this.$this_navArgs.getIntent();
        if (intent != null) {
            Activity activity = this.$this_navArgs;
            bundle = intent.getExtras();
            if (bundle == null) {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        } else {
            bundle = null;
        }
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
    }
}
