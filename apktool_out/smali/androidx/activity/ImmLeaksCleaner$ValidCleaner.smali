.class public final Landroidx/activity/ImmLeaksCleaner$ValidCleaner;
.super Landroidx/activity/ImmLeaksCleaner$Cleaner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/ImmLeaksCleaner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ValidCleaner"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000c\u0010\u0010\u001a\u00020\u0011*\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0008*\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u0004\u0018\u00010\r*\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/activity/ImmLeaksCleaner$ValidCleaner;",
        "Landroidx/activity/ImmLeaksCleaner$Cleaner;",
        "hField",
        "Ljava/lang/reflect/Field;",
        "servedViewField",
        "nextServedViewField",
        "(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V",
        "lock",
        "",
        "Landroid/view/inputmethod/InputMethodManager;",
        "getLock",
        "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;",
        "servedView",
        "Landroid/view/View;",
        "getServedView",
        "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;",
        "clearNextServedView",
        "",
        "activity_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final hField:Ljava/lang/reflect/Field;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final nextServedViewField:Ljava/lang/reflect/Field;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final servedViewField:Ljava/lang/reflect/Field;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 1
    .param p1    # Ljava/lang/reflect/Field;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/reflect/Field;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/reflect/Field;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "hField"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "servedViewField"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nextServedViewField"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, Landroidx/activity/ImmLeaksCleaner$Cleaner;-><init>(Lkotlin/jvm/internal/w;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/activity/ImmLeaksCleaner$ValidCleaner;->hField:Ljava/lang/reflect/Field;

    .line 21
    .line 22
    iput-object p2, p0, Landroidx/activity/ImmLeaksCleaner$ValidCleaner;->servedViewField:Ljava/lang/reflect/Field;

    .line 23
    .line 24
    iput-object p3, p0, Landroidx/activity/ImmLeaksCleaner$ValidCleaner;->nextServedViewField:Ljava/lang/reflect/Field;

    .line 25
    .line 26
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
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


# virtual methods
.method public clearNextServedView(Landroid/view/inputmethod/InputMethodManager;)Z
    .locals 2
    .param p1    # Landroid/view/inputmethod/InputMethodManager;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Landroidx/activity/ImmLeaksCleaner$ValidCleaner;->nextServedViewField:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    return p1
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

.method public getLock(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroid/view/inputmethod/InputMethodManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Landroidx/activity/ImmLeaksCleaner$ValidCleaner;->hField:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    return-object p1
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

.method public getServedView(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;
    .locals 2
    .param p1    # Landroid/view/inputmethod/InputMethodManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    iget-object v1, p0, Landroidx/activity/ImmLeaksCleaner$ValidCleaner;->servedViewField:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    :catch_0
    return-object v0
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
