.class public final Landroidx/activity/compose/BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/compose/BackHandlerKt$BackHandler$2$1;->invoke(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "Lkotlin/r2;",
        "dispose",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2$1\n*L\n1#1,483:1\n106#2,2:484\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $backCallback$inlined:Landroidx/activity/compose/BackHandlerKt$BackHandler$backCallback$1$1;


# direct methods
.method public constructor <init>(Landroidx/activity/compose/BackHandlerKt$BackHandler$backCallback$1$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/compose/BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1;->$backCallback$inlined:Landroidx/activity/compose/BackHandlerKt$BackHandler$backCallback$1$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/compose/BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1;->$backCallback$inlined:Landroidx/activity/compose/BackHandlerKt$BackHandler$backCallback$1$1;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedCallback;->remove()V

    return-void
.end method
