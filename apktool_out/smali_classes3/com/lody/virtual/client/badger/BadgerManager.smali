.class public Lcom/lody/virtual/client/badger/BadgerManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BADGERS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/client/badger/IBadger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/lody/virtual/client/badger/BadgerManager;->BADGERS:Ljava/util/Map;

    .line 9
    .line 10
    new-instance v0, Lcom/lody/virtual/client/badger/BroadcastBadger1$AdwHomeBadger;

    .line 11
    .line 12
    invoke-direct {v0}, Lcom/lody/virtual/client/badger/BroadcastBadger1$AdwHomeBadger;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/lody/virtual/client/badger/BadgerManager;->addBadger(Lcom/lody/virtual/client/badger/IBadger;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/lody/virtual/client/badger/BroadcastBadger1$AospHomeBadger;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/lody/virtual/client/badger/BroadcastBadger1$AospHomeBadger;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/lody/virtual/client/badger/BadgerManager;->addBadger(Lcom/lody/virtual/client/badger/IBadger;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/lody/virtual/client/badger/BroadcastBadger1$LGHomeBadger;

    .line 27
    .line 28
    invoke-direct {v0}, Lcom/lody/virtual/client/badger/BroadcastBadger1$LGHomeBadger;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/lody/virtual/client/badger/BadgerManager;->addBadger(Lcom/lody/virtual/client/badger/IBadger;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/badger/BroadcastBadger1$NewHtcHomeBadger2;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/lody/virtual/client/badger/BroadcastBadger1$NewHtcHomeBadger2;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/lody/virtual/client/badger/BadgerManager;->addBadger(Lcom/lody/virtual/client/badger/IBadger;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/lody/virtual/client/badger/BroadcastBadger1$OPPOHomeBader;

    .line 43
    .line 44
    invoke-direct {v0}, Lcom/lody/virtual/client/badger/BroadcastBadger1$OPPOHomeBader;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/lody/virtual/client/badger/BadgerManager;->addBadger(Lcom/lody/virtual/client/badger/IBadger;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lcom/lody/virtual/client/badger/BroadcastBadger2$NewHtcHomeBadger1;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/lody/virtual/client/badger/BroadcastBadger2$NewHtcHomeBadger1;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lcom/lody/virtual/client/badger/BadgerManager;->addBadger(Lcom/lody/virtual/client/badger/IBadger;)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addBadger(Lcom/lody/virtual/client/badger/IBadger;)V
    .locals 2

    sget-object v0, Lcom/lody/virtual/client/badger/BadgerManager;->BADGERS:Ljava/util/Map;

    invoke-interface {p0}, Lcom/lody/virtual/client/badger/IBadger;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static handleBadger(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/client/badger/BadgerManager;->BADGERS:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/lody/virtual/client/badger/IBadger;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p0}, Lcom/lody/virtual/client/badger/IBadger;->handleBadger(Landroid/content/Intent;)Lcom/lody/virtual/remote/BadgerInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p0}, Lcom/lody/virtual/client/ipc/VActivityManager;->notifyBadgerChange(Lcom/lody/virtual/remote/BadgerInfo;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
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
.end method
