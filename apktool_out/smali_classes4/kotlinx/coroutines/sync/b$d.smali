.class final synthetic Lkotlinx/coroutines/sync/b$d;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/sync/b;->i()Lkotlinx/coroutines/selects/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/q<",
        "Lkotlinx/coroutines/sync/b;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/sync/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/sync/b$d;

    invoke-direct {v0}, Lkotlinx/coroutines/sync/b$d;-><init>()V

    sput-object v0, Lkotlinx/coroutines/sync/b$d;->INSTANCE:Lkotlinx/coroutines/sync/b$d;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const/4 v1, 0x3

    const-class v2, Lkotlinx/coroutines/sync/b;

    const-string v3, "onLockProcessResult"

    const-string v4, "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/sync/b;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/sync/b$d;->invoke(Lkotlinx/coroutines/sync/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/sync/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/sync/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 2
    invoke-virtual {p1, p2, p3}, Lkotlinx/coroutines/sync/b;->A(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
