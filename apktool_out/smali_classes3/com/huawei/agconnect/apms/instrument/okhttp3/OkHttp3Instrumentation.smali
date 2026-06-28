.class public Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation$bcd;,
        Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation$abc;
    }
.end annotation


# static fields
.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final OKHTTP3_LISTENER_TAG:Ljava/lang/String; = "okhttp3.RealCall"

.field public static final OKHTTP4_4_LISTENER_TAG:Ljava/lang/String; = "okhttp3.internal.connection.RealCall"

.field public static final OKHTTP4_TRANSMITTER_TAG:Ljava/lang/String; = "okhttp3.internal.connection.Transmitter"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Lcom/huawei/agconnect/apms/log/AgentLog;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-object v0
.end method

.method public static addEventListenerAndInject(Lokhttp3/Call;Lcom/huawei/agconnect/apms/fed;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->getListenerParentClazz()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    const-string v1, "eventListener"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-static {p0, v1, p1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->setListenerProxy(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/agconnect/apms/fed;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_0

    .line 30
    :catchall_1
    move-exception v1

    .line 31
    const/4 v0, 0x0

    .line 32
    :goto_0
    :try_start_2
    invoke-static {p0, v0, p1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->tryAddEventListenerToTransmitter(Lokhttp3/Call;Ljava/lang/Class;Lcom/huawei/agconnect/apms/fed;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    sget-object p0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_2
    move-exception p0

    .line 49
    sget-object p1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public static addNuwaHeaderId(Lokhttp3/Request$Builder;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "net-msg-id"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1, p1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "x-microservice-name"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const-string p1, "APMS"

    .line 37
    .line 38
    invoke-virtual {p0, v0, p1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static body(Lokhttp3/Response$Builder;Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;
    .locals 3

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
    invoke-virtual {p0, p1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    new-instance v0, Lcom/huawei/agconnect/apms/f0;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/f0;-><init>(Lokhttp3/Response$Builder;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lcom/huawei/agconnect/apms/f0;->abc:Lokhttp3/Response$Builder;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 26
    .line 27
    const-string v2, "skipping APMS OkHttp3 proxy: "

    .line 28
    .line 29
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public static build(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient;
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->filterOkhttp3Interceptors(Lokhttp3/OkHttpClient$Builder;)V

    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/c0;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/c0;-><init>()V

    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    .line 5
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "skipping APMS OkHttp3 proxy: "

    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0

    return-object p0
.end method

.method public static build(Lokhttp3/Request$Builder;)Lokhttp3/Request;
    .locals 3

    .line 7
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    return-object p0

    .line 9
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/q1;->abc()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->addNuwaHeaderId(Lokhttp3/Request$Builder;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 11
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "skipping APMS OkHttp3 proxy: "

    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 12
    :goto_0
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method public static filterOkhttp3Interceptors(Lokhttp3/OkHttpClient$Builder;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->interceptors()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lokhttp3/Interceptor;

    .line 34
    .line 35
    instance-of v3, v2, Lcom/huawei/agconnect/apms/c0;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-interface {p0, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_1
    return-void
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

.method public static getListenerParentClazz()Ljava/lang/Class;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation$abc;->abc:Ljava/lang/Class;

    return-object v0
.end method

.method public static getTransmitterClazz()Ljava/lang/Class;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation$bcd;->abc:Ljava/lang/Class;

    return-object v0
.end method

.method public static getValueFromHeader(Lokhttp3/Request;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, p0

    .line 21
    :cond_1
    :goto_0
    return-object v1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method

.method public static newBuilder(Lokhttp3/Response$Builder;)Lokhttp3/Response$Builder;
    .locals 3

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
    return-object p0

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lcom/huawei/agconnect/apms/f0;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/f0;-><init>(Lokhttp3/Response$Builder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 16
    .line 17
    const-string v2, "skipping APMS OkHttp3 proxy: "

    .line 18
    .line 19
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 24
    .line 25
    .line 26
    return-object p0
    .line 27
.end method

.method public static newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;
    .locals 3

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
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    new-instance v0, Lcom/huawei/agconnect/apms/fed;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/fed;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "net-msg-id"

    .line 18
    .line 19
    invoke-static {p1, v1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->getValueFromHeader(Lokhttp3/Request;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lcom/huawei/agconnect/apms/fed;->jih:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->addEventListenerAndInject(Lokhttp3/Call;Lcom/huawei/agconnect/apms/fed;)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    iput v2, v0, Lcom/huawei/agconnect/apms/fed;->ghi:I

    .line 34
    .line 35
    new-instance v2, Lcom/huawei/agconnect/apms/y;

    .line 36
    .line 37
    invoke-direct {v2, p1, v1, v0}, Lcom/huawei/agconnect/apms/y;-><init>(Lokhttp3/Request;Lokhttp3/Call;Lcom/huawei/agconnect/apms/fed;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 43
    .line 44
    const-string v2, "skipping APMS OkHttp3 proxy: "

    .line 45
    .line 46
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public static open(Lokhttp3/OkUrlFactory;Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lokhttp3/OkUrlFactory;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "https"

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    instance-of p1, p0, Ljavax/net/ssl/HttpsURLConnection;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Lcom/huawei/agconnect/apms/a;

    .line 29
    .line 30
    move-object v0, p0

    .line 31
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Lcom/huawei/agconnect/apms/a;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    new-instance p1, Lcom/huawei/agconnect/apms/cba;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/huawei/agconnect/apms/cba;-><init>(Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 45
    .line 46
    const-string v1, "skipping APMS OkHttp3 proxy: "

    .line 47
    .line 48
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 53
    .line 54
    .line 55
    return-object p0
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public static setListenerProxy(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/agconnect/apms/fed;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/huawei/agconnect/apms/a0;

    .line 6
    .line 7
    check-cast v0, Lokhttp3/EventListener;

    .line 8
    .line 9
    invoke-direct {v1, v0, p2}, Lcom/huawei/agconnect/apms/a0;-><init>(Lokhttp3/EventListener;Lcom/huawei/agconnect/apms/fed;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    sget-object p1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
    .line 27
    .line 28
    .line 29
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public static tryAddEventListenerToTransmitter(Lokhttp3/Call;Ljava/lang/Class;Lcom/huawei/agconnect/apms/fed;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->getTransmitterClazz()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :try_start_0
    const-string v2, "transmitter"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v2, "eventListener"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x1

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0, v1, p2}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->setListenerProxy(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/agconnect/apms/fed;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    return v3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p2, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return v0

    .line 70
    :catch_0
    move-exception p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p2, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_0
    return v0
    .line 88
    .line 89
    .line 90
.end method
