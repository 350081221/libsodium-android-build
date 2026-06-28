.class public abstract Lcom/lody/virtual/client/badger/BroadcastBadger2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/client/badger/IBadger;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/badger/BroadcastBadger2$NewHtcHomeBadger1;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAction()Ljava/lang/String;
.end method

.method public abstract getComponentKey()Ljava/lang/String;
.end method

.method public abstract getCountKey()Ljava/lang/String;
.end method

.method public handleBadger(Landroid/content/Intent;)Lcom/lody/virtual/remote/BadgerInfo;
    .locals 3

    .line 1
    new-instance v0, Lcom/lody/virtual/remote/BadgerInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/remote/BadgerInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/lody/virtual/client/badger/BroadcastBadger2;->getComponentKey()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v0, Lcom/lody/virtual/remote/BadgerInfo;->packageName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, v0, Lcom/lody/virtual/remote/BadgerInfo;->className:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/lody/virtual/client/badger/BroadcastBadger2;->getCountKey()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, v0, Lcom/lody/virtual/remote/BadgerInfo;->badgerCount:I

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return-object p1
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
