.class public final Lcom/yuanqi/master/mine/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LoadingDialog",
        "",
        "mineViewModel",
        "Lcom/yuanqi/master/mine/MineViewModel;",
        "(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;I)V",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .param p0    # Lcom/yuanqi/master/mine/MineViewModel;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const-string v0, "mineViewModel"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x27e78e12

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    const-string v2, "com.yuanqi.master.mine.LoadingDialog (MineActivity.kt:78)"

    .line 21
    .line 22
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v1, Lcom/yuanqi/master/mine/a$a;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/yuanqi/master/mine/a$a;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    new-instance v0, Lcom/yuanqi/master/mine/a$b;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/yuanqi/master/mine/a$b;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 34
    .line 35
    .line 36
    const v3, 0x3177459b

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-static {p1, v3, v4, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/16 v5, 0x180

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    move-object v4, p1

    .line 48
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lv3/a;Landroidx/compose/ui/window/DialogProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance v0, Lcom/yuanqi/master/mine/a$c;

    .line 68
    .line 69
    invoke-direct {v0, p0, p2}, Lcom/yuanqi/master/mine/a$c;-><init>(Lcom/yuanqi/master/mine/MineViewModel;I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
