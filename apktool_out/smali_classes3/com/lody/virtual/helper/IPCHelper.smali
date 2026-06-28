.class public abstract Lcom/lody/virtual/helper/IPCHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/IPCHelper$CallableVoid;,
        Lcom/lody/virtual/helper/IPCHelper$Callable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mInterface:Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/lody/virtual/helper/IPCHelper$Callable;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/lody/virtual/helper/IPCHelper$Callable<",
            "TS;TR;>;)TR;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    if-gt v0, v1, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/lody/virtual/helper/IPCHelper;->mInterface:Landroid/os/IInterface;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Landroid/os/IBinder;->isBinderAlive()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/lody/virtual/helper/IPCHelper;->getInterface()Landroid/os/IInterface;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lcom/lody/virtual/helper/IPCHelper;->mInterface:Landroid/os/IInterface;

    .line 24
    .line 25
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/helper/IPCHelper;->mInterface:Landroid/os/IInterface;

    .line 26
    .line 27
    invoke-interface {p1, v1}, Lcom/lody/virtual/helper/IPCHelper$Callable;->call(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-object p1

    .line 32
    :catch_0
    move-exception v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    return-object p1
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
.end method

.method public callBoolean(Lcom/lody/virtual/helper/IPCHelper$Callable;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/lody/virtual/helper/IPCHelper$Callable<",
            "TS;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/IPCHelper;->call(Lcom/lody/virtual/helper/IPCHelper$Callable;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
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
.end method

.method public callVoid(Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/lody/virtual/helper/IPCHelper$CallableVoid<",
            "TS;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/lody/virtual/helper/IPCHelper$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/lody/virtual/helper/IPCHelper$1;-><init>(Lcom/lody/virtual/helper/IPCHelper;Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/lody/virtual/helper/IPCHelper;->call(Lcom/lody/virtual/helper/IPCHelper$Callable;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public abstract getInterface()Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation
.end method
