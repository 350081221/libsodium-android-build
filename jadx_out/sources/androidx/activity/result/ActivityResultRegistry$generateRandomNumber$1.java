package androidx.activity.result;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.random.f;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultRegistry$generateRandomNumber$1 extends n0 implements v3.a<Integer> {
    public static final ActivityResultRegistry$generateRandomNumber$1 INSTANCE = new ActivityResultRegistry$generateRandomNumber$1();

    ActivityResultRegistry$generateRandomNumber$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @m
    public final Integer invoke() {
        return Integer.valueOf(f.Default.nextInt(2147418112) + 65536);
    }
}
