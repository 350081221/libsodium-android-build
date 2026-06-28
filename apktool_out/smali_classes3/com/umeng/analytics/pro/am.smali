.class public Lcom/umeng/analytics/pro/am;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljavax/net/ssl/HostnameVerifier;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/am;->a:Ljavax/net/ssl/HostnameVerifier;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/umeng/analytics/pro/am$1;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/am$1;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/am;->a:Ljavax/net/ssl/HostnameVerifier;

    .line 3
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/am;->a:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;[B)Ljavax/net/ssl/HttpsURLConnection;
    .locals 3

    const/4 v0, 0x0

    .line 16
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "TLS"

    .line 18
    invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v1

    .line 19
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1, v0, v0, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 20
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 22
    invoke-static {}, Lcom/umeng/analytics/pro/am;->a()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    const-string v0, "POST"

    .line 23
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v0, 0x3a98

    .line 24
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/4 v1, 0x1

    .line 25
    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 26
    invoke-virtual {p0, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 27
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string v0, "Content-Type"

    const-string v1, "application/octet-stream"

    .line 28
    invoke-virtual {p0, v0, v1}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "User-Agent"

    .line 30
    invoke-static {}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getCustomAgt()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Ljava/net/URLConnection;->connect()V

    .line 32
    invoke-virtual {p0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    .line 33
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 34
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 35
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v0, p0

    goto :goto_0

    :catch_1
    move-exception p1

    .line 36
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    move-object p0, v0

    :goto_1
    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 0

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-static {p0, p1}, Lcom/umeng/analytics/pro/am;->a(Ljava/lang/String;[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;[B)[B
    .locals 3

    const-string v0, "ak"

    const/4 v1, 0x0

    .line 5
    :try_start_0
    sget-object v2, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {p1, v2}, Lcom/umeng/analytics/pro/at;->a([B[B)[B

    move-result-object p1

    .line 6
    invoke-static {p0, v0, p1}, Lcom/umeng/analytics/pro/am;->a(Ljava/lang/String;Ljava/lang/String;[B)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 7
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 v2, 0xc8

    if-ne p1, v2, :cond_1

    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    :try_start_1
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readStreamToByteArray(Ljava/io/InputStream;)[B

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    :try_start_2
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {v2, p0}, Lcom/umeng/analytics/pro/at;->a([B[B)[B

    move-result-object p0

    move-object v1, p0

    goto :goto_0

    :cond_0
    const-string p0, "MobclickRT"

    const-string v0, "ccg \u5e94\u7b54\u4e0d\u5305\u542bak!"

    .line 13
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    :goto_0
    :try_start_3
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p0

    :goto_1
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    .line 15
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_1
    :goto_2
    return-object v1
.end method

.method public static b(Ljava/lang/String;[B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    .line 7
    :try_start_1
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/at;->a([BLjava/io/OutputStream;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/at;->a([B[B)[B

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-object p1, v0

    .line 26
    :goto_0
    :try_start_2
    const-string v1, "appkey"

    .line 27
    .line 28
    invoke-static {p0, v1, p1}, Lcom/umeng/analytics/pro/am;->a(Ljava/lang/String;Ljava/lang/String;[B)Ljavax/net/ssl/HttpsURLConnection;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 35
    .line 36
    .line 37
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    const/16 p1, 0xc8

    .line 39
    .line 40
    const-string v1, "MobclickRT"

    .line 41
    .line 42
    if-eq p0, p1, :cond_0

    .line 43
    .line 44
    :try_start_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "SC event report error, http error code: "

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    const-string p0, "SC event report successful."

    .line 66
    .line 67
    invoke-static {v1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 71
    .line 72
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :catchall_1
    move-exception p0

    .line 77
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 78
    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catchall_2
    :cond_2
    :goto_3
    return-void

    .line 84
    :catchall_3
    move-exception p0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    :try_start_6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 88
    .line 89
    .line 90
    :catchall_4
    :cond_3
    throw p0
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
