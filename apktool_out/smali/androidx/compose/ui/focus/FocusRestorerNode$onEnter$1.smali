.class final Landroidx/compose/ui/focus/FocusRestorerNode$onEnter$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusRestorerNode;-><init>(Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "Landroidx/compose/ui/focus/FocusRequester;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/focus/FocusRequester;",
        "it",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "invoke-3ESFkO8",
        "(I)Landroidx/compose/ui/focus/FocusRequester;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/focus/FocusRestorerNode;


# direct methods
.method constructor <init>(Landroidx/compose/ui/focus/FocusRestorerNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onEnter$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/FocusDirection;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusRestorerNode$onEnter$1;->invoke-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onEnter$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->restoreFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onEnter$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRestorerNode;->getOnRestoreFailed()Lv3/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroidx/compose/ui/focus/FocusRequester;

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    :cond_1
    sget-object p1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_2
    :goto_0
    return-object p1
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
