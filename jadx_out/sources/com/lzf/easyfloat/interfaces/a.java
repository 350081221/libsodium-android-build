package com.lzf.easyfloat.interfaces;

import android.view.MotionEvent;
import android.view.View;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00042\u001b\u0010\u0006\u001a\u0017\u0012\b\u0012\u00060\u0003R\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005R&\u0010\u0006\u001a\u00060\u0003R\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/lzf/easyfloat/interfaces/a;", "", "Lkotlin/Function1;", "Lcom/lzf/easyfloat/interfaces/a$a;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "b", bi.ay, "Lcom/lzf/easyfloat/interfaces/a$a;", "()Lcom/lzf/easyfloat/interfaces/a$a;", "c", "(Lcom/lzf/easyfloat/interfaces/a$a;)V", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public C0174a f9267a;

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J*\u0010\b\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0002J\u001a\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\tJ\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\tJ\u0014\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ \u0010\u0010\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eJ \u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eJ\u001a\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\tR@\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R6\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001d¨\u00066"}, d2 = {"Lcom/lzf/easyfloat/interfaces/a$a;", "", "Lkotlin/Function3;", "", "", "Landroid/view/View;", "Lkotlin/r2;", "action", bi.ay, "Lkotlin/Function1;", bi.aL, "l", "Lkotlin/Function0;", "b", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", bi.aK, "c", "d", "Lv3/q;", "e", "()Lv3/q;", "m", "(Lv3/q;)V", "createdResult", "Lv3/l;", "j", "()Lv3/l;", "r", "(Lv3/l;)V", "show", "i", "q", "hide", "Lv3/a;", "f", "()Lv3/a;", "n", "(Lv3/a;)V", "dismiss", "Lv3/p;", "k", "()Lv3/p;", bi.aE, "(Lv3/p;)V", "touchEvent", socket.g.f22386a, "o", "drag", bi.aJ, bi.aA, "dragEnd", "<init>", "(Lcom/lzf/easyfloat/interfaces/a;)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: com.lzf.easyfloat.interfaces.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0174a {

        /* renamed from: a, reason: collision with root package name */
        @m
        private q<? super Boolean, ? super String, ? super View, r2> f9268a;

        /* renamed from: b, reason: collision with root package name */
        @m
        private l<? super View, r2> f9269b;

        /* renamed from: c, reason: collision with root package name */
        @m
        private l<? super View, r2> f9270c;

        /* renamed from: d, reason: collision with root package name */
        @m
        private v3.a<r2> f9271d;

        /* renamed from: e, reason: collision with root package name */
        @m
        private p<? super View, ? super MotionEvent, r2> f9272e;

        /* renamed from: f, reason: collision with root package name */
        @m
        private p<? super View, ? super MotionEvent, r2> f9273f;

        /* renamed from: g, reason: collision with root package name */
        @m
        private l<? super View, r2> f9274g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f9275h;

        public C0174a(a this$0) {
            l0.p(this$0, "this$0");
            this.f9275h = this$0;
        }

        public final void a(@p4.l q<? super Boolean, ? super String, ? super View, r2> action) {
            l0.p(action, "action");
            this.f9268a = action;
        }

        public final void b(@p4.l v3.a<r2> action) {
            l0.p(action, "action");
            this.f9271d = action;
        }

        public final void c(@p4.l p<? super View, ? super MotionEvent, r2> action) {
            l0.p(action, "action");
            this.f9273f = action;
        }

        public final void d(@p4.l l<? super View, r2> action) {
            l0.p(action, "action");
            this.f9274g = action;
        }

        @m
        public final q<Boolean, String, View, r2> e() {
            return this.f9268a;
        }

        @m
        public final v3.a<r2> f() {
            return this.f9271d;
        }

        @m
        public final p<View, MotionEvent, r2> g() {
            return this.f9273f;
        }

        @m
        public final l<View, r2> h() {
            return this.f9274g;
        }

        @m
        public final l<View, r2> i() {
            return this.f9270c;
        }

        @m
        public final l<View, r2> j() {
            return this.f9269b;
        }

        @m
        public final p<View, MotionEvent, r2> k() {
            return this.f9272e;
        }

        public final void l(@p4.l l<? super View, r2> action) {
            l0.p(action, "action");
            this.f9270c = action;
        }

        public final void m(@m q<? super Boolean, ? super String, ? super View, r2> qVar) {
            this.f9268a = qVar;
        }

        public final void n(@m v3.a<r2> aVar) {
            this.f9271d = aVar;
        }

        public final void o(@m p<? super View, ? super MotionEvent, r2> pVar) {
            this.f9273f = pVar;
        }

        public final void p(@m l<? super View, r2> lVar) {
            this.f9274g = lVar;
        }

        public final void q(@m l<? super View, r2> lVar) {
            this.f9270c = lVar;
        }

        public final void r(@m l<? super View, r2> lVar) {
            this.f9269b = lVar;
        }

        public final void s(@m p<? super View, ? super MotionEvent, r2> pVar) {
            this.f9272e = pVar;
        }

        public final void t(@p4.l l<? super View, r2> action) {
            l0.p(action, "action");
            this.f9269b = action;
        }

        public final void u(@p4.l p<? super View, ? super MotionEvent, r2> action) {
            l0.p(action, "action");
            this.f9272e = action;
        }
    }

    @p4.l
    public final C0174a a() {
        C0174a c0174a = this.f9267a;
        if (c0174a != null) {
            return c0174a;
        }
        l0.S("builder");
        return null;
    }

    public final void b(@p4.l l<? super C0174a, r2> builder) {
        l0.p(builder, "builder");
        C0174a c0174a = new C0174a(this);
        builder.invoke(c0174a);
        c(c0174a);
    }

    public final void c(@p4.l C0174a c0174a) {
        l0.p(c0174a, "<set-?>");
        this.f9267a = c0174a;
    }
}
