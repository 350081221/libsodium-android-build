.class public final Lkotlinx/coroutines/a4;
.super Lkotlin/coroutines/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/a4$a;
    }
.end annotation

.annotation build Lkotlin/a1;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00082\u00020\u0001:\u0001\u0003B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\t"
    }
    d2 = {
        "Lkotlinx/coroutines/a4;",
        "Lkotlin/coroutines/a;",
        "",
        "a",
        "Z",
        "dispatcherWasUnconfined",
        "<init>",
        "()V",
        "b",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Lkotlinx/coroutines/a4$a;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field public a:Z
    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/a4$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/a4$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lkotlinx/coroutines/a4;->b:Lkotlinx/coroutines/a4$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lkotlinx/coroutines/a4;->b:Lkotlinx/coroutines/a4$a;

    invoke-direct {p0, v0}, Lkotlin/coroutines/a;-><init>(Lkotlin/coroutines/g$c;)V

    return-void
.end method
