.class final Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lv3/a;Landroidx/compose/ui/window/DialogProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "Landroidx/compose/runtime/DisposableEffectScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,466:1\n64#2,5:467\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n186#1:467,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $dialog:Landroidx/compose/ui/window/DialogWrapper;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/DialogWrapper;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1;->$dialog:Landroidx/compose/ui/window/DialogWrapper;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1
    .param p1    # Landroidx/compose/runtime/DisposableEffectScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1;->$dialog:Landroidx/compose/ui/window/DialogWrapper;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 3
    iget-object p1, p0, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1;->$dialog:Landroidx/compose/ui/window/DialogWrapper;

    .line 4
    new-instance v0, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1;

    invoke-direct {v0, p1}, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1;-><init>(Landroidx/compose/ui/window/DialogWrapper;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
