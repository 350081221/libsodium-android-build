.class public interface abstract Landroidx/compose/runtime/CompositionTracer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/InternalComposeTracingApi;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\n\u001a\u00020\u0008H&J\u0008\u0010\u000c\u001a\u00020\u000bH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/CompositionTracer;",
        "",
        "",
        "key",
        "dirty1",
        "dirty2",
        "",
        "info",
        "Lkotlin/r2;",
        "traceEventStart",
        "traceEventEnd",
        "",
        "isTraceInProgress",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract isTraceInProgress()Z
.end method

.method public abstract traceEventEnd()V
.end method

.method public abstract traceEventStart(IIILjava/lang/String;)V
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
