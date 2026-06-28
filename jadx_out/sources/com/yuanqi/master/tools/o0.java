package com.yuanqi.master.tools;

import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.al.open.SplitEditTextView;
import com.yqtech.multiapp.R;
import com.yqtech.multiapp.databinding.DialogBackupListBinding;
import com.yqtech.multiapp.databinding.DialogBaseScrollTipBinding;
import com.yqtech.multiapp.databinding.DialogBaseTipBinding;
import com.yqtech.multiapp.databinding.DialogClearCacheBinding;
import com.yqtech.multiapp.databinding.DialogDeleteBinding;
import com.yqtech.multiapp.databinding.DialogProgressBinding;
import com.yqtech.multiapp.databinding.DialogSetNoteBinding;
import com.yqtech.multiapp.databinding.DialogSetPwdBinding;
import com.yqtech.multiapp.databinding.DialogUserListBinding;
import com.yuanqi.master.config.a;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.network.model.response.UserInfo;
import com.yuanqi.master.start.TextActivity;
import com.yuanqi.master.tools.dialog.b;
import com.yuanqi.master.tools.o0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l1;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0017J\u001c\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ0\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\u009e\u0001\u0010!\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020\u001d2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJE\u0010-\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001d2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001d2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u000f0\u0017J.\u00102\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\u001c\u00103\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ.\u00104\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\u0016\u00106\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u0002072\u0006\u0010\u001c\u001a\u00020\u001dJB\u00108\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u001d2\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00172\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u0017JZ\u0010;\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ0\u0010<\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020=0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u000f0\u0017J6\u0010?\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001d2\b\b\u0002\u0010C\u001a\u00020&2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\u000e\u0010D\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006E"}, d2 = {"Lcom/yuanqi/master/tools/DialogUtil;", "", "()V", "progressDialog", "Landroid/app/Dialog;", "<set-?>", "", "vipEnd", "getVipEnd", "()I", "setVipEnd", "(I)V", "vipEnd$delegate", "Lcom/yuanqi/master/tools/MVFast;", "dismissProgress", "", "showBackupDialog", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "userList", "", "Ljava/io/File;", "onItemClickCallBack", "Lkotlin/Function1;", "showClearCacheDialog", "action", "Lkotlin/Function0;", "showDeleteDialog", "msg", "", "view", "Landroid/view/View;", "agreeCallBack", "showDialog", com.alipay.sdk.m.x.d.f3030v, "cancelMsg", "confirmMsg", "warnIconGone", "", "btnRefuseGone", "closeIconGone", "cancelable", "closeCallback", "disagreeCallback", "dismissCallback", "showEditDialog", "editMsg", "Lkotlin/ParameterName;", "name", "content", "showLogoutDialog", "showPrivateDialog", "showPrivateForRegisterDialog", "onDismissCallback", "showProgress", "Landroid/app/Activity;", "showPwdDialog", "pwdTipMsg", "showCallback", "showUpdateDialog", "showUserInfoDialog", "Lcom/yuanqi/master/network/model/response/UserInfo;", "", "showVerifyPwdDialog", "scope", "Lkotlinx/coroutines/CoroutineScope;", "pwd", "isEdit", "showVipEndDialog", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: c */
    @p4.m
    private static Dialog f15215c;

    /* renamed from: b */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f15214b = {l1.k(new kotlin.jvm.internal.x0(o0.class, "vipEnd", "getVipEnd()I", 0))};

    /* renamed from: a */
    @p4.l
    public static final o0 f15213a = new o0();

    /* renamed from: d */
    @p4.l
    private static final x0 f15216d = new x0(com.yuanqi.master.config.c.K, 0);

    /* renamed from: e */
    public static final int f15217e = 8;

    @kotlin.i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showBackupDialog$mAdapter$1$1", "Lcom/yuanqi/master/tools/OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements z0 {

        /* renamed from: a */
        final /* synthetic */ v3.l<File, r2> f15218a;

        /* renamed from: b */
        final /* synthetic */ List<File> f15219b;

        /* renamed from: c */
        final /* synthetic */ com.yuanqi.master.tools.dialog.b f15220c;

        /* JADX WARN: Multi-variable type inference failed */
        a(v3.l<? super File, r2> lVar, List<? extends File> list, com.yuanqi.master.tools.dialog.b bVar) {
            this.f15218a = lVar;
            this.f15219b = list;
            this.f15220c = bVar;
        }

        @Override // com.yuanqi.master.tools.z0
        public void a(@p4.m View view, int i5) {
            this.f15218a.invoke(this.f15219b.get(i5));
            this.f15220c.dismiss();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showClearCacheDialog$dialogBinding$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ v3.a<r2> f15221a;

        /* renamed from: b */
        final /* synthetic */ DialogClearCacheBinding f15222b;

        /* renamed from: c */
        final /* synthetic */ Dialog f15223c;

        b(v3.a<r2> aVar, DialogClearCacheBinding dialogClearCacheBinding, Dialog dialog) {
            this.f15221a = aVar;
            this.f15222b = dialogClearCacheBinding;
            this.f15223c = dialog;
        }

        public static final void b(Dialog dialog) {
            kotlin.jvm.internal.l0.p(dialog, "$dialog");
            dialog.dismiss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
            this.f15222b.clearSuccess.setVisibility(0);
            TextView textView = this.f15222b.clearSuccess;
            final Dialog dialog = this.f15223c;
            textView.postDelayed(new Runnable() { // from class: com.yuanqi.master.tools.p0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.b.b(dialog);
                }
            }, 1000L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@p4.l Animator animation) {
            kotlin.jvm.internal.l0.p(animation, "animation");
            this.f15221a.invoke();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showPrivateDialog$privacyPolicySpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f15224a;

        c(Context context) {
            this.f15224a = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@p4.l View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            Context context = this.f15224a;
            Intent intent = new Intent(this.f15224a, (Class<?>) TextActivity.class);
            intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.f15224a.getString(R.string.privacy));
            intent.putExtra("content", com.yuanqi.master.config.d.f14560d);
            context.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@p4.l TextPaint ds) {
            kotlin.jvm.internal.l0.p(ds, "ds");
            ds.setUnderlineText(true);
            ds.setColor(this.f15224a.getResources().getColor(R.color.button_blue));
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showPrivateDialog$termsOfUseSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f15225a;

        d(Context context) {
            this.f15225a = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@p4.l View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            Context context = this.f15225a;
            Intent intent = new Intent(this.f15225a, (Class<?>) TextActivity.class);
            intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.f15225a.getString(R.string.term));
            intent.putExtra("content", com.yuanqi.master.config.d.f14559c);
            context.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@p4.l TextPaint ds) {
            kotlin.jvm.internal.l0.p(ds, "ds");
            ds.setUnderlineText(true);
            ds.setColor(this.f15225a.getResources().getColor(R.color.button_blue));
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showPrivateForRegisterDialog$privacyPolicySpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f15226a;

        e(Context context) {
            this.f15226a = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@p4.l View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            Context context = this.f15226a;
            Intent intent = new Intent(this.f15226a, (Class<?>) TextActivity.class);
            intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.f15226a.getString(R.string.privacy));
            intent.putExtra("content", com.yuanqi.master.config.d.f14560d);
            context.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@p4.l TextPaint ds) {
            kotlin.jvm.internal.l0.p(ds, "ds");
            ds.setUnderlineText(true);
            ds.setColor(this.f15226a.getResources().getColor(R.color.button_blue));
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showPrivateForRegisterDialog$termsOfUseSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f15227a;

        f(Context context) {
            this.f15227a = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@p4.l View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            Context context = this.f15227a;
            Intent intent = new Intent(this.f15227a, (Class<?>) TextActivity.class);
            intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.f15227a.getString(R.string.term));
            intent.putExtra("content", com.yuanqi.master.config.d.f14559c);
            context.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@p4.l TextPaint ds) {
            kotlin.jvm.internal.l0.p(ds, "ds");
            ds.setUnderlineText(true);
            ds.setColor(this.f15227a.getResources().getColor(R.color.button_blue));
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showPwdDialog$1$1", "Lcom/al/open/OnInputListener;", "onInputChanged", "", "text", "", "onInputFinished", "content", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends com.al.open.b {

        /* renamed from: a */
        final /* synthetic */ k1.h<String> f15228a;

        g(k1.h<String> hVar) {
            this.f15228a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.al.open.b
        public void a(@p4.l String text) {
            kotlin.jvm.internal.l0.p(text, "text");
            this.f15228a.element = text;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.al.open.b
        public void b(@p4.l String content) {
            kotlin.jvm.internal.l0.p(content, "content");
            this.f15228a.element = content;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showUpdateDialog$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f15229a;

        h(Context context) {
            this.f15229a = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@p4.l View widget) {
            kotlin.jvm.internal.l0.p(widget, "widget");
            v0.f15260a.c(this.f15229a, "YuanQi23");
            String string = this.f15229a.getString(R.string.copy_suceess);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@p4.l TextPaint ds) {
            kotlin.jvm.internal.l0.p(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(this.f15229a.getColor(R.color.button_blue));
            ds.setUnderlineText(false);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showUserInfoDialog$mAdapter$1$1", "Lcom/yuanqi/master/tools/OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i implements z0 {

        /* renamed from: a */
        final /* synthetic */ v3.l<Long, r2> f15230a;

        /* renamed from: b */
        final /* synthetic */ List<UserInfo> f15231b;

        /* renamed from: c */
        final /* synthetic */ com.yuanqi.master.tools.dialog.b f15232c;

        /* JADX WARN: Multi-variable type inference failed */
        i(v3.l<? super Long, r2> lVar, List<UserInfo> list, com.yuanqi.master.tools.dialog.b bVar) {
            this.f15230a = lVar;
            this.f15231b = list;
            this.f15232c = bVar;
        }

        @Override // com.yuanqi.master.tools.z0
        public void a(@p4.m View view, int i5) {
            this.f15230a.invoke(Long.valueOf(this.f15231b.get(i5).getUserId()));
            this.f15232c.dismiss();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/yuanqi/master/tools/DialogUtil$showVerifyPwdDialog$1$1", "Lcom/al/open/OnInputListener;", "onInputChanged", "", "text", "", "onInputFinished", "content", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j extends com.al.open.b {

        /* renamed from: a */
        final /* synthetic */ k1.h<String> f15233a;

        j(k1.h<String> hVar) {
            this.f15233a = hVar;
        }

        @Override // com.al.open.b
        public void a(@p4.m String str) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.al.open.b
        public void b(@p4.l String content) {
            kotlin.jvm.internal.l0.p(content, "content");
            this.f15233a.element = content;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.tools.DialogUtil$showVerifyPwdDialog$2$1", f = "DialogUtil.kt", i = {}, l = {798}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ DialogSetPwdBinding $dialogBinding;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, DialogSetPwdBinding dialogSetPwdBinding, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$dialogBinding = dialogSetPwdBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new k(this.$context, this.$dialogBinding, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    kotlin.e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.e1.n(obj);
                this.label = 1;
                if (kotlinx.coroutines.d1.b(500L, this) == l5) {
                    return l5;
                }
            }
            Object systemService = this.$context.getSystemService("input_method");
            kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.$dialogBinding.setPwdText, 0);
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        public static final l INSTANCE = new l();

        l() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            o0.f15213a.M(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            o0.f15213a.M(1);
            Intent intent = new Intent(this.$context, (Class<?>) MineActivity.class);
            intent.putExtra("screen", com.yuanqi.master.mine.c.f14825g);
            this.$context.startActivity(intent);
        }
    }

    private o0() {
    }

    public static final void A0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void B0(v3.l agreeCallBack, k1.h pwd, com.yuanqi.master.tools.dialog.b bVar, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        kotlin.jvm.internal.l0.p(pwd, "$pwd");
        agreeCallBack.invoke(pwd.element);
        bVar.dismiss();
    }

    public static final void C0(v3.l lVar, DialogSetPwdBinding dialogBinding, DialogInterface dialogInterface) {
        kotlin.jvm.internal.l0.p(dialogBinding, "$dialogBinding");
        if (lVar != null) {
            SplitEditTextView setPwdText = dialogBinding.setPwdText;
            kotlin.jvm.internal.l0.o(setPwdText, "setPwdText");
            lVar.invoke(setPwdText);
        }
    }

    public static final void F0(v3.a aVar, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void G0(Context context, View view) {
        kotlin.jvm.internal.l0.p(context, "$context");
        v0.f15260a.c(context, "YuanQi23");
        String string = context.getString(R.string.copy_suceess);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        f1.r(string, 0, 2, null);
    }

    public static final void H0(com.yuanqi.master.tools.dialog.b bVar, v3.a aVar, View view) {
        bVar.dismiss();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void I0(com.yuanqi.master.tools.dialog.b bVar, v3.a aVar, View view) {
        bVar.dismiss();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void J0(com.yuanqi.master.tools.dialog.b bVar, v3.a agreeCallBack, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        bVar.dismiss();
        agreeCallBack.invoke();
    }

    private final int L() {
        return ((Number) f15216d.getValue(this, f15214b[0])).intValue();
    }

    public static final void L0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public final void M(int i5) {
        f15216d.setValue(this, f15214b[0], Integer.valueOf(i5));
    }

    public static /* synthetic */ void N0(o0 o0Var, Context context, kotlinx.coroutines.s0 s0Var, String str, boolean z4, v3.a aVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        o0Var.M0(context, s0Var, str, z4, aVar);
    }

    public static final void O(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void O0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        f15213a.K();
        bVar.dismiss();
    }

    public static final void P0(k1.h inputPwd, String pwd, com.yuanqi.master.tools.dialog.b bVar, v3.a action, View view) {
        kotlin.jvm.internal.l0.p(inputPwd, "$inputPwd");
        kotlin.jvm.internal.l0.p(pwd, "$pwd");
        kotlin.jvm.internal.l0.p(action, "$action");
        if (kotlin.jvm.internal.l0.g(inputPwd.element, pwd)) {
            bVar.dismiss();
            action.invoke();
        } else {
            f1.r("密码错误", 0, 2, null);
        }
    }

    public static final void Q0(kotlinx.coroutines.s0 scope, Context context, DialogSetPwdBinding dialogBinding, DialogInterface dialogInterface) {
        kotlin.jvm.internal.l0.p(scope, "$scope");
        kotlin.jvm.internal.l0.p(context, "$context");
        kotlin.jvm.internal.l0.p(dialogBinding, "$dialogBinding");
        kotlinx.coroutines.k.f(scope, kotlinx.coroutines.k1.c(), null, new k(context, dialogBinding, null), 2, null);
    }

    public static /* synthetic */ void R(o0 o0Var, Context context, String str, View view, v3.a aVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            view = null;
        }
        o0Var.Q(context, str, view, aVar);
    }

    public static final void S(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void T(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void U(com.yuanqi.master.tools.dialog.b bVar, v3.a agreeCallBack, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        bVar.dismiss();
        agreeCallBack.invoke();
    }

    public static final void V(View view, DialogInterface dialogInterface) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.linear)) != null) {
            findViewById.setBackgroundResource(R.drawable.item_launcher_white_bg);
        }
    }

    public static final void W(View view, DialogInterface dialogInterface) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.linear)) != null) {
            findViewById.setBackgroundResource(R.drawable.item_launcher_bg);
        }
    }

    public static /* synthetic */ void Y(o0 o0Var, Context context, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, v3.a aVar, v3.a aVar2, v3.a aVar3, v3.a aVar4, int i5, Object obj) {
        o0Var.X(context, str, str2, (i5 & 8) != 0 ? "拒绝" : str3, (i5 & 16) != 0 ? "同意" : str4, (i5 & 32) != 0 ? true : z4, (i5 & 64) != 0 ? false : z5, (i5 & 128) != 0 ? false : z6, (i5 & 256) != 0 ? true : z7, (i5 & 512) != 0 ? null : aVar, (i5 & 1024) != 0 ? null : aVar2, (i5 & 2048) != 0 ? null : aVar3, aVar4);
    }

    public static final void Z(com.yuanqi.master.tools.dialog.b bVar, v3.a aVar, View view) {
        bVar.dismiss();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void a0(com.yuanqi.master.tools.dialog.b bVar, v3.a aVar, View view) {
        bVar.dismiss();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void b0(com.yuanqi.master.tools.dialog.b bVar, v3.a agreeCallBack, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        bVar.dismiss();
        agreeCallBack.invoke();
    }

    public static final void c0(v3.a aVar, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static /* synthetic */ void e0(o0 o0Var, Context context, String str, String str2, v3.l lVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = "";
        }
        o0Var.d0(context, str, str2, lVar);
    }

    public static final void f0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void g0(v3.l agreeCallBack, DialogSetNoteBinding this_apply, com.yuanqi.master.tools.dialog.b bVar, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        kotlin.jvm.internal.l0.p(this_apply, "$this_apply");
        agreeCallBack.invoke(this_apply.etNote.getText().toString());
        bVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i0(o0 o0Var, Context context, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        o0Var.h0(context, aVar, aVar2);
    }

    public static final void j0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void k0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void l0(com.yuanqi.master.tools.dialog.b bVar, v3.a agreeCallBack, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        bVar.dismiss();
        agreeCallBack.invoke();
    }

    public static final void m0(v3.a aVar, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void o0(Context context, View view) {
        kotlin.jvm.internal.l0.p(context, "$context");
        q0.f15237a.a().q(context);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final void p0(Context context, View view) {
        kotlin.jvm.internal.l0.p(context, "$context");
        q0.f15237a.a().q(context);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final void q0(com.yuanqi.master.tools.dialog.b bVar, v3.a agreeCallBack, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        bVar.dismiss();
        agreeCallBack.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s0(o0 o0Var, Context context, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        o0Var.r0(context, aVar, aVar2);
    }

    public static final void t0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void u0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    public static final void v0(com.yuanqi.master.tools.dialog.b bVar, v3.a agreeCallBack, View view) {
        kotlin.jvm.internal.l0.p(agreeCallBack, "$agreeCallBack");
        bVar.dismiss();
        agreeCallBack.invoke();
    }

    public static final void w0(v3.a aVar, DialogInterface dialogInterface) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z0(o0 o0Var, Context context, String str, v3.l lVar, v3.l lVar2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        o0Var.y0(context, str, lVar, lVar2);
    }

    public final void D0(@p4.l final Context context, @p4.l String msg, @p4.m final v3.a<r2> aVar, @p4.m final v3.a<r2> aVar2, @p4.m final v3.a<r2> aVar3, @p4.l final v3.a<r2> agreeCallBack) {
        int p32;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(msg, "msg");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        DialogBaseTipBinding inflate = DialogBaseTipBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(true).t(c1.f15065a.c(context, 300.0f), -2).b();
        SpannableString spannableString = new SpannableString("如您更新后遇到任何问题请添加官方客服（微信：YuanQi23）进行反馈，感谢您的支持和认可。");
        h hVar = new h(context);
        p32 = kotlin.text.f0.p3("如您更新后遇到任何问题请添加官方客服（微信：YuanQi23）进行反馈，感谢您的支持和认可。", "YuanQi23", 0, false, 6, null);
        spannableString.setSpan(hVar, p32, p32 + 8, 33);
        inflate.ivWarn.setVisibility(8);
        inflate.tvTitle.setText(context.getString(R.string.menu_update_msg));
        inflate.tvContent.setText(msg);
        inflate.tvContent.setTextSize(16.0f);
        inflate.tvContentOther.setVisibility(0);
        inflate.tvContentOther.setText(spannableString);
        inflate.tvContentOther.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.G0(context, view);
            }
        });
        inflate.btnRefuse.setVisibility(4);
        inflate.btnConfirm.setText(context.getString(R.string.i_know));
        inflate.ivClose.setVisibility(0);
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.H0(com.yuanqi.master.tools.dialog.b.this, aVar, view);
            }
        });
        inflate.btnRefuse.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.I0(com.yuanqi.master.tools.dialog.b.this, aVar2, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.J0(com.yuanqi.master.tools.dialog.b.this, agreeCallBack, view);
            }
        });
        b5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yuanqi.master.tools.u
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o0.F0(v3.a.this, dialogInterface);
            }
        });
        b5.show();
    }

    public final void K() {
        try {
            Dialog dialog = f15215c;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void K0(@p4.l Context context, @p4.l List<UserInfo> userList, @p4.l v3.l<? super Long, r2> onItemClickCallBack) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(userList, "userList");
        kotlin.jvm.internal.l0.p(onItemClickCallBack, "onItemClickCallBack");
        DialogUserListBinding inflate = DialogUserListBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(context, 300.0f), -2).b();
        UserNameAdapter userNameAdapter = new UserNameAdapter(userList);
        userNameAdapter.e(new i(onItemClickCallBack, userList, b5));
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.L0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        RecyclerView recyclerView = inflate.rvUser;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        kotlin.jvm.internal.l0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(userNameAdapter);
        b5.show();
    }

    public final void M0(@p4.l final Context context, @p4.l final kotlinx.coroutines.s0 scope, @p4.l final String pwd, boolean z4, @p4.l final v3.a<r2> action) {
        String str;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(scope, "scope");
        kotlin.jvm.internal.l0.p(pwd, "pwd");
        kotlin.jvm.internal.l0.p(action, "action");
        final DialogSetPwdBinding inflate = DialogSetPwdBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(context, 300.0f), -2).b();
        final k1.h hVar = new k1.h();
        hVar.element = "";
        TextView textView = inflate.titleSetPwd;
        if (z4) {
            str = "请输入原密码";
        } else {
            str = "请输入密码";
        }
        textView.setText(str);
        inflate.setPwdText.setFocusableInTouchMode(true);
        inflate.setPwdText.requestFocus();
        inflate.setPwdText.setOnInputListener(new j(hVar));
        inflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.O0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.P0(k1.h.this, pwd, b5, action, view);
            }
        });
        b5.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.yuanqi.master.tools.g
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o0.Q0(kotlinx.coroutines.s0.this, context, inflate, dialogInterface);
            }
        });
        b5.show();
    }

    public final void N(@p4.l Context context, @p4.l List<? extends File> userList, @p4.l v3.l<? super File, r2> onItemClickCallBack) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(userList, "userList");
        kotlin.jvm.internal.l0.p(onItemClickCallBack, "onItemClickCallBack");
        DialogBackupListBinding inflate = DialogBackupListBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(context, 300.0f), -2).b();
        ZipFileAdapter zipFileAdapter = new ZipFileAdapter(userList);
        zipFileAdapter.e(new a(onItemClickCallBack, userList, b5));
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.O(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        RecyclerView recyclerView = inflate.rvFile;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        kotlin.jvm.internal.l0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(zipFileAdapter);
        b5.show();
    }

    public final void P(@p4.l Context context, @p4.l v3.a<r2> action) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(action, "action");
        Dialog dialog = new Dialog(context, R.style.MyDialogTheme2);
        DialogClearCacheBinding inflate = DialogClearCacheBinding.inflate(LayoutInflater.from(context));
        inflate.animationView.setAnimation(R.raw.clear);
        inflate.animationView.i(new b(action, inflate, dialog));
        kotlin.jvm.internal.l0.o(inflate, "apply(...)");
        dialog.setContentView(inflate.getRoot());
        dialog.show();
    }

    public final void Q(@p4.l Context context, @p4.l String msg, @p4.m final View view, @p4.l final v3.a<r2> agreeCallBack) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(msg, "msg");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        DialogDeleteBinding inflate = DialogDeleteBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(true).t(c1.f15065a.c(context, 300.0f), -2).b();
        inflate.deleteMsg.setText(msg);
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o0.S(com.yuanqi.master.tools.dialog.b.this, view2);
            }
        });
        inflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o0.T(com.yuanqi.master.tools.dialog.b.this, view2);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o0.U(com.yuanqi.master.tools.dialog.b.this, agreeCallBack, view2);
            }
        });
        b5.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.yuanqi.master.tools.k
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o0.V(view, dialogInterface);
            }
        });
        b5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yuanqi.master.tools.l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o0.W(view, dialogInterface);
            }
        });
        b5.show();
    }

    public final void R0(@p4.l Context context) {
        String str;
        kotlin.jvm.internal.l0.p(context, "context");
        com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
        if (aVar.c() && !aVar.k()) {
            UserInfoData value = aVar.b().getValue();
            if (value != null) {
                str = value.getVipOvertime();
            } else {
                str = null;
            }
            if (str == null || L() == 1) {
                return;
            }
            Y(this, context, "提示", "您的VIP已到期，是否续费", "我知道了", "去续费", false, false, false, false, null, l.INSTANCE, null, new m(context), 3040, null);
        }
    }

    public final void X(@p4.l Context context, @p4.l String title, @p4.l String msg, @p4.l String cancelMsg, @p4.l String confirmMsg, boolean z4, boolean z5, boolean z6, boolean z7, @p4.m final v3.a<r2> aVar, @p4.m final v3.a<r2> aVar2, @p4.m final v3.a<r2> aVar3, @p4.l final v3.a<r2> agreeCallBack) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(msg, "msg");
        kotlin.jvm.internal.l0.p(cancelMsg, "cancelMsg");
        kotlin.jvm.internal.l0.p(confirmMsg, "confirmMsg");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        DialogBaseTipBinding inflate = DialogBaseTipBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(z7).t(c1.f15065a.c(context, 300.0f), -2).b();
        inflate.ivWarn.setVisibility(z4 ? 8 : 0);
        inflate.tvTitle.setText(title);
        inflate.tvContent.setText(msg);
        inflate.tvContentOther.setMovementMethod(LinkMovementMethod.getInstance());
        inflate.btnRefuse.setText(cancelMsg);
        inflate.btnRefuse.setVisibility(z5 ? 4 : 0);
        inflate.btnConfirm.setText(confirmMsg);
        inflate.ivClose.setVisibility(z6 ? 4 : 0);
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.Z(com.yuanqi.master.tools.dialog.b.this, aVar, view);
            }
        });
        inflate.btnRefuse.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.a0(com.yuanqi.master.tools.dialog.b.this, aVar2, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.b0(com.yuanqi.master.tools.dialog.b.this, agreeCallBack, view);
            }
        });
        b5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yuanqi.master.tools.z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o0.c0(v3.a.this, dialogInterface);
            }
        });
        b5.show();
    }

    public final void d0(@p4.l Context context, @p4.l String title, @p4.m String str, @p4.l final v3.l<? super String, r2> agreeCallBack) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        final DialogSetNoteBinding inflate = DialogSetNoteBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(true).t(c1.f15065a.c(context, 300.0f), -2).b();
        inflate.tvTitle.setText(title);
        inflate.etNote.setText(str);
        inflate.etNote.requestFocus();
        inflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.f0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.g0(v3.l.this, inflate, b5, view);
            }
        });
        b5.show();
    }

    public final void h0(@p4.l Context context, @p4.m final v3.a<r2> aVar, @p4.l final v3.a<r2> agreeCallBack) {
        int p32;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        DialogBaseTipBinding inflate = DialogBaseTipBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(context, 300.0f), -2).b();
        SpannableString spannableString = new SpannableString("请您知悉，由于您主动放弃使用元气多开服务并选择清除元气多开中的个人信息和数据，您提交申请并经确认后，元气多开将立即清除您在元气多开中的个人信息，账户信息，会员权益等且无法恢复；建议您慎重考虑！");
        p32 = kotlin.text.f0.p3(spannableString, "立即清除", 0, false, 6, null);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.holo_red_dark)), p32, p32 + 4, 33);
        inflate.ivWarn.setVisibility(0);
        inflate.tvTitle.setText(context.getString(R.string.cancel_account));
        inflate.tvContent.setText(spannableString);
        inflate.tvContent.setMovementMethod(LinkMovementMethod.getInstance());
        inflate.btnRefuse.setText(context.getString(R.string.cancel_msg));
        inflate.btnConfirm.setText(context.getString(R.string.confirm_log_out));
        inflate.btnConfirm.setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.holo_red_dark)));
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.j0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnRefuse.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.k0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.l0(com.yuanqi.master.tools.dialog.b.this, agreeCallBack, view);
            }
        });
        b5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yuanqi.master.tools.l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o0.m0(v3.a.this, dialogInterface);
            }
        });
        b5.show();
    }

    public final void n0(@p4.l final Context context, @p4.l final v3.a<r2> agreeCallBack) {
        String str;
        String str2;
        String str3;
        int p32;
        int p33;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        DialogBaseScrollTipBinding inflate = DialogBaseScrollTipBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        a.b bVar = com.yuanqi.master.config.a.f14505g;
        if (kotlin.jvm.internal.l0.g(bVar.a().e().getLanguage(), "zh")) {
            str = "在您开始使用之前，请仔细阅读并同意我们的《隐私政策》和《用户协议》。这两份文档将帮助您了解我们收集、使用、存储个人信息（包括设备序列号、MAC地址、Android ID、IDFA、GUID、IMSI、OAID、ICCID、位置信息、网络信息、用户传感器信息、屏幕信息，已安装应用列表）的情况以及您享有的相关权力。\n\n请注意，您必须接受这些条款才能使用我们的应用。";
        } else {
            str = "Before you get started, please read and agree to our Privacy Agreement and Terms of Use. These documents will help you understand how we handle your personal information and your rights and obligations while using the app.\n\nPlease note that you must accept these terms to use our app.";
        }
        SpannableString spannableString = new SpannableString(str);
        c cVar = new c(context);
        d dVar = new d(context);
        if (kotlin.jvm.internal.l0.g(bVar.a().e().getLanguage(), "zh")) {
            str2 = "《隐私政策》";
        } else {
            str2 = "Privacy Agreement";
        }
        String str4 = str2;
        if (kotlin.jvm.internal.l0.g(bVar.a().e().getLanguage(), "zh")) {
            str3 = "《用户协议》";
        } else {
            str3 = "Terms of Use";
        }
        p32 = kotlin.text.f0.p3(spannableString, str4, 0, false, 6, null);
        int length = p32 + str4.length();
        p33 = kotlin.text.f0.p3(spannableString, str3, 0, false, 6, null);
        int length2 = str3.length() + p33;
        spannableString.setSpan(cVar, p32, length, 33);
        spannableString.setSpan(dVar, p33, length2, 33);
        spannableString.setSpan(new StyleSpan(1), p32, length, 33);
        spannableString.setSpan(new UnderlineSpan(), p32, length, 33);
        spannableString.setSpan(new StyleSpan(1), p33, length2, 33);
        spannableString.setSpan(new UnderlineSpan(), p33, length2, 33);
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(context, 300.0f), -2).b();
        inflate.tvTitle.setText("欢迎使用元气多开");
        inflate.tvContent.setText(spannableString);
        inflate.tvContent.setMovementMethod(LinkMovementMethod.getInstance());
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.o0(context, view);
            }
        });
        inflate.btnRefuse.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.p0(context, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.q0(com.yuanqi.master.tools.dialog.b.this, agreeCallBack, view);
            }
        });
        b5.show();
    }

    public final void r0(@p4.l Context context, @p4.m final v3.a<r2> aVar, @p4.l final v3.a<r2> agreeCallBack) {
        int p32;
        int p33;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        DialogBaseTipBinding inflate = DialogBaseTipBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(context, 300.0f), -2).b();
        SpannableString spannableString = new SpannableString("您必须同意我们的《隐私政策》和《用户协议》，才能继续注册。");
        e eVar = new e(context);
        f fVar = new f(context);
        p32 = kotlin.text.f0.p3(spannableString, "《隐私政策》", 0, false, 6, null);
        int i5 = p32 + 6;
        p33 = kotlin.text.f0.p3(spannableString, "《用户协议》", 0, false, 6, null);
        int i6 = p33 + 6;
        spannableString.setSpan(eVar, p32, i5, 33);
        spannableString.setSpan(fVar, p33, i6, 33);
        spannableString.setSpan(new StyleSpan(1), p32, i5, 33);
        spannableString.setSpan(new UnderlineSpan(), p32, i5, 33);
        spannableString.setSpan(new StyleSpan(1), p33, i6, 33);
        spannableString.setSpan(new UnderlineSpan(), p33, i6, 33);
        inflate.tvTitle.setText("温馨提示");
        inflate.tvContent.setText(spannableString);
        inflate.tvContent.setMovementMethod(LinkMovementMethod.getInstance());
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.t0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnRefuse.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.u0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.v0(com.yuanqi.master.tools.dialog.b.this, agreeCallBack, view);
            }
        });
        b5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yuanqi.master.tools.h0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o0.w0(v3.a.this, dialogInterface);
            }
        });
        b5.show();
    }

    public final void x0(@p4.l Activity context, @p4.l String msg) {
        Dialog dialog;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(msg, "msg");
        try {
            DialogProgressBinding inflate = DialogProgressBinding.inflate(LayoutInflater.from(context));
            kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
            if (f15215c == null) {
                Dialog dialog2 = new Dialog(context, R.style.MyDialogTheme);
                f15215c = dialog2;
                kotlin.jvm.internal.l0.m(dialog2);
                dialog2.setContentView(inflate.getRoot());
            }
            inflate.progressTxt.setText(msg);
            if (!context.isFinishing() && !context.isDestroyed() && (dialog = f15215c) != null) {
                dialog.show();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void y0(@p4.l Context context, @p4.l String pwdTipMsg, @p4.m final v3.l<? super View, r2> lVar, @p4.l final v3.l<? super String, r2> agreeCallBack) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(pwdTipMsg, "pwdTipMsg");
        kotlin.jvm.internal.l0.p(agreeCallBack, "agreeCallBack");
        final DialogSetPwdBinding inflate = DialogSetPwdBinding.inflate(LayoutInflater.from(context));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(context).a().k(inflate.getRoot()).i(true).t(c1.f15065a.c(context, 300.0f), -2).b();
        inflate.titleSetPwd.setText("请设置密码");
        inflate.setPwdText.setFocusableInTouchMode(true);
        inflate.setPwdText.requestFocus();
        inflate.setPwdTip.setText(pwdTipMsg);
        final k1.h hVar = new k1.h();
        hVar.element = "";
        inflate.setPwdText.setOnInputListener(new g(hVar));
        inflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.A0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.tools.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.B0(v3.l.this, hVar, b5, view);
            }
        });
        b5.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.yuanqi.master.tools.d0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o0.C0(v3.l.this, inflate, dialogInterface);
            }
        });
        b5.show();
    }
}
