.class public final Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004H\u0001\"\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroid/view/View;",
        "view",
        "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;",
        "ComposeInputMethodManager",
        "Lkotlin/Function1;",
        "factory",
        "overrideComposeInputMethodManagerFactoryForTests",
        "ComposeInputMethodManagerFactory",
        "Lv3/l;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static ComposeInputMethodManagerFactory:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroid/view/View;",
            "+",
            "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1;

    sput-object v0, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt;->ComposeInputMethodManagerFactory:Lv3/l;

    return-void
.end method

.method public static final ComposeInputMethodManager(Landroid/view/View;)Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt;->ComposeInputMethodManagerFactory:Lv3/l;

    invoke-interface {v0, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    return-object p0
.end method

.method public static final overrideComposeInputMethodManagerFactoryForTests(Lv3/l;)Lv3/l;
    .locals 1
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroid/view/View;",
            "+",
            "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;",
            ">;)",
            "Lv3/l<",
            "Landroid/view/View;",
            "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lp4/p;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt;->ComposeInputMethodManagerFactory:Lv3/l;

    .line 2
    .line 3
    sput-object p0, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt;->ComposeInputMethodManagerFactory:Lv3/l;

    .line 4
    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
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
.end method
