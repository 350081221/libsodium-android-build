.class public Lcom/huawei/agconnect/apms/a$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/a;->getOutputStream()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/fed;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/a;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/a;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/a$bcd;->bcd:Lcom/huawei/agconnect/apms/a;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->bcd:Lcom/huawei/agconnect/apms/a;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/huawei/agconnect/apms/k;->bcd:Ljava/lang/Exception;

    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/a;->abc(Lcom/huawei/agconnect/apms/a;Ljava/lang/Exception;)V

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a$bcd;->bcd:Lcom/huawei/agconnect/apms/a;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

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
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    sget-object v1, Lcom/huawei/agconnect/apms/a;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 26
    .line 27
    const-string v2, "failed to get status code: "

    .line 28
    .line 29
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->bcd:Lcom/huawei/agconnect/apms/a;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/huawei/agconnect/apms/a;->abc:Ljavax/net/ssl/HttpsURLConnection;

    .line 39
    .line 40
    const-string v1, "Content-length"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-wide v1, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception p1

    .line 56
    sget-object v0, Lcom/huawei/agconnect/apms/a;->def:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 57
    .line 58
    const-string v3, "failed to get content length: "

    .line 59
    .line 60
    invoke-static {v3}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {p1, v3, v0}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 68
    .line 69
    invoke-virtual {p1, v1, v2}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/huawei/agconnect/apms/a$bcd;->bcd:Lcom/huawei/agconnect/apms/a;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a$bcd;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/a;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 77
    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
