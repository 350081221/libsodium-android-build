.class Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;
.super Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FakeReplaceLastPkgMethodProxy"
.end annotation


# instance fields
.field private mDefValue:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;->mDefValue:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string p2, ""

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;->mDefValue:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "test"

    .line 27
    .line 28
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;->mDefValue:Ljava/lang/Object;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
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
.end method
