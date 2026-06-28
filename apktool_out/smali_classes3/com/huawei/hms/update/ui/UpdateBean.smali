.class public Lcom/huawei/hms/update/ui/UpdateBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/util/ArrayList;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/huawei/hms/update/ui/UpdateBean;->d:Z

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
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

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method public getClientAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/update/ui/UpdateBean;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/update/ui/UpdateBean;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getResolutionInstallHMS()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hms/update/ui/UpdateBean;->a:Z

    return v0
.end method

.method public getTypeList()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/update/ui/UpdateBean;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/huawei/hms/update/ui/UpdateBean;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public isNeedConfirm()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hms/update/ui/UpdateBean;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/update/ui/UpdateBean;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public setClientAppId(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setClientAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/update/ui/UpdateBean;->b:Ljava/lang/String;

    return-void
.end method

.method public setClientPackageName(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setClientVersionCode(I)V
    .locals 0

    return-void
.end method

.method public setHmsOrApkUpgrade(Z)V
    .locals 0

    return-void
.end method

.method public setNeedConfirm(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hms/update/ui/UpdateBean;->d:Z

    return-void
.end method

.method public setResolutionInstallHMS(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hms/update/ui/UpdateBean;->a:Z

    return-void
.end method

.method public setTypeList(Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/update/ui/UpdateBean;->c:Ljava/util/ArrayList;

    return-void
.end method
