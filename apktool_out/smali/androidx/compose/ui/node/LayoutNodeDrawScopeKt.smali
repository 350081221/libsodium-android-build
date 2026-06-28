.class public final Landroidx/compose/ui/node/LayoutNodeDrawScopeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "nextDrawNode",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,128:1\n74#2:129\n72#2:130\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n114#1:129\n115#1:130\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$nextDrawNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/node/LayoutNodeDrawScopeKt;->nextDrawNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;

    move-result-object p0

    return-object p0
.end method

.method private static final nextDrawNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/2addr v3, v0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    and-int/2addr v3, v1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    and-int/2addr v3, v0

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object v2
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
