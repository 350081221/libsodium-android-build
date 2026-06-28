.class public Lcom/huawei/agconnect/apms/bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/r1$def;


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/def;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/def;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abc(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V
    .locals 7

    const-string p1, "apms.cdn_header_name"

    const-string v0, "apms.disabled_android_app_versions"

    const-string v1, "apms.disabled_android"

    .line 3
    sget-object v2, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v3, "succeeded to fetch remote config."

    .line 4
    invoke-interface {v2, v3}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 5
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    .line 6
    iget-object v3, v3, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 7
    invoke-virtual {v3, v1}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;)Z

    move-result v3

    .line 8
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 9
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/r1;->bcd()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 10
    iget-object v2, v2, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    invoke-virtual {v2, v1}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getValueAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v3, v2

    .line 11
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 12
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    .line 13
    iget-object v4, v4, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 14
    invoke-virtual {v4, v0}, Lcom/huawei/agconnect/apms/ijk;->bcd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/r1;->bcd()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 16
    iget-object v3, v3, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    invoke-virtual {v3, v0}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getValueAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v4, v3

    .line 17
    :cond_1
    invoke-static {}, Lcom/huawei/agconnect/apms/r1;->def()Lcom/huawei/agconnect/apms/r1;

    move-result-object v3

    iget-object v5, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    .line 18
    iget-object v5, v5, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 19
    invoke-virtual {v5, p1}, Lcom/huawei/agconnect/apms/ijk;->bcd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 20
    invoke-virtual {v3}, Lcom/huawei/agconnect/apms/r1;->bcd()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 21
    iget-object v3, v3, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    invoke-virtual {v3, p1}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getValueAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    move-object v5, v3

    .line 22
    :cond_2
    iget-object v3, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    .line 23
    iget-object v6, v3, Lcom/huawei/agconnect/apms/def;->def:Lcom/huawei/agconnect/apms/efg;

    .line 24
    iput-object v5, v6, Lcom/huawei/agconnect/apms/efg;->def:Ljava/lang/String;

    .line 25
    iput-boolean v2, v6, Lcom/huawei/agconnect/apms/efg;->bcd:Z

    .line 26
    iput-object v4, v6, Lcom/huawei/agconnect/apms/efg;->cde:Ljava/lang/String;

    .line 27
    iget-object v3, v3, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 28
    invoke-virtual {v3, p1, v5}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    .line 30
    iget-object p1, p1, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 31
    invoke-virtual {p1, v1, v2}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Z)V

    .line 32
    iget-object p1, p0, Lcom/huawei/agconnect/apms/bcd;->abc:Lcom/huawei/agconnect/apms/def;

    .line 33
    iget-object p1, p1, Lcom/huawei/agconnect/apms/def;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 34
    invoke-virtual {p1, v0, v4}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 35
    sget-object v0, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "exception occurred when getting remote config: "

    .line 36
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :goto_0
    return-void
.end method

.method public abc(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/def;->jkl:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "failed to fetch remote config: "

    .line 2
    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    return-void
.end method
