.class public abstract Lkotlinx/coroutines/scheduling/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008 \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000b8\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/k;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "",
        "a",
        "J",
        "submissionTime",
        "Lkotlinx/coroutines/scheduling/l;",
        "b",
        "Lkotlinx/coroutines/scheduling/l;",
        "taskContext",
        "",
        "c",
        "()I",
        "mode",
        "<init>",
        "(JLkotlinx/coroutines/scheduling/l;)V",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:J
    .annotation build Lu3/e;
    .end annotation
.end field

.field public b:Lkotlinx/coroutines/scheduling/l;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 4
    sget-object v2, Lkotlinx/coroutines/scheduling/o;->i:Lkotlinx/coroutines/scheduling/l;

    invoke-direct {p0, v0, v1, v2}, Lkotlinx/coroutines/scheduling/k;-><init>(JLkotlinx/coroutines/scheduling/l;)V

    return-void
.end method

.method public constructor <init>(JLkotlinx/coroutines/scheduling/l;)V
    .locals 0
    .param p3    # Lkotlinx/coroutines/scheduling/l;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lkotlinx/coroutines/scheduling/k;->a:J

    .line 3
    iput-object p3, p0, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/l;->i0()I

    move-result v0

    return v0
.end method
