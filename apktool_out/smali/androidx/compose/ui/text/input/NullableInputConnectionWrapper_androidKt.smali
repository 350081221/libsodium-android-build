.class public final Landroidx/compose/ui/text/input/NullableInputConnectionWrapper_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroid/view/inputmethod/InputConnection;",
        "delegate",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onConnectionClosed",
        "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;",
        "NullableInputConnectionWrapper",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final NullableInputConnectionWrapper(Landroid/view/inputmethod/InputConnection;Lv3/a;)Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;
    .locals 2
    .param p0    # Landroid/view/inputmethod/InputConnection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/inputmethod/InputConnection;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi25;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi25;-><init>(Landroid/view/inputmethod/InputConnection;Lv3/a;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;-><init>(Landroid/view/inputmethod/InputConnection;Lv3/a;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-object v0
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
