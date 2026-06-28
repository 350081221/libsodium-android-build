.class public Lcom/huawei/agconnect/apms/r1$cde;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/r1;->abc(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/i<",
        "Lcom/huawei/agconnect/remoteconfig/ConfigValues;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/r1;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/r1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/r1$cde;->abc:Lcom/huawei/agconnect/apms/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/huawei/agconnect/remoteconfig/ConfigValues;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1$cde;->abc:Lcom/huawei/agconnect/apms/r1;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->apply(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1$cde;->abc:Lcom/huawei/agconnect/apms/r1;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/huawei/agconnect/apms/r1;->def:Lcom/huawei/agconnect/apms/r1$def;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast v0, Lcom/huawei/agconnect/apms/bcd;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/bcd;->abc(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method
