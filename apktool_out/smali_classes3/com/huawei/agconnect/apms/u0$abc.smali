.class public Lcom/huawei/agconnect/apms/u0$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/u0;->bcd()Lcom/huawei/agconnect/apms/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/l0;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/u0;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/u0;Lcom/huawei/agconnect/apms/l0;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/u0$abc;->bcd:Lcom/huawei/agconnect/apms/u0;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/u0$abc;->abc:Lcom/huawei/agconnect/apms/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/huawei/agconnect/apms/u0$abc;->bcd:Lcom/huawei/agconnect/apms/u0;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/huawei/agconnect/apms/u0;->cde:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/huawei/agconnect/apms/u0$abc;->abc:Lcom/huawei/agconnect/apms/l0;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;-><init>(Ljava/lang/String;Lcom/huawei/agconnect/apms/l0;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
