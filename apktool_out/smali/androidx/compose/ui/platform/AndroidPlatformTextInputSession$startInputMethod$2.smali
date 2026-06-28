.class final Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;->startInputMethod(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/ui/platform/InputMethodSession;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "coroutineScope",
        "Landroidx/compose/ui/platform/InputMethodSession;",
        "invoke",
        "(Lkotlinx/coroutines/s0;)Landroidx/compose/ui/platform/InputMethodSession;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $request:Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->$request:Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlinx/coroutines/s0;)Landroidx/compose/ui/platform/InputMethodSession;
    .locals 3
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/ui/platform/InputMethodSession;

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->$request:Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;

    new-instance v2, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2$1;

    invoke-direct {v2, p1}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2$1;-><init>(Lkotlinx/coroutines/s0;)V

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/InputMethodSession;-><init>(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lv3/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/s0;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->invoke(Lkotlinx/coroutines/s0;)Landroidx/compose/ui/platform/InputMethodSession;

    move-result-object p1

    return-object p1
.end method
