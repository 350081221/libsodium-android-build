.class public final Lkotlinx/coroutines/selects/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/selects/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        "Q:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/selects/i<",
        "TP;TQ;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u00a8\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012U\u0010\u0015\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\t\u0012\u0017\u0012\u0015\u0012\u0002\u0008\u00030\r\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u0011\u0012U\u0010\u0019\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nj\u0002`\u0017\u0012i\u0008\u0002\u0010\u001e\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\u0008\u00030\r\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b\u0018\u00010\nj\u0004\u0018\u0001`\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008Ri\u0010\u0015\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\t\u0012\u0017\u0012\u0015\u0012\u0002\u0008\u00030\r\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0005\u0010\u0014Ri\u0010\u0019\u001aQ\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nj\u0002`\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0014R{\u0010\u001e\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\u0008\u00030\r\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b\u0018\u00010\nj\u0004\u0018\u0001`\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lkotlinx/coroutines/selects/j;",
        "P",
        "Q",
        "Lkotlinx/coroutines/selects/i;",
        "",
        "a",
        "Ljava/lang/Object;",
        "d",
        "()Ljava/lang/Object;",
        "clauseObject",
        "Lkotlin/Function3;",
        "Lkotlin/v0;",
        "name",
        "Lkotlinx/coroutines/selects/m;",
        "select",
        "param",
        "Lkotlin/r2;",
        "Lkotlinx/coroutines/selects/RegistrationFunction;",
        "b",
        "Lv3/q;",
        "()Lv3/q;",
        "regFunc",
        "clauseResult",
        "Lkotlinx/coroutines/selects/ProcessResultFunction;",
        "c",
        "processResFunc",
        "internalResult",
        "Lkotlin/Function1;",
        "",
        "Lkotlinx/coroutines/selects/OnCancellationConstructor;",
        "onCancellationConstructor",
        "<init>",
        "(Ljava/lang/Object;Lv3/q;Lv3/q;Lv3/q;)V",
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
.field private final a:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/lang/Object;",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final c:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final d:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lv3/l<",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lv3/q;Lv3/q;Lv3/q;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/q;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lv3/q<",
            "Ljava/lang/Object;",
            "-",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/q<",
            "-",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "+",
            "Lv3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlinx/coroutines/selects/j;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lkotlinx/coroutines/selects/j;->b:Lv3/q;

    .line 4
    iput-object p3, p0, Lkotlinx/coroutines/selects/j;->c:Lv3/q;

    .line 5
    iput-object p4, p0, Lkotlinx/coroutines/selects/j;->d:Lv3/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lv3/q;Lv3/q;Lv3/q;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/selects/j;-><init>(Ljava/lang/Object;Lv3/q;Lv3/q;Lv3/q;)V

    return-void
.end method


# virtual methods
.method public a()Lv3/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/q<",
            "Ljava/lang/Object;",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/selects/j;->b:Lv3/q;

    return-object v0
.end method

.method public b()Lv3/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/q<",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lv3/l<",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/selects/j;->d:Lv3/q;

    return-object v0
.end method

.method public c()Lv3/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/q<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/selects/j;->c:Lv3/q;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/selects/j;->a:Ljava/lang/Object;

    return-object v0
.end method
