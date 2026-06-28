.class public Lcom/huawei/agconnect/apms/cba$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/cba;->getInputStream()Ljava/io/InputStream;
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

    iput-object p1, p0, Lcom/huawei/agconnect/apms/cba$abc;->bcd:Lcom/huawei/agconnect/apms/cba;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 10
    .line 11
    iget-wide v1, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->bcd:Lcom/huawei/agconnect/apms/cba;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/huawei/agconnect/apms/cba$abc;->bcd:Lcom/huawei/agconnect/apms/cba;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->bcd:Lcom/huawei/agconnect/apms/cba;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/huawei/agconnect/apms/cba;->abc:Ljava/net/HttpURLConnection;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    iget-wide v2, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 41
    .line 42
    iget-object p1, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/apms/fed;->def(J)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/huawei/agconnect/apms/cba$abc;->bcd:Lcom/huawei/agconnect/apms/cba;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/huawei/agconnect/apms/cba$abc;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lcom/huawei/agconnect/apms/cba;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 57
    .line 58
    .line 59
    return-void
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
