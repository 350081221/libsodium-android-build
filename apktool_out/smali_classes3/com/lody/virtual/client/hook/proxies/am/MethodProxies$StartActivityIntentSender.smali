.class public Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivityIntentSender;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartActivityIntentSender"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    const/4 v3, 0x7

    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x5

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    const/16 v6, 0xa

    .line 16
    .line 17
    move v8, v2

    .line 18
    move v2, v1

    .line 19
    move v1, v6

    .line 20
    move v6, v5

    .line 21
    move v5, v4

    .line 22
    move v4, v3

    .line 23
    move v3, v8

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    const/4 v6, 0x4

    .line 27
    :goto_0
    const/4 v7, 0x1

    .line 28
    aget-object v7, p3, v7

    .line 29
    .line 30
    check-cast v7, Landroid/os/IInterface;

    .line 31
    .line 32
    aget-object v7, p3, v0

    .line 33
    .line 34
    check-cast v7, Landroid/content/Intent;

    .line 35
    .line 36
    aget-object v6, p3, v6

    .line 37
    .line 38
    check-cast v6, Landroid/os/IBinder;

    .line 39
    .line 40
    aget-object v5, p3, v5

    .line 41
    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    aget-object v4, p3, v4

    .line 45
    .line 46
    check-cast v4, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    aget-object v1, p3, v1

    .line 52
    .line 53
    check-cast v1, Landroid/os/Bundle;

    .line 54
    .line 55
    aget-object v3, p3, v3

    .line 56
    .line 57
    check-cast v3, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    aget-object v2, p3, v2

    .line 63
    .line 64
    check-cast v2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    if-nez v7, :cond_1

    .line 70
    .line 71
    new-instance v7, Landroid/content/Intent;

    .line 72
    .line 73
    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 74
    .line 75
    .line 76
    aput-object v7, p3, v0

    .line 77
    .line 78
    :cond_1
    invoke-static {v7, v6, v1}, Lcom/lody/virtual/helper/utils/ComponentUtils;->parcelActivityIntentSender(Landroid/content/Intent;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "startActivityIntentSender"

    return-object v0
.end method
