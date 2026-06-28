package com.yuanqi.master;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.umeng.analytics.pro.d;
import com.yqtech.multiapp.R;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.mine.c;
import com.yuanqi.master.tools.o0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/yuanqi/master/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "showLoginTips", "", d.X, "Landroid/content/Context;", "tipType", "", "showVipTips", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BaseViewModel extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14425a = 0;

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Context context = this.$context;
            Intent intent = new Intent(this.$context, (Class<?>) MineActivity.class);
            intent.putExtra("register", 1);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Context context = this.$context;
            Intent intent = new Intent(this.$context, (Class<?>) MineActivity.class);
            if (com.yuanqi.master.mine.account.a.f14786a.c()) {
                intent.putExtra("screen", c.f14825g);
            } else {
                intent.putExtra("register", 1);
            }
            context.startActivity(intent);
        }
    }

    public final void a(@l Context context, int i5) {
        String str;
        l0.p(context, "context");
        if (i5 != 1) {
            if (i5 != 2) {
                str = "注册登录后添加应用，注册赠送24小时会员";
            } else {
                str = "登陆后打开应用，注册送24小时会员";
            }
        } else {
            str = "注册送24小时会员。";
        }
        String str2 = str;
        o0 o0Var = o0.f15213a;
        String string = context.getString(R.string.warn_tip);
        l0.o(string, "getString(...)");
        String string2 = context.getString(R.string.cancel_msg);
        l0.o(string2, "getString(...)");
        o0.Y(o0Var, context, string, str2, string2, "去注册", false, false, false, false, null, null, null, new a(context), 4064, null);
    }

    public final void b(@l Context context, int i5) {
        String string;
        l0.p(context, "context");
        if (i5 != 1) {
            if (i5 != 2) {
                string = context.getString(R.string.activate_vip_tip_1);
            } else {
                string = context.getString(R.string.activate_vip_tip_2);
            }
        } else {
            string = context.getString(R.string.activate_vip_tip_1);
        }
        String str = string;
        l0.m(str);
        o0 o0Var = o0.f15213a;
        String string2 = context.getString(R.string.warn_tip);
        l0.o(string2, "getString(...)");
        String string3 = context.getString(R.string.cancel_msg);
        l0.o(string3, "getString(...)");
        o0.Y(o0Var, context, string2, str, string3, "去开通", false, false, false, false, null, null, null, new b(context), 4064, null);
    }
}
