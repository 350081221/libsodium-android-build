.class public Lcom/huawei/agconnect/apms/anr/NativeHandler;
.super Lcom/huawei/agconnect/apms/lmn;
.source "SourceFile"


# static fields
.field public static efg:Lcom/huawei/agconnect/apms/anr/NativeHandler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/lmn;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lmn;->bcd:Ljava/util/Set;

    .line 10
    .line 11
    return-void
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

.method public static anrCallback(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/anr/NativeHandler;->bcd()Lcom/huawei/agconnect/apms/anr/NativeHandler;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/lmn;->abc(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    return-void
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

.method public static bcd()Lcom/huawei/agconnect/apms/anr/NativeHandler;
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/anr/NativeHandler;->efg:Lcom/huawei/agconnect/apms/anr/NativeHandler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/huawei/agconnect/apms/anr/NativeHandler;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/anr/NativeHandler;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/huawei/agconnect/apms/anr/NativeHandler;->efg:Lcom/huawei/agconnect/apms/anr/NativeHandler;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/anr/NativeHandler;->efg:Lcom/huawei/agconnect/apms/anr/NativeHandler;

    .line 13
    .line 14
    return-object v0
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

.method public static native initNativeAnr(ILjava/lang/String;Ljava/lang/String;III)I
.end method


# virtual methods
.method public abc(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    :try_start_0
    const-string p1, "apms_ndk_anr"

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    const/16 v4, 0x32

    .line 18
    .line 19
    const/16 v5, 0x32

    .line 20
    .line 21
    const/16 v6, 0xc8

    .line 22
    .line 23
    move-object v2, p2

    .line 24
    move-object v3, p3

    .line 25
    :try_start_1
    invoke-static/range {v1 .. v6}, Lcom/huawei/agconnect/apms/anr/NativeHandler;->initNativeAnr(ILjava/lang/String;Ljava/lang/String;III)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    sget-object p2, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 32
    .line 33
    new-instance p3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v0, "fail to init native anr, code: "

    .line 39
    .line 40
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    sget-object p2, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 56
    .line 57
    const-string p3, "fail to init native anr, "

    .line 58
    .line 59
    invoke-static {p3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p1, p3, p2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    return-void

    .line 67
    :catchall_1
    move-exception p1

    .line 68
    sget-object p2, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 69
    .line 70
    const-string p3, "fail to load apm anr so library, "

    .line 71
    .line 72
    invoke-static {p3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-static {p1, p3, p2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    :goto_1
    sget-object p1, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 81
    .line 82
    const-string p2, "APMS agent or anr monitor is disabled, please enable."

    .line 83
    .line 84
    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
    .line 88
    .line 89
    .line 90
.end method
