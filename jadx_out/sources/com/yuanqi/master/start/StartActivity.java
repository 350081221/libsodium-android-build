package com.yuanqi.master.start;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import com.tendcloud.tenddata.TalkingDataSDK;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.umlink.MobclickLink;
import com.umeng.umlink.UMLinkListener;
import com.yqtech.multiapp.databinding.ActivityStartBinding;
import com.yuanqi.group.App;
import com.yuanqi.group.home.HomeActivity;
import com.yuanqi.master.config.c;
import com.yuanqi.master.tools.o0;
import com.yuanqi.master.tools.w0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.x0;
import kotlin.r2;
import kotlin.reflect.o;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0018\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006)"}, d2 = {"Lcom/yuanqi/master/start/StartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/yqtech/multiapp/databinding/ActivityStartBinding;", "<set-?>", "", "shareCodeKey", "getShareCodeKey", "()Ljava/lang/String;", "setShareCodeKey", "(Ljava/lang/String;)V", "shareCodeKey$delegate", "Lcom/yuanqi/master/tools/MVFast;", "", "showPrivate", "getShowPrivate", "()I", "setShowPrivate", "(I)V", "showPrivate$delegate", "umLinkAdapter", "com/yuanqi/master/start/StartActivity$umLinkAdapter$1", "Lcom/yuanqi/master/start/StartActivity$umLinkAdapter$1;", "bytesToHex", "bytes", "", "initAMap", "", "initDatabase", "initTalkingSDK", "isAppSignatureValid", "", "jumpHomeActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class StartActivity extends AppCompatActivity {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14857e = {l1.k(new x0(StartActivity.class, "shareCodeKey", "getShareCodeKey()Ljava/lang/String;", 0)), l1.k(new x0(StartActivity.class, "showPrivate", "getShowPrivate()I", 0))};

    /* renamed from: f, reason: collision with root package name */
    public static final int f14858f = 8;

    /* renamed from: a, reason: collision with root package name */
    private ActivityStartBinding f14859a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final com.yuanqi.master.tools.x0 f14860b = new com.yuanqi.master.tools.x0(c.f14552v, "");

    /* renamed from: c, reason: collision with root package name */
    @l
    private final com.yuanqi.master.tools.x0 f14861c = new com.yuanqi.master.tools.x0(c.f14553w, 0);

    /* renamed from: d, reason: collision with root package name */
    @l
    private final b f14862d = new b();

    @i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/yuanqi/master/start/StartActivity$onCreate$2$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f14864b;

        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.start.StartActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0426a extends n0 implements v3.a<r2> {
            final /* synthetic */ StartActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "com.yuanqi.master.start.StartActivity$onCreate$2$1$onAnimationEnd$1$1", f = "StartActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.start.StartActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0427a extends kotlin.coroutines.jvm.internal.o implements p<s0, d<? super r2>, Object> {
                int label;
                final /* synthetic */ StartActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0427a(StartActivity startActivity, d<? super C0427a> dVar) {
                    super(2, dVar);
                    this.this$0 = startActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final d<r2> create(@m Object obj, @l d<?> dVar) {
                    return new C0427a(this.this$0, dVar);
                }

                @Override // v3.p
                @m
                public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                    return ((C0427a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        StartActivity startActivity = this.this$0;
                        MobclickLink.getInstallParams(startActivity, startActivity.f14862d);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0426a(StartActivity startActivity) {
                super(0);
                this.this$0 = startActivity;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.N();
                UMConfigure.submitPolicyGrantResult(this.this$0, true);
                this.this$0.L();
                this.this$0.R(1);
                k.f(t0.a(k1.c()), null, null, new C0427a(this.this$0, null), 3, null);
            }
        }

        a(LottieAnimationView lottieAnimationView) {
            this.f14864b = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l Animator animation) {
            l0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l Animator animation) {
            l0.p(animation, "animation");
            if (w0.f15264a.b(c.f14553w)) {
                StartActivity.this.L();
                StartActivity.this.P();
            } else {
                o0 o0Var = o0.f15213a;
                Context context = this.f14864b.getContext();
                l0.o(context, "getContext(...)");
                o0Var.n0(context, new C0426a(StartActivity.this));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l Animator animation) {
            l0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l Animator animation) {
            l0.p(animation, "animation");
        }
    }

    @i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\u000e"}, d2 = {"com/yuanqi/master/start/StartActivity$umLinkAdapter$1", "Lcom/umeng/umlink/UMLinkListener;", "onError", "", com.umeng.analytics.pro.d.U, "", "onInstall", "install_params", "Ljava/util/HashMap;", "uri", "Landroid/net/Uri;", "onLink", ClientCookie.PATH_ATTR, "queryParams", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements UMLinkListener {
        b() {
        }

        private static final void a(StartActivity this$0, DialogInterface dialogInterface, int i5) {
            l0.p(this$0, "this$0");
            this$0.P();
        }

        @Override // com.umeng.umlink.UMLinkListener
        public void onError(@l String error) {
            l0.p(error, "error");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r0 == false) goto L9;
         */
        @Override // com.umeng.umlink.UMLinkListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onInstall(@p4.l java.util.HashMap<java.lang.String, java.lang.String> r5, @p4.l android.net.Uri r6) {
            /*
                r4 = this;
                java.lang.String r0 = "install_params"
                kotlin.jvm.internal.l0.p(r5, r0)
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.l0.p(r6, r0)
                boolean r0 = r5.isEmpty()
                r1 = 1
                r2 = 0
                java.lang.String r3 = "toString(...)"
                if (r0 == 0) goto L26
                java.lang.String r0 = r6.toString()
                kotlin.jvm.internal.l0.o(r0, r3)
                int r0 = r0.length()
                if (r0 != 0) goto L23
                r0 = r1
                goto L24
            L23:
                r0 = r2
            L24:
                if (r0 != 0) goto L3f
            L26:
                r5.isEmpty()
                java.lang.String r5 = r6.toString()
                kotlin.jvm.internal.l0.o(r5, r3)
                int r5 = r5.length()
                if (r5 <= 0) goto L37
                goto L38
            L37:
                r1 = r2
            L38:
                if (r1 == 0) goto L3f
                com.yuanqi.master.start.StartActivity r5 = com.yuanqi.master.start.StartActivity.this
                com.umeng.umlink.MobclickLink.handleUMLinkURI(r5, r6, r4)
            L3f:
                com.yuanqi.master.start.StartActivity r5 = com.yuanqi.master.start.StartActivity.this
                com.yuanqi.master.start.StartActivity.F(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.start.StartActivity.b.onInstall(java.util.HashMap, android.net.Uri):void");
        }

        @Override // com.umeng.umlink.UMLinkListener
        public void onLink(@l String path, @l HashMap<String, String> queryParams) {
            l0.p(path, "path");
            l0.p(queryParams, "queryParams");
            path.length();
            if ((!queryParams.isEmpty()) && queryParams.containsKey(PluginConstants.KEY_ERROR_CODE)) {
                StartActivity startActivity = StartActivity.this;
                String str = queryParams.get(PluginConstants.KEY_ERROR_CODE);
                if (str == null) {
                    str = "";
                }
                startActivity.Q(str);
            }
        }
    }

    private final String I(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b5 : bArr) {
            t1 t1Var = t1.f19457a;
            String format = String.format("%02x:", Arrays.copyOf(new Object[]{Byte.valueOf(b5)}, 1));
            l0.o(format, "format(format, *args)");
            sb.append(format);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "toString(...)");
        return sb2;
    }

    private final String J() {
        return (String) this.f14860b.getValue(this, f14857e[0]);
    }

    private final int K() {
        return ((Number) this.f14861c.getValue(this, f14857e[1])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
    }

    private final void M() {
        com.yuanqi.master.database.a a5 = com.yuanqi.master.database.a.f14574b.a();
        App a6 = App.f13716d.a();
        l0.m(a6);
        a5.f(a6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        TalkingDataSDK.startA(getApplicationContext());
        TalkingDataSDK.setReportUncaughtExceptions(true);
    }

    private final boolean O() {
        PackageInfo packageInfo;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageParserEx.GET_SIGNING_CERTIFICATES);
            } else {
                packageInfo = getPackageManager().getPackageInfo(getPackageName(), 64);
            }
            if (i5 >= 28) {
                signingInfo = packageInfo.signingInfo;
                signatureArr = signingInfo.getApkContentsSigners();
                l0.m(signatureArr);
            } else {
                signatureArr = packageInfo.signatures;
                l0.m(signatureArr);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                byte[] digest = messageDigest.digest();
                l0.o(digest, "digest(...)");
                if (l0.g(I(digest), c.f14523c)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
        } catch (NoSuchAlgorithmException e6) {
            e6.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        this.f14860b.setValue(this, f14857e[0], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int i5) {
        this.f14861c.setValue(this, f14857e[1], Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m Bundle bundle) {
        TraceManager.startActivityTrace(StartActivity.class.getName());
        super.onCreate(bundle);
        MobclickLink.handleUMLinkURI(this, getIntent().getData(), this.f14862d);
        ActivityStartBinding inflate = ActivityStartBinding.inflate(getLayoutInflater());
        l0.o(inflate, "inflate(...)");
        this.f14859a = inflate;
        ActivityStartBinding activityStartBinding = null;
        if (inflate == null) {
            l0.S("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        M();
        ActivityStartBinding activityStartBinding2 = this.f14859a;
        if (activityStartBinding2 == null) {
            l0.S("binding");
            activityStartBinding2 = null;
        }
        LottieAnimationView lottieAnimationView = activityStartBinding2.animationView;
        lottieAnimationView.setImageAssetsFolder("images");
        lottieAnimationView.setAnimation("launch.json");
        lottieAnimationView.G();
        ActivityStartBinding activityStartBinding3 = this.f14859a;
        if (activityStartBinding3 == null) {
            l0.S("binding");
        } else {
            activityStartBinding = activityStartBinding3;
        }
        LottieAnimationView lottieAnimationView2 = activityStartBinding.animationView2;
        lottieAnimationView2.G();
        lottieAnimationView2.i(new a(lottieAnimationView2));
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, @l KeyEvent event) {
        l0.p(event, "event");
        if (i5 != 3 && i5 != 4) {
            return super.onKeyDown(i5, event);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(StartActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(StartActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(StartActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
