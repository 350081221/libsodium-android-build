.class public Lcom/huawei/agconnect/apms/instrument/OkHttp3Instrumentation;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/instrument/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getHttpURLConnection(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lcom/huawei/agconnect/apms/a;

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/a;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    new-instance v0, Lcom/huawei/agconnect/apms/cba;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/cba;-><init>(Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 31
    .line 32
    const-string v2, "skipping APMS OkHttp3 proxy: "

    .line 33
    .line 34
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-object p0
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

.method public static open(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 0

    invoke-static {p0}, Lcom/huawei/agconnect/apms/instrument/OkHttp3Instrumentation;->getHttpURLConnection(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;

    move-result-object p0

    return-object p0
.end method

.method public static openWithProxy(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 0

    invoke-static {p0}, Lcom/huawei/agconnect/apms/instrument/OkHttp3Instrumentation;->getHttpURLConnection(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;

    move-result-object p0

    return-object p0
.end method

.method public static urlFactoryOpen(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 0

    invoke-static {p0}, Lcom/huawei/agconnect/apms/instrument/OkHttp3Instrumentation;->getHttpURLConnection(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;

    move-result-object p0

    return-object p0
.end method
