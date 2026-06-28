.class public final Landroidx/activity/contextaware/ContextAwareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0006\u001a\u00078\u0000\u00a2\u0006\u0002\u0008\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u001e\u0008\u0004\u0010\u0005\u001a\u0018\u0012\t\u0012\u00070\u0003\u00a2\u0006\u0002\u0008\u0004\u0012\t\u0012\u00078\u0000\u00a2\u0006\u0002\u0008\u00040\u0002H\u0086H\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "R",
        "Landroidx/activity/contextaware/ContextAware;",
        "Lkotlin/Function1;",
        "Landroid/content/Context;",
        "Lu3/n;",
        "onContextAvailable",
        "withContextAvailable",
        "(Landroidx/activity/contextaware/ContextAware;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "activity_release"
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
        "SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"
    }
.end annotation


# direct methods
.method public static final withContextAvailable(Landroidx/activity/contextaware/ContextAware;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p0    # Landroidx/activity/contextaware/ContextAware;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/activity/contextaware/ContextAware;",
            "Lv3/l<",
            "Landroid/content/Context;",
            "TR;>;",
            "Lkotlin/coroutines/d<",
            "TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/activity/contextaware/ContextAware;->peekAvailableContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lkotlinx/coroutines/q;

    .line 13
    .line 14
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/b;->e(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/q;-><init>(Lkotlin/coroutines/d;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->B()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;

    .line 26
    .line 27
    invoke-direct {v1, v0, p1}, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;-><init>(Lkotlinx/coroutines/p;Lv3/l;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v1}, Landroidx/activity/contextaware/ContextAware;->addOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1;

    .line 34
    .line 35
    invoke-direct {p1, p0, v1}, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1;-><init>(Landroidx/activity/contextaware/ContextAware;Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, p1}, Lkotlinx/coroutines/p;->g(Lv3/l;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p0, p1, :cond_1

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lkotlin/coroutines/d;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-object p0
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

.method private static final withContextAvailable$$forInline(Landroidx/activity/contextaware/ContextAware;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/activity/contextaware/ContextAware;",
            "Lv3/l<",
            "Landroid/content/Context;",
            "TR;>;",
            "Lkotlin/coroutines/d<",
            "TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/activity/contextaware/ContextAware;->peekAvailableContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->e(I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lkotlinx/coroutines/q;

    .line 17
    .line 18
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/b;->e(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/q;-><init>(Lkotlin/coroutines/d;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->B()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;

    .line 30
    .line 31
    invoke-direct {v1, v0, p1}, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;-><init>(Lkotlinx/coroutines/p;Lv3/l;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v1}, Landroidx/activity/contextaware/ContextAware;->addOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1;

    .line 38
    .line 39
    invoke-direct {p1, p0, v1}, Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1;-><init>(Landroidx/activity/contextaware/ContextAware;Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, p1}, Lkotlinx/coroutines/p;->g(Lv3/l;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 46
    .line 47
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p0, p1, :cond_1

    .line 56
    .line 57
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lkotlin/coroutines/d;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/i0;->e(I)V

    .line 61
    .line 62
    .line 63
    return-object p0
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
