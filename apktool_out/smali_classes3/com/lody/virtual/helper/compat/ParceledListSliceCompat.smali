.class public Lcom/lody/virtual/helper/compat/ParceledListSliceCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/util/List;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lmirror/android/content/pm/ParceledListSliceJBMR2;->ctor:Lmirror/RefConstructor;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    .line 9
    aput-object p0, v2, v1

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lmirror/android/content/pm/ParceledListSlice;->ctor:Lmirror/RefConstructor;

    .line 17
    .line 18
    invoke-virtual {v0}, Lmirror/RefConstructor;->newInstance()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    sget-object v4, Lmirror/android/content/pm/ParceledListSlice;->append:Lmirror/RefMethod;

    .line 37
    .line 38
    new-array v5, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object v3, v5, v1

    .line 41
    .line 42
    invoke-virtual {v4, v0, v5}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object p0, Lmirror/android/content/pm/ParceledListSlice;->setLastSlice:Lmirror/RefMethod;

    .line 47
    .line 48
    new-array v2, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 51
    .line 52
    aput-object v3, v2, v1

    .line 53
    .line 54
    invoke-virtual {p0, v0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object v0
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
.end method

.method public static isReturnParceledListSlice(Ljava/lang/reflect/Method;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    sget-object v0, Lmirror/android/content/pm/ParceledListSlice;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
