package androidx.compose.foundation.text2.input.internal;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {50}, m = "platformSpecificTextInputSession", n = {}, s = {})
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 extends d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(kotlin.coroutines.d<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, this);
    }
}
