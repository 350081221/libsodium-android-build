.class Lcom/lody/virtual/client/hook/proxies/telephony/MethodProxies$GetNeighboringCellInfo;
.super Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;
.source "SourceFile"


# annotations
.annotation runtime Lcom/lody/virtual/client/hook/annotations/SkipInject;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/telephony/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GetNeighboringCellInfo"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "getNeighboringCellInfo"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isFakeLocationEnable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppUserId()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppPkg()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p1, p2, p3}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getNeighboringCell(ILjava/lang/String;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-eqz p3, :cond_0

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    check-cast p3, Lcom/lody/virtual/remote/vloc/VCell;

    .line 45
    .line 46
    new-instance v0, Landroid/telephony/NeighboringCellInfo;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/telephony/NeighboringCellInfo;-><init>()V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lmirror/android/telephony/NeighboringCellInfo;->mLac:Lmirror/RefInt;

    .line 52
    .line 53
    iget v2, p3, Lcom/lody/virtual/remote/vloc/VCell;->lac:I

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lmirror/android/telephony/NeighboringCellInfo;->mCid:Lmirror/RefInt;

    .line 59
    .line 60
    iget p3, p3, Lcom/lody/virtual/remote/vloc/VCell;->cid:I

    .line 61
    .line 62
    invoke-virtual {v1, v0, p3}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    sget-object p3, Lmirror/android/telephony/NeighboringCellInfo;->mRssi:Lmirror/RefInt;

    .line 66
    .line 67
    const/4 v1, 0x6

    .line 68
    invoke-virtual {p3, v0, v1}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-object p2

    .line 76
    :cond_1
    const/4 p1, 0x0

    .line 77
    return-object p1

    .line 78
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
