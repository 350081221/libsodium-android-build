package retrofit2;

import java.lang.reflect.Method;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.z;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "", "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
@h(name = "KotlinExtensions")
/* loaded from: classes4.dex */
public final class KotlinExtensions {
    @m
    public static final <T> Object await(@l Call<T> call, @l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final q qVar = new q(e5, 1);
        qVar.g(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@l Call<T> call2, @l Throwable t5) {
                l0.q(call2, "call");
                l0.q(t5, "t");
                p pVar = p.this;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(e1.a(t5)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@l Call<T> call2, @l Response<T> response) {
                l0.q(call2, "call");
                l0.q(response, "response");
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        Object tag = call2.request().tag(Invocation.class);
                        if (tag == null) {
                            l0.L();
                        }
                        l0.h(tag, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) tag).method();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        l0.h(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        l0.h(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append(external.org.apache.commons.lang3.d.f15957a);
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        z zVar = new z(sb.toString());
                        p pVar = p.this;
                        d1.a aVar = d1.Companion;
                        pVar.resumeWith(d1.m6444constructorimpl(e1.a(zVar)));
                        return;
                    }
                    p pVar2 = p.this;
                    d1.a aVar2 = d1.Companion;
                    pVar2.resumeWith(d1.m6444constructorimpl(body));
                    return;
                }
                p pVar3 = p.this;
                HttpException httpException = new HttpException(response);
                d1.a aVar3 = d1.Companion;
                pVar3.resumeWith(d1.m6444constructorimpl(e1.a(httpException)));
            }
        });
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    @h(name = "awaitNullable")
    @m
    public static final <T> Object awaitNullable(@l Call<T> call, @l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final q qVar = new q(e5, 1);
        qVar.g(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@l Call<T> call2, @l Throwable t5) {
                l0.q(call2, "call");
                l0.q(t5, "t");
                p pVar = p.this;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(e1.a(t5)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@l Call<T> call2, @l Response<T> response) {
                l0.q(call2, "call");
                l0.q(response, "response");
                if (response.isSuccessful()) {
                    p pVar = p.this;
                    T body = response.body();
                    d1.a aVar = d1.Companion;
                    pVar.resumeWith(d1.m6444constructorimpl(body));
                    return;
                }
                p pVar2 = p.this;
                HttpException httpException = new HttpException(response);
                d1.a aVar2 = d1.Companion;
                pVar2.resumeWith(d1.m6444constructorimpl(e1.a(httpException)));
            }
        });
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    @m
    public static final <T> Object awaitResponse(@l Call<T> call, @l kotlin.coroutines.d<? super Response<T>> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final q qVar = new q(e5, 1);
        qVar.g(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@l Call<T> call2, @l Throwable t5) {
                l0.q(call2, "call");
                l0.q(t5, "t");
                p pVar = p.this;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(e1.a(t5)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@l Call<T> call2, @l Response<T> response) {
                l0.q(call2, "call");
                l0.q(response, "response");
                p pVar = p.this;
                d1.a aVar = d1.Companion;
                pVar.resumeWith(d1.m6444constructorimpl(response));
            }
        });
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    public static final /* synthetic */ <T> T create(@l Retrofit create) {
        l0.q(create, "$this$create");
        l0.y(4, "T");
        return (T) create.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(@p4.l final java.lang.Exception r4, @p4.l kotlin.coroutines.d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.e1.n(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.n0 r5 = kotlinx.coroutines.k1.a()
            kotlin.coroutines.g r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.l()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, kotlin.coroutines.d):java.lang.Object");
    }
}
