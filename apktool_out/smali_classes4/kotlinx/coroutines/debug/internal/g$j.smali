.class final Lkotlinx/coroutines/debug/internal/g$j;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/debug/internal/g;->M()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/r2;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/debug/internal/g$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/debug/internal/g$j;

    invoke-direct {v0}, Lkotlinx/coroutines/debug/internal/g$j;-><init>()V

    sput-object v0, Lkotlinx/coroutines/debug/internal/g$j;->INSTANCE:Lkotlinx/coroutines/debug/internal/g$j;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/debug/internal/g$j;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    invoke-static {}, Lkotlinx/coroutines/debug/internal/g;->a()Lkotlinx/coroutines/debug/internal/b;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/coroutines/debug/internal/b;->i()V

    return-void
.end method
