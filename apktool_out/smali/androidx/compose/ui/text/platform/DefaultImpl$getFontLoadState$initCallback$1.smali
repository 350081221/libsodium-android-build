.class public final Landroidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1;
.super Landroidx/emoji2/text/EmojiCompat$InitCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/text/platform/DefaultImpl;->getFontLoadState()Landroidx/compose/runtime/State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1",
        "Landroidx/emoji2/text/EmojiCompat$InitCallback;",
        "Lkotlin/r2;",
        "onInitialized",
        "",
        "throwable",
        "onFailed",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $mutableLoaded:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/ui/text/platform/DefaultImpl;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/platform/DefaultImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/text/platform/DefaultImpl;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1;->$mutableLoaded:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1;->this$0:Landroidx/compose/ui/text/platform/DefaultImpl;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/emoji2/text/EmojiCompat$InitCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method


# virtual methods
.method public onFailed(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1;->this$0:Landroidx/compose/ui/text/platform/DefaultImpl;

    invoke-static {}, Landroidx/compose/ui/text/platform/EmojiCompatStatus_androidKt;->access$getFalsey$p()Landroidx/compose/ui/text/platform/ImmutableBool;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/ui/text/platform/DefaultImpl;->access$setLoadState$p(Landroidx/compose/ui/text/platform/DefaultImpl;Landroidx/compose/runtime/State;)V

    return-void
.end method

.method public onInitialized()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1;->$mutableLoaded:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/ui/text/platform/DefaultImpl$getFontLoadState$initCallback$1;->this$0:Landroidx/compose/ui/text/platform/DefaultImpl;

    .line 9
    .line 10
    new-instance v1, Landroidx/compose/ui/text/platform/ImmutableBool;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, v2}, Landroidx/compose/ui/text/platform/ImmutableBool;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Landroidx/compose/ui/text/platform/DefaultImpl;->access$setLoadState$p(Landroidx/compose/ui/text/platform/DefaultImpl;Landroidx/compose/runtime/State;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
