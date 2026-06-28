.class public final Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a=\u0010\u0008\u001a\u00020\u0004*\u00020\u00002\'\u0010\u0007\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001\u00a2\u0006\u0002\u0008\u0006H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\"(\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8GX\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;",
        "Lkotlin/coroutines/d;",
        "",
        "",
        "Lkotlin/u;",
        "block",
        "establishTextInputSession",
        "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;",
        "LocalPlatformTextInputMethodOverride",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "getLocalPlatformTextInputMethodOverride",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "getLocalPlatformTextInputMethodOverride$annotations",
        "()V",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"
    }
.end annotation


# static fields
.field private static final LocalPlatformTextInputMethodOverride:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$LocalPlatformTextInputMethodOverride$1;->INSTANCE:Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$LocalPlatformTextInputMethodOverride$1;

    invoke-static {v0}, Landroidx/compose/runtime/CompositionLocalKt;->staticCompositionLocalOf(Lv3/a;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt;->LocalPlatformTextInputMethodOverride:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method public static final establishTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .param p0    # Landroidx/compose/ui/platform/PlatformTextInputModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "*>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_1
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_5

    .line 62
    .line 63
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNode;->getCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v2, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt;->LocalPlatformTextInputMethodOverride:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 72
    .line 73
    invoke-interface {p2, v2}, Landroidx/compose/runtime/CompositionLocalMap;->get(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;

    .line 78
    .line 79
    if-nez p2, :cond_3

    .line 80
    .line 81
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    :cond_3
    iput v3, v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt$establishTextInputSession$1;->label:I

    .line 86
    .line 87
    invoke-interface {p2, p1, v0}, Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;->textInputSession(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v1, :cond_4

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_4
    :goto_1
    new-instance p0, Lkotlin/y;

    .line 95
    .line 96
    invoke-direct {p0}, Lkotlin/y;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    const-string p1, "establishTextInputSession called from an unattached node"

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public static final getLocalPlatformTextInputMethodOverride()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation build Landroidx/compose/ui/InternalComposeUiApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/platform/PlatformTextInputModifierNodeKt;->LocalPlatformTextInputMethodOverride:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method

.method public static synthetic getLocalPlatformTextInputMethodOverride$annotations()V
    .locals 0
    .annotation build Landroidx/compose/ui/InternalComposeUiApi;
    .end annotation

    return-void
.end method
