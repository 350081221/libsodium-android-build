.class public Lcom/huawei/agconnect/apms/r1$bcd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/r1;->abc(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/r1;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/r1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/r1$bcd;->abc:Lcom/huawei/agconnect/apms/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1$bcd;->abc:Lcom/huawei/agconnect/apms/r1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/huawei/agconnect/apms/r1;->def:Lcom/huawei/agconnect/apms/r1$def;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/huawei/agconnect/apms/bcd;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/bcd;->abc(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
