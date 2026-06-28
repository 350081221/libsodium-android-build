.class public Lcom/huawei/agconnect/apms/cba$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/cba;->getOutputStream()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/fed;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/cba;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/cba;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/cba$bcd;->bcd:Lcom/huawei/agconnect/apms/cba;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 10
    .line 11
    iget-wide v1, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->bcd:Lcom/huawei/agconnect/apms/cba;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/huawei/agconnect/apms/k;->bcd:Ljava/lang/Exception;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/cba;->abc(Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bcd(Lcom/huawei/agconnect/apms/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/huawei/agconnect/apms/cba$bcd;->bcd:Lcom/huawei/agconnect/apms/cba;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/huawei/agconnect/apms/cba;->abc:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->cde(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/cba;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 25
    .line 26
    const-string v1, "failed to get status code"

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->bcd:Lcom/huawei/agconnect/apms/cba;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/huawei/agconnect/apms/cba;->abc:Ljava/net/HttpURLConnection;

    .line 34
    .line 35
    const-string v1, "Content-length"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-wide v1, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    sget-object v0, Lcom/huawei/agconnect/apms/cba;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 52
    .line 53
    const-string v3, "failed to get content length: "

    .line 54
    .line 55
    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {p1, v3, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 63
    .line 64
    invoke-virtual {p1, v1, v2}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/huawei/agconnect/apms/cba$bcd;->bcd:Lcom/huawei/agconnect/apms/cba;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/cba;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 72
    .line 73
    .line 74
    return-void
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
