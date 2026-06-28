.class public abstract Lkotlinx/coroutines/x1;
.super Lkotlinx/coroutines/n0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/x1$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\u0008\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlinx/coroutines/x1;",
        "Lkotlinx/coroutines/n0;",
        "Ljava/io/Closeable;",
        "Lkotlin/r2;",
        "close",
        "Ljava/util/concurrent/Executor;",
        "C0",
        "()Ljava/util/concurrent/Executor;",
        "executor",
        "<init>",
        "()V",
        "a",
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
.field public static final a:Lkotlinx/coroutines/x1$a;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/x1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/x1$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lkotlinx/coroutines/x1;->a:Lkotlinx/coroutines/x1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract C0()Ljava/util/concurrent/Executor;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract close()V
.end method
