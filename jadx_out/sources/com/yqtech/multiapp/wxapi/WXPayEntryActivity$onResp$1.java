package com.yqtech.multiapp.wxapi;

import com.yuanqi.master.mine.MineActivity;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class WXPayEntryActivity$onResp$1 extends n0 implements a<r2> {
    public static final WXPayEntryActivity$onResp$1 INSTANCE = new WXPayEntryActivity$onResp$1();

    WXPayEntryActivity$onResp$1() {
        super(0);
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MineActivity a5 = MineActivity.f14760b.a();
        if (a5 != null) {
            a5.F();
        }
    }
}
